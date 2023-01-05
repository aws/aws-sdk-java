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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The maximum allowed cumulative resources for an application. No new resources will be created once the limit is hit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/MaximumAllowedResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaximumAllowedResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum allowed CPU for an application.
     * </p>
     */
    private String cpu;
    /**
     * <p>
     * The maximum allowed resources for an application.
     * </p>
     */
    private String memory;
    /**
     * <p>
     * The maximum allowed disk for an application.
     * </p>
     */
    private String disk;

    /**
     * <p>
     * The maximum allowed CPU for an application.
     * </p>
     * 
     * @param cpu
     *        The maximum allowed CPU for an application.
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The maximum allowed CPU for an application.
     * </p>
     * 
     * @return The maximum allowed CPU for an application.
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The maximum allowed CPU for an application.
     * </p>
     * 
     * @param cpu
     *        The maximum allowed CPU for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumAllowedResources withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The maximum allowed resources for an application.
     * </p>
     * 
     * @param memory
     *        The maximum allowed resources for an application.
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The maximum allowed resources for an application.
     * </p>
     * 
     * @return The maximum allowed resources for an application.
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The maximum allowed resources for an application.
     * </p>
     * 
     * @param memory
     *        The maximum allowed resources for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumAllowedResources withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The maximum allowed disk for an application.
     * </p>
     * 
     * @param disk
     *        The maximum allowed disk for an application.
     */

    public void setDisk(String disk) {
        this.disk = disk;
    }

    /**
     * <p>
     * The maximum allowed disk for an application.
     * </p>
     * 
     * @return The maximum allowed disk for an application.
     */

    public String getDisk() {
        return this.disk;
    }

    /**
     * <p>
     * The maximum allowed disk for an application.
     * </p>
     * 
     * @param disk
     *        The maximum allowed disk for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaximumAllowedResources withDisk(String disk) {
        setDisk(disk);
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
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getDisk() != null)
            sb.append("Disk: ").append(getDisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaximumAllowedResources == false)
            return false;
        MaximumAllowedResources other = (MaximumAllowedResources) obj;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getDisk() == null ^ this.getDisk() == null)
            return false;
        if (other.getDisk() != null && other.getDisk().equals(this.getDisk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getDisk() == null) ? 0 : getDisk().hashCode());
        return hashCode;
    }

    @Override
    public MaximumAllowedResources clone() {
        try {
            return (MaximumAllowedResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.MaximumAllowedResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
