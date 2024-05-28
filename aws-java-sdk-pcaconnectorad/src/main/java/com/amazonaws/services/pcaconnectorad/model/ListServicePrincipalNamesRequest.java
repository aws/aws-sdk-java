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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListServicePrincipalNames"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicePrincipalNamesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     */
    private String directoryRegistrationArn;
    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @param directoryRegistrationArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a href=
     *        "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *        >CreateDirectoryRegistration</a>.
     */

    public void setDirectoryRegistrationArn(String directoryRegistrationArn) {
        this.directoryRegistrationArn = directoryRegistrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *         >CreateDirectoryRegistration</a>.
     */

    public String getDirectoryRegistrationArn() {
        return this.directoryRegistrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     * >CreateDirectoryRegistration</a>.
     * </p>
     * 
     * @param directoryRegistrationArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a href=
     *        "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html"
     *        >CreateDirectoryRegistration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePrincipalNamesRequest withDirectoryRegistrationArn(String directoryRegistrationArn) {
        setDirectoryRegistrationArn(directoryRegistrationArn);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter when paginating results to specify the maximum number of items to return in the
     *        response on each page. If additional items exist beyond the number you specify, the <code>NextToken</code>
     *        element is sent in the response. Use this <code>NextToken</code> value in a subsequent request to retrieve
     *        additional items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @return Use this parameter when paginating results to specify the maximum number of items to return in the
     *         response on each page. If additional items exist beyond the number you specify, the
     *         <code>NextToken</code> element is sent in the response. Use this <code>NextToken</code> value in a
     *         subsequent request to retrieve additional items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter when paginating results to specify the maximum number of items to return in the
     *        response on each page. If additional items exist beyond the number you specify, the <code>NextToken</code>
     *        element is sent in the response. Use this <code>NextToken</code> value in a subsequent request to retrieve
     *        additional items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePrincipalNamesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @return Use this parameter when paginating results in a subsequent request after you receive a response with
     *         truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *         received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePrincipalNamesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDirectoryRegistrationArn() != null)
            sb.append("DirectoryRegistrationArn: ").append(getDirectoryRegistrationArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicePrincipalNamesRequest == false)
            return false;
        ListServicePrincipalNamesRequest other = (ListServicePrincipalNamesRequest) obj;
        if (other.getDirectoryRegistrationArn() == null ^ this.getDirectoryRegistrationArn() == null)
            return false;
        if (other.getDirectoryRegistrationArn() != null && other.getDirectoryRegistrationArn().equals(this.getDirectoryRegistrationArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryRegistrationArn() == null) ? 0 : getDirectoryRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServicePrincipalNamesRequest clone() {
        return (ListServicePrincipalNamesRequest) super.clone();
    }

}
