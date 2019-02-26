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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisionedCapacityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response body contains the following JSON fields.
     * </p>
     */
    private java.util.List<ProvisionedCapacityDescription> provisionedCapacityList;

    /**
     * <p>
     * The response body contains the following JSON fields.
     * </p>
     * 
     * @return The response body contains the following JSON fields.
     */

    public java.util.List<ProvisionedCapacityDescription> getProvisionedCapacityList() {
        return provisionedCapacityList;
    }

    /**
     * <p>
     * The response body contains the following JSON fields.
     * </p>
     * 
     * @param provisionedCapacityList
     *        The response body contains the following JSON fields.
     */

    public void setProvisionedCapacityList(java.util.Collection<ProvisionedCapacityDescription> provisionedCapacityList) {
        if (provisionedCapacityList == null) {
            this.provisionedCapacityList = null;
            return;
        }

        this.provisionedCapacityList = new java.util.ArrayList<ProvisionedCapacityDescription>(provisionedCapacityList);
    }

    /**
     * <p>
     * The response body contains the following JSON fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedCapacityList(java.util.Collection)} or
     * {@link #withProvisionedCapacityList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisionedCapacityList
     *        The response body contains the following JSON fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedCapacityResult withProvisionedCapacityList(ProvisionedCapacityDescription... provisionedCapacityList) {
        if (this.provisionedCapacityList == null) {
            setProvisionedCapacityList(new java.util.ArrayList<ProvisionedCapacityDescription>(provisionedCapacityList.length));
        }
        for (ProvisionedCapacityDescription ele : provisionedCapacityList) {
            this.provisionedCapacityList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response body contains the following JSON fields.
     * </p>
     * 
     * @param provisionedCapacityList
     *        The response body contains the following JSON fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedCapacityResult withProvisionedCapacityList(java.util.Collection<ProvisionedCapacityDescription> provisionedCapacityList) {
        setProvisionedCapacityList(provisionedCapacityList);
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
        if (getProvisionedCapacityList() != null)
            sb.append("ProvisionedCapacityList: ").append(getProvisionedCapacityList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisionedCapacityResult == false)
            return false;
        ListProvisionedCapacityResult other = (ListProvisionedCapacityResult) obj;
        if (other.getProvisionedCapacityList() == null ^ this.getProvisionedCapacityList() == null)
            return false;
        if (other.getProvisionedCapacityList() != null && other.getProvisionedCapacityList().equals(this.getProvisionedCapacityList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedCapacityList() == null) ? 0 : getProvisionedCapacityList().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisionedCapacityResult clone() {
        try {
            return (ListProvisionedCapacityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
