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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateGroupProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a group profile is updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the group profile that is updated.
     * </p>
     */
    private String groupIdentifier;
    /**
     * <p>
     * The status of the group profile that is updated.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a group profile is updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a group profile is updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a group profile is updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a group profile is updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a group profile is updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a group profile is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupProfileRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the group profile that is updated.
     * </p>
     * 
     * @param groupIdentifier
     *        The identifier of the group profile that is updated.
     */

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * <p>
     * The identifier of the group profile that is updated.
     * </p>
     * 
     * @return The identifier of the group profile that is updated.
     */

    public String getGroupIdentifier() {
        return this.groupIdentifier;
    }

    /**
     * <p>
     * The identifier of the group profile that is updated.
     * </p>
     * 
     * @param groupIdentifier
     *        The identifier of the group profile that is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupProfileRequest withGroupIdentifier(String groupIdentifier) {
        setGroupIdentifier(groupIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of the group profile that is updated.
     * </p>
     * 
     * @param status
     *        The status of the group profile that is updated.
     * @see GroupProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the group profile that is updated.
     * </p>
     * 
     * @return The status of the group profile that is updated.
     * @see GroupProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the group profile that is updated.
     * </p>
     * 
     * @param status
     *        The status of the group profile that is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupProfileStatus
     */

    public UpdateGroupProfileRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the group profile that is updated.
     * </p>
     * 
     * @param status
     *        The status of the group profile that is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupProfileStatus
     */

    public UpdateGroupProfileRequest withStatus(GroupProfileStatus status) {
        this.status = status.toString();
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getGroupIdentifier() != null)
            sb.append("GroupIdentifier: ").append(getGroupIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupProfileRequest == false)
            return false;
        UpdateGroupProfileRequest other = (UpdateGroupProfileRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getGroupIdentifier() == null ^ this.getGroupIdentifier() == null)
            return false;
        if (other.getGroupIdentifier() != null && other.getGroupIdentifier().equals(this.getGroupIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGroupIdentifier() == null) ? 0 : getGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupProfileRequest clone() {
        return (UpdateGroupProfileRequest) super.clone();
    }

}
