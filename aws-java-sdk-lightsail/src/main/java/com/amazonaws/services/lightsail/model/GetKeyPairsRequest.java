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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyPairsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;
    /**
     * <p>
     * A Boolean value that indicates whether to include the default key pair in the response of your request.
     * </p>
     */
    private Boolean includeDefaultKeyPair;

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated,
     *        the response will return a next page token that you can specify as the page token in a subsequent request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated,
     *         the response will return a next page token that you can specify as the page token in a subsequent
     *         request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetKeyPairs</code> request. If your results are paginated,
     *        the response will return a next page token that you can specify as the page token in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyPairsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include the default key pair in the response of your request.
     * </p>
     * 
     * @param includeDefaultKeyPair
     *        A Boolean value that indicates whether to include the default key pair in the response of your request.
     */

    public void setIncludeDefaultKeyPair(Boolean includeDefaultKeyPair) {
        this.includeDefaultKeyPair = includeDefaultKeyPair;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include the default key pair in the response of your request.
     * </p>
     * 
     * @return A Boolean value that indicates whether to include the default key pair in the response of your request.
     */

    public Boolean getIncludeDefaultKeyPair() {
        return this.includeDefaultKeyPair;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include the default key pair in the response of your request.
     * </p>
     * 
     * @param includeDefaultKeyPair
     *        A Boolean value that indicates whether to include the default key pair in the response of your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyPairsRequest withIncludeDefaultKeyPair(Boolean includeDefaultKeyPair) {
        setIncludeDefaultKeyPair(includeDefaultKeyPair);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include the default key pair in the response of your request.
     * </p>
     * 
     * @return A Boolean value that indicates whether to include the default key pair in the response of your request.
     */

    public Boolean isIncludeDefaultKeyPair() {
        return this.includeDefaultKeyPair;
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
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
        if (getIncludeDefaultKeyPair() != null)
            sb.append("IncludeDefaultKeyPair: ").append(getIncludeDefaultKeyPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyPairsRequest == false)
            return false;
        GetKeyPairsRequest other = (GetKeyPairsRequest) obj;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getIncludeDefaultKeyPair() == null ^ this.getIncludeDefaultKeyPair() == null)
            return false;
        if (other.getIncludeDefaultKeyPair() != null && other.getIncludeDefaultKeyPair().equals(this.getIncludeDefaultKeyPair()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getIncludeDefaultKeyPair() == null) ? 0 : getIncludeDefaultKeyPair().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyPairsRequest clone() {
        return (GetKeyPairsRequest) super.clone();
    }

}
