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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the details for the Kubernetes resources of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksPropertiesDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksPropertiesDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties for the Kubernetes pod resources of a job.
     * </p>
     */
    private EksPodPropertiesDetail podProperties;

    /**
     * <p>
     * The properties for the Kubernetes pod resources of a job.
     * </p>
     * 
     * @param podProperties
     *        The properties for the Kubernetes pod resources of a job.
     */

    public void setPodProperties(EksPodPropertiesDetail podProperties) {
        this.podProperties = podProperties;
    }

    /**
     * <p>
     * The properties for the Kubernetes pod resources of a job.
     * </p>
     * 
     * @return The properties for the Kubernetes pod resources of a job.
     */

    public EksPodPropertiesDetail getPodProperties() {
        return this.podProperties;
    }

    /**
     * <p>
     * The properties for the Kubernetes pod resources of a job.
     * </p>
     * 
     * @param podProperties
     *        The properties for the Kubernetes pod resources of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPropertiesDetail withPodProperties(EksPodPropertiesDetail podProperties) {
        setPodProperties(podProperties);
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
        if (getPodProperties() != null)
            sb.append("PodProperties: ").append(getPodProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksPropertiesDetail == false)
            return false;
        EksPropertiesDetail other = (EksPropertiesDetail) obj;
        if (other.getPodProperties() == null ^ this.getPodProperties() == null)
            return false;
        if (other.getPodProperties() != null && other.getPodProperties().equals(this.getPodProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPodProperties() == null) ? 0 : getPodProperties().hashCode());
        return hashCode;
    }

    @Override
    public EksPropertiesDetail clone() {
        try {
            return (EksPropertiesDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksPropertiesDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
