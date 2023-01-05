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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadinessCheckResourceStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Name of a readiness check.
     * </p>
     */
    private String readinessCheckName;
    /**
     * <p>
     * The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the resource by
     * Application Recovery Controller (for example, for a DNS target resource).
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of objects that you want to return with this call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     * 
     * @return The number of objects that you want to return with this call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of objects that you want to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Name of a readiness check.
     * </p>
     * 
     * @param readinessCheckName
     *        Name of a readiness check.
     */

    public void setReadinessCheckName(String readinessCheckName) {
        this.readinessCheckName = readinessCheckName;
    }

    /**
     * <p>
     * Name of a readiness check.
     * </p>
     * 
     * @return Name of a readiness check.
     */

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * <p>
     * Name of a readiness check.
     * </p>
     * 
     * @param readinessCheckName
     *        Name of a readiness check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withReadinessCheckName(String readinessCheckName) {
        setReadinessCheckName(readinessCheckName);
        return this;
    }

    /**
     * <p>
     * The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the resource by
     * Application Recovery Controller (for example, for a DNS target resource).
     * </p>
     * 
     * @param resourceIdentifier
     *        The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the
     *        resource by Application Recovery Controller (for example, for a DNS target resource).
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the resource by
     * Application Recovery Controller (for example, for a DNS target resource).
     * </p>
     * 
     * @return The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the
     *         resource by Application Recovery Controller (for example, for a DNS target resource).
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the resource by
     * Application Recovery Controller (for example, for a DNS target resource).
     * </p>
     * 
     * @param resourceIdentifier
     *        The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the
     *        resource by Application Recovery Controller (for example, for a DNS target resource).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getReadinessCheckName() != null)
            sb.append("ReadinessCheckName: ").append(getReadinessCheckName()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadinessCheckResourceStatusRequest == false)
            return false;
        GetReadinessCheckResourceStatusRequest other = (GetReadinessCheckResourceStatusRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReadinessCheckName() == null ^ this.getReadinessCheckName() == null)
            return false;
        if (other.getReadinessCheckName() != null && other.getReadinessCheckName().equals(this.getReadinessCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReadinessCheckName() == null) ? 0 : getReadinessCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetReadinessCheckResourceStatusRequest clone() {
        return (GetReadinessCheckResourceStatusRequest) super.clone();
    }

}
