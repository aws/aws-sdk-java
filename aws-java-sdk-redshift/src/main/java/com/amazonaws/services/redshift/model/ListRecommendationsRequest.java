/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ListRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is returned.
     * If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor recommendations is
     * returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve
     * the next set of records by retrying the command with the returned marker value.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is returned.
     * If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is
     *        returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified,
     *        then recommendations for all clusters in the account are returned.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is returned.
     * If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     * 
     * @return The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is
     *         returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified,
     *         then recommendations for all clusters in the account are returned.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is returned.
     * If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the Amazon Redshift cluster for which the list of Advisor recommendations is
     *        returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified,
     *        then recommendations for all clusters in the account are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor recommendations is
     * returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor
     *        recommendations is returned. If the neither the cluster identifier and the cluster namespace ARN
     *        parameters are specified, then recommendations for all clusters in the account are returned.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor recommendations is
     * returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     * 
     * @return The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor
     *         recommendations is returned. If the neither the cluster identifier and the cluster namespace ARN
     *         parameters are specified, then recommendations for all clusters in the account are returned.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor recommendations is
     * returned. If the neither the cluster identifier and the cluster namespace ARN parameters are specified, then
     * recommendations for all clusters in the account are returned.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Redshift cluster namespace Amazon Resource Name (ARN) for which the list of Advisor
     *        recommendations is returned. If the neither the cluster identifier and the cluster namespace ARN
     *        parameters are specified, then recommendations for all clusters in the account are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve
     * the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can
     *        retrieve the next set of records by retrying the command with the returned marker value.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve
     * the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified MaxRecords value, a value is returned in a marker field of the response.
     *         You can retrieve the next set of records by retrying the command with the returned marker value.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve
     * the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can
     *        retrieve the next set of records by retrying the command with the returned marker value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *        records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *         records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *        records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withMarker(String marker) {
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
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
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

        if (obj instanceof ListRecommendationsRequest == false)
            return false;
        ListRecommendationsRequest other = (ListRecommendationsRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
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
        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsRequest clone() {
        return (ListRecommendationsRequest) super.clone();
    }

}
