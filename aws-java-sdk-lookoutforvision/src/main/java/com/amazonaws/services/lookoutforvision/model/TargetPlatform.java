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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The platform on which a model runs on an AWS IoT Greengrass core device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/TargetPlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetPlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target operating system for the model. Linux is the only operating system that is currently supported.
     * </p>
     */
    private String os;
    /**
     * <p>
     * The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of the
     * x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * </p>
     */
    private String arch;
    /**
     * <p>
     * The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia graphics
     * processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also specify the
     * <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If you don't specify an
     * accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend that you use the
     * <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the following compiler options for
     * CPU:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String accelerator;

    /**
     * <p>
     * The target operating system for the model. Linux is the only operating system that is currently supported.
     * </p>
     * 
     * @param os
     *        The target operating system for the model. Linux is the only operating system that is currently supported.
     * @see TargetPlatformOs
     */

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * <p>
     * The target operating system for the model. Linux is the only operating system that is currently supported.
     * </p>
     * 
     * @return The target operating system for the model. Linux is the only operating system that is currently
     *         supported.
     * @see TargetPlatformOs
     */

    public String getOs() {
        return this.os;
    }

    /**
     * <p>
     * The target operating system for the model. Linux is the only operating system that is currently supported.
     * </p>
     * 
     * @param os
     *        The target operating system for the model. Linux is the only operating system that is currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformOs
     */

    public TargetPlatform withOs(String os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * The target operating system for the model. Linux is the only operating system that is currently supported.
     * </p>
     * 
     * @param os
     *        The target operating system for the model. Linux is the only operating system that is currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformOs
     */

    public TargetPlatform withOs(TargetPlatformOs os) {
        this.os = os.toString();
        return this;
    }

    /**
     * <p>
     * The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of the
     * x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * </p>
     * 
     * @param arch
     *        The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of
     *        the x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * @see TargetPlatformArch
     */

    public void setArch(String arch) {
        this.arch = arch;
    }

    /**
     * <p>
     * The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of the
     * x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * </p>
     * 
     * @return The target architecture for the model. The currently supported architectures are X86_64 (64-bit version
     *         of the x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * @see TargetPlatformArch
     */

    public String getArch() {
        return this.arch;
    }

    /**
     * <p>
     * The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of the
     * x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * </p>
     * 
     * @param arch
     *        The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of
     *        the x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformArch
     */

    public TargetPlatform withArch(String arch) {
        setArch(arch);
        return this;
    }

    /**
     * <p>
     * The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of the
     * x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * </p>
     * 
     * @param arch
     *        The target architecture for the model. The currently supported architectures are X86_64 (64-bit version of
     *        the x86 instruction set) and ARM_64 (ARMv8 64-bit CPU).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformArch
     */

    public TargetPlatform withArch(TargetPlatformArch arch) {
        this.arch = arch.toString();
        return this;
    }

    /**
     * <p>
     * The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia graphics
     * processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also specify the
     * <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If you don't specify an
     * accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend that you use the
     * <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the following compiler options for
     * CPU:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param accelerator
     *        The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia
     *        graphics processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also
     *        specify the <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If
     *        you don't specify an accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend
     *        that you use the <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the
     *        following compiler options for CPU: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     *        </p>
     *        </li>
     * @see TargetPlatformAccelerator
     */

    public void setAccelerator(String accelerator) {
        this.accelerator = accelerator;
    }

    /**
     * <p>
     * The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia graphics
     * processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also specify the
     * <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If you don't specify an
     * accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend that you use the
     * <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the following compiler options for
     * CPU:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia
     *         graphics processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also
     *         specify the <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If
     *         you don't specify an accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend
     *         that you use the <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the
     *         following compiler options for CPU: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     *         </p>
     *         </li>
     * @see TargetPlatformAccelerator
     */

    public String getAccelerator() {
        return this.accelerator;
    }

    /**
     * <p>
     * The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia graphics
     * processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also specify the
     * <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If you don't specify an
     * accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend that you use the
     * <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the following compiler options for
     * CPU:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param accelerator
     *        The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia
     *        graphics processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also
     *        specify the <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If
     *        you don't specify an accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend
     *        that you use the <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the
     *        following compiler options for CPU: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
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
     * The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia graphics
     * processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also specify the
     * <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If you don't specify an
     * accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend that you use the
     * <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the following compiler options for
     * CPU:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param accelerator
     *        The target accelerator for the model. Currently, Amazon Lookout for Vision only supports NVIDIA (Nvidia
     *        graphics processing unit) and CPU accelerators. If you specify NVIDIA as an accelerator, you must also
     *        specify the <code>gpu-code</code>, <code>trt-ver</code>, and <code>cuda-ver</code> compiler options. If
     *        you don't specify an accelerator, Lookout for Vision uses the CPU for compilation and we highly recommend
     *        that you use the <a>GreengrassConfiguration$CompilerOptions</a> field. For example, you can use the
     *        following compiler options for CPU: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>mcpu</code>: CPU micro-architecture. For example, <code>{'mcpu': 'skylake-avx512'}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mattr</code>: CPU flags. For example, <code>{'mattr': ['+neon', '+vfpv4']}</code>
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
        com.amazonaws.services.lookoutforvision.model.transform.TargetPlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
