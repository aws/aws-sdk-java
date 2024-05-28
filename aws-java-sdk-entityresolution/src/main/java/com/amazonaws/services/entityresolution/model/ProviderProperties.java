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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the <code>providerServiceARN</code>, <code>intermediateSourceConfiguration</code>, and
 * <code>providerConfiguration</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ProviderProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProviderProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location that temporarily stores your data while it processes. Your information won't be saved
     * permanently.
     * </p>
     */
    private IntermediateSourceConfiguration intermediateSourceConfiguration;
    /**
     * <p>
     * The ARN of the provider service.
     * </p>
     */
    private String providerServiceArn;

    /**
     * <p>
     * The Amazon S3 location that temporarily stores your data while it processes. Your information won't be saved
     * permanently.
     * </p>
     * 
     * @param intermediateSourceConfiguration
     *        The Amazon S3 location that temporarily stores your data while it processes. Your information won't be
     *        saved permanently.
     */

    public void setIntermediateSourceConfiguration(IntermediateSourceConfiguration intermediateSourceConfiguration) {
        this.intermediateSourceConfiguration = intermediateSourceConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location that temporarily stores your data while it processes. Your information won't be saved
     * permanently.
     * </p>
     * 
     * @return The Amazon S3 location that temporarily stores your data while it processes. Your information won't be
     *         saved permanently.
     */

    public IntermediateSourceConfiguration getIntermediateSourceConfiguration() {
        return this.intermediateSourceConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 location that temporarily stores your data while it processes. Your information won't be saved
     * permanently.
     * </p>
     * 
     * @param intermediateSourceConfiguration
     *        The Amazon S3 location that temporarily stores your data while it processes. Your information won't be
     *        saved permanently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderProperties withIntermediateSourceConfiguration(IntermediateSourceConfiguration intermediateSourceConfiguration) {
        setIntermediateSourceConfiguration(intermediateSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN of the provider service.
     * </p>
     * 
     * @param providerServiceArn
     *        The ARN of the provider service.
     */

    public void setProviderServiceArn(String providerServiceArn) {
        this.providerServiceArn = providerServiceArn;
    }

    /**
     * <p>
     * The ARN of the provider service.
     * </p>
     * 
     * @return The ARN of the provider service.
     */

    public String getProviderServiceArn() {
        return this.providerServiceArn;
    }

    /**
     * <p>
     * The ARN of the provider service.
     * </p>
     * 
     * @param providerServiceArn
     *        The ARN of the provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderProperties withProviderServiceArn(String providerServiceArn) {
        setProviderServiceArn(providerServiceArn);
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
        if (getIntermediateSourceConfiguration() != null)
            sb.append("IntermediateSourceConfiguration: ").append(getIntermediateSourceConfiguration()).append(",");
        if (getProviderServiceArn() != null)
            sb.append("ProviderServiceArn: ").append(getProviderServiceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProviderProperties == false)
            return false;
        ProviderProperties other = (ProviderProperties) obj;
        if (other.getIntermediateSourceConfiguration() == null ^ this.getIntermediateSourceConfiguration() == null)
            return false;
        if (other.getIntermediateSourceConfiguration() != null
                && other.getIntermediateSourceConfiguration().equals(this.getIntermediateSourceConfiguration()) == false)
            return false;
        if (other.getProviderServiceArn() == null ^ this.getProviderServiceArn() == null)
            return false;
        if (other.getProviderServiceArn() != null && other.getProviderServiceArn().equals(this.getProviderServiceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntermediateSourceConfiguration() == null) ? 0 : getIntermediateSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProviderServiceArn() == null) ? 0 : getProviderServiceArn().hashCode());
        return hashCode;
    }

    @Override
    public ProviderProperties clone() {
        try {
            return (ProviderProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.ProviderPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
