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
 * Contains the output from the <a>DescribeClusterParameterGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameterGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterParameterGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
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
     * A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterParameterGroup> parameterGroups;

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

    public DescribeClusterParameterGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * </p>
     * 
     * @return A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     */

    public java.util.List<ClusterParameterGroup> getParameterGroups() {
        if (parameterGroups == null) {
            parameterGroups = new com.amazonaws.internal.SdkInternalList<ClusterParameterGroup>();
        }
        return parameterGroups;
    }

    /**
     * <p>
     * A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * </p>
     * 
     * @param parameterGroups
     *        A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     */

    public void setParameterGroups(java.util.Collection<ClusterParameterGroup> parameterGroups) {
        if (parameterGroups == null) {
            this.parameterGroups = null;
            return;
        }

        this.parameterGroups = new com.amazonaws.internal.SdkInternalList<ClusterParameterGroup>(parameterGroups);
    }

    /**
     * <p>
     * A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterGroups(java.util.Collection)} or {@link #withParameterGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterGroups
     *        A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterParameterGroupsResult withParameterGroups(ClusterParameterGroup... parameterGroups) {
        if (this.parameterGroups == null) {
            setParameterGroups(new com.amazonaws.internal.SdkInternalList<ClusterParameterGroup>(parameterGroups.length));
        }
        for (ClusterParameterGroup ele : parameterGroups) {
            this.parameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * </p>
     * 
     * @param parameterGroups
     *        A list of <a>ClusterParameterGroup</a> instances. Each instance describes one cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterParameterGroupsResult withParameterGroups(java.util.Collection<ClusterParameterGroup> parameterGroups) {
        setParameterGroups(parameterGroups);
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
        if (getParameterGroups() != null)
            sb.append("ParameterGroups: ").append(getParameterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterParameterGroupsResult == false)
            return false;
        DescribeClusterParameterGroupsResult other = (DescribeClusterParameterGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getParameterGroups() == null ^ this.getParameterGroups() == null)
            return false;
        if (other.getParameterGroups() != null && other.getParameterGroups().equals(this.getParameterGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getParameterGroups() == null) ? 0 : getParameterGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterParameterGroupsResult clone() {
        try {
            return (DescribeClusterParameterGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
