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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
 * Docker. For more information on the default capabilities and the non-default available capabilities, see <a
 * href="https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities">Runtime privilege and
 * Linux capabilities</a> in the <i>Docker run reference</i>. For more detailed information on these Linux capabilities,
 * see the <a href="http://man7.org/linux/man-pages/man7/capabilities.7.html">capabilities(7)</a> Linux manual page.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/KernelCapabilities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KernelCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the default configuration provided by Docker.
     * This parameter maps to <code>CapAdd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-add</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> add;
    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the default configuration provided by
     * Docker. This parameter maps to <code>CapDrop</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-drop</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> drop;

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the default configuration provided by Docker.
     * This parameter maps to <code>CapAdd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-add</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * 
     * @return The Linux capabilities for the container that have been added to the default configuration provided by
     *         Docker. This parameter maps to <code>CapAdd</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--cap-add</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p> <note>
     *         <p>
     *         If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values:
     *         <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     */

    public java.util.List<String> getAdd() {
        if (add == null) {
            add = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return add;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the default configuration provided by Docker.
     * This parameter maps to <code>CapAdd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-add</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * 
     * @param add
     *        The Linux capabilities for the container that have been added to the default configuration provided by
     *        Docker. This parameter maps to <code>CapAdd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cap-add</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values:
     *        <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     */

    public void setAdd(java.util.Collection<String> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new com.amazonaws.internal.SdkInternalList<String>(add);
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the default configuration provided by Docker.
     * This parameter maps to <code>CapAdd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-add</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdd(java.util.Collection)} or {@link #withAdd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param add
     *        The Linux capabilities for the container that have been added to the default configuration provided by
     *        Docker. This parameter maps to <code>CapAdd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cap-add</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values:
     *        <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelCapabilities withAdd(String... add) {
        if (this.add == null) {
            setAdd(new com.amazonaws.internal.SdkInternalList<String>(add.length));
        }
        for (String ele : add) {
            this.add.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the default configuration provided by Docker.
     * This parameter maps to <code>CapAdd</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-add</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * 
     * @param add
     *        The Linux capabilities for the container that have been added to the default configuration provided by
     *        Docker. This parameter maps to <code>CapAdd</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cap-add</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p> <note>
     *        <p>
     *        If you are using tasks that use the Fargate launch type, the <code>add</code> parameter is not supported.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values:
     *        <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelCapabilities withAdd(java.util.Collection<String> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the default configuration provided by
     * Docker. This parameter maps to <code>CapDrop</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-drop</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * 
     * @return The Linux capabilities for the container that have been removed from the default configuration provided
     *         by Docker. This parameter maps to <code>CapDrop</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *         of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *         <code>--cap-drop</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.</p>
     *         <p>
     *         Valid values:
     *         <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     */

    public java.util.List<String> getDrop() {
        if (drop == null) {
            drop = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return drop;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the default configuration provided by
     * Docker. This parameter maps to <code>CapDrop</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-drop</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * 
     * @param drop
     *        The Linux capabilities for the container that have been removed from the default configuration provided by
     *        Docker. This parameter maps to <code>CapDrop</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cap-drop</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        Valid values:
     *        <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     */

    public void setDrop(java.util.Collection<String> drop) {
        if (drop == null) {
            this.drop = null;
            return;
        }

        this.drop = new com.amazonaws.internal.SdkInternalList<String>(drop);
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the default configuration provided by
     * Docker. This parameter maps to <code>CapDrop</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-drop</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDrop(java.util.Collection)} or {@link #withDrop(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param drop
     *        The Linux capabilities for the container that have been removed from the default configuration provided by
     *        Docker. This parameter maps to <code>CapDrop</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cap-drop</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        Valid values:
     *        <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelCapabilities withDrop(String... drop) {
        if (this.drop == null) {
            setDrop(new com.amazonaws.internal.SdkInternalList<String>(drop.length));
        }
        for (String ele : drop) {
            this.drop.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the default configuration provided by
     * Docker. This parameter maps to <code>CapDrop</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section of the
     * <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the <code>--cap-drop</code> option
     * to <a href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * 
     * @param drop
     *        The Linux capabilities for the container that have been removed from the default configuration provided by
     *        Docker. This parameter maps to <code>CapDrop</code> in the <a
     *        href="https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate">Create a container</a> section
     *        of the <a href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a> and the
     *        <code>--cap-drop</code> option to <a href="https://docs.docker.com/engine/reference/run/">docker
     *        run</a>.</p>
     *        <p>
     *        Valid values:
     *        <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelCapabilities withDrop(java.util.Collection<String> drop) {
        setDrop(drop);
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
        if (getAdd() != null)
            sb.append("Add: ").append(getAdd()).append(",");
        if (getDrop() != null)
            sb.append("Drop: ").append(getDrop());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelCapabilities == false)
            return false;
        KernelCapabilities other = (KernelCapabilities) obj;
        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getDrop() == null ^ this.getDrop() == null)
            return false;
        if (other.getDrop() != null && other.getDrop().equals(this.getDrop()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode());
        hashCode = prime * hashCode + ((getDrop() == null) ? 0 : getDrop().hashCode());
        return hashCode;
    }

    @Override
    public KernelCapabilities clone() {
        try {
            return (KernelCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.KernelCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
