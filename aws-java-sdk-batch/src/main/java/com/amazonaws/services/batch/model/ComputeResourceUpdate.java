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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the attributes of a compute environment that can be updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ComputeResourceUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResourceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain.
     * </p>
     */
    private Integer minvCpus;
    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     */
    private Integer maxvCpus;
    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     */
    private Integer desiredvCpus;

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain.
     * </p>
     * 
     * @param minvCpus
     *        The minimum number of EC2 vCPUs that an environment should maintain.
     */

    public void setMinvCpus(Integer minvCpus) {
        this.minvCpus = minvCpus;
    }

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain.
     * </p>
     * 
     * @return The minimum number of EC2 vCPUs that an environment should maintain.
     */

    public Integer getMinvCpus() {
        return this.minvCpus;
    }

    /**
     * <p>
     * The minimum number of EC2 vCPUs that an environment should maintain.
     * </p>
     * 
     * @param minvCpus
     *        The minimum number of EC2 vCPUs that an environment should maintain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withMinvCpus(Integer minvCpus) {
        setMinvCpus(minvCpus);
        return this;
    }

    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     * 
     * @param maxvCpus
     *        The maximum number of EC2 vCPUs that an environment can reach.
     */

    public void setMaxvCpus(Integer maxvCpus) {
        this.maxvCpus = maxvCpus;
    }

    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     * 
     * @return The maximum number of EC2 vCPUs that an environment can reach.
     */

    public Integer getMaxvCpus() {
        return this.maxvCpus;
    }

    /**
     * <p>
     * The maximum number of EC2 vCPUs that an environment can reach.
     * </p>
     * 
     * @param maxvCpus
     *        The maximum number of EC2 vCPUs that an environment can reach.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withMaxvCpus(Integer maxvCpus) {
        setMaxvCpus(maxvCpus);
        return this;
    }

    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     * 
     * @param desiredvCpus
     *        The desired number of EC2 vCPUS in the compute environment.
     */

    public void setDesiredvCpus(Integer desiredvCpus) {
        this.desiredvCpus = desiredvCpus;
    }

    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     * 
     * @return The desired number of EC2 vCPUS in the compute environment.
     */

    public Integer getDesiredvCpus() {
        return this.desiredvCpus;
    }

    /**
     * <p>
     * The desired number of EC2 vCPUS in the compute environment.
     * </p>
     * 
     * @param desiredvCpus
     *        The desired number of EC2 vCPUS in the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withDesiredvCpus(Integer desiredvCpus) {
        setDesiredvCpus(desiredvCpus);
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
        if (getMinvCpus() != null)
            sb.append("MinvCpus: ").append(getMinvCpus()).append(",");
        if (getMaxvCpus() != null)
            sb.append("MaxvCpus: ").append(getMaxvCpus()).append(",");
        if (getDesiredvCpus() != null)
            sb.append("DesiredvCpus: ").append(getDesiredvCpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeResourceUpdate == false)
            return false;
        ComputeResourceUpdate other = (ComputeResourceUpdate) obj;
        if (other.getMinvCpus() == null ^ this.getMinvCpus() == null)
            return false;
        if (other.getMinvCpus() != null && other.getMinvCpus().equals(this.getMinvCpus()) == false)
            return false;
        if (other.getMaxvCpus() == null ^ this.getMaxvCpus() == null)
            return false;
        if (other.getMaxvCpus() != null && other.getMaxvCpus().equals(this.getMaxvCpus()) == false)
            return false;
        if (other.getDesiredvCpus() == null ^ this.getDesiredvCpus() == null)
            return false;
        if (other.getDesiredvCpus() != null && other.getDesiredvCpus().equals(this.getDesiredvCpus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinvCpus() == null) ? 0 : getMinvCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxvCpus() == null) ? 0 : getMaxvCpus().hashCode());
        hashCode = prime * hashCode + ((getDesiredvCpus() == null) ? 0 : getDesiredvCpus().hashCode());
        return hashCode;
    }

    @Override
    public ComputeResourceUpdate clone() {
        try {
            return (ComputeResourceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ComputeResourceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
