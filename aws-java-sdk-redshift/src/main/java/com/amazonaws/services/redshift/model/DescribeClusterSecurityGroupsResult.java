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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSecurityGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterSecurityGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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
     * A list of <a>ClusterSecurityGroup</a> instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSecurityGroup> clusterSecurityGroups;

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

    public DescribeClusterSecurityGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterSecurityGroup</a> instances.
     * </p>
     * 
     * @return A list of <a>ClusterSecurityGroup</a> instances.
     */

    public java.util.List<ClusterSecurityGroup> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
            clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<ClusterSecurityGroup>();
        }
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of <a>ClusterSecurityGroup</a> instances.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of <a>ClusterSecurityGroup</a> instances.
     */

    public void setClusterSecurityGroups(java.util.Collection<ClusterSecurityGroup> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }

        this.clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<ClusterSecurityGroup>(clusterSecurityGroups);
    }

    /**
     * <p>
     * A list of <a>ClusterSecurityGroup</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of <a>ClusterSecurityGroup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterSecurityGroupsResult withClusterSecurityGroups(ClusterSecurityGroup... clusterSecurityGroups) {
        if (this.clusterSecurityGroups == null) {
            setClusterSecurityGroups(new com.amazonaws.internal.SdkInternalList<ClusterSecurityGroup>(clusterSecurityGroups.length));
        }
        for (ClusterSecurityGroup ele : clusterSecurityGroups) {
            this.clusterSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterSecurityGroup</a> instances.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of <a>ClusterSecurityGroup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterSecurityGroupsResult withClusterSecurityGroups(java.util.Collection<ClusterSecurityGroup> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
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
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: ").append(getClusterSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterSecurityGroupsResult == false)
            return false;
        DescribeClusterSecurityGroupsResult other = (DescribeClusterSecurityGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterSecurityGroupsResult clone() {
        try {
            return (DescribeClusterSecurityGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
