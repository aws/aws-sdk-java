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
 * <p>
 * Contains the output from the <a>DescribeClusterSubnetGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSubnetGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterSubnetGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSubnetGroup> clusterSubnetGroups;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterSubnetGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     * 
     * @return A list of <a>ClusterSubnetGroup</a> instances.
     */

    public java.util.List<ClusterSubnetGroup> getClusterSubnetGroups() {
        if (clusterSubnetGroups == null) {
            clusterSubnetGroups = new com.amazonaws.internal.SdkInternalList<ClusterSubnetGroup>();
        }
        return clusterSubnetGroups;
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     * 
     * @param clusterSubnetGroups
     *        A list of <a>ClusterSubnetGroup</a> instances.
     */

    public void setClusterSubnetGroups(java.util.Collection<ClusterSubnetGroup> clusterSubnetGroups) {
        if (clusterSubnetGroups == null) {
            this.clusterSubnetGroups = null;
            return;
        }

        this.clusterSubnetGroups = new com.amazonaws.internal.SdkInternalList<ClusterSubnetGroup>(clusterSubnetGroups);
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSubnetGroups(java.util.Collection)} or {@link #withClusterSubnetGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param clusterSubnetGroups
     *        A list of <a>ClusterSubnetGroup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterSubnetGroupsResult withClusterSubnetGroups(ClusterSubnetGroup... clusterSubnetGroups) {
        if (this.clusterSubnetGroups == null) {
            setClusterSubnetGroups(new com.amazonaws.internal.SdkInternalList<ClusterSubnetGroup>(clusterSubnetGroups.length));
        }
        for (ClusterSubnetGroup ele : clusterSubnetGroups) {
            this.clusterSubnetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterSubnetGroup</a> instances.
     * </p>
     * 
     * @param clusterSubnetGroups
     *        A list of <a>ClusterSubnetGroup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterSubnetGroupsResult withClusterSubnetGroups(java.util.Collection<ClusterSubnetGroup> clusterSubnetGroups) {
        setClusterSubnetGroups(clusterSubnetGroups);
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
        if (getClusterSubnetGroups() != null)
            sb.append("ClusterSubnetGroups: ").append(getClusterSubnetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterSubnetGroupsResult == false)
            return false;
        DescribeClusterSubnetGroupsResult other = (DescribeClusterSubnetGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getClusterSubnetGroups() == null ^ this.getClusterSubnetGroups() == null)
            return false;
        if (other.getClusterSubnetGroups() != null && other.getClusterSubnetGroups().equals(this.getClusterSubnetGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getClusterSubnetGroups() == null) ? 0 : getClusterSubnetGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterSubnetGroupsResult clone() {
        try {
            return (DescribeClusterSubnetGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
