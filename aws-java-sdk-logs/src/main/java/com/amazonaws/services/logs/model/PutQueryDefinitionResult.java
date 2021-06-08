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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutQueryDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutQueryDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the query definition.
     * </p>
     */
    private String queryDefinitionId;

    /**
     * <p>
     * The ID of the query definition.
     * </p>
     * 
     * @param queryDefinitionId
     *        The ID of the query definition.
     */

    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * <p>
     * The ID of the query definition.
     * </p>
     * 
     * @return The ID of the query definition.
     */

    public String getQueryDefinitionId() {
        return this.queryDefinitionId;
    }

    /**
     * <p>
     * The ID of the query definition.
     * </p>
     * 
     * @param queryDefinitionId
     *        The ID of the query definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionResult withQueryDefinitionId(String queryDefinitionId) {
        setQueryDefinitionId(queryDefinitionId);
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
        if (getQueryDefinitionId() != null)
            sb.append("QueryDefinitionId: ").append(getQueryDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutQueryDefinitionResult == false)
            return false;
        PutQueryDefinitionResult other = (PutQueryDefinitionResult) obj;
        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public PutQueryDefinitionResult clone() {
        try {
            return (PutQueryDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
