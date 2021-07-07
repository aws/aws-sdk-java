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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for a gateway that runs on IoT Greengrass. To create a gateway that runs on IoT Greengrass, you must
 * add the IoT SiteWise connector to a Greengrass group and deploy it. Your Greengrass group must also have permissions
 * to upload data to IoT SiteWise. For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html">Ingesting data using a
 * gateway</a> in the <i>IoT SiteWise User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Greengrass" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Greengrass implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * Greengrass group. For more information about how to find a group's ARN, see <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in the <i>IoT
     * Greengrass API Reference</i>.
     * </p>
     */
    private String groupArn;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * Greengrass group. For more information about how to find a group's ARN, see <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in the <i>IoT
     * Greengrass API Reference</i>.
     * </p>
     * 
     * @param groupArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        Greengrass group. For more information about how to find a group's ARN, see <a
     *        href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and
     *        <a href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in the
     *        <i>IoT Greengrass API Reference</i>.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * Greengrass group. For more information about how to find a group's ARN, see <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in the <i>IoT
     * Greengrass API Reference</i>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         Greengrass group. For more information about how to find a group's ARN, see <a
     *         href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and
     *         <a href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in
     *         the <i>IoT Greengrass API Reference</i>.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     * Greengrass group. For more information about how to find a group's ARN, see <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and <a
     * href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in the <i>IoT
     * Greengrass API Reference</i>.
     * </p>
     * 
     * @param groupArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        Greengrass group. For more information about how to find a group's ARN, see <a
     *        href="https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html">ListGroups</a> and
     *        <a href="https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html">GetGroup</a> in the
     *        <i>IoT Greengrass API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Greengrass withGroupArn(String groupArn) {
        setGroupArn(groupArn);
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
        if (getGroupArn() != null)
            sb.append("GroupArn: ").append(getGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Greengrass == false)
            return false;
        Greengrass other = (Greengrass) obj;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public Greengrass clone() {
        try {
            return (Greengrass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.GreengrassMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
