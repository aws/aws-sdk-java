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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The alias for an organization.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The state of an organization.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail organization.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     */
    private String directoryType;
    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     */
    private String defaultMailDomain;
    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date completedDate;
    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier of an organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * 
     * @return The identifier of an organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * 
     * @param alias
     *        The alias for an organization.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * 
     * @return The alias for an organization.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * 
     * @param alias
     *        The alias for an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The state of an organization.
     * </p>
     * 
     * @param state
     *        The state of an organization.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of an organization.
     * </p>
     * 
     * @return The state of an organization.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of an organization.
     * </p>
     * 
     * @param state
     *        The state of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail organization.
     * </p>
     * 
     * @param directoryId
     *        The identifier for the directory associated with an Amazon WorkMail organization.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail organization.
     * </p>
     * 
     * @return The identifier for the directory associated with an Amazon WorkMail organization.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail organization.
     * </p>
     * 
     * @param directoryId
     *        The identifier for the directory associated with an Amazon WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * 
     * @param directoryType
     *        The type of directory associated with the WorkMail organization.
     */

    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * 
     * @return The type of directory associated with the WorkMail organization.
     */

    public String getDirectoryType() {
        return this.directoryType;
    }

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * 
     * @param directoryType
     *        The type of directory associated with the WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withDirectoryType(String directoryType) {
        setDirectoryType(directoryType);
        return this;
    }

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * 
     * @param defaultMailDomain
     *        The default mail domain associated with the organization.
     */

    public void setDefaultMailDomain(String defaultMailDomain) {
        this.defaultMailDomain = defaultMailDomain;
    }

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * 
     * @return The default mail domain associated with the organization.
     */

    public String getDefaultMailDomain() {
        return this.defaultMailDomain;
    }

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * 
     * @param defaultMailDomain
     *        The default mail domain associated with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withDefaultMailDomain(String defaultMailDomain) {
        setDefaultMailDomain(defaultMailDomain);
        return this;
    }

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     * </p>
     * 
     * @param completedDate
     *        The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     */

    public void setCompletedDate(java.util.Date completedDate) {
        this.completedDate = completedDate;
    }

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     * </p>
     * 
     * @return The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     */

    public java.util.Date getCompletedDate() {
        return this.completedDate;
    }

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     * </p>
     * 
     * @param completedDate
     *        The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withCompletedDate(java.util.Date completedDate) {
        setCompletedDate(completedDate);
        return this;
    }

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
     * </p>
     * 
     * @param errorMessage
     *        (Optional) The error message indicating if unexpected behavior was encountered with regards to the
     *        organization.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
     * </p>
     * 
     * @return (Optional) The error message indicating if unexpected behavior was encountered with regards to the
     *         organization.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
     * </p>
     * 
     * @param errorMessage
     *        (Optional) The error message indicating if unexpected behavior was encountered with regards to the
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getDirectoryType() != null)
            sb.append("DirectoryType: ").append(getDirectoryType()).append(",");
        if (getDefaultMailDomain() != null)
            sb.append("DefaultMailDomain: ").append(getDefaultMailDomain()).append(",");
        if (getCompletedDate() != null)
            sb.append("CompletedDate: ").append(getCompletedDate()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationResult == false)
            return false;
        DescribeOrganizationResult other = (DescribeOrganizationResult) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getDirectoryType() == null ^ this.getDirectoryType() == null)
            return false;
        if (other.getDirectoryType() != null && other.getDirectoryType().equals(this.getDirectoryType()) == false)
            return false;
        if (other.getDefaultMailDomain() == null ^ this.getDefaultMailDomain() == null)
            return false;
        if (other.getDefaultMailDomain() != null && other.getDefaultMailDomain().equals(this.getDefaultMailDomain()) == false)
            return false;
        if (other.getCompletedDate() == null ^ this.getCompletedDate() == null)
            return false;
        if (other.getCompletedDate() != null && other.getCompletedDate().equals(this.getCompletedDate()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getDirectoryType() == null) ? 0 : getDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getDefaultMailDomain() == null) ? 0 : getDefaultMailDomain().hashCode());
        hashCode = prime * hashCode + ((getCompletedDate() == null) ? 0 : getCompletedDate().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationResult clone() {
        try {
            return (DescribeOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
