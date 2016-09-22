/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportImageRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ImportImage.
 * </p>
 */
public class ImportImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ImportImageRequest> {

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the disk containers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImageDiskContainer> diskContainers;
    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a third
     * party cloud like AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * <p>
     * Valid values: <code>AWS</code> | <code>BYOL</code>
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The client-specific data.
     * </p>
     */
    private ClientData clientData;
    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * 
     * @param description
     *        A description string for the import image task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * 
     * @return A description string for the import image task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * 
     * @param description
     *        A description string for the import image task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * 
     * @return Information about the disk containers.
     */

    public java.util.List<ImageDiskContainer> getDiskContainers() {
        if (diskContainers == null) {
            diskContainers = new com.amazonaws.internal.SdkInternalList<ImageDiskContainer>();
        }
        return diskContainers;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * 
     * @param diskContainers
     *        Information about the disk containers.
     */

    public void setDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        if (diskContainers == null) {
            this.diskContainers = null;
            return;
        }

        this.diskContainers = new com.amazonaws.internal.SdkInternalList<ImageDiskContainer>(diskContainers);
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskContainers(java.util.Collection)} or {@link #withDiskContainers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param diskContainers
     *        Information about the disk containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withDiskContainers(ImageDiskContainer... diskContainers) {
        if (this.diskContainers == null) {
            setDiskContainers(new com.amazonaws.internal.SdkInternalList<ImageDiskContainer>(diskContainers.length));
        }
        for (ImageDiskContainer ele : diskContainers) {
            this.diskContainers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * 
     * @param diskContainers
     *        Information about the disk containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        setDiskContainers(diskContainers);
        return this;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a third
     * party cloud like AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * <p>
     * Valid values: <code>AWS</code> | <code>BYOL</code>
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the Amazon Machine Image (AMI) after importing.</p>
     *        <p>
     *        <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a
     *        third party cloud like AWS. For more information, see <a href=
     *        "http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *        >Prerequisites</a> in the VM Import/Export User Guide.
     *        </p>
     *        <p>
     *        Valid values: <code>AWS</code> | <code>BYOL</code>
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a third
     * party cloud like AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * <p>
     * Valid values: <code>AWS</code> | <code>BYOL</code>
     * </p>
     * 
     * @return The license type to be used for the Amazon Machine Image (AMI) after importing.</p>
     *         <p>
     *         <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a
     *         third party cloud like AWS. For more information, see <a href=
     *         "http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *         >Prerequisites</a> in the VM Import/Export User Guide.
     *         </p>
     *         <p>
     *         Valid values: <code>AWS</code> | <code>BYOL</code>
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after importing.
     * </p>
     * <p>
     * <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a third
     * party cloud like AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * <p>
     * Valid values: <code>AWS</code> | <code>BYOL</code>
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the Amazon Machine Image (AMI) after importing.</p>
     *        <p>
     *        <b>Note:</b> You may only use BYOL if you have existing licenses with rights to use these licenses in a
     *        third party cloud like AWS. For more information, see <a href=
     *        "http://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *        >Prerequisites</a> in the VM Import/Export User Guide.
     *        </p>
     *        <p>
     *        Valid values: <code>AWS</code> | <code>BYOL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor platform.</p>
     *        <p>
     *        Valid values: <code>xen</code>
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @return The target hypervisor platform.</p>
     *         <p>
     *         Valid values: <code>xen</code>
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor platform.</p>
     *        <p>
     *        Valid values: <code>xen</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>i386</code> | <code>x86_64</code>
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @return The architecture of the virtual machine.</p>
     *         <p>
     *         Valid values: <code>i386</code> | <code>x86_64</code>
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>i386</code> | <code>x86_64</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * 
     * @param platform
     *        The operating system of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>Windows</code> | <code>Linux</code>
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * 
     * @return The operating system of the virtual machine.</p>
     *         <p>
     *         Valid values: <code>Windows</code> | <code>Linux</code>
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * 
     * @param platform
     *        The operating system of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>Windows</code> | <code>Linux</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     * 
     * @param clientData
     *        The client-specific data.
     */

    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     * 
     * @return The client-specific data.
     */

    public ClientData getClientData() {
        return this.clientData;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     * 
     * @param clientData
     *        The client-specific data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withClientData(ClientData clientData) {
        setClientData(clientData);
        return this;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * 
     * @param clientToken
     *        The token to enable idempotency for VM import requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * 
     * @return The token to enable idempotency for VM import requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * 
     * @param clientToken
     *        The token to enable idempotency for VM import requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * 
     * @param roleName
     *        The name of the role to use when not using the default role, 'vmimport'.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * 
     * @return The name of the role to use when not using the default role, 'vmimport'.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * 
     * @param roleName
     *        The name of the role to use when not using the default role, 'vmimport'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ImportImageRequest> getDryRunRequest() {
        Request<ImportImageRequest> request = new ImportImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDiskContainers() != null)
            sb.append("DiskContainers: " + getDiskContainers() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getClientData() != null)
            sb.append("ClientData: " + getClientData() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageRequest == false)
            return false;
        ImportImageRequest other = (ImportImageRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiskContainers() == null ^ this.getDiskContainers() == null)
            return false;
        if (other.getDiskContainers() != null && other.getDiskContainers().equals(this.getDiskContainers()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getClientData() == null ^ this.getClientData() == null)
            return false;
        if (other.getClientData() != null && other.getClientData().equals(this.getClientData()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiskContainers() == null) ? 0 : getDiskContainers().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public ImportImageRequest clone() {
        return (ImportImageRequest) super.clone();
    }
}
