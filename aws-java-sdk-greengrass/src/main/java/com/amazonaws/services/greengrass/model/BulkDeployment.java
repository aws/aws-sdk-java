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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a bulk deployment. You cannot start a new bulk deployment while another one is still running or in
 * a non-terminal state.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/BulkDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkDeployment implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the bulk deployment. */
    private String bulkDeploymentArn;
    /** The ID of the bulk deployment. */
    private String bulkDeploymentId;
    /** The time, in ISO format, when the deployment was created. */
    private String createdAt;

    /**
     * The ARN of the bulk deployment.
     * 
     * @param bulkDeploymentArn
     *        The ARN of the bulk deployment.
     */

    public void setBulkDeploymentArn(String bulkDeploymentArn) {
        this.bulkDeploymentArn = bulkDeploymentArn;
    }

    /**
     * The ARN of the bulk deployment.
     * 
     * @return The ARN of the bulk deployment.
     */

    public String getBulkDeploymentArn() {
        return this.bulkDeploymentArn;
    }

    /**
     * The ARN of the bulk deployment.
     * 
     * @param bulkDeploymentArn
     *        The ARN of the bulk deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeployment withBulkDeploymentArn(String bulkDeploymentArn) {
        setBulkDeploymentArn(bulkDeploymentArn);
        return this;
    }

    /**
     * The ID of the bulk deployment.
     * 
     * @param bulkDeploymentId
     *        The ID of the bulk deployment.
     */

    public void setBulkDeploymentId(String bulkDeploymentId) {
        this.bulkDeploymentId = bulkDeploymentId;
    }

    /**
     * The ID of the bulk deployment.
     * 
     * @return The ID of the bulk deployment.
     */

    public String getBulkDeploymentId() {
        return this.bulkDeploymentId;
    }

    /**
     * The ID of the bulk deployment.
     * 
     * @param bulkDeploymentId
     *        The ID of the bulk deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeployment withBulkDeploymentId(String bulkDeploymentId) {
        setBulkDeploymentId(bulkDeploymentId);
        return this;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in ISO format, when the deployment was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @return The time, in ISO format, when the deployment was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time, in ISO format, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in ISO format, when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkDeployment withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
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
        if (getBulkDeploymentArn() != null)
            sb.append("BulkDeploymentArn: ").append(getBulkDeploymentArn()).append(",");
        if (getBulkDeploymentId() != null)
            sb.append("BulkDeploymentId: ").append(getBulkDeploymentId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkDeployment == false)
            return false;
        BulkDeployment other = (BulkDeployment) obj;
        if (other.getBulkDeploymentArn() == null ^ this.getBulkDeploymentArn() == null)
            return false;
        if (other.getBulkDeploymentArn() != null && other.getBulkDeploymentArn().equals(this.getBulkDeploymentArn()) == false)
            return false;
        if (other.getBulkDeploymentId() == null ^ this.getBulkDeploymentId() == null)
            return false;
        if (other.getBulkDeploymentId() != null && other.getBulkDeploymentId().equals(this.getBulkDeploymentId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBulkDeploymentArn() == null) ? 0 : getBulkDeploymentArn().hashCode());
        hashCode = prime * hashCode + ((getBulkDeploymentId() == null) ? 0 : getBulkDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public BulkDeployment clone() {
        try {
            return (BulkDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.BulkDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
