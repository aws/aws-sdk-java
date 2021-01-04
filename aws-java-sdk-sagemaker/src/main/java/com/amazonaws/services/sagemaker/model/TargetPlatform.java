/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a target platform that you want your model to run on, such as OS, architecture, and
 * accelerators. It is an alternative of <code>TargetDevice</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TargetPlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetPlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a target platform OS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINUX</code>: Linux-based operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     * <code>ANDROID_PLATFORM</code> compiler option. For example,
     * <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String os;
    /**
     * <p>
     * Specifies a target platform architecture.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X86_64</code>: 64-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X86</code>: 32-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM64</code>: ARMv8 64-bit CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     * </p>
     * </li>
     * </ul>
     */
    private String arch;
    /**
     * <p>
     * Specifies a target platform accelerator (optional).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     * <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MALI</code>: ARM Mali graphics processor
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     * </p>
     * </li>
     * </ul>
     */
    private String accelerator;

    /**
     * <p>
     * Specifies a target platform OS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINUX</code>: Linux-based operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     * <code>ANDROID_PLATFORM</code> compiler option. For example,
     * <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param os
     *        Specifies a target platform OS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINUX</code>: Linux-based operating systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     *        <code>ANDROID_PLATFORM</code> compiler option. For example,
     *        <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     *        </p>
     *        </li>
     * @see TargetPlatformOs
     */

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * <p>
     * Specifies a target platform OS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINUX</code>: Linux-based operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     * <code>ANDROID_PLATFORM</code> compiler option. For example,
     * <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies a target platform OS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LINUX</code>: Linux-based operating systems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     *         <code>ANDROID_PLATFORM</code> compiler option. For example,
     *         <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     *         </p>
     *         </li>
     * @see TargetPlatformOs
     */

    public String getOs() {
        return this.os;
    }

    /**
     * <p>
     * Specifies a target platform OS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINUX</code>: Linux-based operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     * <code>ANDROID_PLATFORM</code> compiler option. For example,
     * <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param os
     *        Specifies a target platform OS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINUX</code>: Linux-based operating systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     *        <code>ANDROID_PLATFORM</code> compiler option. For example,
     *        <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformOs
     */

    public TargetPlatform withOs(String os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * Specifies a target platform OS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINUX</code>: Linux-based operating systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     * <code>ANDROID_PLATFORM</code> compiler option. For example,
     * <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param os
     *        Specifies a target platform OS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LINUX</code>: Linux-based operating systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANDROID</code>: Android operating systems. Android API level can be specified using the
     *        <code>ANDROID_PLATFORM</code> compiler option. For example,
     *        <code>"CompilerOptions": {'ANDROID_PLATFORM': 28}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformOs
     */

    public TargetPlatform withOs(TargetPlatformOs os) {
        this.os = os.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a target platform architecture.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X86_64</code>: 64-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X86</code>: 32-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM64</code>: ARMv8 64-bit CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param arch
     *        Specifies a target platform architecture.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>X86_64</code>: 64-bit version of the x86 instruction set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>X86</code>: 32-bit version of the x86 instruction set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM64</code>: ARMv8 64-bit CPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     *        </p>
     *        </li>
     * @see TargetPlatformArch
     */

    public void setArch(String arch) {
        this.arch = arch;
    }

    /**
     * <p>
     * Specifies a target platform architecture.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X86_64</code>: 64-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X86</code>: 32-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM64</code>: ARMv8 64-bit CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies a target platform architecture.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>X86_64</code>: 64-bit version of the x86 instruction set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>X86</code>: 32-bit version of the x86 instruction set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARM64</code>: ARMv8 64-bit CPU.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     *         </p>
     *         </li>
     * @see TargetPlatformArch
     */

    public String getArch() {
        return this.arch;
    }

    /**
     * <p>
     * Specifies a target platform architecture.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X86_64</code>: 64-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X86</code>: 32-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM64</code>: ARMv8 64-bit CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param arch
     *        Specifies a target platform architecture.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>X86_64</code>: 64-bit version of the x86 instruction set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>X86</code>: 32-bit version of the x86 instruction set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM64</code>: ARMv8 64-bit CPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformArch
     */

    public TargetPlatform withArch(String arch) {
        setArch(arch);
        return this;
    }

    /**
     * <p>
     * Specifies a target platform architecture.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X86_64</code>: 64-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X86</code>: 32-bit version of the x86 instruction set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM64</code>: ARMv8 64-bit CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     * </p>
     * </li>
     * </ul>
     * 
     * @param arch
     *        Specifies a target platform architecture.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>X86_64</code>: 64-bit version of the x86 instruction set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>X86</code>: 32-bit version of the x86 instruction set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM64</code>: ARMv8 64-bit CPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM_EABIHF</code>: ARMv7 32-bit, Hard Float.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARM_EABI</code>: ARMv7 32-bit, Soft Float. Used by Android 32-bit ARM platform.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformArch
     */

    public TargetPlatform withArch(TargetPlatformArch arch) {
        this.arch = arch.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a target platform accelerator (optional).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     * <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MALI</code>: ARM Mali graphics processor
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     * </p>
     * </li>
     * </ul>
     * 
     * @param accelerator
     *        Specifies a target platform accelerator (optional).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     *        <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MALI</code>: ARM Mali graphics processor
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     *        </p>
     *        </li>
     * @see TargetPlatformAccelerator
     */

    public void setAccelerator(String accelerator) {
        this.accelerator = accelerator;
    }

    /**
     * <p>
     * Specifies a target platform accelerator (optional).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     * <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MALI</code>: ARM Mali graphics processor
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies a target platform accelerator (optional).</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     *         <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MALI</code>: ARM Mali graphics processor
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     *         </p>
     *         </li>
     * @see TargetPlatformAccelerator
     */

    public String getAccelerator() {
        return this.accelerator;
    }

    /**
     * <p>
     * Specifies a target platform accelerator (optional).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     * <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MALI</code>: ARM Mali graphics processor
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     * </p>
     * </li>
     * </ul>
     * 
     * @param accelerator
     *        Specifies a target platform accelerator (optional).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     *        <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MALI</code>: ARM Mali graphics processor
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformAccelerator
     */

    public TargetPlatform withAccelerator(String accelerator) {
        setAccelerator(accelerator);
        return this;
    }

    /**
     * <p>
     * Specifies a target platform accelerator (optional).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     * <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MALI</code>: ARM Mali graphics processor
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     * </p>
     * </li>
     * </ul>
     * 
     * @param accelerator
     *        Specifies a target platform accelerator (optional).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NVIDIA</code>: Nvidia graphics processing unit. It also requires <code>gpu-code</code>,
     *        <code>trt-ver</code>, <code>cuda-ver</code> compiler options
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MALI</code>: ARM Mali graphics processor
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTEL_GRAPHICS</code>: Integrated Intel graphics
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformAccelerator
     */

    public TargetPlatform withAccelerator(TargetPlatformAccelerator accelerator) {
        this.accelerator = accelerator.toString();
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
        if (getOs() != null)
            sb.append("Os: ").append(getOs()).append(",");
        if (getArch() != null)
            sb.append("Arch: ").append(getArch()).append(",");
        if (getAccelerator() != null)
            sb.append("Accelerator: ").append(getAccelerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetPlatform == false)
            return false;
        TargetPlatform other = (TargetPlatform) obj;
        if (other.getOs() == null ^ this.getOs() == null)
            return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false)
            return false;
        if (other.getArch() == null ^ this.getArch() == null)
            return false;
        if (other.getArch() != null && other.getArch().equals(this.getArch()) == false)
            return false;
        if (other.getAccelerator() == null ^ this.getAccelerator() == null)
            return false;
        if (other.getAccelerator() != null && other.getAccelerator().equals(this.getAccelerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode());
        hashCode = prime * hashCode + ((getArch() == null) ? 0 : getArch().hashCode());
        hashCode = prime * hashCode + ((getAccelerator() == null) ? 0 : getAccelerator().hashCode());
        return hashCode;
    }

    @Override
    public TargetPlatform clone() {
        try {
            return (TargetPlatform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TargetPlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
