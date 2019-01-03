/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTaskDefinitionFamilies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTaskDefinitionFamiliesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> families;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request. When the
     * results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     * 
     * @return The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     */

    public java.util.List<String> getFamilies() {
        if (families == null) {
            families = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return families;
    }

    /**
     * <p>
     * The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     * 
     * @param families
     *        The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     */

    public void setFamilies(java.util.Collection<String> families) {
        if (families == null) {
            this.families = null;
            return;
        }

        this.families = new com.amazonaws.internal.SdkInternalList<String>(families);
    }

    /**
     * <p>
     * The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFamilies(java.util.Collection)} or {@link #withFamilies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param families
     *        The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskDefinitionFamiliesResult withFamilies(String... families) {
        if (this.families == null) {
            setFamilies(new com.amazonaws.internal.SdkInternalList<String>(families.length));
        }
        for (String ele : families) {
            this.families.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * </p>
     * 
     * @param families
     *        The list of task definition family names that match the <code>ListTaskDefinitionFamilies</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskDefinitionFamiliesResult withFamilies(java.util.Collection<String> families) {
        setFamilies(families);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request. When the
     * results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request.
     *        When the results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request. When the
     * results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request.
     *         When the results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>,
     *         this value can be used to retrieve the next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request. When the
     * results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListTaskDefinitionFamilies</code> request.
     *        When the results of a <code>ListTaskDefinitionFamilies</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTaskDefinitionFamiliesResult withNextToken(String nextToken) {
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
        if (getFamilies() != null)
            sb.append("Families: ").append(getFamilies()).append(",");
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

        if (obj instanceof ListTaskDefinitionFamiliesResult == false)
            return false;
        ListTaskDefinitionFamiliesResult other = (ListTaskDefinitionFamiliesResult) obj;
        if (other.getFamilies() == null ^ this.getFamilies() == null)
            return false;
        if (other.getFamilies() != null && other.getFamilies().equals(this.getFamilies()) == false)
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

        hashCode = prime * hashCode + ((getFamilies() == null) ? 0 : getFamilies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTaskDefinitionFamiliesResult clone() {
        try {
            return (ListTaskDefinitionFamiliesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
