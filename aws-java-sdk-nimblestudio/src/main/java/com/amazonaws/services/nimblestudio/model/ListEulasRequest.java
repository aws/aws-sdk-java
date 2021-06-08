/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEulasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of EULA IDs.
     * </p>
     */
    private java.util.List<String> eulaIds;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of EULA IDs.
     * </p>
     * 
     * @return A collection of EULA IDs.
     */

    public java.util.List<String> getEulaIds() {
        return eulaIds;
    }

    /**
     * <p>
     * A collection of EULA IDs.
     * </p>
     * 
     * @param eulaIds
     *        A collection of EULA IDs.
     */

    public void setEulaIds(java.util.Collection<String> eulaIds) {
        if (eulaIds == null) {
            this.eulaIds = null;
            return;
        }

        this.eulaIds = new java.util.ArrayList<String>(eulaIds);
    }

    /**
     * <p>
     * A collection of EULA IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEulaIds(java.util.Collection)} or {@link #withEulaIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param eulaIds
     *        A collection of EULA IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEulasRequest withEulaIds(String... eulaIds) {
        if (this.eulaIds == null) {
            setEulaIds(new java.util.ArrayList<String>(eulaIds.length));
        }
        for (String ele : eulaIds) {
            this.eulaIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of EULA IDs.
     * </p>
     * 
     * @param eulaIds
     *        A collection of EULA IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEulasRequest withEulaIds(java.util.Collection<String> eulaIds) {
        setEulaIds(eulaIds);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEulasRequest withNextToken(String nextToken) {
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
        if (getEulaIds() != null)
            sb.append("EulaIds: ").append(getEulaIds()).append(",");
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

        if (obj instanceof ListEulasRequest == false)
            return false;
        ListEulasRequest other = (ListEulasRequest) obj;
        if (other.getEulaIds() == null ^ this.getEulaIds() == null)
            return false;
        if (other.getEulaIds() != null && other.getEulaIds().equals(this.getEulaIds()) == false)
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

        hashCode = prime * hashCode + ((getEulaIds() == null) ? 0 : getEulaIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEulasRequest clone() {
        return (ListEulasRequest) super.clone();
    }

}
