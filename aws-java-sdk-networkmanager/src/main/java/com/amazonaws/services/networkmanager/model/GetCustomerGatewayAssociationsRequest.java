/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomerGatewayAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * </p>
     */
    private java.util.List<String> customerGatewayArns;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * </p>
     * 
     * @return One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *         >Resources Defined by Amazon EC2</a>. The maximum is 10.
     */

    public java.util.List<String> getCustomerGatewayArns() {
        return customerGatewayArns;
    }

    /**
     * <p>
     * One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * </p>
     * 
     * @param customerGatewayArns
     *        One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *        >Resources Defined by Amazon EC2</a>. The maximum is 10.
     */

    public void setCustomerGatewayArns(java.util.Collection<String> customerGatewayArns) {
        if (customerGatewayArns == null) {
            this.customerGatewayArns = null;
            return;
        }

        this.customerGatewayArns = new java.util.ArrayList<String>(customerGatewayArns);
    }

    /**
     * <p>
     * One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerGatewayArns(java.util.Collection)} or {@link #withCustomerGatewayArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param customerGatewayArns
     *        One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *        >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsRequest withCustomerGatewayArns(String... customerGatewayArns) {
        if (this.customerGatewayArns == null) {
            setCustomerGatewayArns(new java.util.ArrayList<String>(customerGatewayArns.length));
        }
        for (String ele : customerGatewayArns) {
            this.customerGatewayArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     * >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * </p>
     * 
     * @param customerGatewayArns
     *        One or more customer gateway Amazon Resource Names (ARNs). For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazonec2.html#amazonec2-resources-for-iam-policies"
     *        >Resources Defined by Amazon EC2</a>. The maximum is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsRequest withCustomerGatewayArns(java.util.Collection<String> customerGatewayArns) {
        setCustomerGatewayArns(customerGatewayArns);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomerGatewayAssociationsRequest withNextToken(String nextToken) {
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getCustomerGatewayArns() != null)
            sb.append("CustomerGatewayArns: ").append(getCustomerGatewayArns()).append(",");
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

        if (obj instanceof GetCustomerGatewayAssociationsRequest == false)
            return false;
        GetCustomerGatewayAssociationsRequest other = (GetCustomerGatewayAssociationsRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getCustomerGatewayArns() == null ^ this.getCustomerGatewayArns() == null)
            return false;
        if (other.getCustomerGatewayArns() != null && other.getCustomerGatewayArns().equals(this.getCustomerGatewayArns()) == false)
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

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayArns() == null) ? 0 : getCustomerGatewayArns().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCustomerGatewayAssociationsRequest clone() {
        return (GetCustomerGatewayAssociationsRequest) super.clone();
    }

}
