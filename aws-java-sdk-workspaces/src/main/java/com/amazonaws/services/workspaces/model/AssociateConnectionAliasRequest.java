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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateConnectionAlias"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateConnectionAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * The identifier of the directory to associate the connection alias with.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @return The identifier of the connection alias.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateConnectionAliasRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * The identifier of the directory to associate the connection alias with.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory to associate the connection alias with.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the directory to associate the connection alias with.
     * </p>
     * 
     * @return The identifier of the directory to associate the connection alias with.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the directory to associate the connection alias with.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory to associate the connection alias with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateConnectionAliasRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateConnectionAliasRequest == false)
            return false;
        AssociateConnectionAliasRequest other = (AssociateConnectionAliasRequest) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateConnectionAliasRequest clone() {
        return (AssociateConnectionAliasRequest) super.clone();
    }

}
