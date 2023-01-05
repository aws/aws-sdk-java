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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Search" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of resources that match the query.
     * </p>
     */
    private ResourceCount count;
    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of structures that describe the resources that match the query.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that this operation used to perform the search.
     * </p>
     */
    private String viewArn;

    /**
     * <p>
     * The number of resources that match the query.
     * </p>
     * 
     * @param count
     *        The number of resources that match the query.
     */

    public void setCount(ResourceCount count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of resources that match the query.
     * </p>
     * 
     * @return The number of resources that match the query.
     */

    public ResourceCount getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of resources that match the query.
     * </p>
     * 
     * @param count
     *        The number of resources that match the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withCount(ResourceCount count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @return If present, indicates that more output is available than is included in the current response. Use this
     *         value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *         next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *         back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of structures that describe the resources that match the query.
     * </p>
     * 
     * @return The list of structures that describe the resources that match the query.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * The list of structures that describe the resources that match the query.
     * </p>
     * 
     * @param resources
     *        The list of structures that describe the resources that match the query.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * The list of structures that describe the resources that match the query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The list of structures that describe the resources that match the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of structures that describe the resources that match the query.
     * </p>
     * 
     * @param resources
     *        The list of structures that describe the resources that match the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that this operation used to perform the search.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view that this operation used to perform the search.
     */

    public void setViewArn(String viewArn) {
        this.viewArn = viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that this operation used to perform the search.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the view that this operation used to perform the search.
     */

    public String getViewArn() {
        return this.viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that this operation used to perform the search.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view that this operation used to perform the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResult withViewArn(String viewArn) {
        setViewArn(viewArn);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getViewArn() != null)
            sb.append("ViewArn: ").append(getViewArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResult == false)
            return false;
        SearchResult other = (SearchResult) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getViewArn() == null ^ this.getViewArn() == null)
            return false;
        if (other.getViewArn() != null && other.getViewArn().equals(this.getViewArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getViewArn() == null) ? 0 : getViewArn().hashCode());
        return hashCode;
    }

    @Override
    public SearchResult clone() {
        try {
            return (SearchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
