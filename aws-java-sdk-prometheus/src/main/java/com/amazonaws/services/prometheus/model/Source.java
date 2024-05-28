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
 * The source of collected metrics for a scraper.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/Source" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EKS cluster from which a scraper collects metrics.
     * </p>
     */
    private EksConfiguration eksConfiguration;

    /**
     * <p>
     * The Amazon EKS cluster from which a scraper collects metrics.
     * </p>
     * 
     * @param eksConfiguration
     *        The Amazon EKS cluster from which a scraper collects metrics.
     */

    public void setEksConfiguration(EksConfiguration eksConfiguration) {
        this.eksConfiguration = eksConfiguration;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which a scraper collects metrics.
     * </p>
     * 
     * @return The Amazon EKS cluster from which a scraper collects metrics.
     */

    public EksConfiguration getEksConfiguration() {
        return this.eksConfiguration;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which a scraper collects metrics.
     * </p>
     * 
     * @param eksConfiguration
     *        The Amazon EKS cluster from which a scraper collects metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withEksConfiguration(EksConfiguration eksConfiguration) {
        setEksConfiguration(eksConfiguration);
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
        if (getEksConfiguration() != null)
            sb.append("EksConfiguration: ").append(getEksConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Source == false)
            return false;
        Source other = (Source) obj;
        if (other.getEksConfiguration() == null ^ this.getEksConfiguration() == null)
            return false;
        if (other.getEksConfiguration() != null && other.getEksConfiguration().equals(this.getEksConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEksConfiguration() == null) ? 0 : getEksConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
