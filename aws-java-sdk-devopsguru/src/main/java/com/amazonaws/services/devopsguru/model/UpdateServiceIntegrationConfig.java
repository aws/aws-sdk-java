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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about updating the integration status of an AWS service, such as AWS Systems Manager, with DevOps Guru.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegrationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceIntegrationConfig implements Serializable, Cloneable, StructuredPojo {

    private OpsCenterIntegrationConfig opsCenter;

    /**
     * @param opsCenter
     */

    public void setOpsCenter(OpsCenterIntegrationConfig opsCenter) {
        this.opsCenter = opsCenter;
    }

    /**
     * @return
     */

    public OpsCenterIntegrationConfig getOpsCenter() {
        return this.opsCenter;
    }

    /**
     * @param opsCenter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceIntegrationConfig withOpsCenter(OpsCenterIntegrationConfig opsCenter) {
        setOpsCenter(opsCenter);
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
        if (getOpsCenter() != null)
            sb.append("OpsCenter: ").append(getOpsCenter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceIntegrationConfig == false)
            return false;
        UpdateServiceIntegrationConfig other = (UpdateServiceIntegrationConfig) obj;
        if (other.getOpsCenter() == null ^ this.getOpsCenter() == null)
            return false;
        if (other.getOpsCenter() != null && other.getOpsCenter().equals(this.getOpsCenter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsCenter() == null) ? 0 : getOpsCenter().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceIntegrationConfig clone() {
        try {
            return (UpdateServiceIntegrationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.UpdateServiceIntegrationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
