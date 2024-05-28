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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworkVpcAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceNetworkVpcAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     */
    private String serviceNetworkIdentifier;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the VPC.
     * </p>
     */
    private String vpcIdentifier;

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

    public ListServiceNetworkVpcAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     * 
     * @return A pagination token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceNetworkVpcAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param serviceNetworkIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network.
     */

    public void setServiceNetworkIdentifier(String serviceNetworkIdentifier) {
        this.serviceNetworkIdentifier = serviceNetworkIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service network.
     */

    public String getServiceNetworkIdentifier() {
        return this.serviceNetworkIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param serviceNetworkIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceNetworkVpcAssociationsRequest withServiceNetworkIdentifier(String serviceNetworkIdentifier) {
        setServiceNetworkIdentifier(serviceNetworkIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the VPC.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID or Amazon Resource Name (ARN) of the VPC.
     */

    public void setVpcIdentifier(String vpcIdentifier) {
        this.vpcIdentifier = vpcIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the VPC.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the VPC.
     */

    public String getVpcIdentifier() {
        return this.vpcIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the VPC.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID or Amazon Resource Name (ARN) of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceNetworkVpcAssociationsRequest withVpcIdentifier(String vpcIdentifier) {
        setVpcIdentifier(vpcIdentifier);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceNetworkIdentifier() != null)
            sb.append("ServiceNetworkIdentifier: ").append(getServiceNetworkIdentifier()).append(",");
        if (getVpcIdentifier() != null)
            sb.append("VpcIdentifier: ").append(getVpcIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceNetworkVpcAssociationsRequest == false)
            return false;
        ListServiceNetworkVpcAssociationsRequest other = (ListServiceNetworkVpcAssociationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceNetworkIdentifier() == null ^ this.getServiceNetworkIdentifier() == null)
            return false;
        if (other.getServiceNetworkIdentifier() != null && other.getServiceNetworkIdentifier().equals(this.getServiceNetworkIdentifier()) == false)
            return false;
        if (other.getVpcIdentifier() == null ^ this.getVpcIdentifier() == null)
            return false;
        if (other.getVpcIdentifier() != null && other.getVpcIdentifier().equals(this.getVpcIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkIdentifier() == null) ? 0 : getServiceNetworkIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVpcIdentifier() == null) ? 0 : getVpcIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceNetworkVpcAssociationsRequest clone() {
        return (ListServiceNetworkVpcAssociationsRequest) super.clone();
    }

}
