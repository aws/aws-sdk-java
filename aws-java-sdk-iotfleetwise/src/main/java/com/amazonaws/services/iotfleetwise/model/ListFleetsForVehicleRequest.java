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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleetsForVehicle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsForVehicleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the vehicle to retrieve information about.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the vehicle to retrieve information about.
     * </p>
     * 
     * @param vehicleName
     *        The ID of the vehicle to retrieve information about.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The ID of the vehicle to retrieve information about.
     * </p>
     * 
     * @return The ID of the vehicle to retrieve information about.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The ID of the vehicle to retrieve information about.
     * </p>
     * 
     * @param vehicleName
     *        The ID of the vehicle to retrieve information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsForVehicleRequest withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next set of results.</p>
     *        <p>
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next set of results,
     *        reissue the search request and include the returned token. When all results have been returned, the
     *        response does not contain a pagination token value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     * 
     * @return A pagination token for the next set of results.</p>
     *         <p>
     *         If the results of a search are large, only a portion of the results are returned, and a
     *         <code>nextToken</code> pagination token is returned in the response. To retrieve the next set of results,
     *         reissue the search request and include the returned token. When all results have been returned, the
     *         response does not contain a pagination token value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next set of results, reissue the search request and
     * include the returned token. When all results have been returned, the response does not contain a pagination token
     * value.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next set of results.</p>
     *        <p>
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next set of results,
     *        reissue the search request and include the returned token. When all results have been returned, the
     *        response does not contain a pagination token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsForVehicleRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return, between 1 and 100, inclusive.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     * 
     * @return The maximum number of items to return, between 1 and 100, inclusive.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return, between 1 and 100, inclusive.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return, between 1 and 100, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsForVehicleRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getVehicleName() != null)
            sb.append("VehicleName: ").append(getVehicleName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFleetsForVehicleRequest == false)
            return false;
        ListFleetsForVehicleRequest other = (ListFleetsForVehicleRequest) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFleetsForVehicleRequest clone() {
        return (ListFleetsForVehicleRequest) super.clone();
    }

}
