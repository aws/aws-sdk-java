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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an allowed repository for a package group, including its name and origin configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageGroupAllowedRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageGroupAllowedRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the allowed repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The origin configuration restriction type of the allowed repository.
     * </p>
     */
    private String originRestrictionType;

    /**
     * <p>
     * The name of the allowed repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the allowed repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the allowed repository.
     * </p>
     * 
     * @return The name of the allowed repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the allowed repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the allowed repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupAllowedRepository withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The origin configuration restriction type of the allowed repository.
     * </p>
     * 
     * @param originRestrictionType
     *        The origin configuration restriction type of the allowed repository.
     * @see PackageGroupOriginRestrictionType
     */

    public void setOriginRestrictionType(String originRestrictionType) {
        this.originRestrictionType = originRestrictionType;
    }

    /**
     * <p>
     * The origin configuration restriction type of the allowed repository.
     * </p>
     * 
     * @return The origin configuration restriction type of the allowed repository.
     * @see PackageGroupOriginRestrictionType
     */

    public String getOriginRestrictionType() {
        return this.originRestrictionType;
    }

    /**
     * <p>
     * The origin configuration restriction type of the allowed repository.
     * </p>
     * 
     * @param originRestrictionType
     *        The origin configuration restriction type of the allowed repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupOriginRestrictionType
     */

    public PackageGroupAllowedRepository withOriginRestrictionType(String originRestrictionType) {
        setOriginRestrictionType(originRestrictionType);
        return this;
    }

    /**
     * <p>
     * The origin configuration restriction type of the allowed repository.
     * </p>
     * 
     * @param originRestrictionType
     *        The origin configuration restriction type of the allowed repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageGroupOriginRestrictionType
     */

    public PackageGroupAllowedRepository withOriginRestrictionType(PackageGroupOriginRestrictionType originRestrictionType) {
        this.originRestrictionType = originRestrictionType.toString();
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getOriginRestrictionType() != null)
            sb.append("OriginRestrictionType: ").append(getOriginRestrictionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageGroupAllowedRepository == false)
            return false;
        PackageGroupAllowedRepository other = (PackageGroupAllowedRepository) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getOriginRestrictionType() == null ^ this.getOriginRestrictionType() == null)
            return false;
        if (other.getOriginRestrictionType() != null && other.getOriginRestrictionType().equals(this.getOriginRestrictionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getOriginRestrictionType() == null) ? 0 : getOriginRestrictionType().hashCode());
        return hashCode;
    }

    @Override
    public PackageGroupAllowedRepository clone() {
        try {
            return (PackageGroupAllowedRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageGroupAllowedRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
