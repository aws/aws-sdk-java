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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status of the Post Launch Actions running on the Test or Cutover instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PostLaunchActionsStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostLaunchActionsStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of Post Launch Action status.
     * </p>
     */
    private java.util.List<JobPostLaunchActionsLaunchStatus> postLaunchActionsLaunchStatusList;
    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     * </p>
     */
    private String ssmAgentDiscoveryDatetime;

    /**
     * <p>
     * List of Post Launch Action status.
     * </p>
     * 
     * @return List of Post Launch Action status.
     */

    public java.util.List<JobPostLaunchActionsLaunchStatus> getPostLaunchActionsLaunchStatusList() {
        return postLaunchActionsLaunchStatusList;
    }

    /**
     * <p>
     * List of Post Launch Action status.
     * </p>
     * 
     * @param postLaunchActionsLaunchStatusList
     *        List of Post Launch Action status.
     */

    public void setPostLaunchActionsLaunchStatusList(java.util.Collection<JobPostLaunchActionsLaunchStatus> postLaunchActionsLaunchStatusList) {
        if (postLaunchActionsLaunchStatusList == null) {
            this.postLaunchActionsLaunchStatusList = null;
            return;
        }

        this.postLaunchActionsLaunchStatusList = new java.util.ArrayList<JobPostLaunchActionsLaunchStatus>(postLaunchActionsLaunchStatusList);
    }

    /**
     * <p>
     * List of Post Launch Action status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPostLaunchActionsLaunchStatusList(java.util.Collection)} or
     * {@link #withPostLaunchActionsLaunchStatusList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param postLaunchActionsLaunchStatusList
     *        List of Post Launch Action status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActionsStatus withPostLaunchActionsLaunchStatusList(JobPostLaunchActionsLaunchStatus... postLaunchActionsLaunchStatusList) {
        if (this.postLaunchActionsLaunchStatusList == null) {
            setPostLaunchActionsLaunchStatusList(new java.util.ArrayList<JobPostLaunchActionsLaunchStatus>(postLaunchActionsLaunchStatusList.length));
        }
        for (JobPostLaunchActionsLaunchStatus ele : postLaunchActionsLaunchStatusList) {
            this.postLaunchActionsLaunchStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Post Launch Action status.
     * </p>
     * 
     * @param postLaunchActionsLaunchStatusList
     *        List of Post Launch Action status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActionsStatus withPostLaunchActionsLaunchStatusList(
            java.util.Collection<JobPostLaunchActionsLaunchStatus> postLaunchActionsLaunchStatusList) {
        setPostLaunchActionsLaunchStatusList(postLaunchActionsLaunchStatusList);
        return this;
    }

    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     * </p>
     * 
     * @param ssmAgentDiscoveryDatetime
     *        Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     */

    public void setSsmAgentDiscoveryDatetime(String ssmAgentDiscoveryDatetime) {
        this.ssmAgentDiscoveryDatetime = ssmAgentDiscoveryDatetime;
    }

    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     * </p>
     * 
     * @return Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     */

    public String getSsmAgentDiscoveryDatetime() {
        return this.ssmAgentDiscoveryDatetime;
    }

    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     * </p>
     * 
     * @param ssmAgentDiscoveryDatetime
     *        Time where the AWS Systems Manager was detected as running on the Test or Cutover instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostLaunchActionsStatus withSsmAgentDiscoveryDatetime(String ssmAgentDiscoveryDatetime) {
        setSsmAgentDiscoveryDatetime(ssmAgentDiscoveryDatetime);
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
        if (getPostLaunchActionsLaunchStatusList() != null)
            sb.append("PostLaunchActionsLaunchStatusList: ").append(getPostLaunchActionsLaunchStatusList()).append(",");
        if (getSsmAgentDiscoveryDatetime() != null)
            sb.append("SsmAgentDiscoveryDatetime: ").append(getSsmAgentDiscoveryDatetime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostLaunchActionsStatus == false)
            return false;
        PostLaunchActionsStatus other = (PostLaunchActionsStatus) obj;
        if (other.getPostLaunchActionsLaunchStatusList() == null ^ this.getPostLaunchActionsLaunchStatusList() == null)
            return false;
        if (other.getPostLaunchActionsLaunchStatusList() != null
                && other.getPostLaunchActionsLaunchStatusList().equals(this.getPostLaunchActionsLaunchStatusList()) == false)
            return false;
        if (other.getSsmAgentDiscoveryDatetime() == null ^ this.getSsmAgentDiscoveryDatetime() == null)
            return false;
        if (other.getSsmAgentDiscoveryDatetime() != null && other.getSsmAgentDiscoveryDatetime().equals(this.getSsmAgentDiscoveryDatetime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPostLaunchActionsLaunchStatusList() == null) ? 0 : getPostLaunchActionsLaunchStatusList().hashCode());
        hashCode = prime * hashCode + ((getSsmAgentDiscoveryDatetime() == null) ? 0 : getSsmAgentDiscoveryDatetime().hashCode());
        return hashCode;
    }

    @Override
    public PostLaunchActionsStatus clone() {
        try {
            return (PostLaunchActionsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.PostLaunchActionsStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
