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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token. If this parameter is returned in the response, more records are available, which can be
     * retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The list of global clusters and instances returned by this request.
     * </p>
     */
    private java.util.List<GlobalCluster> globalClusters;

    /**
     * <p>
     * A pagination token. If this parameter is returned in the response, more records are available, which can be
     * retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     * </p>
     * 
     * @param marker
     *        A pagination token. If this parameter is returned in the response, more records are available, which can
     *        be retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token. If this parameter is returned in the response, more records are available, which can be
     * retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     * </p>
     * 
     * @return A pagination token. If this parameter is returned in the response, more records are available, which can
     *         be retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token. If this parameter is returned in the response, more records are available, which can be
     * retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     * </p>
     * 
     * @param marker
     *        A pagination token. If this parameter is returned in the response, more records are available, which can
     *        be retrieved by one or more additional calls to <code>DescribeGlobalClusters</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The list of global clusters and instances returned by this request.
     * </p>
     * 
     * @return The list of global clusters and instances returned by this request.
     */

    public java.util.List<GlobalCluster> getGlobalClusters() {
        return globalClusters;
    }

    /**
     * <p>
     * The list of global clusters and instances returned by this request.
     * </p>
     * 
     * @param globalClusters
     *        The list of global clusters and instances returned by this request.
     */

    public void setGlobalClusters(java.util.Collection<GlobalCluster> globalClusters) {
        if (globalClusters == null) {
            this.globalClusters = null;
            return;
        }

        this.globalClusters = new java.util.ArrayList<GlobalCluster>(globalClusters);
    }

    /**
     * <p>
     * The list of global clusters and instances returned by this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalClusters(java.util.Collection)} or {@link #withGlobalClusters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param globalClusters
     *        The list of global clusters and instances returned by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersResult withGlobalClusters(GlobalCluster... globalClusters) {
        if (this.globalClusters == null) {
            setGlobalClusters(new java.util.ArrayList<GlobalCluster>(globalClusters.length));
        }
        for (GlobalCluster ele : globalClusters) {
            this.globalClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of global clusters and instances returned by this request.
     * </p>
     * 
     * @param globalClusters
     *        The list of global clusters and instances returned by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersResult withGlobalClusters(java.util.Collection<GlobalCluster> globalClusters) {
        setGlobalClusters(globalClusters);
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
        if (getGlobalClusters() != null)
            sb.append("GlobalClusters: ").append(getGlobalClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalClustersResult == false)
            return false;
        DescribeGlobalClustersResult other = (DescribeGlobalClustersResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getGlobalClusters() == null ^ this.getGlobalClusters() == null)
            return false;
        if (other.getGlobalClusters() != null && other.getGlobalClusters().equals(this.getGlobalClusters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getGlobalClusters() == null) ? 0 : getGlobalClusters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalClustersResult clone() {
        try {
            return (DescribeGlobalClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
