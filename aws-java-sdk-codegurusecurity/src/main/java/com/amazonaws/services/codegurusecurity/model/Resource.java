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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a resource, such as an Amazon S3 bucket or AWS Lambda function, that contains a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier for a section of the resource, such as an AWS Lambda layer.
     * </p>
     */
    private String subResourceId;

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * 
     * @param id
     *        The identifier for the resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * 
     * @return The identifier for the resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * 
     * @param id
     *        The identifier for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier for a section of the resource, such as an AWS Lambda layer.
     * </p>
     * 
     * @param subResourceId
     *        The identifier for a section of the resource, such as an AWS Lambda layer.
     */

    public void setSubResourceId(String subResourceId) {
        this.subResourceId = subResourceId;
    }

    /**
     * <p>
     * The identifier for a section of the resource, such as an AWS Lambda layer.
     * </p>
     * 
     * @return The identifier for a section of the resource, such as an AWS Lambda layer.
     */

    public String getSubResourceId() {
        return this.subResourceId;
    }

    /**
     * <p>
     * The identifier for a section of the resource, such as an AWS Lambda layer.
     * </p>
     * 
     * @param subResourceId
     *        The identifier for a section of the resource, such as an AWS Lambda layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withSubResourceId(String subResourceId) {
        setSubResourceId(subResourceId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSubResourceId() != null)
            sb.append("SubResourceId: ").append(getSubResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSubResourceId() == null ^ this.getSubResourceId() == null)
            return false;
        if (other.getSubResourceId() != null && other.getSubResourceId().equals(this.getSubResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSubResourceId() == null) ? 0 : getSubResourceId().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
