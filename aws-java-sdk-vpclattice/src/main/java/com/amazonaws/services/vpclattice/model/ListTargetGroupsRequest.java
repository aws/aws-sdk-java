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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListTargetGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTargetGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The target group type.
     * </p>
     */
    private String targetGroupType;
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

    public ListTargetGroupsRequest withMaxResults(Integer maxResults) {
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

    public ListTargetGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param targetGroupType
     *        The target group type.
     * @see TargetGroupType
     */

    public void setTargetGroupType(String targetGroupType) {
        this.targetGroupType = targetGroupType;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @return The target group type.
     * @see TargetGroupType
     */

    public String getTargetGroupType() {
        return this.targetGroupType;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param targetGroupType
     *        The target group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public ListTargetGroupsRequest withTargetGroupType(String targetGroupType) {
        setTargetGroupType(targetGroupType);
        return this;
    }

    /**
     * <p>
     * The target group type.
     * </p>
     * 
     * @param targetGroupType
     *        The target group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public ListTargetGroupsRequest withTargetGroupType(TargetGroupType targetGroupType) {
        this.targetGroupType = targetGroupType.toString();
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

    public ListTargetGroupsRequest withVpcIdentifier(String vpcIdentifier) {
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
        if (getTargetGroupType() != null)
            sb.append("TargetGroupType: ").append(getTargetGroupType()).append(",");
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

        if (obj instanceof ListTargetGroupsRequest == false)
            return false;
        ListTargetGroupsRequest other = (ListTargetGroupsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTargetGroupType() == null ^ this.getTargetGroupType() == null)
            return false;
        if (other.getTargetGroupType() != null && other.getTargetGroupType().equals(this.getTargetGroupType()) == false)
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
        hashCode = prime * hashCode + ((getTargetGroupType() == null) ? 0 : getTargetGroupType().hashCode());
        hashCode = prime * hashCode + ((getVpcIdentifier() == null) ? 0 : getVpcIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetGroupsRequest clone() {
        return (ListTargetGroupsRequest) super.clone();
    }

}
