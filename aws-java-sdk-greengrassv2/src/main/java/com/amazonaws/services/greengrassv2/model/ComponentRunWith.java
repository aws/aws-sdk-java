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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information system user and group that the IoT Greengrass Core software uses to run component processes on
 * the core device. For more information, see <a href=
 * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
 * >Configure the user and group that run components</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentRunWith" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentRunWith implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user, and
     * group if specified, must exist on each Linux core device. Specify the user and group separated by a colon (
     * <code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't specify a
     * group, the IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     */
    private String posixUser;
    /**
     * <p>
     * The system resource limits to apply to this component's process on the core device. IoT Greengrass currently
     * supports this feature on only Linux core devices.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     * >Configure system resource limits for components</a>.
     * </p>
     */
    private SystemResourceLimits systemResourceLimits;
    /**
     * <p>
     * The Windows user to use to run this component on Windows core devices. The user must exist on each Windows core
     * device, and its name and password must be in the LocalSystem account's Credentials Manager instance.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you configure on
     * the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     */
    private String windowsUser;

    /**
     * <p>
     * The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user, and
     * group if specified, must exist on each Linux core device. Specify the user and group separated by a colon (
     * <code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't specify a
     * group, the IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     * 
     * @param posixUser
     *        The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user,
     *        and group if specified, must exist on each Linux core device. Specify the user and group separated by a
     *        colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you
     *        don't specify a group, the IoT Greengrass Core software uses the primary user for the group.</p>
     *        <p>
     *        If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that
     *        you configure on the Greengrass nucleus component. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *        >Configure the user and group that run components</a>.
     */

    public void setPosixUser(String posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user, and
     * group if specified, must exist on each Linux core device. Specify the user and group separated by a colon (
     * <code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't specify a
     * group, the IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     * 
     * @return The POSIX system user and, optionally, group to use to run this component on Linux core devices. The
     *         user, and group if specified, must exist on each Linux core device. Specify the user and group separated
     *         by a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If
     *         you don't specify a group, the IoT Greengrass Core software uses the primary user for the group.</p>
     *         <p>
     *         If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that
     *         you configure on the Greengrass nucleus component. For more information, see <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *         >Configure the user and group that run components</a>.
     */

    public String getPosixUser() {
        return this.posixUser;
    }

    /**
     * <p>
     * The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user, and
     * group if specified, must exist on each Linux core device. Specify the user and group separated by a colon (
     * <code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't specify a
     * group, the IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     * 
     * @param posixUser
     *        The POSIX system user and, optionally, group to use to run this component on Linux core devices. The user,
     *        and group if specified, must exist on each Linux core device. Specify the user and group separated by a
     *        colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you
     *        don't specify a group, the IoT Greengrass Core software uses the primary user for the group.</p>
     *        <p>
     *        If you omit this parameter, the IoT Greengrass Core software uses the default system user and group that
     *        you configure on the Greengrass nucleus component. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *        >Configure the user and group that run components</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRunWith withPosixUser(String posixUser) {
        setPosixUser(posixUser);
        return this;
    }

    /**
     * <p>
     * The system resource limits to apply to this component's process on the core device. IoT Greengrass currently
     * supports this feature on only Linux core devices.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     * >Configure system resource limits for components</a>.
     * </p>
     * 
     * @param systemResourceLimits
     *        The system resource limits to apply to this component's process on the core device. IoT Greengrass
     *        currently supports this feature on only Linux core devices.</p>
     *        <p>
     *        If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that
     *        you configure on the Greengrass nucleus component. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     *        >Configure system resource limits for components</a>.
     */

    public void setSystemResourceLimits(SystemResourceLimits systemResourceLimits) {
        this.systemResourceLimits = systemResourceLimits;
    }

    /**
     * <p>
     * The system resource limits to apply to this component's process on the core device. IoT Greengrass currently
     * supports this feature on only Linux core devices.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     * >Configure system resource limits for components</a>.
     * </p>
     * 
     * @return The system resource limits to apply to this component's process on the core device. IoT Greengrass
     *         currently supports this feature on only Linux core devices.</p>
     *         <p>
     *         If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that
     *         you configure on the Greengrass nucleus component. For more information, see <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     *         >Configure system resource limits for components</a>.
     */

    public SystemResourceLimits getSystemResourceLimits() {
        return this.systemResourceLimits;
    }

    /**
     * <p>
     * The system resource limits to apply to this component's process on the core device. IoT Greengrass currently
     * supports this feature on only Linux core devices.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that you
     * configure on the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     * >Configure system resource limits for components</a>.
     * </p>
     * 
     * @param systemResourceLimits
     *        The system resource limits to apply to this component's process on the core device. IoT Greengrass
     *        currently supports this feature on only Linux core devices.</p>
     *        <p>
     *        If you omit this parameter, the IoT Greengrass Core software uses the default system resource limits that
     *        you configure on the Greengrass nucleus component. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits"
     *        >Configure system resource limits for components</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRunWith withSystemResourceLimits(SystemResourceLimits systemResourceLimits) {
        setSystemResourceLimits(systemResourceLimits);
        return this;
    }

    /**
     * <p>
     * The Windows user to use to run this component on Windows core devices. The user must exist on each Windows core
     * device, and its name and password must be in the LocalSystem account's Credentials Manager instance.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you configure on
     * the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     * 
     * @param windowsUser
     *        The Windows user to use to run this component on Windows core devices. The user must exist on each Windows
     *        core device, and its name and password must be in the LocalSystem account's Credentials Manager
     *        instance.</p>
     *        <p>
     *        If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you
     *        configure on the Greengrass nucleus component. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *        >Configure the user and group that run components</a>.
     */

    public void setWindowsUser(String windowsUser) {
        this.windowsUser = windowsUser;
    }

    /**
     * <p>
     * The Windows user to use to run this component on Windows core devices. The user must exist on each Windows core
     * device, and its name and password must be in the LocalSystem account's Credentials Manager instance.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you configure on
     * the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     * 
     * @return The Windows user to use to run this component on Windows core devices. The user must exist on each
     *         Windows core device, and its name and password must be in the LocalSystem account's Credentials Manager
     *         instance.</p>
     *         <p>
     *         If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you
     *         configure on the Greengrass nucleus component. For more information, see <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *         >Configure the user and group that run components</a>.
     */

    public String getWindowsUser() {
        return this.windowsUser;
    }

    /**
     * <p>
     * The Windows user to use to run this component on Windows core devices. The user must exist on each Windows core
     * device, and its name and password must be in the LocalSystem account's Credentials Manager instance.
     * </p>
     * <p>
     * If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you configure on
     * the Greengrass nucleus component. For more information, see <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     * >Configure the user and group that run components</a>.
     * </p>
     * 
     * @param windowsUser
     *        The Windows user to use to run this component on Windows core devices. The user must exist on each Windows
     *        core device, and its name and password must be in the LocalSystem account's Credentials Manager
     *        instance.</p>
     *        <p>
     *        If you omit this parameter, the IoT Greengrass Core software uses the default Windows user that you
     *        configure on the Greengrass nucleus component. For more information, see <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
     *        >Configure the user and group that run components</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRunWith withWindowsUser(String windowsUser) {
        setWindowsUser(windowsUser);
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
        if (getPosixUser() != null)
            sb.append("PosixUser: ").append(getPosixUser()).append(",");
        if (getSystemResourceLimits() != null)
            sb.append("SystemResourceLimits: ").append(getSystemResourceLimits()).append(",");
        if (getWindowsUser() != null)
            sb.append("WindowsUser: ").append(getWindowsUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentRunWith == false)
            return false;
        ComponentRunWith other = (ComponentRunWith) obj;
        if (other.getPosixUser() == null ^ this.getPosixUser() == null)
            return false;
        if (other.getPosixUser() != null && other.getPosixUser().equals(this.getPosixUser()) == false)
            return false;
        if (other.getSystemResourceLimits() == null ^ this.getSystemResourceLimits() == null)
            return false;
        if (other.getSystemResourceLimits() != null && other.getSystemResourceLimits().equals(this.getSystemResourceLimits()) == false)
            return false;
        if (other.getWindowsUser() == null ^ this.getWindowsUser() == null)
            return false;
        if (other.getWindowsUser() != null && other.getWindowsUser().equals(this.getWindowsUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
        hashCode = prime * hashCode + ((getSystemResourceLimits() == null) ? 0 : getSystemResourceLimits().hashCode());
        hashCode = prime * hashCode + ((getWindowsUser() == null) ? 0 : getWindowsUser().hashCode());
        return hashCode;
    }

    @Override
    public ComponentRunWith clone() {
        try {
            return (ComponentRunWith) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentRunWithMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
