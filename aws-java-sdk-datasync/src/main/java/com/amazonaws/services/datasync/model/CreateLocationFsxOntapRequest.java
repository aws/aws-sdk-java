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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOntap" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationFsxOntapRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private FsxProtocol protocol;
    /**
     * <p>
     * Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.
     * </p>
     * <p>
     * The security groups must allow outbound traffic on the following ports (depending on the protocol you use):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Server Message Block (SMB)</b>: TCP port 445
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your file system's security groups must also allow inbound traffic on the same ports.
     * </p>
     */
    private java.util.List<String> securityGroupArns;
    /**
     * <p>
     * Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to or from.
     * </p>
     */
    private String storageVirtualMachineArn;
    /**
     * <p>
     * Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to or from
     * (for example, <code>/vol1</code>).
     * </p>
     * <note>
     * <p>
     * Don't specify a junction path in the SVM's root volume. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP storage
     * virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * </note>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * @param protocol
     */

    public void setProtocol(FsxProtocol protocol) {
        this.protocol = protocol;
    }

    /**
     * @return
     */

    public FsxProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * @param protocol
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withProtocol(FsxProtocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.
     * </p>
     * <p>
     * The security groups must allow outbound traffic on the following ports (depending on the protocol you use):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Server Message Block (SMB)</b>: TCP port 445
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your file system's security groups must also allow inbound traffic on the same ports.
     * </p>
     * 
     * @return Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.</p>
     *         <p>
     *         The security groups must allow outbound traffic on the following ports (depending on the protocol you
     *         use):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Server Message Block (SMB)</b>: TCP port 445
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Your file system's security groups must also allow inbound traffic on the same ports.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.
     * </p>
     * <p>
     * The security groups must allow outbound traffic on the following ports (depending on the protocol you use):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Server Message Block (SMB)</b>: TCP port 445
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your file system's security groups must also allow inbound traffic on the same ports.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.</p>
     *        <p>
     *        The security groups must allow outbound traffic on the following ports (depending on the protocol you
     *        use):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Server Message Block (SMB)</b>: TCP port 445
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Your file system's security groups must also allow inbound traffic on the same ports.
     */

    public void setSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        if (securityGroupArns == null) {
            this.securityGroupArns = null;
            return;
        }

        this.securityGroupArns = new java.util.ArrayList<String>(securityGroupArns);
    }

    /**
     * <p>
     * Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.
     * </p>
     * <p>
     * The security groups must allow outbound traffic on the following ports (depending on the protocol you use):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Server Message Block (SMB)</b>: TCP port 445
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your file system's security groups must also allow inbound traffic on the same ports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.</p>
     *        <p>
     *        The security groups must allow outbound traffic on the following ports (depending on the protocol you
     *        use):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Server Message Block (SMB)</b>: TCP port 445
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Your file system's security groups must also allow inbound traffic on the same ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withSecurityGroupArns(String... securityGroupArns) {
        if (this.securityGroupArns == null) {
            setSecurityGroupArns(new java.util.ArrayList<String>(securityGroupArns.length));
        }
        for (String ele : securityGroupArns) {
            this.securityGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.
     * </p>
     * <p>
     * The security groups must allow outbound traffic on the following ports (depending on the protocol you use):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Server Message Block (SMB)</b>: TCP port 445
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your file system's security groups must also allow inbound traffic on the same ports.
     * </p>
     * 
     * @param securityGroupArns
     *        Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet.</p>
     *        <p>
     *        The security groups must allow outbound traffic on the following ports (depending on the protocol you
     *        use):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Network File System (NFS)</b>: TCP ports 111, 635, and 2049
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Server Message Block (SMB)</b>: TCP port 445
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Your file system's security groups must also allow inbound traffic on the same ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to or from.
     * </p>
     * 
     * @param storageVirtualMachineArn
     *        Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to or
     *        from.
     */

    public void setStorageVirtualMachineArn(String storageVirtualMachineArn) {
        this.storageVirtualMachineArn = storageVirtualMachineArn;
    }

    /**
     * <p>
     * Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to or from.
     * </p>
     * 
     * @return Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to
     *         or from.
     */

    public String getStorageVirtualMachineArn() {
        return this.storageVirtualMachineArn;
    }

    /**
     * <p>
     * Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to or from.
     * </p>
     * 
     * @param storageVirtualMachineArn
     *        Specifies the ARN of the storage virtual machine (SVM) on your file system where you're copying data to or
     *        from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withStorageVirtualMachineArn(String storageVirtualMachineArn) {
        setStorageVirtualMachineArn(storageVirtualMachineArn);
        return this;
    }

    /**
     * <p>
     * Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to or from
     * (for example, <code>/vol1</code>).
     * </p>
     * <note>
     * <p>
     * Don't specify a junction path in the SVM's root volume. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP storage
     * virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * </note>
     * 
     * @param subdirectory
     *        Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to
     *        or from (for example, <code>/vol1</code>).</p> <note>
     *        <p>
     *        Don't specify a junction path in the SVM's root volume. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP storage
     *        virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     *        </p>
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to or from
     * (for example, <code>/vol1</code>).
     * </p>
     * <note>
     * <p>
     * Don't specify a junction path in the SVM's root volume. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP storage
     * virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * </note>
     * 
     * @return Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to
     *         or from (for example, <code>/vol1</code>).</p> <note>
     *         <p>
     *         Don't specify a junction path in the SVM's root volume. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP
     *         storage virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     *         </p>
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to or from
     * (for example, <code>/vol1</code>).
     * </p>
     * <note>
     * <p>
     * Don't specify a junction path in the SVM's root volume. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP storage
     * virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * </note>
     * 
     * @param subdirectory
     *        Specifies the junction path (also known as a mount point) in the SVM volume where you're copying data to
     *        or from (for example, <code>/vol1</code>).</p> <note>
     *        <p>
     *        Don't specify a junction path in the SVM's root volume. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html">Managing FSx for ONTAP storage
     *        virtual machines</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *         recommend creating at least a name tag for your location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your location.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxOntapRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns()).append(",");
        if (getStorageVirtualMachineArn() != null)
            sb.append("StorageVirtualMachineArn: ").append(getStorageVirtualMachineArn()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationFsxOntapRequest == false)
            return false;
        CreateLocationFsxOntapRequest other = (CreateLocationFsxOntapRequest) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        if (other.getStorageVirtualMachineArn() == null ^ this.getStorageVirtualMachineArn() == null)
            return false;
        if (other.getStorageVirtualMachineArn() != null && other.getStorageVirtualMachineArn().equals(this.getStorageVirtualMachineArn()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineArn() == null) ? 0 : getStorageVirtualMachineArn().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationFsxOntapRequest clone() {
        return (CreateLocationFsxOntapRequest) super.clone();
    }

}
