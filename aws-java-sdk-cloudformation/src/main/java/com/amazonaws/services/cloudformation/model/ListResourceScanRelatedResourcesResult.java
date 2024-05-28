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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListResourceScanRelatedResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScanRelatedResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     * resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScannedResource> relatedResources;
    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     * resources.
     * </p>
     * 
     * @return List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     *         resources.
     */

    public java.util.List<ScannedResource> getRelatedResources() {
        if (relatedResources == null) {
            relatedResources = new com.amazonaws.internal.SdkInternalList<ScannedResource>();
        }
        return relatedResources;
    }

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     * resources.
     * </p>
     * 
     * @param relatedResources
     *        List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     *        resources.
     */

    public void setRelatedResources(java.util.Collection<ScannedResource> relatedResources) {
        if (relatedResources == null) {
            this.relatedResources = null;
            return;
        }

        this.relatedResources = new com.amazonaws.internal.SdkInternalList<ScannedResource>(relatedResources);
    }

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     * resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedResources(java.util.Collection)} or {@link #withRelatedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedResources
     *        List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesResult withRelatedResources(ScannedResource... relatedResources) {
        if (this.relatedResources == null) {
            setRelatedResources(new com.amazonaws.internal.SdkInternalList<ScannedResource>(relatedResources.length));
        }
        for (ScannedResource ele : relatedResources) {
            this.relatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     * resources.
     * </p>
     * 
     * @param relatedResources
     *        List of up to <code>MaxResults</code> resources in the specified resource scan related to the specified
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesResult withRelatedResources(java.util.Collection<ScannedResource> relatedResources) {
        setRelatedResources(relatedResources);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that
     *        value for the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code>
     *        is set to an empty string.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @return If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that
     *         value for the <code>NextToken</code> parameter. If the request returns all results,
     *         <code>NextToken</code> is set to an empty string.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResourceScanRelatedResources</code> again and use that
     *        value for the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code>
     *        is set to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanRelatedResourcesResult withNextToken(String nextToken) {
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
        if (getRelatedResources() != null)
            sb.append("RelatedResources: ").append(getRelatedResources()).append(",");
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

        if (obj instanceof ListResourceScanRelatedResourcesResult == false)
            return false;
        ListResourceScanRelatedResourcesResult other = (ListResourceScanRelatedResourcesResult) obj;
        if (other.getRelatedResources() == null ^ this.getRelatedResources() == null)
            return false;
        if (other.getRelatedResources() != null && other.getRelatedResources().equals(this.getRelatedResources()) == false)
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

        hashCode = prime * hashCode + ((getRelatedResources() == null) ? 0 : getRelatedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceScanRelatedResourcesResult clone() {
        try {
            return (ListResourceScanRelatedResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
