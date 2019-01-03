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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to list the devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The limit of the device request.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * 
     * @param accessToken
     *        The access tokens for the request to list devices.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * 
     * @return The access tokens for the request to list devices.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access tokens for the request to list devices.
     * </p>
     * 
     * @param accessToken
     *        The access tokens for the request to list devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * 
     * @param limit
     *        The limit of the device request.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * 
     * @return The limit of the device request.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The limit of the device request.
     * </p>
     * 
     * @param limit
     *        The limit of the device request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * 
     * @param paginationToken
     *        The pagination token for the list request.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * 
     * @return The pagination token for the list request.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * The pagination token for the list request.
     * </p>
     * 
     * @param paginationToken
     *        The pagination token for the list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesRequest == false)
            return false;
        ListDevicesRequest other = (ListDevicesRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesRequest clone() {
        return (ListDevicesRequest) super.clone();
    }

}
