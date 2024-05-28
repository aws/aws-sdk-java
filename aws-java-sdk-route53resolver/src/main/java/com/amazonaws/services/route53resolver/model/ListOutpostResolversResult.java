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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListOutpostResolvers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutpostResolversResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that match the
     * specified filters, if any.
     * </p>
     */
    private java.util.List<OutpostResolver> outpostResolvers;
    /**
     * <p>
     * If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     * <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that match the
     * specified filters, if any.
     * </p>
     * 
     * @return The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that
     *         match the specified filters, if any.
     */

    public java.util.List<OutpostResolver> getOutpostResolvers() {
        return outpostResolvers;
    }

    /**
     * <p>
     * The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that match the
     * specified filters, if any.
     * </p>
     * 
     * @param outpostResolvers
     *        The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that
     *        match the specified filters, if any.
     */

    public void setOutpostResolvers(java.util.Collection<OutpostResolver> outpostResolvers) {
        if (outpostResolvers == null) {
            this.outpostResolvers = null;
            return;
        }

        this.outpostResolvers = new java.util.ArrayList<OutpostResolver>(outpostResolvers);
    }

    /**
     * <p>
     * The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that match the
     * specified filters, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutpostResolvers(java.util.Collection)} or {@link #withOutpostResolvers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outpostResolvers
     *        The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that
     *        match the specified filters, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostResolversResult withOutpostResolvers(OutpostResolver... outpostResolvers) {
        if (this.outpostResolvers == null) {
            setOutpostResolvers(new java.util.ArrayList<OutpostResolver>(outpostResolvers.length));
        }
        for (OutpostResolver ele : outpostResolvers) {
            this.outpostResolvers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that match the
     * specified filters, if any.
     * </p>
     * 
     * @param outpostResolvers
     *        The Resolvers on Outposts that were created by using the current Amazon Web Services account, and that
     *        match the specified filters, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostResolversResult withOutpostResolvers(java.util.Collection<OutpostResolver> outpostResolvers) {
        setOutpostResolvers(outpostResolvers);
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     * <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     *        <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify
     *        the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     * <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     *         <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify
     *         the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     * <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify the value
     * of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> Resolvers match the specified criteria, you can submit another
     *        <code>ListOutpostResolver</code> request to get the next group of results. In the next request, specify
     *        the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutpostResolversResult withNextToken(String nextToken) {
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
        if (getOutpostResolvers() != null)
            sb.append("OutpostResolvers: ").append(getOutpostResolvers()).append(",");
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

        if (obj instanceof ListOutpostResolversResult == false)
            return false;
        ListOutpostResolversResult other = (ListOutpostResolversResult) obj;
        if (other.getOutpostResolvers() == null ^ this.getOutpostResolvers() == null)
            return false;
        if (other.getOutpostResolvers() != null && other.getOutpostResolvers().equals(this.getOutpostResolvers()) == false)
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

        hashCode = prime * hashCode + ((getOutpostResolvers() == null) ? 0 : getOutpostResolvers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOutpostResolversResult clone() {
        try {
            return (ListOutpostResolversResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
