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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private EndpointDetails endpointDetails;

    private String endpointType;
    /**
     * <p>
     * This response parameter is an array containing all of the information required to call a customer's
     * authentication API method.
     * </p>
     */
    private IdentityProviderDetails identityProviderDetails;
    /**
     * <p>
     * Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in Amazon
     * CloudWatch, turning logging on or off.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     */
    private String serverId;

    /**
     * @param endpointDetails
     */

    public void setEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    /**
     * @return
     */

    public EndpointDetails getEndpointDetails() {
        return this.endpointDetails;
    }

    /**
     * @param endpointDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withEndpointDetails(EndpointDetails endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * @param endpointType
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * @return
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @param endpointType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public UpdateServerRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * @param endpointType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public UpdateServerRequest withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * This response parameter is an array containing all of the information required to call a customer's
     * authentication API method.
     * </p>
     * 
     * @param identityProviderDetails
     *        This response parameter is an array containing all of the information required to call a customer's
     *        authentication API method.
     */

    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * This response parameter is an array containing all of the information required to call a customer's
     * authentication API method.
     * </p>
     * 
     * @return This response parameter is an array containing all of the information required to call a customer's
     *         authentication API method.
     */

    public IdentityProviderDetails getIdentityProviderDetails() {
        return this.identityProviderDetails;
    }

    /**
     * <p>
     * This response parameter is an array containing all of the information required to call a customer's
     * authentication API method.
     * </p>
     * 
     * @param identityProviderDetails
     *        This response parameter is an array containing all of the information required to call a customer's
     *        authentication API method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        setIdentityProviderDetails(identityProviderDetails);
        return this;
    }

    /**
     * <p>
     * Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in Amazon
     * CloudWatch, turning logging on or off.
     * </p>
     * 
     * @param loggingRole
     *        Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in
     *        Amazon CloudWatch, turning logging on or off.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in Amazon
     * CloudWatch, turning logging on or off.
     * </p>
     * 
     * @return Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in
     *         Amazon CloudWatch, turning logging on or off.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in Amazon
     * CloudWatch, turning logging on or off.
     * </p>
     * 
     * @param loggingRole
     *        Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in
     *        Amazon CloudWatch, turning logging on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     * 
     * @return A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withServerId(String serverId) {
        setServerId(serverId);
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
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getIdentityProviderDetails() != null)
            sb.append("IdentityProviderDetails: ").append(getIdentityProviderDetails()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServerRequest == false)
            return false;
        UpdateServerRequest other = (UpdateServerRequest) obj;
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getIdentityProviderDetails() == null ^ this.getIdentityProviderDetails() == null)
            return false;
        if (other.getIdentityProviderDetails() != null && other.getIdentityProviderDetails().equals(this.getIdentityProviderDetails()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServerRequest clone() {
        return (UpdateServerRequest) super.clone();
    }

}
