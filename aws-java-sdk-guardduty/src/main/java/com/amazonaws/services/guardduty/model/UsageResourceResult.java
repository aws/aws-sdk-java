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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the sum of usage based on an AWS resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageResourceResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageResourceResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS resource that generated usage.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * Represents the sum total of usage for the specified resource type.
     * </p>
     */
    private Total total;

    /**
     * <p>
     * The AWS resource that generated usage.
     * </p>
     * 
     * @param resource
     *        The AWS resource that generated usage.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The AWS resource that generated usage.
     * </p>
     * 
     * @return The AWS resource that generated usage.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The AWS resource that generated usage.
     * </p>
     * 
     * @param resource
     *        The AWS resource that generated usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageResourceResult withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Represents the sum total of usage for the specified resource type.
     * </p>
     * 
     * @param total
     *        Represents the sum total of usage for the specified resource type.
     */

    public void setTotal(Total total) {
        this.total = total;
    }

    /**
     * <p>
     * Represents the sum total of usage for the specified resource type.
     * </p>
     * 
     * @return Represents the sum total of usage for the specified resource type.
     */

    public Total getTotal() {
        return this.total;
    }

    /**
     * <p>
     * Represents the sum total of usage for the specified resource type.
     * </p>
     * 
     * @param total
     *        Represents the sum total of usage for the specified resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageResourceResult withTotal(Total total) {
        setTotal(total);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageResourceResult == false)
            return false;
        UsageResourceResult other = (UsageResourceResult) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public UsageResourceResult clone() {
        try {
            return (UsageResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageResourceResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
