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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Deletion details for an OpenSearch Serverless-managed interface endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteVpcEndpointDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcEndpointDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the endpoint deletion process.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @return The unique identifier of the endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint deletion process.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint deletion process.
     * @see VpcEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the endpoint deletion process.
     * </p>
     * 
     * @return The current status of the endpoint deletion process.
     * @see VpcEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the endpoint deletion process.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint deletion process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public DeleteVpcEndpointDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint deletion process.
     * </p>
     * 
     * @param status
     *        The current status of the endpoint deletion process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointStatus
     */

    public DeleteVpcEndpointDetail withStatus(VpcEndpointStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcEndpointDetail == false)
            return false;
        DeleteVpcEndpointDetail other = (DeleteVpcEndpointDetail) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcEndpointDetail clone() {
        try {
            return (DeleteVpcEndpointDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.DeleteVpcEndpointDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
