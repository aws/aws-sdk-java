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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private EndpointDetails endpointDetails;

    private String endpointType;
    /**
     * <p>
     * An array containing all of the information required to call a customer-supplied authentication API. This
     * parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses the
     * <code>SERVICE_MANAGED</code> authentication method.
     * </p>
     */
    private IdentityProviderDetails identityProviderDetails;
    /**
     * <p>
     * The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access SFTP user credentials within the service. An <code>IdentityProviderType</code>
     * value of <code>API_GATEWAY</code> indicates that user authentication requires a call to an API Gateway endpoint
     * URL provided by you to integrate an identity provider of your choice.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for monitoring
     * and auditing purposes.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateServerRequest withEndpointDetails(EndpointDetails endpointDetails) {
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

    public CreateServerRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * @param endpointType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public CreateServerRequest withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * An array containing all of the information required to call a customer-supplied authentication API. This
     * parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses the
     * <code>SERVICE_MANAGED</code> authentication method.
     * </p>
     * 
     * @param identityProviderDetails
     *        An array containing all of the information required to call a customer-supplied authentication API. This
     *        parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses
     *        the <code>SERVICE_MANAGED</code> authentication method.
     */

    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * An array containing all of the information required to call a customer-supplied authentication API. This
     * parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses the
     * <code>SERVICE_MANAGED</code> authentication method.
     * </p>
     * 
     * @return An array containing all of the information required to call a customer-supplied authentication API. This
     *         parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses
     *         the <code>SERVICE_MANAGED</code> authentication method.
     */

    public IdentityProviderDetails getIdentityProviderDetails() {
        return this.identityProviderDetails;
    }

    /**
     * <p>
     * An array containing all of the information required to call a customer-supplied authentication API. This
     * parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses the
     * <code>SERVICE_MANAGED</code> authentication method.
     * </p>
     * 
     * @param identityProviderDetails
     *        An array containing all of the information required to call a customer-supplied authentication API. This
     *        parameter is not required when the <code>IdentityProviderType</code> value of server that is created uses
     *        the <code>SERVICE_MANAGED</code> authentication method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        setIdentityProviderDetails(identityProviderDetails);
        return this;
    }

    /**
     * <p>
     * The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access SFTP user credentials within the service. An <code>IdentityProviderType</code>
     * value of <code>API_GATEWAY</code> indicates that user authentication requires a call to an API Gateway endpoint
     * URL provided by you to integrate an identity provider of your choice.
     * </p>
     * 
     * @param identityProviderType
     *        The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>,
     *        which allows you to store and access SFTP user credentials within the service. An
     *        <code>IdentityProviderType</code> value of <code>API_GATEWAY</code> indicates that user authentication
     *        requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your
     *        choice.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access SFTP user credentials within the service. An <code>IdentityProviderType</code>
     * value of <code>API_GATEWAY</code> indicates that user authentication requires a call to an API Gateway endpoint
     * URL provided by you to integrate an identity provider of your choice.
     * </p>
     * 
     * @return The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>,
     *         which allows you to store and access SFTP user credentials within the service. An
     *         <code>IdentityProviderType</code> value of <code>API_GATEWAY</code> indicates that user authentication
     *         requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your
     *         choice.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access SFTP user credentials within the service. An <code>IdentityProviderType</code>
     * value of <code>API_GATEWAY</code> indicates that user authentication requires a call to an API Gateway endpoint
     * URL provided by you to integrate an identity provider of your choice.
     * </p>
     * 
     * @param identityProviderType
     *        The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>,
     *        which allows you to store and access SFTP user credentials within the service. An
     *        <code>IdentityProviderType</code> value of <code>API_GATEWAY</code> indicates that user authentication
     *        requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your
     *        choice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public CreateServerRequest withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access SFTP user credentials within the service. An <code>IdentityProviderType</code>
     * value of <code>API_GATEWAY</code> indicates that user authentication requires a call to an API Gateway endpoint
     * URL provided by you to integrate an identity provider of your choice.
     * </p>
     * 
     * @param identityProviderType
     *        The mode of authentication enabled for this service. The default value is <code>SERVICE_MANAGED</code>,
     *        which allows you to store and access SFTP user credentials within the service. An
     *        <code>IdentityProviderType</code> value of <code>API_GATEWAY</code> indicates that user authentication
     *        requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your
     *        choice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public CreateServerRequest withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for monitoring
     * and auditing purposes.
     * </p>
     * 
     * @param loggingRole
     *        A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for
     *        monitoring and auditing purposes.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for monitoring
     * and auditing purposes.
     * </p>
     * 
     * @return A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for
     *         monitoring and auditing purposes.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for monitoring
     * and auditing purposes.
     * </p>
     * 
     * @param loggingRole
     *        A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for
     *        monitoring and auditing purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for servers.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for servers.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for servers.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServerRequest == false)
            return false;
        CreateServerRequest other = (CreateServerRequest) obj;
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
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateServerRequest clone() {
        return (CreateServerRequest) super.clone();
    }

}
