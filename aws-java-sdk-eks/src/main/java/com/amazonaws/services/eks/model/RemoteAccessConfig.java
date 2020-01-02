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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the remote access configuration for the managed node group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/RemoteAccessConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteAccessConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node
     * group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     * </p>
     */
    private String ec2SshKey;
    /**
     * <p>
     * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your VPC</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private java.util.List<String> sourceSecurityGroups;

    /**
     * <p>
     * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node
     * group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ec2SshKey
     *        The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed
     *        node group. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     */

    public void setEc2SshKey(String ec2SshKey) {
        this.ec2SshKey = ec2SshKey;
    }

    /**
     * <p>
     * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node
     * group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed
     *         node group. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     */

    public String getEc2SshKey() {
        return this.ec2SshKey;
    }

    /**
     * <p>
     * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed node
     * group. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ec2SshKey
     *        The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the managed
     *        node group. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon EC2 Key Pairs</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessConfig withEc2SshKey(String ec2SshKey) {
        setEc2SshKey(ec2SshKey);
        return this;
    }

    /**
     * <p>
     * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your VPC</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon
     *         EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22
     *         on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your
     *         VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public java.util.List<String> getSourceSecurityGroups() {
        return sourceSecurityGroups;
    }

    /**
     * <p>
     * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your VPC</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param sourceSecurityGroups
     *        The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon
     *        EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22
     *        on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your
     *        VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */

    public void setSourceSecurityGroups(java.util.Collection<String> sourceSecurityGroups) {
        if (sourceSecurityGroups == null) {
            this.sourceSecurityGroups = null;
            return;
        }

        this.sourceSecurityGroups = new java.util.ArrayList<String>(sourceSecurityGroups);
    }

    /**
     * <p>
     * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your VPC</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceSecurityGroups(java.util.Collection)} or {@link #withSourceSecurityGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sourceSecurityGroups
     *        The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon
     *        EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22
     *        on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your
     *        VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessConfig withSourceSecurityGroups(String... sourceSecurityGroups) {
        if (this.sourceSecurityGroups == null) {
            setSourceSecurityGroups(new java.util.ArrayList<String>(sourceSecurityGroups.length));
        }
        for (String ele : sourceSecurityGroups) {
            this.sourceSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your VPC</a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param sourceSecurityGroups
     *        The security groups that are allowed SSH access (port 22) to the worker nodes. If you specify an Amazon
     *        EC2 SSH key but do not specify a source security group when you create a managed node group, then port 22
     *        on the worker nodes is opened to the internet (0.0.0.0/0). For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security Groups for Your
     *        VPC</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessConfig withSourceSecurityGroups(java.util.Collection<String> sourceSecurityGroups) {
        setSourceSecurityGroups(sourceSecurityGroups);
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
        if (getEc2SshKey() != null)
            sb.append("Ec2SshKey: ").append(getEc2SshKey()).append(",");
        if (getSourceSecurityGroups() != null)
            sb.append("SourceSecurityGroups: ").append(getSourceSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteAccessConfig == false)
            return false;
        RemoteAccessConfig other = (RemoteAccessConfig) obj;
        if (other.getEc2SshKey() == null ^ this.getEc2SshKey() == null)
            return false;
        if (other.getEc2SshKey() != null && other.getEc2SshKey().equals(this.getEc2SshKey()) == false)
            return false;
        if (other.getSourceSecurityGroups() == null ^ this.getSourceSecurityGroups() == null)
            return false;
        if (other.getSourceSecurityGroups() != null && other.getSourceSecurityGroups().equals(this.getSourceSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2SshKey() == null) ? 0 : getEc2SshKey().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroups() == null) ? 0 : getSourceSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public RemoteAccessConfig clone() {
        try {
            return (RemoteAccessConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.RemoteAccessConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
