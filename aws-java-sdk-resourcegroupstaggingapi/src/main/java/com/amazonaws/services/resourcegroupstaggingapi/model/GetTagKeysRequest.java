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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetTagKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTagKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a PaginationToken, use that string for this value to request an additional page of data.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a PaginationToken, use that string for this value to request an additional page of data.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that additional data is available. Leave this value empty for your initial
     *        request. If the response includes a PaginationToken, use that string for this value to request an
     *        additional page of data.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a PaginationToken, use that string for this value to request an additional page of data.
     * </p>
     * 
     * @return A string that indicates that additional data is available. Leave this value empty for your initial
     *         request. If the response includes a PaginationToken, use that string for this value to request an
     *         additional page of data.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a PaginationToken, use that string for this value to request an additional page of data.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that additional data is available. Leave this value empty for your initial
     *        request. If the response includes a PaginationToken, use that string for this value to request an
     *        additional page of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagKeysRequest withPaginationToken(String paginationToken) {
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

        if (obj instanceof GetTagKeysRequest == false)
            return false;
        GetTagKeysRequest other = (GetTagKeysRequest) obj;
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

        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTagKeysRequest clone() {
        return (GetTagKeysRequest) super.clone();
    }

}
