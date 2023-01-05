/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the enablement status, user access URL, and relay state parameter name that are used for configuring
 * federation with an SAML 2.0 identity provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/SamlProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamlProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the status of SAML 2.0 authentication. These statuses include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the setting is <code>DISABLED</code>, end users will be directed to login with their directory credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     * attempting to connect to WorkSpaces from a client application that does not support SAML 2.0 authentication will
     * not be able to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login via the
     * user access URL on supported client applications, but will not prevent clients that do not support SAML 2.0
     * authentication from connecting as if SAML 2.0 authentication was disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web browser in
     * order to federate from the IdP and directly access the application, without any SAML 2.0 service provider (SP)
     * bindings.
     * </p>
     */
    private String userAccessUrl;
    /**
     * <p>
     * The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is redirected
     * to the user access URL from the WorkSpaces client application, this relay state parameter name is appended as a
     * query parameter to the URL along with the relay state endpoint to return the user to the client application
     * session.
     * </p>
     * <p>
     * To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the relay
     * state URL. Consult your IdP documentation for more information.
     * </p>
     */
    private String relayStateParameterName;

    /**
     * <p>
     * Indicates the status of SAML 2.0 authentication. These statuses include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the setting is <code>DISABLED</code>, end users will be directed to login with their directory credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     * attempting to connect to WorkSpaces from a client application that does not support SAML 2.0 authentication will
     * not be able to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login via the
     * user access URL on supported client applications, but will not prevent clients that do not support SAML 2.0
     * authentication from connecting as if SAML 2.0 authentication was disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates the status of SAML 2.0 authentication. These statuses include the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the setting is <code>DISABLED</code>, end users will be directed to login with their directory
     *        credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     *        attempting to connect to WorkSpaces from a client application that does not support SAML 2.0
     *        authentication will not be able to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login
     *        via the user access URL on supported client applications, but will not prevent clients that do not support
     *        SAML 2.0 authentication from connecting as if SAML 2.0 authentication was disabled.
     *        </p>
     *        </li>
     * @see SamlStatusEnum
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of SAML 2.0 authentication. These statuses include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the setting is <code>DISABLED</code>, end users will be directed to login with their directory credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     * attempting to connect to WorkSpaces from a client application that does not support SAML 2.0 authentication will
     * not be able to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login via the
     * user access URL on supported client applications, but will not prevent clients that do not support SAML 2.0
     * authentication from connecting as if SAML 2.0 authentication was disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of SAML 2.0 authentication. These statuses include the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the setting is <code>DISABLED</code>, end users will be directed to login with their directory
     *         credentials.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL.
     *         Users attempting to connect to WorkSpaces from a client application that does not support SAML 2.0
     *         authentication will not be able to connect.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login
     *         via the user access URL on supported client applications, but will not prevent clients that do not
     *         support SAML 2.0 authentication from connecting as if SAML 2.0 authentication was disabled.
     *         </p>
     *         </li>
     * @see SamlStatusEnum
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of SAML 2.0 authentication. These statuses include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the setting is <code>DISABLED</code>, end users will be directed to login with their directory credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     * attempting to connect to WorkSpaces from a client application that does not support SAML 2.0 authentication will
     * not be able to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login via the
     * user access URL on supported client applications, but will not prevent clients that do not support SAML 2.0
     * authentication from connecting as if SAML 2.0 authentication was disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates the status of SAML 2.0 authentication. These statuses include the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the setting is <code>DISABLED</code>, end users will be directed to login with their directory
     *        credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     *        attempting to connect to WorkSpaces from a client application that does not support SAML 2.0
     *        authentication will not be able to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login
     *        via the user access URL on supported client applications, but will not prevent clients that do not support
     *        SAML 2.0 authentication from connecting as if SAML 2.0 authentication was disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SamlStatusEnum
     */

    public SamlProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of SAML 2.0 authentication. These statuses include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the setting is <code>DISABLED</code>, end users will be directed to login with their directory credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     * attempting to connect to WorkSpaces from a client application that does not support SAML 2.0 authentication will
     * not be able to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login via the
     * user access URL on supported client applications, but will not prevent clients that do not support SAML 2.0
     * authentication from connecting as if SAML 2.0 authentication was disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Indicates the status of SAML 2.0 authentication. These statuses include the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the setting is <code>DISABLED</code>, end users will be directed to login with their directory
     *        credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the setting is <code>ENABLED</code>, end users will be directed to login via the user access URL. Users
     *        attempting to connect to WorkSpaces from a client application that does not support SAML 2.0
     *        authentication will not be able to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the setting is <code>ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK</code>, end users will be directed to login
     *        via the user access URL on supported client applications, but will not prevent clients that do not support
     *        SAML 2.0 authentication from connecting as if SAML 2.0 authentication was disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SamlStatusEnum
     */

    public SamlProperties withStatus(SamlStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web browser in
     * order to federate from the IdP and directly access the application, without any SAML 2.0 service provider (SP)
     * bindings.
     * </p>
     * 
     * @param userAccessUrl
     *        The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web
     *        browser in order to federate from the IdP and directly access the application, without any SAML 2.0
     *        service provider (SP) bindings.
     */

    public void setUserAccessUrl(String userAccessUrl) {
        this.userAccessUrl = userAccessUrl;
    }

    /**
     * <p>
     * The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web browser in
     * order to federate from the IdP and directly access the application, without any SAML 2.0 service provider (SP)
     * bindings.
     * </p>
     * 
     * @return The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web
     *         browser in order to federate from the IdP and directly access the application, without any SAML 2.0
     *         service provider (SP) bindings.
     */

    public String getUserAccessUrl() {
        return this.userAccessUrl;
    }

    /**
     * <p>
     * The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web browser in
     * order to federate from the IdP and directly access the application, without any SAML 2.0 service provider (SP)
     * bindings.
     * </p>
     * 
     * @param userAccessUrl
     *        The SAML 2.0 identity provider (IdP) user access URL is the URL a user would navigate to in their web
     *        browser in order to federate from the IdP and directly access the application, without any SAML 2.0
     *        service provider (SP) bindings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlProperties withUserAccessUrl(String userAccessUrl) {
        setUserAccessUrl(userAccessUrl);
        return this;
    }

    /**
     * <p>
     * The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is redirected
     * to the user access URL from the WorkSpaces client application, this relay state parameter name is appended as a
     * query parameter to the URL along with the relay state endpoint to return the user to the client application
     * session.
     * </p>
     * <p>
     * To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the relay
     * state URL. Consult your IdP documentation for more information.
     * </p>
     * 
     * @param relayStateParameterName
     *        The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is
     *        redirected to the user access URL from the WorkSpaces client application, this relay state parameter name
     *        is appended as a query parameter to the URL along with the relay state endpoint to return the user to the
     *        client application session.</p>
     *        <p>
     *        To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the
     *        relay state URL. Consult your IdP documentation for more information.
     */

    public void setRelayStateParameterName(String relayStateParameterName) {
        this.relayStateParameterName = relayStateParameterName;
    }

    /**
     * <p>
     * The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is redirected
     * to the user access URL from the WorkSpaces client application, this relay state parameter name is appended as a
     * query parameter to the URL along with the relay state endpoint to return the user to the client application
     * session.
     * </p>
     * <p>
     * To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the relay
     * state URL. Consult your IdP documentation for more information.
     * </p>
     * 
     * @return The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is
     *         redirected to the user access URL from the WorkSpaces client application, this relay state parameter name
     *         is appended as a query parameter to the URL along with the relay state endpoint to return the user to the
     *         client application session.</p>
     *         <p>
     *         To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the
     *         relay state URL. Consult your IdP documentation for more information.
     */

    public String getRelayStateParameterName() {
        return this.relayStateParameterName;
    }

    /**
     * <p>
     * The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is redirected
     * to the user access URL from the WorkSpaces client application, this relay state parameter name is appended as a
     * query parameter to the URL along with the relay state endpoint to return the user to the client application
     * session.
     * </p>
     * <p>
     * To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the relay
     * state URL. Consult your IdP documentation for more information.
     * </p>
     * 
     * @param relayStateParameterName
     *        The relay state parameter name supported by the SAML 2.0 identity provider (IdP). When the end user is
     *        redirected to the user access URL from the WorkSpaces client application, this relay state parameter name
     *        is appended as a query parameter to the URL along with the relay state endpoint to return the user to the
     *        client application session.</p>
     *        <p>
     *        To use SAML 2.0 authentication with WorkSpaces, the IdP must support IdP-initiated deep linking for the
     *        relay state URL. Consult your IdP documentation for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlProperties withRelayStateParameterName(String relayStateParameterName) {
        setRelayStateParameterName(relayStateParameterName);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUserAccessUrl() != null)
            sb.append("UserAccessUrl: ").append(getUserAccessUrl()).append(",");
        if (getRelayStateParameterName() != null)
            sb.append("RelayStateParameterName: ").append(getRelayStateParameterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamlProperties == false)
            return false;
        SamlProperties other = (SamlProperties) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUserAccessUrl() == null ^ this.getUserAccessUrl() == null)
            return false;
        if (other.getUserAccessUrl() != null && other.getUserAccessUrl().equals(this.getUserAccessUrl()) == false)
            return false;
        if (other.getRelayStateParameterName() == null ^ this.getRelayStateParameterName() == null)
            return false;
        if (other.getRelayStateParameterName() != null && other.getRelayStateParameterName().equals(this.getRelayStateParameterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUserAccessUrl() == null) ? 0 : getUserAccessUrl().hashCode());
        hashCode = prime * hashCode + ((getRelayStateParameterName() == null) ? 0 : getRelayStateParameterName().hashCode());
        return hashCode;
    }

    @Override
    public SamlProperties clone() {
        try {
            return (SamlProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.SamlPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
