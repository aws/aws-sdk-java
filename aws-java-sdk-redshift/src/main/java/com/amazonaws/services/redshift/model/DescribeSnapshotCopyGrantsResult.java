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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotCopyGrants"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotCopyGrantsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b> parameter,
     * but not both.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SnapshotCopyGrant> snapshotCopyGrants;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b> parameter,
     * but not both.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in
     *        <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *        retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request. </p>
     *        <p>
     *        Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b>
     *        parameter, but not both.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b> parameter,
     * but not both.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in
     *         <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *         retrieve the next set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request. </p>
     *         <p>
     *         Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b> parameter,
     * but not both.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <code>DescribeSnapshotCopyGrant</code> request exceed the value specified in
     *        <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *        retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request. </p>
     *        <p>
     *        Constraints: You can specify either the <b>SnapshotCopyGrantName</b> parameter or the <b>Marker</b>
     *        parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotCopyGrantsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     * 
     * @return The list of <code>SnapshotCopyGrant</code> objects.
     */

    public java.util.List<SnapshotCopyGrant> getSnapshotCopyGrants() {
        if (snapshotCopyGrants == null) {
            snapshotCopyGrants = new com.amazonaws.internal.SdkInternalList<SnapshotCopyGrant>();
        }
        return snapshotCopyGrants;
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     * 
     * @param snapshotCopyGrants
     *        The list of <code>SnapshotCopyGrant</code> objects.
     */

    public void setSnapshotCopyGrants(java.util.Collection<SnapshotCopyGrant> snapshotCopyGrants) {
        if (snapshotCopyGrants == null) {
            this.snapshotCopyGrants = null;
            return;
        }

        this.snapshotCopyGrants = new com.amazonaws.internal.SdkInternalList<SnapshotCopyGrant>(snapshotCopyGrants);
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotCopyGrants(java.util.Collection)} or {@link #withSnapshotCopyGrants(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param snapshotCopyGrants
     *        The list of <code>SnapshotCopyGrant</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotCopyGrantsResult withSnapshotCopyGrants(SnapshotCopyGrant... snapshotCopyGrants) {
        if (this.snapshotCopyGrants == null) {
            setSnapshotCopyGrants(new com.amazonaws.internal.SdkInternalList<SnapshotCopyGrant>(snapshotCopyGrants.length));
        }
        for (SnapshotCopyGrant ele : snapshotCopyGrants) {
            this.snapshotCopyGrants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>SnapshotCopyGrant</code> objects.
     * </p>
     * 
     * @param snapshotCopyGrants
     *        The list of <code>SnapshotCopyGrant</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotCopyGrantsResult withSnapshotCopyGrants(java.util.Collection<SnapshotCopyGrant> snapshotCopyGrants) {
        setSnapshotCopyGrants(snapshotCopyGrants);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getSnapshotCopyGrants() != null)
            sb.append("SnapshotCopyGrants: ").append(getSnapshotCopyGrants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotCopyGrantsResult == false)
            return false;
        DescribeSnapshotCopyGrantsResult other = (DescribeSnapshotCopyGrantsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getSnapshotCopyGrants() == null ^ this.getSnapshotCopyGrants() == null)
            return false;
        if (other.getSnapshotCopyGrants() != null && other.getSnapshotCopyGrants().equals(this.getSnapshotCopyGrants()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCopyGrants() == null) ? 0 : getSnapshotCopyGrants().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotCopyGrantsResult clone() {
        try {
            return (DescribeSnapshotCopyGrantsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
