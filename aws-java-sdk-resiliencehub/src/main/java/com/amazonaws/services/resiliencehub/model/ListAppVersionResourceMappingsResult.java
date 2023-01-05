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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResourceMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppVersionResourceMappingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Mappings used to map logical resources from the template to physical resources. You can use the mapping type
     * <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map individual resources
     * by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type <code>CFN_STACK</code> if
     * the application is backed by a CloudFormation stack.
     * </p>
     */
    private java.util.List<ResourceMapping> resourceMappings;

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

    public ListAppVersionResourceMappingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Mappings used to map logical resources from the template to physical resources. You can use the mapping type
     * <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map individual resources
     * by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type <code>CFN_STACK</code> if
     * the application is backed by a CloudFormation stack.
     * </p>
     * 
     * @return Mappings used to map logical resources from the template to physical resources. You can use the mapping
     *         type <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map
     *         individual resources by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type
     *         <code>CFN_STACK</code> if the application is backed by a CloudFormation stack.
     */

    public java.util.List<ResourceMapping> getResourceMappings() {
        return resourceMappings;
    }

    /**
     * <p>
     * Mappings used to map logical resources from the template to physical resources. You can use the mapping type
     * <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map individual resources
     * by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type <code>CFN_STACK</code> if
     * the application is backed by a CloudFormation stack.
     * </p>
     * 
     * @param resourceMappings
     *        Mappings used to map logical resources from the template to physical resources. You can use the mapping
     *        type <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map
     *        individual resources by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type
     *        <code>CFN_STACK</code> if the application is backed by a CloudFormation stack.
     */

    public void setResourceMappings(java.util.Collection<ResourceMapping> resourceMappings) {
        if (resourceMappings == null) {
            this.resourceMappings = null;
            return;
        }

        this.resourceMappings = new java.util.ArrayList<ResourceMapping>(resourceMappings);
    }

    /**
     * <p>
     * Mappings used to map logical resources from the template to physical resources. You can use the mapping type
     * <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map individual resources
     * by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type <code>CFN_STACK</code> if
     * the application is backed by a CloudFormation stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceMappings(java.util.Collection)} or {@link #withResourceMappings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceMappings
     *        Mappings used to map logical resources from the template to physical resources. You can use the mapping
     *        type <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map
     *        individual resources by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type
     *        <code>CFN_STACK</code> if the application is backed by a CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourceMappingsResult withResourceMappings(ResourceMapping... resourceMappings) {
        if (this.resourceMappings == null) {
            setResourceMappings(new java.util.ArrayList<ResourceMapping>(resourceMappings.length));
        }
        for (ResourceMapping ele : resourceMappings) {
            this.resourceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Mappings used to map logical resources from the template to physical resources. You can use the mapping type
     * <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map individual resources
     * by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type <code>CFN_STACK</code> if
     * the application is backed by a CloudFormation stack.
     * </p>
     * 
     * @param resourceMappings
     *        Mappings used to map logical resources from the template to physical resources. You can use the mapping
     *        type <code>CFN_STACK</code> if the application template uses a logical stack name. Or you can map
     *        individual resources by using the mapping type <code>RESOURCE</code>. We recommend using the mapping type
     *        <code>CFN_STACK</code> if the application is backed by a CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppVersionResourceMappingsResult withResourceMappings(java.util.Collection<ResourceMapping> resourceMappings) {
        setResourceMappings(resourceMappings);
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
        if (getResourceMappings() != null)
            sb.append("ResourceMappings: ").append(getResourceMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppVersionResourceMappingsResult == false)
            return false;
        ListAppVersionResourceMappingsResult other = (ListAppVersionResourceMappingsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceMappings() == null ^ this.getResourceMappings() == null)
            return false;
        if (other.getResourceMappings() != null && other.getResourceMappings().equals(this.getResourceMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceMappings() == null) ? 0 : getResourceMappings().hashCode());
        return hashCode;
    }

    @Override
    public ListAppVersionResourceMappingsResult clone() {
        try {
            return (ListAppVersionResourceMappingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
