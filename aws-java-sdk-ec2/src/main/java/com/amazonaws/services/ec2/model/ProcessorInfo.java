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
 * Describes the processor used by the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ProcessorInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessorInfo implements Serializable, Cloneable {

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedArchitectures;
    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     */
    private Double sustainedClockSpeedInGhz;

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * 
     * @return A list of architectures supported by the instance type.
     * @see ArchitectureType
     */

    public java.util.List<String> getSupportedArchitectures() {
        if (supportedArchitectures == null) {
            supportedArchitectures = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedArchitectures;
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * 
     * @param supportedArchitectures
     *        A list of architectures supported by the instance type.
     * @see ArchitectureType
     */

    public void setSupportedArchitectures(java.util.Collection<String> supportedArchitectures) {
        if (supportedArchitectures == null) {
            this.supportedArchitectures = null;
            return;
        }

        this.supportedArchitectures = new com.amazonaws.internal.SdkInternalList<String>(supportedArchitectures);
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedArchitectures(java.util.Collection)} or
     * {@link #withSupportedArchitectures(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedArchitectures
     *        A list of architectures supported by the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public ProcessorInfo withSupportedArchitectures(String... supportedArchitectures) {
        if (this.supportedArchitectures == null) {
            setSupportedArchitectures(new com.amazonaws.internal.SdkInternalList<String>(supportedArchitectures.length));
        }
        for (String ele : supportedArchitectures) {
            this.supportedArchitectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * 
     * @param supportedArchitectures
     *        A list of architectures supported by the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public ProcessorInfo withSupportedArchitectures(java.util.Collection<String> supportedArchitectures) {
        setSupportedArchitectures(supportedArchitectures);
        return this;
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * 
     * @param supportedArchitectures
     *        A list of architectures supported by the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public ProcessorInfo withSupportedArchitectures(ArchitectureType... supportedArchitectures) {
        com.amazonaws.internal.SdkInternalList<String> supportedArchitecturesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedArchitectures.length);
        for (ArchitectureType value : supportedArchitectures) {
            supportedArchitecturesCopy.add(value.toString());
        }
        if (getSupportedArchitectures() == null) {
            setSupportedArchitectures(supportedArchitecturesCopy);
        } else {
            getSupportedArchitectures().addAll(supportedArchitecturesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     * 
     * @param sustainedClockSpeedInGhz
     *        The speed of the processor, in GHz.
     */

    public void setSustainedClockSpeedInGhz(Double sustainedClockSpeedInGhz) {
        this.sustainedClockSpeedInGhz = sustainedClockSpeedInGhz;
    }

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     * 
     * @return The speed of the processor, in GHz.
     */

    public Double getSustainedClockSpeedInGhz() {
        return this.sustainedClockSpeedInGhz;
    }

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     * 
     * @param sustainedClockSpeedInGhz
     *        The speed of the processor, in GHz.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessorInfo withSustainedClockSpeedInGhz(Double sustainedClockSpeedInGhz) {
        setSustainedClockSpeedInGhz(sustainedClockSpeedInGhz);
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
        if (getSupportedArchitectures() != null)
            sb.append("SupportedArchitectures: ").append(getSupportedArchitectures()).append(",");
        if (getSustainedClockSpeedInGhz() != null)
            sb.append("SustainedClockSpeedInGhz: ").append(getSustainedClockSpeedInGhz());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessorInfo == false)
            return false;
        ProcessorInfo other = (ProcessorInfo) obj;
        if (other.getSupportedArchitectures() == null ^ this.getSupportedArchitectures() == null)
            return false;
        if (other.getSupportedArchitectures() != null && other.getSupportedArchitectures().equals(this.getSupportedArchitectures()) == false)
            return false;
        if (other.getSustainedClockSpeedInGhz() == null ^ this.getSustainedClockSpeedInGhz() == null)
            return false;
        if (other.getSustainedClockSpeedInGhz() != null && other.getSustainedClockSpeedInGhz().equals(this.getSustainedClockSpeedInGhz()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedArchitectures() == null) ? 0 : getSupportedArchitectures().hashCode());
        hashCode = prime * hashCode + ((getSustainedClockSpeedInGhz() == null) ? 0 : getSustainedClockSpeedInGhz().hashCode());
        return hashCode;
    }

    @Override
    public ProcessorInfo clone() {
        try {
            return (ProcessorInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
