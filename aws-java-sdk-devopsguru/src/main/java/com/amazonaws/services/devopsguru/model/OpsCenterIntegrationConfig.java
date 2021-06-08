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
 * Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each
 * created insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/OpsCenterIntegrationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsCenterIntegrationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * </p>
     */
    private String optInStatus;

    /**
     * <p>
     * Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * </p>
     * 
     * @param optInStatus
     *        Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * @see OptInStatus
     */

    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * </p>
     * 
     * @return Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * @see OptInStatus
     */

    public String getOptInStatus() {
        return this.optInStatus;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * </p>
     * 
     * @param optInStatus
     *        Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptInStatus
     */

    public OpsCenterIntegrationConfig withOptInStatus(String optInStatus) {
        setOptInStatus(optInStatus);
        return this;
    }

    /**
     * <p>
     * Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * </p>
     * 
     * @param optInStatus
     *        Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptInStatus
     */

    public OpsCenterIntegrationConfig withOptInStatus(OptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
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
        if (getOptInStatus() != null)
            sb.append("OptInStatus: ").append(getOptInStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsCenterIntegrationConfig == false)
            return false;
        OpsCenterIntegrationConfig other = (OpsCenterIntegrationConfig) obj;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        return hashCode;
    }

    @Override
    public OpsCenterIntegrationConfig clone() {
        try {
            return (OpsCenterIntegrationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.OpsCenterIntegrationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
