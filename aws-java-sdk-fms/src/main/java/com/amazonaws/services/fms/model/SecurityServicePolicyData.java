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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the security service that is being used to protect the resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/SecurityServicePolicyData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityServicePolicyData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies,
     * Firewall Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting AWS Support.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format. For service type
     * <code>SHIELD_ADVANCED</code>, this is an empty string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>WAF</code>
     * </p>
     * <p>
     * <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * <p>
     * The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     * <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's security
     * group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String managedServiceData;

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies,
     * Firewall Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting AWS Support.
     * </p>
     * 
     * @param type
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security
     *        group policies, Firewall Manager supports one security group for each common policy and for each content
     *        audit policy. This is an adjustable limit that you can increase by contacting AWS Support.
     * @see SecurityServiceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies,
     * Firewall Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting AWS Support.
     * </p>
     * 
     * @return The service that the policy is using to protect the resources. This specifies the type of policy that is
     *         created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security
     *         group policies, Firewall Manager supports one security group for each common policy and for each content
     *         audit policy. This is an adjustable limit that you can increase by contacting AWS Support.
     * @see SecurityServiceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies,
     * Firewall Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting AWS Support.
     * </p>
     * 
     * @param type
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security
     *        group policies, Firewall Manager supports one security group for each common policy and for each content
     *        audit policy. This is an adjustable limit that you can increase by contacting AWS Support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public SecurityServicePolicyData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security group policies,
     * Firewall Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting AWS Support.
     * </p>
     * 
     * @param type
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy. For security
     *        group policies, Firewall Manager supports one security group for each common policy and for each content
     *        audit policy. This is an adjustable limit that you can increase by contacting AWS Support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public SecurityServicePolicyData withType(SecurityServiceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format. For service type
     * <code>SHIELD_ADVANCED</code>, this is an empty string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>WAF</code>
     * </p>
     * <p>
     * <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * <p>
     * The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     * <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's security
     * group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedServiceData
     *        Details about the service that are specific to the service type, in JSON format. For service type
     *        <code>SHIELD_ADVANCED</code>, this is an empty string.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example: <code>WAF</code>
     *        </p>
     *        <p>
     *        <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_COMMON</code>
     *        </p>
     *        <p>
     *        <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     *        </p>
     *        <p>
     *        <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     *        </p>
     *        <p>
     *        The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     *        <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's
     *        security group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value or
     *        a range that matches a rule value or range in the policy security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     *        </p>
     *        <p>
     *        <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     *        </p>
     *        </li>
     */

    public void setManagedServiceData(String managedServiceData) {
        this.managedServiceData = managedServiceData;
    }

    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format. For service type
     * <code>SHIELD_ADVANCED</code>, this is an empty string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>WAF</code>
     * </p>
     * <p>
     * <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * <p>
     * The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     * <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's security
     * group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Details about the service that are specific to the service type, in JSON format. For service type
     *         <code>SHIELD_ADVANCED</code>, this is an empty string.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Example: <code>WAF</code>
     *         </p>
     *         <p>
     *         <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>SECURITY_GROUPS_COMMON</code>
     *         </p>
     *         <p>
     *         <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     *         </p>
     *         <p>
     *         <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     *         </p>
     *         <p>
     *         The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     *         <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's
     *         security group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value
     *         or a range that matches a rule value or range in the policy security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     *         </p>
     *         <p>
     *         <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     *         </p>
     *         </li>
     */

    public String getManagedServiceData() {
        return this.managedServiceData;
    }

    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format. For service type
     * <code>SHIELD_ADVANCED</code>, this is an empty string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>WAF</code>
     * </p>
     * <p>
     * <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     * </p>
     * <p>
     * The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     * <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's security
     * group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value or a range that
     * matches a rule value or range in the policy security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     * </p>
     * <p>
     * <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedServiceData
     *        Details about the service that are specific to the service type, in JSON format. For service type
     *        <code>SHIELD_ADVANCED</code>, this is an empty string.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example: <code>WAF</code>
     *        </p>
     *        <p>
     *        <code>ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_COMMON</code>
     *        </p>
     *        <p>
     *        <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_COMMON","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     *        </p>
     *        <p>
     *        <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_CONTENT_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd \"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"},"RemediationEnabled":false,"ResourceType":"AWS::EC2::NetworkInterface"}</code>
     *        </p>
     *        <p>
     *        The security group action for content audit can be <code>ALLOW</code> or <code>DENY</code>. For
     *        <code>ALLOW</code>, all in-scope security group rules must be within the allowed range of the policy's
     *        security group rules. For <code>DENY</code>, all in-scope security group rules must not contain a value or
     *        a range that matches a rule value or range in the policy security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_USAGE_AUDIT</code>
     *        </p>
     *        <p>
     *        <code>"SecurityServicePolicyData":{"Type":"SECURITY_GROUPS_USAGE_AUDIT","ManagedServiceData":"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"},"RemediationEnabled":false,"Resou rceType":"AWS::EC2::SecurityGroup"}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityServicePolicyData withManagedServiceData(String managedServiceData) {
        setManagedServiceData(managedServiceData);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getManagedServiceData() != null)
            sb.append("ManagedServiceData: ").append(getManagedServiceData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityServicePolicyData == false)
            return false;
        SecurityServicePolicyData other = (SecurityServicePolicyData) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getManagedServiceData() == null ^ this.getManagedServiceData() == null)
            return false;
        if (other.getManagedServiceData() != null && other.getManagedServiceData().equals(this.getManagedServiceData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getManagedServiceData() == null) ? 0 : getManagedServiceData().hashCode());
        return hashCode;
    }

    @Override
    public SecurityServicePolicyData clone() {
        try {
            return (SecurityServicePolicyData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.SecurityServicePolicyDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
