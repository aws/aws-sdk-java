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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterDbRevisions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterDbRevisionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string representing the starting point for the next set of revisions. If a value is returned in a response, you
     * can retrieve the next set of revisions by providing the value in the <code>marker</code> parameter and retrying
     * the command. If the <code>marker</code> field is empty, all revisions have already been returned.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of revisions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterDbRevision> clusterDbRevisions;

    /**
     * <p>
     * A string representing the starting point for the next set of revisions. If a value is returned in a response, you
     * can retrieve the next set of revisions by providing the value in the <code>marker</code> parameter and retrying
     * the command. If the <code>marker</code> field is empty, all revisions have already been returned.
     * </p>
     * 
     * @param marker
     *        A string representing the starting point for the next set of revisions. If a value is returned in a
     *        response, you can retrieve the next set of revisions by providing the value in the <code>marker</code>
     *        parameter and retrying the command. If the <code>marker</code> field is empty, all revisions have already
     *        been returned.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string representing the starting point for the next set of revisions. If a value is returned in a response, you
     * can retrieve the next set of revisions by providing the value in the <code>marker</code> parameter and retrying
     * the command. If the <code>marker</code> field is empty, all revisions have already been returned.
     * </p>
     * 
     * @return A string representing the starting point for the next set of revisions. If a value is returned in a
     *         response, you can retrieve the next set of revisions by providing the value in the <code>marker</code>
     *         parameter and retrying the command. If the <code>marker</code> field is empty, all revisions have already
     *         been returned.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A string representing the starting point for the next set of revisions. If a value is returned in a response, you
     * can retrieve the next set of revisions by providing the value in the <code>marker</code> parameter and retrying
     * the command. If the <code>marker</code> field is empty, all revisions have already been returned.
     * </p>
     * 
     * @param marker
     *        A string representing the starting point for the next set of revisions. If a value is returned in a
     *        response, you can retrieve the next set of revisions by providing the value in the <code>marker</code>
     *        parameter and retrying the command. If the <code>marker</code> field is empty, all revisions have already
     *        been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterDbRevisionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     * 
     * @return A list of revisions.
     */

    public java.util.List<ClusterDbRevision> getClusterDbRevisions() {
        if (clusterDbRevisions == null) {
            clusterDbRevisions = new com.amazonaws.internal.SdkInternalList<ClusterDbRevision>();
        }
        return clusterDbRevisions;
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     * 
     * @param clusterDbRevisions
     *        A list of revisions.
     */

    public void setClusterDbRevisions(java.util.Collection<ClusterDbRevision> clusterDbRevisions) {
        if (clusterDbRevisions == null) {
            this.clusterDbRevisions = null;
            return;
        }

        this.clusterDbRevisions = new com.amazonaws.internal.SdkInternalList<ClusterDbRevision>(clusterDbRevisions);
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterDbRevisions(java.util.Collection)} or {@link #withClusterDbRevisions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param clusterDbRevisions
     *        A list of revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterDbRevisionsResult withClusterDbRevisions(ClusterDbRevision... clusterDbRevisions) {
        if (this.clusterDbRevisions == null) {
            setClusterDbRevisions(new com.amazonaws.internal.SdkInternalList<ClusterDbRevision>(clusterDbRevisions.length));
        }
        for (ClusterDbRevision ele : clusterDbRevisions) {
            this.clusterDbRevisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of revisions.
     * </p>
     * 
     * @param clusterDbRevisions
     *        A list of revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterDbRevisionsResult withClusterDbRevisions(java.util.Collection<ClusterDbRevision> clusterDbRevisions) {
        setClusterDbRevisions(clusterDbRevisions);
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
        if (getClusterDbRevisions() != null)
            sb.append("ClusterDbRevisions: ").append(getClusterDbRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterDbRevisionsResult == false)
            return false;
        DescribeClusterDbRevisionsResult other = (DescribeClusterDbRevisionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getClusterDbRevisions() == null ^ this.getClusterDbRevisions() == null)
            return false;
        if (other.getClusterDbRevisions() != null && other.getClusterDbRevisions().equals(this.getClusterDbRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getClusterDbRevisions() == null) ? 0 : getClusterDbRevisions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterDbRevisionsResult clone() {
        try {
            return (DescribeClusterDbRevisionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
