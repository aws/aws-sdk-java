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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BatchGetCustomDataIdentifiers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCustomDataIdentifiersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information
     * about.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information
     * about.
     * </p>
     * 
     * @return An array of strings that lists the unique identifiers for the custom data identifiers to retrieve
     *         information about.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information
     * about.
     * </p>
     * 
     * @param ids
     *        An array of strings that lists the unique identifiers for the custom data identifiers to retrieve
     *        information about.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information
     * about.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        An array of strings that lists the unique identifiers for the custom data identifiers to retrieve
     *        information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifiersRequest withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information
     * about.
     * </p>
     * 
     * @param ids
     *        An array of strings that lists the unique identifiers for the custom data identifiers to retrieve
     *        information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifiersRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCustomDataIdentifiersRequest == false)
            return false;
        BatchGetCustomDataIdentifiersRequest other = (BatchGetCustomDataIdentifiersRequest) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCustomDataIdentifiersRequest clone() {
        return (BatchGetCustomDataIdentifiersRequest) super.clone();
    }

}
