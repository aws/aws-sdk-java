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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListSecurityControlDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityControlDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     * </p>
     */
    private String standardsArn;
    /**
     * <p>
     * Optional pagination parameter.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 security controls that apply to the
     * specified standard. The results also include a <code>NextToken</code> parameter that you can use in a subsequent
     * API call to get the next 25 controls. This repeats until all controls for the standard are returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     * </p>
     * 
     * @param standardsArn
     *        The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     * </p>
     * 
     * @param standardsArn
     *        The Amazon Resource Name (ARN) of the standard that you want to view controls for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityControlDefinitionsRequest withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
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

    public ListSecurityControlDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 security controls that apply to the
     * specified standard. The results also include a <code>NextToken</code> parameter that you can use in a subsequent
     * API call to get the next 25 controls. This repeats until all controls for the standard are returned.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that limits the total results of the API response to the specified number. If this
     *        parameter isn't provided in the request, the results include the first 25 security controls that apply to
     *        the specified standard. The results also include a <code>NextToken</code> parameter that you can use in a
     *        subsequent API call to get the next 25 controls. This repeats until all controls for the standard are
     *        returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 security controls that apply to the
     * specified standard. The results also include a <code>NextToken</code> parameter that you can use in a subsequent
     * API call to get the next 25 controls. This repeats until all controls for the standard are returned.
     * </p>
     * 
     * @return An optional parameter that limits the total results of the API response to the specified number. If this
     *         parameter isn't provided in the request, the results include the first 25 security controls that apply to
     *         the specified standard. The results also include a <code>NextToken</code> parameter that you can use in a
     *         subsequent API call to get the next 25 controls. This repeats until all controls for the standard are
     *         returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that limits the total results of the API response to the specified number. If this
     * parameter isn't provided in the request, the results include the first 25 security controls that apply to the
     * specified standard. The results also include a <code>NextToken</code> parameter that you can use in a subsequent
     * API call to get the next 25 controls. This repeats until all controls for the standard are returned.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that limits the total results of the API response to the specified number. If this
     *        parameter isn't provided in the request, the results include the first 25 security controls that apply to
     *        the specified standard. The results also include a <code>NextToken</code> parameter that you can use in a
     *        subsequent API call to get the next 25 controls. This repeats until all controls for the standard are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityControlDefinitionsRequest withMaxResults(Integer maxResults) {
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
        if (getStandardsArn() != null)
            sb.append("StandardsArn: ").append(getStandardsArn()).append(",");
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

        if (obj instanceof ListSecurityControlDefinitionsRequest == false)
            return false;
        ListSecurityControlDefinitionsRequest other = (ListSecurityControlDefinitionsRequest) obj;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
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

        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityControlDefinitionsRequest clone() {
        return (ListSecurityControlDefinitionsRequest) super.clone();
    }

}
