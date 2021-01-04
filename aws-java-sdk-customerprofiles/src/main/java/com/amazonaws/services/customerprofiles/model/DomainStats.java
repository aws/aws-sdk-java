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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Usage-specific statistics about the domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DomainStats" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of profiles currently in the domain.
     * </p>
     */
    private Long profileCount;
    /**
     * <p>
     * The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     * associated with a single profile, that profile counts as two profiles. If you have more than 200 objects, that
     * profile counts as three, and so on.
     * </p>
     */
    private Long meteringProfileCount;
    /**
     * <p>
     * The total number of objects in domain.
     * </p>
     */
    private Long objectCount;
    /**
     * <p>
     * The total size, in bytes, of all objects in the domain.
     * </p>
     */
    private Long totalSize;

    /**
     * <p>
     * The total number of profiles currently in the domain.
     * </p>
     * 
     * @param profileCount
     *        The total number of profiles currently in the domain.
     */

    public void setProfileCount(Long profileCount) {
        this.profileCount = profileCount;
    }

    /**
     * <p>
     * The total number of profiles currently in the domain.
     * </p>
     * 
     * @return The total number of profiles currently in the domain.
     */

    public Long getProfileCount() {
        return this.profileCount;
    }

    /**
     * <p>
     * The total number of profiles currently in the domain.
     * </p>
     * 
     * @param profileCount
     *        The total number of profiles currently in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStats withProfileCount(Long profileCount) {
        setProfileCount(profileCount);
        return this;
    }

    /**
     * <p>
     * The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     * associated with a single profile, that profile counts as two profiles. If you have more than 200 objects, that
     * profile counts as three, and so on.
     * </p>
     * 
     * @param meteringProfileCount
     *        The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     *        associated with a single profile, that profile counts as two profiles. If you have more than 200 objects,
     *        that profile counts as three, and so on.
     */

    public void setMeteringProfileCount(Long meteringProfileCount) {
        this.meteringProfileCount = meteringProfileCount;
    }

    /**
     * <p>
     * The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     * associated with a single profile, that profile counts as two profiles. If you have more than 200 objects, that
     * profile counts as three, and so on.
     * </p>
     * 
     * @return The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     *         associated with a single profile, that profile counts as two profiles. If you have more than 200 objects,
     *         that profile counts as three, and so on.
     */

    public Long getMeteringProfileCount() {
        return this.meteringProfileCount;
    }

    /**
     * <p>
     * The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     * associated with a single profile, that profile counts as two profiles. If you have more than 200 objects, that
     * profile counts as three, and so on.
     * </p>
     * 
     * @param meteringProfileCount
     *        The number of profiles that you are currently paying for in the domain. If you have more than 100 objects
     *        associated with a single profile, that profile counts as two profiles. If you have more than 200 objects,
     *        that profile counts as three, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStats withMeteringProfileCount(Long meteringProfileCount) {
        setMeteringProfileCount(meteringProfileCount);
        return this;
    }

    /**
     * <p>
     * The total number of objects in domain.
     * </p>
     * 
     * @param objectCount
     *        The total number of objects in domain.
     */

    public void setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
    }

    /**
     * <p>
     * The total number of objects in domain.
     * </p>
     * 
     * @return The total number of objects in domain.
     */

    public Long getObjectCount() {
        return this.objectCount;
    }

    /**
     * <p>
     * The total number of objects in domain.
     * </p>
     * 
     * @param objectCount
     *        The total number of objects in domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStats withObjectCount(Long objectCount) {
        setObjectCount(objectCount);
        return this;
    }

    /**
     * <p>
     * The total size, in bytes, of all objects in the domain.
     * </p>
     * 
     * @param totalSize
     *        The total size, in bytes, of all objects in the domain.
     */

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * <p>
     * The total size, in bytes, of all objects in the domain.
     * </p>
     * 
     * @return The total size, in bytes, of all objects in the domain.
     */

    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * <p>
     * The total size, in bytes, of all objects in the domain.
     * </p>
     * 
     * @param totalSize
     *        The total size, in bytes, of all objects in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStats withTotalSize(Long totalSize) {
        setTotalSize(totalSize);
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
        if (getProfileCount() != null)
            sb.append("ProfileCount: ").append(getProfileCount()).append(",");
        if (getMeteringProfileCount() != null)
            sb.append("MeteringProfileCount: ").append(getMeteringProfileCount()).append(",");
        if (getObjectCount() != null)
            sb.append("ObjectCount: ").append(getObjectCount()).append(",");
        if (getTotalSize() != null)
            sb.append("TotalSize: ").append(getTotalSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainStats == false)
            return false;
        DomainStats other = (DomainStats) obj;
        if (other.getProfileCount() == null ^ this.getProfileCount() == null)
            return false;
        if (other.getProfileCount() != null && other.getProfileCount().equals(this.getProfileCount()) == false)
            return false;
        if (other.getMeteringProfileCount() == null ^ this.getMeteringProfileCount() == null)
            return false;
        if (other.getMeteringProfileCount() != null && other.getMeteringProfileCount().equals(this.getMeteringProfileCount()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null && other.getObjectCount().equals(this.getObjectCount()) == false)
            return false;
        if (other.getTotalSize() == null ^ this.getTotalSize() == null)
            return false;
        if (other.getTotalSize() != null && other.getTotalSize().equals(this.getTotalSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileCount() == null) ? 0 : getProfileCount().hashCode());
        hashCode = prime * hashCode + ((getMeteringProfileCount() == null) ? 0 : getMeteringProfileCount().hashCode());
        hashCode = prime * hashCode + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime * hashCode + ((getTotalSize() == null) ? 0 : getTotalSize().hashCode());
        return hashCode;
    }

    @Override
    public DomainStats clone() {
        try {
            return (DomainStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.DomainStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
