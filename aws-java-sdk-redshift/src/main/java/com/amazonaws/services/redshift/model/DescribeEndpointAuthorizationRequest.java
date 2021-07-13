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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEndpointAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is true, then
     * the <code>Account</code> value is of the grantor.
     * </p>
     */
    private String account;
    /**
     * <p>
     * Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     * returns endpoint authorizations that you've been granted. If false (default), checks authorization from a grantor
     * point of view.
     * </p>
     */
    private Boolean grantee;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the response so
     * that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster to access.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     * 
     * @return The cluster identifier of the cluster to access.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster to access.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster to access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is true, then
     * the <code>Account</code> value is of the grantor.
     * </p>
     * 
     * @param account
     *        The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is
     *        true, then the <code>Account</code> value is of the grantor.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is true, then
     * the <code>Account</code> value is of the grantor.
     * </p>
     * 
     * @return The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is
     *         true, then the <code>Account</code> value is of the grantor.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is true, then
     * the <code>Account</code> value is of the grantor.
     * </p>
     * 
     * @param account
     *        The Aaccount ID of either the cluster owner (grantor) or grantee. If <code>Grantee</code> parameter is
     *        true, then the <code>Account</code> value is of the grantor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationRequest withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     * returns endpoint authorizations that you've been granted. If false (default), checks authorization from a grantor
     * point of view.
     * </p>
     * 
     * @param grantee
     *        Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     *        returns endpoint authorizations that you've been granted. If false (default), checks authorization from a
     *        grantor point of view.
     */

    public void setGrantee(Boolean grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     * returns endpoint authorizations that you've been granted. If false (default), checks authorization from a grantor
     * point of view.
     * </p>
     * 
     * @return Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon
     *         Redshift returns endpoint authorizations that you've been granted. If false (default), checks
     *         authorization from a grantor point of view.
     */

    public Boolean getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     * returns endpoint authorizations that you've been granted. If false (default), checks authorization from a grantor
     * point of view.
     * </p>
     * 
     * @param grantee
     *        Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     *        returns endpoint authorizations that you've been granted. If false (default), checks authorization from a
     *        grantor point of view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationRequest withGrantee(Boolean grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon Redshift
     * returns endpoint authorizations that you've been granted. If false (default), checks authorization from a grantor
     * point of view.
     * </p>
     * 
     * @return Indicates whether to check authorization from a grantor or grantee point of view. If true, Amazon
     *         Redshift returns endpoint authorizations that you've been granted. If false (default), checks
     *         authorization from a grantor point of view.
     */

    public Boolean isGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the response so
     * that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the response
     *        so that the remaining results can be retrieved.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the response so
     * that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the
     *         response so that the remaining results can be retrieved.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the response so
     * that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a <code>Marker</code> is included in the response
     *        so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by the <code>MaxRecords</code> parameter.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request.
     *         If this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by the <code>MaxRecords</code> parameter.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by the
     * <code>MaxRecords</code> parameter.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeEndpointAuthorization</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by the <code>MaxRecords</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointAuthorizationRequest withMarker(String marker) {
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getGrantee() != null)
            sb.append("Grantee: ").append(getGrantee()).append(",");
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

        if (obj instanceof DescribeEndpointAuthorizationRequest == false)
            return false;
        DescribeEndpointAuthorizationRequest other = (DescribeEndpointAuthorizationRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false)
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

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointAuthorizationRequest clone() {
        return (DescribeEndpointAuthorizationRequest) super.clone();
    }

}
