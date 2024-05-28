/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateProfiles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;
    /**
     * <p>
     * The list of profile ARNs to disassociate from the workload.
     * </p>
     */
    private java.util.List<String> profileArns;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProfilesRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * <p>
     * The list of profile ARNs to disassociate from the workload.
     * </p>
     * 
     * @return The list of profile ARNs to disassociate from the workload.
     */

    public java.util.List<String> getProfileArns() {
        return profileArns;
    }

    /**
     * <p>
     * The list of profile ARNs to disassociate from the workload.
     * </p>
     * 
     * @param profileArns
     *        The list of profile ARNs to disassociate from the workload.
     */

    public void setProfileArns(java.util.Collection<String> profileArns) {
        if (profileArns == null) {
            this.profileArns = null;
            return;
        }

        this.profileArns = new java.util.ArrayList<String>(profileArns);
    }

    /**
     * <p>
     * The list of profile ARNs to disassociate from the workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileArns(java.util.Collection)} or {@link #withProfileArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param profileArns
     *        The list of profile ARNs to disassociate from the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProfilesRequest withProfileArns(String... profileArns) {
        if (this.profileArns == null) {
            setProfileArns(new java.util.ArrayList<String>(profileArns.length));
        }
        for (String ele : profileArns) {
            this.profileArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of profile ARNs to disassociate from the workload.
     * </p>
     * 
     * @param profileArns
     *        The list of profile ARNs to disassociate from the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProfilesRequest withProfileArns(java.util.Collection<String> profileArns) {
        setProfileArns(profileArns);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getProfileArns() != null)
            sb.append("ProfileArns: ").append(getProfileArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateProfilesRequest == false)
            return false;
        DisassociateProfilesRequest other = (DisassociateProfilesRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getProfileArns() == null ^ this.getProfileArns() == null)
            return false;
        if (other.getProfileArns() != null && other.getProfileArns().equals(this.getProfileArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getProfileArns() == null) ? 0 : getProfileArns().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateProfilesRequest clone() {
        return (DisassociateProfilesRequest) super.clone();
    }

}
