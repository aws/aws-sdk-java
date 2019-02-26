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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * JoinDomainInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/JoinDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JoinDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The organizational unit (OU) is a container with an Active Directory that can hold users, groups, computers, and
     * other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * </p>
     */
    private String organizationalUnit;
    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port
     * number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> domainControllers;
    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *        list of gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *         list of gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a list of
     * gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway. Use the <code>ListGateways</code> operation to return a
     *        list of gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want the gateway to join.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     * 
     * @return The name of the domain that you want the gateway to join.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want the gateway to join.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The organizational unit (OU) is a container with an Active Directory that can hold users, groups, computers, and
     * other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * </p>
     * 
     * @param organizationalUnit
     *        The organizational unit (OU) is a container with an Active Directory that can hold users, groups,
     *        computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD
     *        domain.
     */

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * <p>
     * The organizational unit (OU) is a container with an Active Directory that can hold users, groups, computers, and
     * other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * </p>
     * 
     * @return The organizational unit (OU) is a container with an Active Directory that can hold users, groups,
     *         computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD
     *         domain.
     */

    public String getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * <p>
     * The organizational unit (OU) is a container with an Active Directory that can hold users, groups, computers, and
     * other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * </p>
     * 
     * @param organizationalUnit
     *        The organizational unit (OU) is a container with an Active Directory that can hold users, groups,
     *        computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD
     *        domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withOrganizationalUnit(String organizationalUnit) {
        setOrganizationalUnit(organizationalUnit);
        return this;
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port
     * number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     * 
     * @return List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the
     *         port number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     */

    public java.util.List<String> getDomainControllers() {
        if (domainControllers == null) {
            domainControllers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return domainControllers;
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port
     * number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     * 
     * @param domainControllers
     *        List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the
     *        port number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     */

    public void setDomainControllers(java.util.Collection<String> domainControllers) {
        if (domainControllers == null) {
            this.domainControllers = null;
            return;
        }

        this.domainControllers = new com.amazonaws.internal.SdkInternalList<String>(domainControllers);
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port
     * number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainControllers(java.util.Collection)} or {@link #withDomainControllers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainControllers
     *        List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the
     *        port number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withDomainControllers(String... domainControllers) {
        if (this.domainControllers == null) {
            setDomainControllers(new com.amazonaws.internal.SdkInternalList<String>(domainControllers.length));
        }
        for (String ele : domainControllers) {
            this.domainControllers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port
     * number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     * 
     * @param domainControllers
     *        List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the
     *        port number include it after the colon (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withDomainControllers(java.util.Collection<String> domainControllers) {
        setDomainControllers(domainControllers);
        return this;
    }

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     * </p>
     * 
     * @param userName
     *        Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     * </p>
     * 
     * @return Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     * </p>
     * 
     * @param userName
     *        Sets the user name of user who has permission to add the gateway to the Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     * </p>
     * 
     * @param password
     *        Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     * </p>
     * 
     * @return Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     * </p>
     * 
     * @param password
     *        Sets the password of the user who has permission to add the gateway to the Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinDomainRequest withPassword(String password) {
        setPassword(password);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getOrganizationalUnit() != null)
            sb.append("OrganizationalUnit: ").append(getOrganizationalUnit()).append(",");
        if (getDomainControllers() != null)
            sb.append("DomainControllers: ").append(getDomainControllers()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinDomainRequest == false)
            return false;
        JoinDomainRequest other = (JoinDomainRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOrganizationalUnit() == null ^ this.getOrganizationalUnit() == null)
            return false;
        if (other.getOrganizationalUnit() != null && other.getOrganizationalUnit().equals(this.getOrganizationalUnit()) == false)
            return false;
        if (other.getDomainControllers() == null ^ this.getDomainControllers() == null)
            return false;
        if (other.getDomainControllers() != null && other.getDomainControllers().equals(this.getDomainControllers()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnit() == null) ? 0 : getOrganizationalUnit().hashCode());
        hashCode = prime * hashCode + ((getDomainControllers() == null) ? 0 : getDomainControllers().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public JoinDomainRequest clone() {
        return (JoinDomainRequest) super.clone();
    }

}
