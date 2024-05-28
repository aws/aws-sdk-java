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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListOutpostResolvers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutpostResolversRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * The maximum number of Resolvers on the Outpost that you want to return in the response to a
     * <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the request
     * returns up to 100 Resolvers.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>ListOutpostResolver</code> request, omit this value.
     * </p>
     * <p/>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostResolversRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of Resolvers on the Outpost that you want to return in the response to a
     * <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the request
     * returns up to 100 Resolvers.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Resolvers on the Outpost that you want to return in the response to a
     *        <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the
     *        request returns up to 100 Resolvers.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of Resolvers on the Outpost that you want to return in the response to a
     * <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the request
     * returns up to 100 Resolvers.
     * </p>
     * 
     * @return The maximum number of Resolvers on the Outpost that you want to return in the response to a
     *         <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the
     *         request returns up to 100 Resolvers.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of Resolvers on the Outpost that you want to return in the response to a
     * <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the request
     * returns up to 100 Resolvers.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Resolvers on the Outpost that you want to return in the response to a
     *        <code>ListOutpostResolver</code> request. If you don't specify a value for <code>MaxResults</code>, the
     *        request returns up to 100 Resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostResolversRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>ListOutpostResolver</code> request, omit this value.
     * </p>
     * <p/>
     * 
     * @param nextToken
     *        For the first <code>ListOutpostResolver</code> request, omit this value.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListOutpostResolver</code> request, omit this value.
     * </p>
     * <p/>
     * 
     * @return For the first <code>ListOutpostResolver</code> request, omit this value.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListOutpostResolver</code> request, omit this value.
     * </p>
     * <p/>
     * 
     * @param nextToken
     *        For the first <code>ListOutpostResolver</code> request, omit this value.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostResolversRequest withNextToken(String nextToken) {
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
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
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

        if (obj instanceof ListOutpostResolversRequest == false)
            return false;
        ListOutpostResolversRequest other = (ListOutpostResolversRequest) obj;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
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

        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOutpostResolversRequest clone() {
        return (ListOutpostResolversRequest) super.clone();
    }

}
