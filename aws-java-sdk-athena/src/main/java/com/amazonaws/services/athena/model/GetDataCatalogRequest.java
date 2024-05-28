/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataCatalogRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data catalog to return.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the workgroup. Required if making an IAM Identity Center request.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The name of the data catalog to return.
     * </p>
     * 
     * @param name
     *        The name of the data catalog to return.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data catalog to return.
     * </p>
     * 
     * @return The name of the data catalog to return.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data catalog to return.
     * </p>
     * 
     * @param name
     *        The name of the data catalog to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataCatalogRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup. Required if making an IAM Identity Center request.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup. Required if making an IAM Identity Center request.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup. Required if making an IAM Identity Center request.
     * </p>
     * 
     * @return The name of the workgroup. Required if making an IAM Identity Center request.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup. Required if making an IAM Identity Center request.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup. Required if making an IAM Identity Center request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataCatalogRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataCatalogRequest == false)
            return false;
        GetDataCatalogRequest other = (GetDataCatalogRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetDataCatalogRequest clone() {
        return (GetDataCatalogRequest) super.clone();
    }

}
