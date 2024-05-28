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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional information about the suspicious activity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RuntimeContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the process that modified the current process. This is available for multiple finding types.
     * </p>
     */
    private ProcessDetails modifyingProcess;
    /**
     * <p>
     * The timestamp at which the process modified the current process. The timestamp is in UTC date string format.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The path to the script that was executed.
     * </p>
     */
    private String scriptPath;
    /**
     * <p>
     * The path to the new library that was loaded.
     * </p>
     */
    private String libraryPath;
    /**
     * <p>
     * The value of the LD_PRELOAD environment variable.
     * </p>
     */
    private String ldPreloadValue;
    /**
     * <p>
     * The path to the docket socket that was accessed.
     * </p>
     */
    private String socketPath;
    /**
     * <p>
     * The path to the leveraged <code>runc</code> implementation.
     * </p>
     */
    private String runcBinaryPath;
    /**
     * <p>
     * The path in the container that modified the release agent file.
     * </p>
     */
    private String releaseAgentPath;
    /**
     * <p>
     * The path on the host that is mounted by the container.
     * </p>
     */
    private String mountSource;
    /**
     * <p>
     * The path in the container that is mapped to the host directory.
     * </p>
     */
    private String mountTarget;
    /**
     * <p>
     * Represents the type of mounted fileSystem.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * Represents options that control the behavior of a runtime operation or action. For example, a filesystem mount
     * operation may contain a read-only flag.
     * </p>
     */
    private java.util.List<String> flags;
    /**
     * <p>
     * The name of the module loaded into the kernel.
     * </p>
     */
    private String moduleName;
    /**
     * <p>
     * The path to the module loaded into the kernel.
     * </p>
     */
    private String moduleFilePath;
    /**
     * <p>
     * The <code>SHA256</code> hash of the module.
     * </p>
     */
    private String moduleSha256;
    /**
     * <p>
     * The path to the modified shell history file.
     * </p>
     */
    private String shellHistoryFilePath;
    /**
     * <p>
     * Information about the process that had its memory overwritten by the current process.
     * </p>
     */
    private ProcessDetails targetProcess;
    /**
     * <p>
     * Represents the communication protocol associated with the address. For example, the address family
     * <code>AF_INET</code> is used for IP version of 4 protocol.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * Specifies a particular protocol within the address family. Usually there is a single protocol in address
     * families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     * </p>
     */
    private Integer ianaProtocolNumber;
    /**
     * <p>
     * Specifies the Region of a process's address space such as stack and heap.
     * </p>
     */
    private java.util.List<String> memoryRegions;
    /**
     * <p>
     * Name of the potentially suspicious tool.
     * </p>
     */
    private String toolName;
    /**
     * <p>
     * Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner, and
     * Network Sniffer.
     * </p>
     */
    private String toolCategory;
    /**
     * <p>
     * Name of the security service that has been potentially disabled.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * Example of the command line involved in the suspicious activity.
     * </p>
     */
    private String commandLineExample;
    /**
     * <p>
     * The suspicious file path for which the threat intelligence details were found.
     * </p>
     */
    private String threatFilePath;

    /**
     * <p>
     * Information about the process that modified the current process. This is available for multiple finding types.
     * </p>
     * 
     * @param modifyingProcess
     *        Information about the process that modified the current process. This is available for multiple finding
     *        types.
     */

    public void setModifyingProcess(ProcessDetails modifyingProcess) {
        this.modifyingProcess = modifyingProcess;
    }

    /**
     * <p>
     * Information about the process that modified the current process. This is available for multiple finding types.
     * </p>
     * 
     * @return Information about the process that modified the current process. This is available for multiple finding
     *         types.
     */

    public ProcessDetails getModifyingProcess() {
        return this.modifyingProcess;
    }

    /**
     * <p>
     * Information about the process that modified the current process. This is available for multiple finding types.
     * </p>
     * 
     * @param modifyingProcess
     *        Information about the process that modified the current process. This is available for multiple finding
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withModifyingProcess(ProcessDetails modifyingProcess) {
        setModifyingProcess(modifyingProcess);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the process modified the current process. The timestamp is in UTC date string format.
     * </p>
     * 
     * @param modifiedAt
     *        The timestamp at which the process modified the current process. The timestamp is in UTC date string
     *        format.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The timestamp at which the process modified the current process. The timestamp is in UTC date string format.
     * </p>
     * 
     * @return The timestamp at which the process modified the current process. The timestamp is in UTC date string
     *         format.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The timestamp at which the process modified the current process. The timestamp is in UTC date string format.
     * </p>
     * 
     * @param modifiedAt
     *        The timestamp at which the process modified the current process. The timestamp is in UTC date string
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The path to the script that was executed.
     * </p>
     * 
     * @param scriptPath
     *        The path to the script that was executed.
     */

    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    /**
     * <p>
     * The path to the script that was executed.
     * </p>
     * 
     * @return The path to the script that was executed.
     */

    public String getScriptPath() {
        return this.scriptPath;
    }

    /**
     * <p>
     * The path to the script that was executed.
     * </p>
     * 
     * @param scriptPath
     *        The path to the script that was executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withScriptPath(String scriptPath) {
        setScriptPath(scriptPath);
        return this;
    }

    /**
     * <p>
     * The path to the new library that was loaded.
     * </p>
     * 
     * @param libraryPath
     *        The path to the new library that was loaded.
     */

    public void setLibraryPath(String libraryPath) {
        this.libraryPath = libraryPath;
    }

    /**
     * <p>
     * The path to the new library that was loaded.
     * </p>
     * 
     * @return The path to the new library that was loaded.
     */

    public String getLibraryPath() {
        return this.libraryPath;
    }

    /**
     * <p>
     * The path to the new library that was loaded.
     * </p>
     * 
     * @param libraryPath
     *        The path to the new library that was loaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withLibraryPath(String libraryPath) {
        setLibraryPath(libraryPath);
        return this;
    }

    /**
     * <p>
     * The value of the LD_PRELOAD environment variable.
     * </p>
     * 
     * @param ldPreloadValue
     *        The value of the LD_PRELOAD environment variable.
     */

    public void setLdPreloadValue(String ldPreloadValue) {
        this.ldPreloadValue = ldPreloadValue;
    }

    /**
     * <p>
     * The value of the LD_PRELOAD environment variable.
     * </p>
     * 
     * @return The value of the LD_PRELOAD environment variable.
     */

    public String getLdPreloadValue() {
        return this.ldPreloadValue;
    }

    /**
     * <p>
     * The value of the LD_PRELOAD environment variable.
     * </p>
     * 
     * @param ldPreloadValue
     *        The value of the LD_PRELOAD environment variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withLdPreloadValue(String ldPreloadValue) {
        setLdPreloadValue(ldPreloadValue);
        return this;
    }

    /**
     * <p>
     * The path to the docket socket that was accessed.
     * </p>
     * 
     * @param socketPath
     *        The path to the docket socket that was accessed.
     */

    public void setSocketPath(String socketPath) {
        this.socketPath = socketPath;
    }

    /**
     * <p>
     * The path to the docket socket that was accessed.
     * </p>
     * 
     * @return The path to the docket socket that was accessed.
     */

    public String getSocketPath() {
        return this.socketPath;
    }

    /**
     * <p>
     * The path to the docket socket that was accessed.
     * </p>
     * 
     * @param socketPath
     *        The path to the docket socket that was accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withSocketPath(String socketPath) {
        setSocketPath(socketPath);
        return this;
    }

    /**
     * <p>
     * The path to the leveraged <code>runc</code> implementation.
     * </p>
     * 
     * @param runcBinaryPath
     *        The path to the leveraged <code>runc</code> implementation.
     */

    public void setRuncBinaryPath(String runcBinaryPath) {
        this.runcBinaryPath = runcBinaryPath;
    }

    /**
     * <p>
     * The path to the leveraged <code>runc</code> implementation.
     * </p>
     * 
     * @return The path to the leveraged <code>runc</code> implementation.
     */

    public String getRuncBinaryPath() {
        return this.runcBinaryPath;
    }

    /**
     * <p>
     * The path to the leveraged <code>runc</code> implementation.
     * </p>
     * 
     * @param runcBinaryPath
     *        The path to the leveraged <code>runc</code> implementation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withRuncBinaryPath(String runcBinaryPath) {
        setRuncBinaryPath(runcBinaryPath);
        return this;
    }

    /**
     * <p>
     * The path in the container that modified the release agent file.
     * </p>
     * 
     * @param releaseAgentPath
     *        The path in the container that modified the release agent file.
     */

    public void setReleaseAgentPath(String releaseAgentPath) {
        this.releaseAgentPath = releaseAgentPath;
    }

    /**
     * <p>
     * The path in the container that modified the release agent file.
     * </p>
     * 
     * @return The path in the container that modified the release agent file.
     */

    public String getReleaseAgentPath() {
        return this.releaseAgentPath;
    }

    /**
     * <p>
     * The path in the container that modified the release agent file.
     * </p>
     * 
     * @param releaseAgentPath
     *        The path in the container that modified the release agent file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withReleaseAgentPath(String releaseAgentPath) {
        setReleaseAgentPath(releaseAgentPath);
        return this;
    }

    /**
     * <p>
     * The path on the host that is mounted by the container.
     * </p>
     * 
     * @param mountSource
     *        The path on the host that is mounted by the container.
     */

    public void setMountSource(String mountSource) {
        this.mountSource = mountSource;
    }

    /**
     * <p>
     * The path on the host that is mounted by the container.
     * </p>
     * 
     * @return The path on the host that is mounted by the container.
     */

    public String getMountSource() {
        return this.mountSource;
    }

    /**
     * <p>
     * The path on the host that is mounted by the container.
     * </p>
     * 
     * @param mountSource
     *        The path on the host that is mounted by the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withMountSource(String mountSource) {
        setMountSource(mountSource);
        return this;
    }

    /**
     * <p>
     * The path in the container that is mapped to the host directory.
     * </p>
     * 
     * @param mountTarget
     *        The path in the container that is mapped to the host directory.
     */

    public void setMountTarget(String mountTarget) {
        this.mountTarget = mountTarget;
    }

    /**
     * <p>
     * The path in the container that is mapped to the host directory.
     * </p>
     * 
     * @return The path in the container that is mapped to the host directory.
     */

    public String getMountTarget() {
        return this.mountTarget;
    }

    /**
     * <p>
     * The path in the container that is mapped to the host directory.
     * </p>
     * 
     * @param mountTarget
     *        The path in the container that is mapped to the host directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withMountTarget(String mountTarget) {
        setMountTarget(mountTarget);
        return this;
    }

    /**
     * <p>
     * Represents the type of mounted fileSystem.
     * </p>
     * 
     * @param fileSystemType
     *        Represents the type of mounted fileSystem.
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * Represents the type of mounted fileSystem.
     * </p>
     * 
     * @return Represents the type of mounted fileSystem.
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * Represents the type of mounted fileSystem.
     * </p>
     * 
     * @param fileSystemType
     *        Represents the type of mounted fileSystem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * Represents options that control the behavior of a runtime operation or action. For example, a filesystem mount
     * operation may contain a read-only flag.
     * </p>
     * 
     * @return Represents options that control the behavior of a runtime operation or action. For example, a filesystem
     *         mount operation may contain a read-only flag.
     */

    public java.util.List<String> getFlags() {
        return flags;
    }

    /**
     * <p>
     * Represents options that control the behavior of a runtime operation or action. For example, a filesystem mount
     * operation may contain a read-only flag.
     * </p>
     * 
     * @param flags
     *        Represents options that control the behavior of a runtime operation or action. For example, a filesystem
     *        mount operation may contain a read-only flag.
     */

    public void setFlags(java.util.Collection<String> flags) {
        if (flags == null) {
            this.flags = null;
            return;
        }

        this.flags = new java.util.ArrayList<String>(flags);
    }

    /**
     * <p>
     * Represents options that control the behavior of a runtime operation or action. For example, a filesystem mount
     * operation may contain a read-only flag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlags(java.util.Collection)} or {@link #withFlags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param flags
     *        Represents options that control the behavior of a runtime operation or action. For example, a filesystem
     *        mount operation may contain a read-only flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withFlags(String... flags) {
        if (this.flags == null) {
            setFlags(new java.util.ArrayList<String>(flags.length));
        }
        for (String ele : flags) {
            this.flags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents options that control the behavior of a runtime operation or action. For example, a filesystem mount
     * operation may contain a read-only flag.
     * </p>
     * 
     * @param flags
     *        Represents options that control the behavior of a runtime operation or action. For example, a filesystem
     *        mount operation may contain a read-only flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withFlags(java.util.Collection<String> flags) {
        setFlags(flags);
        return this;
    }

    /**
     * <p>
     * The name of the module loaded into the kernel.
     * </p>
     * 
     * @param moduleName
     *        The name of the module loaded into the kernel.
     */

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * <p>
     * The name of the module loaded into the kernel.
     * </p>
     * 
     * @return The name of the module loaded into the kernel.
     */

    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * <p>
     * The name of the module loaded into the kernel.
     * </p>
     * 
     * @param moduleName
     *        The name of the module loaded into the kernel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withModuleName(String moduleName) {
        setModuleName(moduleName);
        return this;
    }

    /**
     * <p>
     * The path to the module loaded into the kernel.
     * </p>
     * 
     * @param moduleFilePath
     *        The path to the module loaded into the kernel.
     */

    public void setModuleFilePath(String moduleFilePath) {
        this.moduleFilePath = moduleFilePath;
    }

    /**
     * <p>
     * The path to the module loaded into the kernel.
     * </p>
     * 
     * @return The path to the module loaded into the kernel.
     */

    public String getModuleFilePath() {
        return this.moduleFilePath;
    }

    /**
     * <p>
     * The path to the module loaded into the kernel.
     * </p>
     * 
     * @param moduleFilePath
     *        The path to the module loaded into the kernel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withModuleFilePath(String moduleFilePath) {
        setModuleFilePath(moduleFilePath);
        return this;
    }

    /**
     * <p>
     * The <code>SHA256</code> hash of the module.
     * </p>
     * 
     * @param moduleSha256
     *        The <code>SHA256</code> hash of the module.
     */

    public void setModuleSha256(String moduleSha256) {
        this.moduleSha256 = moduleSha256;
    }

    /**
     * <p>
     * The <code>SHA256</code> hash of the module.
     * </p>
     * 
     * @return The <code>SHA256</code> hash of the module.
     */

    public String getModuleSha256() {
        return this.moduleSha256;
    }

    /**
     * <p>
     * The <code>SHA256</code> hash of the module.
     * </p>
     * 
     * @param moduleSha256
     *        The <code>SHA256</code> hash of the module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withModuleSha256(String moduleSha256) {
        setModuleSha256(moduleSha256);
        return this;
    }

    /**
     * <p>
     * The path to the modified shell history file.
     * </p>
     * 
     * @param shellHistoryFilePath
     *        The path to the modified shell history file.
     */

    public void setShellHistoryFilePath(String shellHistoryFilePath) {
        this.shellHistoryFilePath = shellHistoryFilePath;
    }

    /**
     * <p>
     * The path to the modified shell history file.
     * </p>
     * 
     * @return The path to the modified shell history file.
     */

    public String getShellHistoryFilePath() {
        return this.shellHistoryFilePath;
    }

    /**
     * <p>
     * The path to the modified shell history file.
     * </p>
     * 
     * @param shellHistoryFilePath
     *        The path to the modified shell history file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withShellHistoryFilePath(String shellHistoryFilePath) {
        setShellHistoryFilePath(shellHistoryFilePath);
        return this;
    }

    /**
     * <p>
     * Information about the process that had its memory overwritten by the current process.
     * </p>
     * 
     * @param targetProcess
     *        Information about the process that had its memory overwritten by the current process.
     */

    public void setTargetProcess(ProcessDetails targetProcess) {
        this.targetProcess = targetProcess;
    }

    /**
     * <p>
     * Information about the process that had its memory overwritten by the current process.
     * </p>
     * 
     * @return Information about the process that had its memory overwritten by the current process.
     */

    public ProcessDetails getTargetProcess() {
        return this.targetProcess;
    }

    /**
     * <p>
     * Information about the process that had its memory overwritten by the current process.
     * </p>
     * 
     * @param targetProcess
     *        Information about the process that had its memory overwritten by the current process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withTargetProcess(ProcessDetails targetProcess) {
        setTargetProcess(targetProcess);
        return this;
    }

    /**
     * <p>
     * Represents the communication protocol associated with the address. For example, the address family
     * <code>AF_INET</code> is used for IP version of 4 protocol.
     * </p>
     * 
     * @param addressFamily
     *        Represents the communication protocol associated with the address. For example, the address family
     *        <code>AF_INET</code> is used for IP version of 4 protocol.
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * Represents the communication protocol associated with the address. For example, the address family
     * <code>AF_INET</code> is used for IP version of 4 protocol.
     * </p>
     * 
     * @return Represents the communication protocol associated with the address. For example, the address family
     *         <code>AF_INET</code> is used for IP version of 4 protocol.
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * Represents the communication protocol associated with the address. For example, the address family
     * <code>AF_INET</code> is used for IP version of 4 protocol.
     * </p>
     * 
     * @param addressFamily
     *        Represents the communication protocol associated with the address. For example, the address family
     *        <code>AF_INET</code> is used for IP version of 4 protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * Specifies a particular protocol within the address family. Usually there is a single protocol in address
     * families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     * </p>
     * 
     * @param ianaProtocolNumber
     *        Specifies a particular protocol within the address family. Usually there is a single protocol in address
     *        families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     */

    public void setIanaProtocolNumber(Integer ianaProtocolNumber) {
        this.ianaProtocolNumber = ianaProtocolNumber;
    }

    /**
     * <p>
     * Specifies a particular protocol within the address family. Usually there is a single protocol in address
     * families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     * </p>
     * 
     * @return Specifies a particular protocol within the address family. Usually there is a single protocol in address
     *         families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     */

    public Integer getIanaProtocolNumber() {
        return this.ianaProtocolNumber;
    }

    /**
     * <p>
     * Specifies a particular protocol within the address family. Usually there is a single protocol in address
     * families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     * </p>
     * 
     * @param ianaProtocolNumber
     *        Specifies a particular protocol within the address family. Usually there is a single protocol in address
     *        families. For example, the address family <code>AF_INET</code> only has the IP protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withIanaProtocolNumber(Integer ianaProtocolNumber) {
        setIanaProtocolNumber(ianaProtocolNumber);
        return this;
    }

    /**
     * <p>
     * Specifies the Region of a process's address space such as stack and heap.
     * </p>
     * 
     * @return Specifies the Region of a process's address space such as stack and heap.
     */

    public java.util.List<String> getMemoryRegions() {
        return memoryRegions;
    }

    /**
     * <p>
     * Specifies the Region of a process's address space such as stack and heap.
     * </p>
     * 
     * @param memoryRegions
     *        Specifies the Region of a process's address space such as stack and heap.
     */

    public void setMemoryRegions(java.util.Collection<String> memoryRegions) {
        if (memoryRegions == null) {
            this.memoryRegions = null;
            return;
        }

        this.memoryRegions = new java.util.ArrayList<String>(memoryRegions);
    }

    /**
     * <p>
     * Specifies the Region of a process's address space such as stack and heap.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemoryRegions(java.util.Collection)} or {@link #withMemoryRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memoryRegions
     *        Specifies the Region of a process's address space such as stack and heap.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withMemoryRegions(String... memoryRegions) {
        if (this.memoryRegions == null) {
            setMemoryRegions(new java.util.ArrayList<String>(memoryRegions.length));
        }
        for (String ele : memoryRegions) {
            this.memoryRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Region of a process's address space such as stack and heap.
     * </p>
     * 
     * @param memoryRegions
     *        Specifies the Region of a process's address space such as stack and heap.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withMemoryRegions(java.util.Collection<String> memoryRegions) {
        setMemoryRegions(memoryRegions);
        return this;
    }

    /**
     * <p>
     * Name of the potentially suspicious tool.
     * </p>
     * 
     * @param toolName
     *        Name of the potentially suspicious tool.
     */

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    /**
     * <p>
     * Name of the potentially suspicious tool.
     * </p>
     * 
     * @return Name of the potentially suspicious tool.
     */

    public String getToolName() {
        return this.toolName;
    }

    /**
     * <p>
     * Name of the potentially suspicious tool.
     * </p>
     * 
     * @param toolName
     *        Name of the potentially suspicious tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withToolName(String toolName) {
        setToolName(toolName);
        return this;
    }

    /**
     * <p>
     * Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner, and
     * Network Sniffer.
     * </p>
     * 
     * @param toolCategory
     *        Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner,
     *        and Network Sniffer.
     */

    public void setToolCategory(String toolCategory) {
        this.toolCategory = toolCategory;
    }

    /**
     * <p>
     * Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner, and
     * Network Sniffer.
     * </p>
     * 
     * @return Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner,
     *         and Network Sniffer.
     */

    public String getToolCategory() {
        return this.toolCategory;
    }

    /**
     * <p>
     * Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner, and
     * Network Sniffer.
     * </p>
     * 
     * @param toolCategory
     *        Category that the tool belongs to. Some of the examples are Backdoor Tool, Pentest Tool, Network Scanner,
     *        and Network Sniffer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withToolCategory(String toolCategory) {
        setToolCategory(toolCategory);
        return this;
    }

    /**
     * <p>
     * Name of the security service that has been potentially disabled.
     * </p>
     * 
     * @param serviceName
     *        Name of the security service that has been potentially disabled.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * Name of the security service that has been potentially disabled.
     * </p>
     * 
     * @return Name of the security service that has been potentially disabled.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * Name of the security service that has been potentially disabled.
     * </p>
     * 
     * @param serviceName
     *        Name of the security service that has been potentially disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * Example of the command line involved in the suspicious activity.
     * </p>
     * 
     * @param commandLineExample
     *        Example of the command line involved in the suspicious activity.
     */

    public void setCommandLineExample(String commandLineExample) {
        this.commandLineExample = commandLineExample;
    }

    /**
     * <p>
     * Example of the command line involved in the suspicious activity.
     * </p>
     * 
     * @return Example of the command line involved in the suspicious activity.
     */

    public String getCommandLineExample() {
        return this.commandLineExample;
    }

    /**
     * <p>
     * Example of the command line involved in the suspicious activity.
     * </p>
     * 
     * @param commandLineExample
     *        Example of the command line involved in the suspicious activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withCommandLineExample(String commandLineExample) {
        setCommandLineExample(commandLineExample);
        return this;
    }

    /**
     * <p>
     * The suspicious file path for which the threat intelligence details were found.
     * </p>
     * 
     * @param threatFilePath
     *        The suspicious file path for which the threat intelligence details were found.
     */

    public void setThreatFilePath(String threatFilePath) {
        this.threatFilePath = threatFilePath;
    }

    /**
     * <p>
     * The suspicious file path for which the threat intelligence details were found.
     * </p>
     * 
     * @return The suspicious file path for which the threat intelligence details were found.
     */

    public String getThreatFilePath() {
        return this.threatFilePath;
    }

    /**
     * <p>
     * The suspicious file path for which the threat intelligence details were found.
     * </p>
     * 
     * @param threatFilePath
     *        The suspicious file path for which the threat intelligence details were found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeContext withThreatFilePath(String threatFilePath) {
        setThreatFilePath(threatFilePath);
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
        if (getModifyingProcess() != null)
            sb.append("ModifyingProcess: ").append(getModifyingProcess()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getScriptPath() != null)
            sb.append("ScriptPath: ").append(getScriptPath()).append(",");
        if (getLibraryPath() != null)
            sb.append("LibraryPath: ").append(getLibraryPath()).append(",");
        if (getLdPreloadValue() != null)
            sb.append("LdPreloadValue: ").append(getLdPreloadValue()).append(",");
        if (getSocketPath() != null)
            sb.append("SocketPath: ").append(getSocketPath()).append(",");
        if (getRuncBinaryPath() != null)
            sb.append("RuncBinaryPath: ").append(getRuncBinaryPath()).append(",");
        if (getReleaseAgentPath() != null)
            sb.append("ReleaseAgentPath: ").append(getReleaseAgentPath()).append(",");
        if (getMountSource() != null)
            sb.append("MountSource: ").append(getMountSource()).append(",");
        if (getMountTarget() != null)
            sb.append("MountTarget: ").append(getMountTarget()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getFlags() != null)
            sb.append("Flags: ").append(getFlags()).append(",");
        if (getModuleName() != null)
            sb.append("ModuleName: ").append(getModuleName()).append(",");
        if (getModuleFilePath() != null)
            sb.append("ModuleFilePath: ").append(getModuleFilePath()).append(",");
        if (getModuleSha256() != null)
            sb.append("ModuleSha256: ").append(getModuleSha256()).append(",");
        if (getShellHistoryFilePath() != null)
            sb.append("ShellHistoryFilePath: ").append(getShellHistoryFilePath()).append(",");
        if (getTargetProcess() != null)
            sb.append("TargetProcess: ").append(getTargetProcess()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getIanaProtocolNumber() != null)
            sb.append("IanaProtocolNumber: ").append(getIanaProtocolNumber()).append(",");
        if (getMemoryRegions() != null)
            sb.append("MemoryRegions: ").append(getMemoryRegions()).append(",");
        if (getToolName() != null)
            sb.append("ToolName: ").append(getToolName()).append(",");
        if (getToolCategory() != null)
            sb.append("ToolCategory: ").append(getToolCategory()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getCommandLineExample() != null)
            sb.append("CommandLineExample: ").append(getCommandLineExample()).append(",");
        if (getThreatFilePath() != null)
            sb.append("ThreatFilePath: ").append(getThreatFilePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeContext == false)
            return false;
        RuntimeContext other = (RuntimeContext) obj;
        if (other.getModifyingProcess() == null ^ this.getModifyingProcess() == null)
            return false;
        if (other.getModifyingProcess() != null && other.getModifyingProcess().equals(this.getModifyingProcess()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getScriptPath() == null ^ this.getScriptPath() == null)
            return false;
        if (other.getScriptPath() != null && other.getScriptPath().equals(this.getScriptPath()) == false)
            return false;
        if (other.getLibraryPath() == null ^ this.getLibraryPath() == null)
            return false;
        if (other.getLibraryPath() != null && other.getLibraryPath().equals(this.getLibraryPath()) == false)
            return false;
        if (other.getLdPreloadValue() == null ^ this.getLdPreloadValue() == null)
            return false;
        if (other.getLdPreloadValue() != null && other.getLdPreloadValue().equals(this.getLdPreloadValue()) == false)
            return false;
        if (other.getSocketPath() == null ^ this.getSocketPath() == null)
            return false;
        if (other.getSocketPath() != null && other.getSocketPath().equals(this.getSocketPath()) == false)
            return false;
        if (other.getRuncBinaryPath() == null ^ this.getRuncBinaryPath() == null)
            return false;
        if (other.getRuncBinaryPath() != null && other.getRuncBinaryPath().equals(this.getRuncBinaryPath()) == false)
            return false;
        if (other.getReleaseAgentPath() == null ^ this.getReleaseAgentPath() == null)
            return false;
        if (other.getReleaseAgentPath() != null && other.getReleaseAgentPath().equals(this.getReleaseAgentPath()) == false)
            return false;
        if (other.getMountSource() == null ^ this.getMountSource() == null)
            return false;
        if (other.getMountSource() != null && other.getMountSource().equals(this.getMountSource()) == false)
            return false;
        if (other.getMountTarget() == null ^ this.getMountTarget() == null)
            return false;
        if (other.getMountTarget() != null && other.getMountTarget().equals(this.getMountTarget()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getFlags() == null ^ this.getFlags() == null)
            return false;
        if (other.getFlags() != null && other.getFlags().equals(this.getFlags()) == false)
            return false;
        if (other.getModuleName() == null ^ this.getModuleName() == null)
            return false;
        if (other.getModuleName() != null && other.getModuleName().equals(this.getModuleName()) == false)
            return false;
        if (other.getModuleFilePath() == null ^ this.getModuleFilePath() == null)
            return false;
        if (other.getModuleFilePath() != null && other.getModuleFilePath().equals(this.getModuleFilePath()) == false)
            return false;
        if (other.getModuleSha256() == null ^ this.getModuleSha256() == null)
            return false;
        if (other.getModuleSha256() != null && other.getModuleSha256().equals(this.getModuleSha256()) == false)
            return false;
        if (other.getShellHistoryFilePath() == null ^ this.getShellHistoryFilePath() == null)
            return false;
        if (other.getShellHistoryFilePath() != null && other.getShellHistoryFilePath().equals(this.getShellHistoryFilePath()) == false)
            return false;
        if (other.getTargetProcess() == null ^ this.getTargetProcess() == null)
            return false;
        if (other.getTargetProcess() != null && other.getTargetProcess().equals(this.getTargetProcess()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getIanaProtocolNumber() == null ^ this.getIanaProtocolNumber() == null)
            return false;
        if (other.getIanaProtocolNumber() != null && other.getIanaProtocolNumber().equals(this.getIanaProtocolNumber()) == false)
            return false;
        if (other.getMemoryRegions() == null ^ this.getMemoryRegions() == null)
            return false;
        if (other.getMemoryRegions() != null && other.getMemoryRegions().equals(this.getMemoryRegions()) == false)
            return false;
        if (other.getToolName() == null ^ this.getToolName() == null)
            return false;
        if (other.getToolName() != null && other.getToolName().equals(this.getToolName()) == false)
            return false;
        if (other.getToolCategory() == null ^ this.getToolCategory() == null)
            return false;
        if (other.getToolCategory() != null && other.getToolCategory().equals(this.getToolCategory()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getCommandLineExample() == null ^ this.getCommandLineExample() == null)
            return false;
        if (other.getCommandLineExample() != null && other.getCommandLineExample().equals(this.getCommandLineExample()) == false)
            return false;
        if (other.getThreatFilePath() == null ^ this.getThreatFilePath() == null)
            return false;
        if (other.getThreatFilePath() != null && other.getThreatFilePath().equals(this.getThreatFilePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModifyingProcess() == null) ? 0 : getModifyingProcess().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getScriptPath() == null) ? 0 : getScriptPath().hashCode());
        hashCode = prime * hashCode + ((getLibraryPath() == null) ? 0 : getLibraryPath().hashCode());
        hashCode = prime * hashCode + ((getLdPreloadValue() == null) ? 0 : getLdPreloadValue().hashCode());
        hashCode = prime * hashCode + ((getSocketPath() == null) ? 0 : getSocketPath().hashCode());
        hashCode = prime * hashCode + ((getRuncBinaryPath() == null) ? 0 : getRuncBinaryPath().hashCode());
        hashCode = prime * hashCode + ((getReleaseAgentPath() == null) ? 0 : getReleaseAgentPath().hashCode());
        hashCode = prime * hashCode + ((getMountSource() == null) ? 0 : getMountSource().hashCode());
        hashCode = prime * hashCode + ((getMountTarget() == null) ? 0 : getMountTarget().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getFlags() == null) ? 0 : getFlags().hashCode());
        hashCode = prime * hashCode + ((getModuleName() == null) ? 0 : getModuleName().hashCode());
        hashCode = prime * hashCode + ((getModuleFilePath() == null) ? 0 : getModuleFilePath().hashCode());
        hashCode = prime * hashCode + ((getModuleSha256() == null) ? 0 : getModuleSha256().hashCode());
        hashCode = prime * hashCode + ((getShellHistoryFilePath() == null) ? 0 : getShellHistoryFilePath().hashCode());
        hashCode = prime * hashCode + ((getTargetProcess() == null) ? 0 : getTargetProcess().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getIanaProtocolNumber() == null) ? 0 : getIanaProtocolNumber().hashCode());
        hashCode = prime * hashCode + ((getMemoryRegions() == null) ? 0 : getMemoryRegions().hashCode());
        hashCode = prime * hashCode + ((getToolName() == null) ? 0 : getToolName().hashCode());
        hashCode = prime * hashCode + ((getToolCategory() == null) ? 0 : getToolCategory().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getCommandLineExample() == null) ? 0 : getCommandLineExample().hashCode());
        hashCode = prime * hashCode + ((getThreatFilePath() == null) ? 0 : getThreatFilePath().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeContext clone() {
        try {
            return (RuntimeContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RuntimeContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
