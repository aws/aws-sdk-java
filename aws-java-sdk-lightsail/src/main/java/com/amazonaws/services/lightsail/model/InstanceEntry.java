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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon Elastic Compute Cloud instance and related resources to be created using the
 * <code>create cloud formation stack</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will be used
     * as the source of the new Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that you can
     * use to create a CloudFormation stack.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DEFAULT — Use the default firewall settings from the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE — Use the firewall settings from the source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE — Default to Amazon EC2.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED — All ports closed.
     * </p>
     * </li>
     * </ul>
     */
    private String portInfoSource;
    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>.
     * </p>
     * </note>
     */
    private String userData;
    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will be used
     * as the source of the new Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that you can
     * use to create a CloudFormation stack.
     * </p>
     * 
     * @param sourceName
     *        The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will
     *        be used as the source of the new Amazon EC2 instance.</p>
     *        <p>
     *        Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that
     *        you can use to create a CloudFormation stack.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will be used
     * as the source of the new Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that you can
     * use to create a CloudFormation stack.
     * </p>
     * 
     * @return The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will
     *         be used as the source of the new Amazon EC2 instance.</p>
     *         <p>
     *         Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that
     *         you can use to create a CloudFormation stack.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will be used
     * as the source of the new Amazon EC2 instance.
     * </p>
     * <p>
     * Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that you can
     * use to create a CloudFormation stack.
     * </p>
     * 
     * @param sourceName
     *        The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will
     *        be used as the source of the new Amazon EC2 instance.</p>
     *        <p>
     *        Use the <code>get export snapshot records</code> operation to get a list of export snapshot records that
     *        you can use to create a CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEntry withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     * </p>
     * 
     * @param instanceType
     *        The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     * </p>
     * 
     * @return The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     * </p>
     * 
     * @param instanceType
     *        The instance type (e.g., <code>t2.micro</code>) to use for the new Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEntry withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DEFAULT — Use the default firewall settings from the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE — Use the firewall settings from the source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE — Default to Amazon EC2.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED — All ports closed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param portInfoSource
     *        The port configuration to use for the new Amazon EC2 instance.</p>
     *        <p>
     *        The following configuration options are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DEFAULT — Use the default firewall settings from the image.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE — Use the firewall settings from the source Lightsail instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE — Default to Amazon EC2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CLOSED — All ports closed.
     *        </p>
     *        </li>
     * @see PortInfoSourceType
     */

    public void setPortInfoSource(String portInfoSource) {
        this.portInfoSource = portInfoSource;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DEFAULT — Use the default firewall settings from the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE — Use the firewall settings from the source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE — Default to Amazon EC2.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED — All ports closed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The port configuration to use for the new Amazon EC2 instance.</p>
     *         <p>
     *         The following configuration options are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DEFAULT — Use the default firewall settings from the image.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE — Use the firewall settings from the source Lightsail instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NONE — Default to Amazon EC2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CLOSED — All ports closed.
     *         </p>
     *         </li>
     * @see PortInfoSourceType
     */

    public String getPortInfoSource() {
        return this.portInfoSource;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DEFAULT — Use the default firewall settings from the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE — Use the firewall settings from the source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE — Default to Amazon EC2.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED — All ports closed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param portInfoSource
     *        The port configuration to use for the new Amazon EC2 instance.</p>
     *        <p>
     *        The following configuration options are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DEFAULT — Use the default firewall settings from the image.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE — Use the firewall settings from the source Lightsail instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE — Default to Amazon EC2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CLOSED — All ports closed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortInfoSourceType
     */

    public InstanceEntry withPortInfoSource(String portInfoSource) {
        setPortInfoSource(portInfoSource);
        return this;
    }

    /**
     * <p>
     * The port configuration to use for the new Amazon EC2 instance.
     * </p>
     * <p>
     * The following configuration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DEFAULT — Use the default firewall settings from the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE — Use the firewall settings from the source Lightsail instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE — Default to Amazon EC2.
     * </p>
     * </li>
     * <li>
     * <p>
     * CLOSED — All ports closed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param portInfoSource
     *        The port configuration to use for the new Amazon EC2 instance.</p>
     *        <p>
     *        The following configuration options are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DEFAULT — Use the default firewall settings from the image.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE — Use the firewall settings from the source Lightsail instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE — Default to Amazon EC2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CLOSED — All ports closed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortInfoSourceType
     */

    public InstanceEntry withPortInfoSource(PortInfoSourceType portInfoSource) {
        this.portInfoSource = portInfoSource.toString();
        return this;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>.
     * </p>
     * </note>
     * 
     * @param userData
     *        A launch script you can create that configures a server with additional user data. For example, you might
     *        want to run <code>apt-get -y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>.
     *        </p>
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>.
     * </p>
     * </note>
     * 
     * @return A launch script you can create that configures a server with additional user data. For example, you might
     *         want to run <code>apt-get -y update</code>.</p> <note>
     *         <p>
     *         Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *         Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *         <code>pkg</code>.
     *         </p>
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>.
     * </p>
     * </note>
     * 
     * @param userData
     *        A launch script you can create that configures a server with additional user data. For example, you might
     *        want to run <code>apt-get -y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEntry withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the new Amazon EC2 instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     * 
     * @return The Availability Zone for the new Amazon EC2 instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the new Amazon EC2 instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the new Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEntry withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPortInfoSource() != null)
            sb.append("PortInfoSource: ").append(getPortInfoSource()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceEntry == false)
            return false;
        InstanceEntry other = (InstanceEntry) obj;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPortInfoSource() == null ^ this.getPortInfoSource() == null)
            return false;
        if (other.getPortInfoSource() != null && other.getPortInfoSource().equals(this.getPortInfoSource()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPortInfoSource() == null) ? 0 : getPortInfoSource().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public InstanceEntry clone() {
        try {
            return (InstanceEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
