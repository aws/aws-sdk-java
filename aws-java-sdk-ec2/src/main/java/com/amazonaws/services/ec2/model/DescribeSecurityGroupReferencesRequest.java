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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSecurityGroupReferencesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityGroupReferencesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSecurityGroupReferencesRequest> {

    /**
     * <p>
     * The IDs of the security groups in your account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupId;

    /**
     * <p>
     * The IDs of the security groups in your account.
     * </p>
     * 
     * @return The IDs of the security groups in your account.
     */

    public java.util.List<String> getGroupId() {
        if (groupId == null) {
            groupId = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupId;
    }

    /**
     * <p>
     * The IDs of the security groups in your account.
     * </p>
     * 
     * @param groupId
     *        The IDs of the security groups in your account.
     */

    public void setGroupId(java.util.Collection<String> groupId) {
        if (groupId == null) {
            this.groupId = null;
            return;
        }

        this.groupId = new com.amazonaws.internal.SdkInternalList<String>(groupId);
    }

    /**
     * <p>
     * The IDs of the security groups in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupId(java.util.Collection)} or {@link #withGroupId(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupId
     *        The IDs of the security groups in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupReferencesRequest withGroupId(String... groupId) {
        if (this.groupId == null) {
            setGroupId(new com.amazonaws.internal.SdkInternalList<String>(groupId.length));
        }
        for (String ele : groupId) {
            this.groupId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups in your account.
     * </p>
     * 
     * @param groupId
     *        The IDs of the security groups in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupReferencesRequest withGroupId(java.util.Collection<String> groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSecurityGroupReferencesRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupReferencesRequest> request = new DescribeSecurityGroupReferencesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecurityGroupReferencesRequest == false)
            return false;
        DescribeSecurityGroupReferencesRequest other = (DescribeSecurityGroupReferencesRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityGroupReferencesRequest clone() {
        return (DescribeSecurityGroupReferencesRequest) super.clone();
    }
}
