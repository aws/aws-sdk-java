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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListStandardsControlAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStandardsControlAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>,
     * or a mix of both parameters) that you want to determine the enablement status of in each enabled standard.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * Optional pagination parameter.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 standard and control associations. The
     * results also include a <code>NextToken</code> parameter that you can use in a subsequent API call to get the next
     * 25 associations. This repeats until all associations for the specified control are returned. The number of
     * results is limited by the number of supported Security Hub standards that you've enabled in the calling account.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>,
     * or a mix of both parameters) that you want to determine the enablement status of in each enabled standard.
     * </p>
     * 
     * @param securityControlId
     *        The identifier of the control (identified with <code>SecurityControlId</code>,
     *        <code>SecurityControlArn</code>, or a mix of both parameters) that you want to determine the enablement
     *        status of in each enabled standard.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The identifier of the control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>,
     * or a mix of both parameters) that you want to determine the enablement status of in each enabled standard.
     * </p>
     * 
     * @return The identifier of the control (identified with <code>SecurityControlId</code>,
     *         <code>SecurityControlArn</code>, or a mix of both parameters) that you want to determine the enablement
     *         status of in each enabled standard.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The identifier of the control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>,
     * or a mix of both parameters) that you want to determine the enablement status of in each enabled standard.
     * </p>
     * 
     * @param securityControlId
     *        The identifier of the control (identified with <code>SecurityControlId</code>,
     *        <code>SecurityControlArn</code>, or a mix of both parameters) that you want to determine the enablement
     *        status of in each enabled standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStandardsControlAssociationsRequest withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * Optional pagination parameter.
     * </p>
     * 
     * @param nextToken
     *        Optional pagination parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Optional pagination parameter.
     * </p>
     * 
     * @return Optional pagination parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Optional pagination parameter.
     * </p>
     * 
     * @param nextToken
     *        Optional pagination parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStandardsControlAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 standard and control associations. The
     * results also include a <code>NextToken</code> parameter that you can use in a subsequent API call to get the next
     * 25 associations. This repeats until all associations for the specified control are returned. The number of
     * results is limited by the number of supported Security Hub standards that you've enabled in the calling account.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that limits the total results of the API response to the specified number. If this
     *        parameter isn't provided in the request, the results include the first 25 standard and control
     *        associations. The results also include a <code>NextToken</code> parameter that you can use in a subsequent
     *        API call to get the next 25 associations. This repeats until all associations for the specified control
     *        are returned. The number of results is limited by the number of supported Security Hub standards that
     *        you've enabled in the calling account.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 standard and control associations. The
     * results also include a <code>NextToken</code> parameter that you can use in a subsequent API call to get the next
     * 25 associations. This repeats until all associations for the specified control are returned. The number of
     * results is limited by the number of supported Security Hub standards that you've enabled in the calling account.
     * </p>
     * 
     * @return An optional parameter that limits the total results of the API response to the specified number. If this
     *         parameter isn't provided in the request, the results include the first 25 standard and control
     *         associations. The results also include a <code>NextToken</code> parameter that you can use in a
     *         subsequent API call to get the next 25 associations. This repeats until all associations for the
     *         specified control are returned. The number of results is limited by the number of supported Security Hub
     *         standards that you've enabled in the calling account.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 standard and control associations. The
     * results also include a <code>NextToken</code> parameter that you can use in a subsequent API call to get the next
     * 25 associations. This repeats until all associations for the specified control are returned. The number of
     * results is limited by the number of supported Security Hub standards that you've enabled in the calling account.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that limits the total results of the API response to the specified number. If this
     *        parameter isn't provided in the request, the results include the first 25 standard and control
     *        associations. The results also include a <code>NextToken</code> parameter that you can use in a subsequent
     *        API call to get the next 25 associations. This repeats until all associations for the specified control
     *        are returned. The number of results is limited by the number of supported Security Hub standards that
     *        you've enabled in the calling account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStandardsControlAssociationsRequest withMaxResults(Integer maxResults) {
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
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

        if (obj instanceof ListStandardsControlAssociationsRequest == false)
            return false;
        ListStandardsControlAssociationsRequest other = (ListStandardsControlAssociationsRequest) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
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

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListStandardsControlAssociationsRequest clone() {
        return (ListStandardsControlAssociationsRequest) super.clone();
    }

}
