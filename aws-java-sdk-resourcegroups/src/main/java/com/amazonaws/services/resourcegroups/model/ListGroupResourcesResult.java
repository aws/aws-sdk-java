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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of resources from which you can determine each resource's identity, type, and group membership status.
     * </p>
     */
    private java.util.List<ListGroupResourcesItem> resources;
    /**
     * <important>
     * <p>
     * <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i> </b>
     * </p>
     * </important>
     */
    @Deprecated
    private java.util.List<ResourceIdentifier> resourceIdentifiers;
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
     * A list of <code>QueryError</code> objects. Each error is an object that contains <code>ErrorCode</code> and
     * <code>Message</code> structures. Possible values for <code>ErrorCode</code> are
     * <code>CLOUDFORMATION_STACK_INACTIVE</code> and <code>CLOUDFORMATION_STACK_NOT_EXISTING</code>.
     * </p>
     */
    private java.util.List<QueryError> queryErrors;

    /**
     * <p>
     * An array of resources from which you can determine each resource's identity, type, and group membership status.
     * </p>
     * 
     * @return An array of resources from which you can determine each resource's identity, type, and group membership
     *         status.
     */

    public java.util.List<ListGroupResourcesItem> getResources() {
        return resources;
    }

    /**
     * <p>
     * An array of resources from which you can determine each resource's identity, type, and group membership status.
     * </p>
     * 
     * @param resources
     *        An array of resources from which you can determine each resource's identity, type, and group membership
     *        status.
     */

    public void setResources(java.util.Collection<ListGroupResourcesItem> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<ListGroupResourcesItem>(resources);
    }

    /**
     * <p>
     * An array of resources from which you can determine each resource's identity, type, and group membership status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        An array of resources from which you can determine each resource's identity, type, and group membership
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesResult withResources(ListGroupResourcesItem... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<ListGroupResourcesItem>(resources.length));
        }
        for (ListGroupResourcesItem ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of resources from which you can determine each resource's identity, type, and group membership status.
     * </p>
     * 
     * @param resources
     *        An array of resources from which you can determine each resource's identity, type, and group membership
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesResult withResources(java.util.Collection<ListGroupResourcesItem> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <important>
     * <p>
     * <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i> </b>
     * </p>
     * </important>
     * 
     * @return <p>
     *         <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i>
     *         </b>
     *         </p>
     */
    @Deprecated
    public java.util.List<ResourceIdentifier> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    /**
     * <important>
     * <p>
     * <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i> </b>
     * </p>
     * </important>
     * 
     * @param resourceIdentifiers
     *        <p>
     *        <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i>
     *        </b>
     *        </p>
     */
    @Deprecated
    public void setResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        if (resourceIdentifiers == null) {
            this.resourceIdentifiers = null;
            return;
        }

        this.resourceIdentifiers = new java.util.ArrayList<ResourceIdentifier>(resourceIdentifiers);
    }

    /**
     * <important>
     * <p>
     * <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i> </b>
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIdentifiers(java.util.Collection)} or {@link #withResourceIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceIdentifiers
     *        <p>
     *        <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i>
     *        </b>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ListGroupResourcesResult withResourceIdentifiers(ResourceIdentifier... resourceIdentifiers) {
        if (this.resourceIdentifiers == null) {
            setResourceIdentifiers(new java.util.ArrayList<ResourceIdentifier>(resourceIdentifiers.length));
        }
        for (ResourceIdentifier ele : resourceIdentifiers) {
            this.resourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <important>
     * <p>
     * <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i> </b>
     * </p>
     * </important>
     * 
     * @param resourceIdentifiers
     *        <p>
     *        <b> <i>Deprecated - don't use this parameter. Use the <code>Resources</code> response field instead.</i>
     *        </b>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ListGroupResourcesResult withResourceIdentifiers(java.util.Collection<ResourceIdentifier> resourceIdentifiers) {
        setResourceIdentifiers(resourceIdentifiers);
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

    public ListGroupResourcesResult withNextToken(String nextToken) {
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

    public ListGroupResourcesResult withQueryErrors(QueryError... queryErrors) {
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

    public ListGroupResourcesResult withQueryErrors(java.util.Collection<QueryError> queryErrors) {
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
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

        if (obj instanceof ListGroupResourcesResult == false)
            return false;
        ListGroupResourcesResult other = (ListGroupResourcesResult) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifiers() == null) ? 0 : getResourceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQueryErrors() == null) ? 0 : getQueryErrors().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupResourcesResult clone() {
        try {
            return (ListGroupResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
