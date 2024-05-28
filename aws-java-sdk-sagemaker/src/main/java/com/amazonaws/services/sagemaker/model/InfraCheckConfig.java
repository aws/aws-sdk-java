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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the infrastructure health check of a training job. A SageMaker-provided health check
 * tests the health of instance hardware and cluster network connectivity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InfraCheckConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InfraCheckConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables an infrastructure health check.
     * </p>
     */
    private Boolean enableInfraCheck;

    /**
     * <p>
     * Enables an infrastructure health check.
     * </p>
     * 
     * @param enableInfraCheck
     *        Enables an infrastructure health check.
     */

    public void setEnableInfraCheck(Boolean enableInfraCheck) {
        this.enableInfraCheck = enableInfraCheck;
    }

    /**
     * <p>
     * Enables an infrastructure health check.
     * </p>
     * 
     * @return Enables an infrastructure health check.
     */

    public Boolean getEnableInfraCheck() {
        return this.enableInfraCheck;
    }

    /**
     * <p>
     * Enables an infrastructure health check.
     * </p>
     * 
     * @param enableInfraCheck
     *        Enables an infrastructure health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfraCheckConfig withEnableInfraCheck(Boolean enableInfraCheck) {
        setEnableInfraCheck(enableInfraCheck);
        return this;
    }

    /**
     * <p>
     * Enables an infrastructure health check.
     * </p>
     * 
     * @return Enables an infrastructure health check.
     */

    public Boolean isEnableInfraCheck() {
        return this.enableInfraCheck;
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
        if (getEnableInfraCheck() != null)
            sb.append("EnableInfraCheck: ").append(getEnableInfraCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InfraCheckConfig == false)
            return false;
        InfraCheckConfig other = (InfraCheckConfig) obj;
        if (other.getEnableInfraCheck() == null ^ this.getEnableInfraCheck() == null)
            return false;
        if (other.getEnableInfraCheck() != null && other.getEnableInfraCheck().equals(this.getEnableInfraCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableInfraCheck() == null) ? 0 : getEnableInfraCheck().hashCode());
        return hashCode;
    }

    @Override
    public InfraCheckConfig clone() {
        try {
            return (InfraCheckConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InfraCheckConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
