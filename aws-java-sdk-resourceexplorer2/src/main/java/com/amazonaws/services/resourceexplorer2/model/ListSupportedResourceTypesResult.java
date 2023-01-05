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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListSupportedResourceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSupportedResourceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The list of resource types supported by Resource Explorer.
     * </p>
     */
    private java.util.List<SupportedResourceType> resourceTypes;

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

    public ListSupportedResourceTypesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of resource types supported by Resource Explorer.
     * </p>
     * 
     * @return The list of resource types supported by Resource Explorer.
     */

    public java.util.List<SupportedResourceType> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The list of resource types supported by Resource Explorer.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types supported by Resource Explorer.
     */

    public void setResourceTypes(java.util.Collection<SupportedResourceType> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<SupportedResourceType>(resourceTypes);
    }

    /**
     * <p>
     * The list of resource types supported by Resource Explorer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types supported by Resource Explorer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedResourceTypesResult withResourceTypes(SupportedResourceType... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<SupportedResourceType>(resourceTypes.length));
        }
        for (SupportedResourceType ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resource types supported by Resource Explorer.
     * </p>
     * 
     * @param resourceTypes
     *        The list of resource types supported by Resource Explorer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedResourceTypesResult withResourceTypes(java.util.Collection<SupportedResourceType> resourceTypes) {
        setResourceTypes(resourceTypes);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSupportedResourceTypesResult == false)
            return false;
        ListSupportedResourceTypesResult other = (ListSupportedResourceTypesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListSupportedResourceTypesResult clone() {
        try {
            return (ListSupportedResourceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
