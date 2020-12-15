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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information system user and group that the AWS IoT Greengrass Core software uses to run component processes
 * on the core device. For more information, see <a href=
 * "https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user"
 * >Configure the user and group that run components</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentRunWith" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentRunWith implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The POSIX system user and (optional) group to use to run this component. Specify the user and group separated by
     * a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't
     * specify a group, the AWS IoT Greengrass Core software uses the primary user for the group.
     * </p>
     */
    private String posixUser;

    /**
     * <p>
     * The POSIX system user and (optional) group to use to run this component. Specify the user and group separated by
     * a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't
     * specify a group, the AWS IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * 
     * @param posixUser
     *        The POSIX system user and (optional) group to use to run this component. Specify the user and group
     *        separated by a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is
     *        optional. If you don't specify a group, the AWS IoT Greengrass Core software uses the primary user for the
     *        group.
     */

    public void setPosixUser(String posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The POSIX system user and (optional) group to use to run this component. Specify the user and group separated by
     * a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't
     * specify a group, the AWS IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * 
     * @return The POSIX system user and (optional) group to use to run this component. Specify the user and group
     *         separated by a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is
     *         optional. If you don't specify a group, the AWS IoT Greengrass Core software uses the primary user for
     *         the group.
     */

    public String getPosixUser() {
        return this.posixUser;
    }

    /**
     * <p>
     * The POSIX system user and (optional) group to use to run this component. Specify the user and group separated by
     * a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is optional. If you don't
     * specify a group, the AWS IoT Greengrass Core software uses the primary user for the group.
     * </p>
     * 
     * @param posixUser
     *        The POSIX system user and (optional) group to use to run this component. Specify the user and group
     *        separated by a colon (<code>:</code>) in the following format: <code>user:group</code>. The group is
     *        optional. If you don't specify a group, the AWS IoT Greengrass Core software uses the primary user for the
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRunWith withPosixUser(String posixUser) {
        setPosixUser(posixUser);
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
            sb.append("PosixUser: ").append(getPosixUser());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
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
