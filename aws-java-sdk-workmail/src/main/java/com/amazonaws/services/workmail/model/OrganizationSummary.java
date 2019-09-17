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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The representation of an organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/OrganizationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The error message associated with the organization. It is only present if unexpected behavior has occurred with
     * regards to the organization. It provides insight or solutions regarding unexpected behavior.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The state associated with the organization.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * 
     * @return The identifier associated with the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationSummary withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * 
     * @param alias
     *        The alias associated with the organization.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * 
     * @return The alias associated with the organization.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias associated with the organization.
     * </p>
     * 
     * @param alias
     *        The alias associated with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationSummary withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The error message associated with the organization. It is only present if unexpected behavior has occurred with
     * regards to the organization. It provides insight or solutions regarding unexpected behavior.
     * </p>
     * 
     * @param errorMessage
     *        The error message associated with the organization. It is only present if unexpected behavior has occurred
     *        with regards to the organization. It provides insight or solutions regarding unexpected behavior.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message associated with the organization. It is only present if unexpected behavior has occurred with
     * regards to the organization. It provides insight or solutions regarding unexpected behavior.
     * </p>
     * 
     * @return The error message associated with the organization. It is only present if unexpected behavior has
     *         occurred with regards to the organization. It provides insight or solutions regarding unexpected
     *         behavior.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message associated with the organization. It is only present if unexpected behavior has occurred with
     * regards to the organization. It provides insight or solutions regarding unexpected behavior.
     * </p>
     * 
     * @param errorMessage
     *        The error message associated with the organization. It is only present if unexpected behavior has occurred
     *        with regards to the organization. It provides insight or solutions regarding unexpected behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationSummary withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * 
     * @param state
     *        The state associated with the organization.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * 
     * @return The state associated with the organization.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state associated with the organization.
     * </p>
     * 
     * @param state
     *        The state associated with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationSummary withState(String state) {
        setState(state);
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationSummary == false)
            return false;
        OrganizationSummary other = (OrganizationSummary) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationSummary clone() {
        try {
            return (OrganizationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.OrganizationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
