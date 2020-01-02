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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the vCPU configurations for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VCpuInfo" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VCpuInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     */
    private Integer defaultVCpus;
    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     */
    private Integer defaultCores;
    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     */
    private Integer defaultThreadsPerCore;
    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> validCores;
    /**
     * <p>
     * List of the valid number of threads per core that can be configured for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> validThreadsPerCore;

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     * 
     * @param defaultVCpus
     *        The default number of vCPUs for the instance type.
     */

    public void setDefaultVCpus(Integer defaultVCpus) {
        this.defaultVCpus = defaultVCpus;
    }

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     * 
     * @return The default number of vCPUs for the instance type.
     */

    public Integer getDefaultVCpus() {
        return this.defaultVCpus;
    }

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     * 
     * @param defaultVCpus
     *        The default number of vCPUs for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withDefaultVCpus(Integer defaultVCpus) {
        setDefaultVCpus(defaultVCpus);
        return this;
    }

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     * 
     * @param defaultCores
     *        The default number of cores for the instance type.
     */

    public void setDefaultCores(Integer defaultCores) {
        this.defaultCores = defaultCores;
    }

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     * 
     * @return The default number of cores for the instance type.
     */

    public Integer getDefaultCores() {
        return this.defaultCores;
    }

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     * 
     * @param defaultCores
     *        The default number of cores for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withDefaultCores(Integer defaultCores) {
        setDefaultCores(defaultCores);
        return this;
    }

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     * 
     * @param defaultThreadsPerCore
     *        The default number of threads per core for the instance type.
     */

    public void setDefaultThreadsPerCore(Integer defaultThreadsPerCore) {
        this.defaultThreadsPerCore = defaultThreadsPerCore;
    }

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     * 
     * @return The default number of threads per core for the instance type.
     */

    public Integer getDefaultThreadsPerCore() {
        return this.defaultThreadsPerCore;
    }

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     * 
     * @param defaultThreadsPerCore
     *        The default number of threads per core for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withDefaultThreadsPerCore(Integer defaultThreadsPerCore) {
        setDefaultThreadsPerCore(defaultThreadsPerCore);
        return this;
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance type.
     * </p>
     * 
     * @return List of the valid number of cores that can be configured for the instance type.
     */

    public java.util.List<Integer> getValidCores() {
        if (validCores == null) {
            validCores = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return validCores;
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance type.
     * </p>
     * 
     * @param validCores
     *        List of the valid number of cores that can be configured for the instance type.
     */

    public void setValidCores(java.util.Collection<Integer> validCores) {
        if (validCores == null) {
            this.validCores = null;
            return;
        }

        this.validCores = new com.amazonaws.internal.SdkInternalList<Integer>(validCores);
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidCores(java.util.Collection)} or {@link #withValidCores(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validCores
     *        List of the valid number of cores that can be configured for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withValidCores(Integer... validCores) {
        if (this.validCores == null) {
            setValidCores(new com.amazonaws.internal.SdkInternalList<Integer>(validCores.length));
        }
        for (Integer ele : validCores) {
            this.validCores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance type.
     * </p>
     * 
     * @param validCores
     *        List of the valid number of cores that can be configured for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withValidCores(java.util.Collection<Integer> validCores) {
        setValidCores(validCores);
        return this;
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for the instance type.
     * </p>
     * 
     * @return List of the valid number of threads per core that can be configured for the instance type.
     */

    public java.util.List<Integer> getValidThreadsPerCore() {
        if (validThreadsPerCore == null) {
            validThreadsPerCore = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return validThreadsPerCore;
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for the instance type.
     * </p>
     * 
     * @param validThreadsPerCore
     *        List of the valid number of threads per core that can be configured for the instance type.
     */

    public void setValidThreadsPerCore(java.util.Collection<Integer> validThreadsPerCore) {
        if (validThreadsPerCore == null) {
            this.validThreadsPerCore = null;
            return;
        }

        this.validThreadsPerCore = new com.amazonaws.internal.SdkInternalList<Integer>(validThreadsPerCore);
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidThreadsPerCore(java.util.Collection)} or {@link #withValidThreadsPerCore(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param validThreadsPerCore
     *        List of the valid number of threads per core that can be configured for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withValidThreadsPerCore(Integer... validThreadsPerCore) {
        if (this.validThreadsPerCore == null) {
            setValidThreadsPerCore(new com.amazonaws.internal.SdkInternalList<Integer>(validThreadsPerCore.length));
        }
        for (Integer ele : validThreadsPerCore) {
            this.validThreadsPerCore.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for the instance type.
     * </p>
     * 
     * @param validThreadsPerCore
     *        List of the valid number of threads per core that can be configured for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VCpuInfo withValidThreadsPerCore(java.util.Collection<Integer> validThreadsPerCore) {
        setValidThreadsPerCore(validThreadsPerCore);
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
        if (getDefaultVCpus() != null)
            sb.append("DefaultVCpus: ").append(getDefaultVCpus()).append(",");
        if (getDefaultCores() != null)
            sb.append("DefaultCores: ").append(getDefaultCores()).append(",");
        if (getDefaultThreadsPerCore() != null)
            sb.append("DefaultThreadsPerCore: ").append(getDefaultThreadsPerCore()).append(",");
        if (getValidCores() != null)
            sb.append("ValidCores: ").append(getValidCores()).append(",");
        if (getValidThreadsPerCore() != null)
            sb.append("ValidThreadsPerCore: ").append(getValidThreadsPerCore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VCpuInfo == false)
            return false;
        VCpuInfo other = (VCpuInfo) obj;
        if (other.getDefaultVCpus() == null ^ this.getDefaultVCpus() == null)
            return false;
        if (other.getDefaultVCpus() != null && other.getDefaultVCpus().equals(this.getDefaultVCpus()) == false)
            return false;
        if (other.getDefaultCores() == null ^ this.getDefaultCores() == null)
            return false;
        if (other.getDefaultCores() != null && other.getDefaultCores().equals(this.getDefaultCores()) == false)
            return false;
        if (other.getDefaultThreadsPerCore() == null ^ this.getDefaultThreadsPerCore() == null)
            return false;
        if (other.getDefaultThreadsPerCore() != null && other.getDefaultThreadsPerCore().equals(this.getDefaultThreadsPerCore()) == false)
            return false;
        if (other.getValidCores() == null ^ this.getValidCores() == null)
            return false;
        if (other.getValidCores() != null && other.getValidCores().equals(this.getValidCores()) == false)
            return false;
        if (other.getValidThreadsPerCore() == null ^ this.getValidThreadsPerCore() == null)
            return false;
        if (other.getValidThreadsPerCore() != null && other.getValidThreadsPerCore().equals(this.getValidThreadsPerCore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultVCpus() == null) ? 0 : getDefaultVCpus().hashCode());
        hashCode = prime * hashCode + ((getDefaultCores() == null) ? 0 : getDefaultCores().hashCode());
        hashCode = prime * hashCode + ((getDefaultThreadsPerCore() == null) ? 0 : getDefaultThreadsPerCore().hashCode());
        hashCode = prime * hashCode + ((getValidCores() == null) ? 0 : getValidCores().hashCode());
        hashCode = prime * hashCode + ((getValidThreadsPerCore() == null) ? 0 : getValidThreadsPerCore().hashCode());
        return hashCode;
    }

    @Override
    public VCpuInfo clone() {
        try {
            return (VCpuInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
