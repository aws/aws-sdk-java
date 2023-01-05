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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, only information about the specified DB
     * cluster is returned. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: If supplied, must match an existing DB cluster identifier.
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>. If this
     * parameter is specified, the response will only include records beyond the marker, up to the number specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, only information about the specified DB
     * cluster is returned. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: If supplied, must match an existing DB cluster identifier.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The user-supplied DB cluster identifier. If this parameter is specified, only information about the
     *        specified DB cluster is returned. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints: If supplied, must match an existing DB cluster identifier.
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, only information about the specified DB
     * cluster is returned. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: If supplied, must match an existing DB cluster identifier.
     * </p>
     * 
     * @return The user-supplied DB cluster identifier. If this parameter is specified, only information about the
     *         specified DB cluster is returned. This parameter is not case-sensitive.</p>
     *         <p>
     *         Constraints: If supplied, must match an existing DB cluster identifier.
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, only information about the specified DB
     * cluster is returned. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: If supplied, must match an existing DB cluster identifier.
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The user-supplied DB cluster identifier. If this parameter is specified, only information about the
     *        specified DB cluster is returned. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints: If supplied, must match an existing DB cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to
     *         retrieve the remaining results.</p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination marker token is included in the response that you can use to
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>. If this
     * parameter is specified, the response will only include records beyond the marker, up to the number specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>.
     *        If this parameter is specified, the response will only include records beyond the marker, up to the number
     *        specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>. If this
     * parameter is specified, the response will only include records beyond the marker, up to the number specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>.
     *         If this parameter is specified, the response will only include records beyond the marker, up to the
     *         number specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>. If this
     * parameter is specified, the response will only include records beyond the marker, up to the number specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        (<i>Optional</i>) A pagination token returned by a previous call to <code>DescribeGlobalClusters</code>.
     *        If this parameter is specified, the response will only include records beyond the marker, up to the number
     *        specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalClustersRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalClustersRequest == false)
            return false;
        DescribeGlobalClustersRequest other = (DescribeGlobalClustersRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalClustersRequest clone() {
        return (DescribeGlobalClustersRequest) super.clone();
    }

}
