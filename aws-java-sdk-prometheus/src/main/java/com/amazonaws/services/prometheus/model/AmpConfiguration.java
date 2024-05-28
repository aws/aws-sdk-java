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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>AmpConfiguration</code> structure defines the Amazon Managed Service for Prometheus instance a scraper
 * should send metrics to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/AmpConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmpConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the Amazon Managed Service for Prometheus workspace.
     * </p>
     */
    private String workspaceArn;

    /**
     * <p>
     * ARN of the Amazon Managed Service for Prometheus workspace.
     * </p>
     * 
     * @param workspaceArn
     *        ARN of the Amazon Managed Service for Prometheus workspace.
     */

    public void setWorkspaceArn(String workspaceArn) {
        this.workspaceArn = workspaceArn;
    }

    /**
     * <p>
     * ARN of the Amazon Managed Service for Prometheus workspace.
     * </p>
     * 
     * @return ARN of the Amazon Managed Service for Prometheus workspace.
     */

    public String getWorkspaceArn() {
        return this.workspaceArn;
    }

    /**
     * <p>
     * ARN of the Amazon Managed Service for Prometheus workspace.
     * </p>
     * 
     * @param workspaceArn
     *        ARN of the Amazon Managed Service for Prometheus workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmpConfiguration withWorkspaceArn(String workspaceArn) {
        setWorkspaceArn(workspaceArn);
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
        if (getWorkspaceArn() != null)
            sb.append("WorkspaceArn: ").append(getWorkspaceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmpConfiguration == false)
            return false;
        AmpConfiguration other = (AmpConfiguration) obj;
        if (other.getWorkspaceArn() == null ^ this.getWorkspaceArn() == null)
            return false;
        if (other.getWorkspaceArn() != null && other.getWorkspaceArn().equals(this.getWorkspaceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceArn() == null) ? 0 : getWorkspaceArn().hashCode());
        return hashCode;
    }

    @Override
    public AmpConfiguration clone() {
        try {
            return (AmpConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.AmpConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
