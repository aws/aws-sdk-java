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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The case-sensitive name of the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ARN of the group that was generated on creation.
     * </p>
     */
    private String groupARN;

    /**
     * <p>
     * The case-sensitive name of the group.
     * </p>
     * 
     * @param groupName
     *        The case-sensitive name of the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The case-sensitive name of the group.
     * </p>
     * 
     * @return The case-sensitive name of the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The case-sensitive name of the group.
     * </p>
     * 
     * @param groupName
     *        The case-sensitive name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ARN of the group that was generated on creation.
     * </p>
     * 
     * @param groupARN
     *        The ARN of the group that was generated on creation.
     */

    public void setGroupARN(String groupARN) {
        this.groupARN = groupARN;
    }

    /**
     * <p>
     * The ARN of the group that was generated on creation.
     * </p>
     * 
     * @return The ARN of the group that was generated on creation.
     */

    public String getGroupARN() {
        return this.groupARN;
    }

    /**
     * <p>
     * The ARN of the group that was generated on creation.
     * </p>
     * 
     * @param groupARN
     *        The ARN of the group that was generated on creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGroupRequest withGroupARN(String groupARN) {
        setGroupARN(groupARN);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupARN() != null)
            sb.append("GroupARN: ").append(getGroupARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGroupRequest == false)
            return false;
        DeleteGroupRequest other = (DeleteGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupARN() == null ^ this.getGroupARN() == null)
            return false;
        if (other.getGroupARN() != null && other.getGroupARN().equals(this.getGroupARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupARN() == null) ? 0 : getGroupARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGroupRequest clone() {
        return (DeleteGroupRequest) super.clone();
    }

}
