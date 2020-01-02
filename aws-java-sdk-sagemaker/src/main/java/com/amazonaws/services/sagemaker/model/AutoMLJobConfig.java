/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A collection of settings used for a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     */
    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     */
    private AutoMLSecurityConfig securityConfig;

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @param completionCriteria
     *        How long a job is allowed to run, or how many candidates a job is allowed to generate.
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @return How long a job is allowed to run, or how many candidates a job is allowed to generate.
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @param completionCriteria
     *        How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        Security configuration for traffic encryption or Amazon VPC settings.
     */

    public void setSecurityConfig(AutoMLSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @return Security configuration for traffic encryption or Amazon VPC settings.
     */

    public AutoMLSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        Security configuration for traffic encryption or Amazon VPC settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobConfig withSecurityConfig(AutoMLSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
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
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobConfig == false)
            return false;
        AutoMLJobConfig other = (AutoMLJobConfig) obj;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobConfig clone() {
        try {
            return (AutoMLJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
