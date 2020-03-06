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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyAvailabilityZoneGroupRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyAvailabilityZoneGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyAvailabilityZoneGroupRequest> {

    /**
     * <p>
     * The names of the Zone Group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * </p>
     */
    private String optInStatus;

    /**
     * <p>
     * The names of the Zone Group.
     * </p>
     * 
     * @param groupName
     *        The names of the Zone Group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The names of the Zone Group.
     * </p>
     * 
     * @return The names of the Zone Group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The names of the Zone Group.
     * </p>
     * 
     * @param groupName
     *        The names of the Zone Group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAvailabilityZoneGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * </p>
     * 
     * @param optInStatus
     *        Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * @see ModifyAvailabilityZoneOptInStatus
     */

    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * </p>
     * 
     * @return Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * @see ModifyAvailabilityZoneOptInStatus
     */

    public String getOptInStatus() {
        return this.optInStatus;
    }

    /**
     * <p>
     * Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * </p>
     * 
     * @param optInStatus
     *        Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModifyAvailabilityZoneOptInStatus
     */

    public ModifyAvailabilityZoneGroupRequest withOptInStatus(String optInStatus) {
        setOptInStatus(optInStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * </p>
     * 
     * @param optInStatus
     *        Indicates whether to enable or disable Zone Group membership. The valid values are <code>opted-in</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModifyAvailabilityZoneOptInStatus
     */

    public ModifyAvailabilityZoneGroupRequest withOptInStatus(ModifyAvailabilityZoneOptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyAvailabilityZoneGroupRequest> getDryRunRequest() {
        Request<ModifyAvailabilityZoneGroupRequest> request = new ModifyAvailabilityZoneGroupRequestMarshaller().marshall(this);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: ").append(getOptInStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAvailabilityZoneGroupRequest == false)
            return false;
        ModifyAvailabilityZoneGroupRequest other = (ModifyAvailabilityZoneGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModifyAvailabilityZoneGroupRequest clone() {
        return (ModifyAvailabilityZoneGroupRequest) super.clone();
    }
}
