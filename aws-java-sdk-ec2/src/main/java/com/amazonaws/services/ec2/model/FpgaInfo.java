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
 * Describes the FPGAs for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FpgaInfo" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FpgaInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FpgaDeviceInfo> fpgas;
    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     */
    private Integer totalFpgaMemoryInMiB;

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     * 
     * @return Describes the FPGAs for the instance type.
     */

    public java.util.List<FpgaDeviceInfo> getFpgas() {
        if (fpgas == null) {
            fpgas = new com.amazonaws.internal.SdkInternalList<FpgaDeviceInfo>();
        }
        return fpgas;
    }

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     * 
     * @param fpgas
     *        Describes the FPGAs for the instance type.
     */

    public void setFpgas(java.util.Collection<FpgaDeviceInfo> fpgas) {
        if (fpgas == null) {
            this.fpgas = null;
            return;
        }

        this.fpgas = new com.amazonaws.internal.SdkInternalList<FpgaDeviceInfo>(fpgas);
    }

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFpgas(java.util.Collection)} or {@link #withFpgas(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fpgas
     *        Describes the FPGAs for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaInfo withFpgas(FpgaDeviceInfo... fpgas) {
        if (this.fpgas == null) {
            setFpgas(new com.amazonaws.internal.SdkInternalList<FpgaDeviceInfo>(fpgas.length));
        }
        for (FpgaDeviceInfo ele : fpgas) {
            this.fpgas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     * 
     * @param fpgas
     *        Describes the FPGAs for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaInfo withFpgas(java.util.Collection<FpgaDeviceInfo> fpgas) {
        setFpgas(fpgas);
        return this;
    }

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     * 
     * @param totalFpgaMemoryInMiB
     *        The total memory of all FPGA accelerators for the instance type.
     */

    public void setTotalFpgaMemoryInMiB(Integer totalFpgaMemoryInMiB) {
        this.totalFpgaMemoryInMiB = totalFpgaMemoryInMiB;
    }

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     * 
     * @return The total memory of all FPGA accelerators for the instance type.
     */

    public Integer getTotalFpgaMemoryInMiB() {
        return this.totalFpgaMemoryInMiB;
    }

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     * 
     * @param totalFpgaMemoryInMiB
     *        The total memory of all FPGA accelerators for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaInfo withTotalFpgaMemoryInMiB(Integer totalFpgaMemoryInMiB) {
        setTotalFpgaMemoryInMiB(totalFpgaMemoryInMiB);
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
        if (getFpgas() != null)
            sb.append("Fpgas: ").append(getFpgas()).append(",");
        if (getTotalFpgaMemoryInMiB() != null)
            sb.append("TotalFpgaMemoryInMiB: ").append(getTotalFpgaMemoryInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaInfo == false)
            return false;
        FpgaInfo other = (FpgaInfo) obj;
        if (other.getFpgas() == null ^ this.getFpgas() == null)
            return false;
        if (other.getFpgas() != null && other.getFpgas().equals(this.getFpgas()) == false)
            return false;
        if (other.getTotalFpgaMemoryInMiB() == null ^ this.getTotalFpgaMemoryInMiB() == null)
            return false;
        if (other.getTotalFpgaMemoryInMiB() != null && other.getTotalFpgaMemoryInMiB().equals(this.getTotalFpgaMemoryInMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgas() == null) ? 0 : getFpgas().hashCode());
        hashCode = prime * hashCode + ((getTotalFpgaMemoryInMiB() == null) ? 0 : getTotalFpgaMemoryInMiB().hashCode());
        return hashCode;
    }

    @Override
    public FpgaInfo clone() {
        try {
            return (FpgaInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
