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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/SearchResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARNs and resource types of resources that are members of the group that you specified.
     * </p>
     */
    private java.util.List<ResourceIdentifier> resourceIdentifiers;
    /**
     * <p>
     * The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code> and
     * <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     * <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * </p>
     */
    private java.util.List<QueryError> queryErrors;

    /**
     * <p>
     * The ARNs and resource types of resources that are members of the group that you specified.
     * </p>
     * 
     * @return The ARNs and resource types of resources that are members of the group that you specified.
     */

    public java.util.List<ResourceIdentifier> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    /**
     * <p>
     * The ARNs and resource types of resources that are members of the group that you specified.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The ARNs and resource types of resources that are members of the group that you specified.
     */

    public void setResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new java.util.ArrayList<ResourceIdentifier>(resourceIdentifiers);
    }

    /**
     * <p>
     * The ARNs and resource types of resources that are members of the group that you specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The ARNs and resource types of resources that are members of the group that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withResourceIdentifiers(ResourceIdentifier... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new java.util.ArrayList<ResourceIdentifier>(resourceIdentifiers.length));
        }
        for (ResourceIdentifier ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs and resource types of resources that are members of the group that you specified.
     * </p>
     * 
     * @param resourceIdentifiers
     *        The ARNs and resource types of resources that are members of the group that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
        return this;
    }

    /**
     * <p>
     * The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     * </p>
     * 
     * @param nextToken
     *        The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     * </p>
     * 
     * @return The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     * </p>
     * 
     * @param nextToken
     *        The NextToken value to include in a subsequent <code>SearchResources</code> request, to get more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code> and
     * <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     * <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * </p>
     * 
     * @return A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code>
     *         and <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     *         <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     */

    public java.util.List<QueryError> getQueryErrors() {
        return queryErrors;
    }

    /**
     * <p>
     * A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code> and
     * <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     * <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * </p>
     * 
     * @param queryErrors
     *        A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code>
     *        and <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     *        <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     */

    public void setQueryErrors(java.util.Collection<QueryError> queryErrors) {
        if (queryErrors == null) {
            this.queryErrors = null;
            return;
        }

        this.queryErrors = new java.util.ArrayList<QueryError>(queryErrors);
    }

    /**
     * <p>
     * A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code> and
     * <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     * <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryErrors(java.util.Collection)} or {@link #withQueryErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queryErrors
     *        A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code>
     *        and <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     *        <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withQueryErrors(QueryError... queryErrors) {
        if (this.queryErrors == null) {
            setQueryErrors(new java.util.ArrayList<QueryError>(queryErrors.length));
        }
        for (QueryError ele : queryErrors) {
            this.queryErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code> and
     * <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     * <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * </p>
     * 
     * @param queryErrors
     *        A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code>
     *        and <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     *        <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesResult withQueryErrors(java.util.Collection<QueryError> queryErrors) {
        setQueryErrors(queryErrors);
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
        if (getResourceIdentifiers() != null)
            sb.append("ResourceIdentifiers: ").append(getResourceIdentifiers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getQueryErrors() != null)
            sb.append("QueryErrors: ").append(getQueryErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResourcesResult == false)
            return false;
        SearchResourcesResult other = (SearchResourcesResult) obj;
        if (other.getResourceIdentifiers() == null ^ this.getResourceIdentifiers() == null)
            return false;
        if (other.getResourceIdentifiers() != null && other.getResourceIdentifiers().equals(this.getResourceIdentifiers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQueryErrors() == null ^ this.getQueryErrors() == null)
            return false;
        if (other.getQueryErrors() != null && other.getQueryErrors().equals(this.getQueryErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQueryErrors() == null) ? 0 : getQueryErrors().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesResult clone() {
        try {
            return (SearchResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
