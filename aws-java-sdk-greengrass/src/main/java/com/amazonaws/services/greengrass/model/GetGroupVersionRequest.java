/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique Id of the AWS Greengrass Group */
    private String groupId;
    /** Group version Id */
    private String groupVersionId;

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @return The unique Id of the AWS Greengrass Group
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupVersionRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Group version Id
     * 
     * @param groupVersionId
     *        Group version Id
     */

    public void setGroupVersionId(String groupVersionId) {
        this.groupVersionId = groupVersionId;
    }

    /**
     * Group version Id
     * 
     * @return Group version Id
     */

    public String getGroupVersionId() {
        return this.groupVersionId;
    }

    /**
     * Group version Id
     * 
     * @param groupVersionId
     *        Group version Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupVersionRequest withGroupVersionId(String groupVersionId) {
        setGroupVersionId(groupVersionId);
        return this;
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupVersionId() != null)
            sb.append("GroupVersionId: ").append(getGroupVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupVersionRequest == false)
            return false;
        GetGroupVersionRequest other = (GetGroupVersionRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupVersionId() == null ^ this.getGroupVersionId() == null)
            return false;
        if (other.getGroupVersionId() != null && other.getGroupVersionId().equals(this.getGroupVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupVersionId() == null) ? 0 : getGroupVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupVersionRequest clone() {
        return (GetGroupVersionRequest) super.clone();
    }

}
