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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetNamedQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of query IDs.
     * </p>
     */
    private java.util.List<String> namedQueryIds;

    /**
     * <p>
     * An array of query IDs.
     * </p>
     * 
     * @return An array of query IDs.
     */

    public java.util.List<String> getNamedQueryIds() {
        return namedQueryIds;
    }

    /**
     * <p>
     * An array of query IDs.
     * </p>
     * 
     * @param namedQueryIds
     *        An array of query IDs.
     */

    public void setNamedQueryIds(java.util.Collection<String> namedQueryIds) {
        if (namedQueryIds == null) {
            this.namedQueryIds = null;
            return;
        }

        this.namedQueryIds = new java.util.ArrayList<String>(namedQueryIds);
    }

    /**
     * <p>
     * An array of query IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamedQueryIds(java.util.Collection)} or {@link #withNamedQueryIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param namedQueryIds
     *        An array of query IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetNamedQueryRequest withNamedQueryIds(String... namedQueryIds) {
        if (this.namedQueryIds == null) {
            setNamedQueryIds(new java.util.ArrayList<String>(namedQueryIds.length));
        }
        for (String ele : namedQueryIds) {
            this.namedQueryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of query IDs.
     * </p>
     * 
     * @param namedQueryIds
     *        An array of query IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetNamedQueryRequest withNamedQueryIds(java.util.Collection<String> namedQueryIds) {
        setNamedQueryIds(namedQueryIds);
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
        if (getNamedQueryIds() != null)
            sb.append("NamedQueryIds: ").append(getNamedQueryIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetNamedQueryRequest == false)
            return false;
        BatchGetNamedQueryRequest other = (BatchGetNamedQueryRequest) obj;
        if (other.getNamedQueryIds() == null ^ this.getNamedQueryIds() == null)
            return false;
        if (other.getNamedQueryIds() != null && other.getNamedQueryIds().equals(this.getNamedQueryIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamedQueryIds() == null) ? 0 : getNamedQueryIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetNamedQueryRequest clone() {
        return (BatchGetNamedQueryRequest) super.clone();
    }

}
