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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Group owner related settings for local resources.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GroupOwnerSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupOwnerSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda
     * process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
     */
    private Boolean autoAddGroupOwner;
    /** The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional. */
    private String groupOwner;

    /**
     * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda
     * process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
     * 
     * @param autoAddGroupOwner
     *        If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the
     *        Lambda process privileges. Thus the Lambda process will have the file access permissions of the added
     *        Linux group.
     */

    public void setAutoAddGroupOwner(Boolean autoAddGroupOwner) {
        this.autoAddGroupOwner = autoAddGroupOwner;
    }

    /**
     * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda
     * process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
     * 
     * @return If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the
     *         Lambda process privileges. Thus the Lambda process will have the file access permissions of the added
     *         Linux group.
     */

    public Boolean getAutoAddGroupOwner() {
        return this.autoAddGroupOwner;
    }

    /**
     * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda
     * process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
     * 
     * @param autoAddGroupOwner
     *        If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the
     *        Lambda process privileges. Thus the Lambda process will have the file access permissions of the added
     *        Linux group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupOwnerSetting withAutoAddGroupOwner(Boolean autoAddGroupOwner) {
        setAutoAddGroupOwner(autoAddGroupOwner);
        return this;
    }

    /**
     * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda
     * process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
     * 
     * @return If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the
     *         Lambda process privileges. Thus the Lambda process will have the file access permissions of the added
     *         Linux group.
     */

    public Boolean isAutoAddGroupOwner() {
        return this.autoAddGroupOwner;
    }

    /**
     * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
     * 
     * @param groupOwner
     *        The name of the Linux OS group whose privileges will be added to the Lambda process. This field is
     *        optional.
     */

    public void setGroupOwner(String groupOwner) {
        this.groupOwner = groupOwner;
    }

    /**
     * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
     * 
     * @return The name of the Linux OS group whose privileges will be added to the Lambda process. This field is
     *         optional.
     */

    public String getGroupOwner() {
        return this.groupOwner;
    }

    /**
     * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
     * 
     * @param groupOwner
     *        The name of the Linux OS group whose privileges will be added to the Lambda process. This field is
     *        optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupOwnerSetting withGroupOwner(String groupOwner) {
        setGroupOwner(groupOwner);
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
        if (getAutoAddGroupOwner() != null)
            sb.append("AutoAddGroupOwner: ").append(getAutoAddGroupOwner()).append(",");
        if (getGroupOwner() != null)
            sb.append("GroupOwner: ").append(getGroupOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupOwnerSetting == false)
            return false;
        GroupOwnerSetting other = (GroupOwnerSetting) obj;
        if (other.getAutoAddGroupOwner() == null ^ this.getAutoAddGroupOwner() == null)
            return false;
        if (other.getAutoAddGroupOwner() != null && other.getAutoAddGroupOwner().equals(this.getAutoAddGroupOwner()) == false)
            return false;
        if (other.getGroupOwner() == null ^ this.getGroupOwner() == null)
            return false;
        if (other.getGroupOwner() != null && other.getGroupOwner().equals(this.getGroupOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoAddGroupOwner() == null) ? 0 : getAutoAddGroupOwner().hashCode());
        hashCode = prime * hashCode + ((getGroupOwner() == null) ? 0 : getGroupOwner().hashCode());
        return hashCode;
    }

    @Override
    public GroupOwnerSetting clone() {
        try {
            return (GroupOwnerSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.GroupOwnerSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
