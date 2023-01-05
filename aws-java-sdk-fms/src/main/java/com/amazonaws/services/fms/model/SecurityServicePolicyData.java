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
     * either an WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall
     * Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting Amazon Web Services Support.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>DNS_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     * </p>
     * <note>
     * <p>
     * Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     * <code>postProcessRuleGroups</code> are between 9901 and 10000.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     * </p>
     * <p>
     * To use the centralized deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>CENTRALIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to create the
     * endpoints in. To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * With custom Availability Zone configuration, you define which specific Availability Zones to create endpoints in
     * by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     * <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     * <code>availabilityZoneId</code> parameter, not both parameters.
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * and route management
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     * </p>
     * <p>
     * <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     * </p>
     * <p>
     * Firewall Manager automatically distributes tags from the primary group to the security groups created by this
     * policy. To use security group tag distribution, you must also set <code>revertManualSecurityGroupChanges</code>
     * to <code>true</code>, otherwise Firewall Manager won't be able to create the policy. When you enable
     * <code>revertManualSecurityGroupChanges</code>, Firewall Manager identifies and reports when the security groups
     * created by this policy become non-compliant.
     * </p>
     * <p>
     * Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica security
     * groups. System tags begin with the <code>aws:</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs that the
     * account owns
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     * <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     * </p>
     * <p>
     * For example:
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     * </p>
     * <p>
     * The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     * <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     * <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is <code>false</code>.
     * </p>
     * <p>
     * For other resource types that you can protect with a Shield Advanced policy, this <code>ManagedServiceData</code>
     * configuration is an empty string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     * optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     * <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like to use.
     * If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit <code>versionEnabled</code>,
     * then Firewall Manager uses the default version of the WAF managed rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAF Classic</code>
     * </p>
     * <p>
     * <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String managedServiceData;
    /**
     * <p>
     * Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     * </p>
     */
    private PolicyOption policyOption;

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall
     * Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting Amazon Web Services Support.
     * </p>
     * 
     * @param type
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either an WAF policy, a Shield Advanced policy, or a security group policy. For security group
     *        policies, Firewall Manager supports one security group for each common policy and for each content audit
     *        policy. This is an adjustable limit that you can increase by contacting Amazon Web Services Support.
     * @see SecurityServiceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall
     * Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting Amazon Web Services Support.
     * </p>
     * 
     * @return The service that the policy is using to protect the resources. This specifies the type of policy that is
     *         created, either an WAF policy, a Shield Advanced policy, or a security group policy. For security group
     *         policies, Firewall Manager supports one security group for each common policy and for each content audit
     *         policy. This is an adjustable limit that you can increase by contacting Amazon Web Services Support.
     * @see SecurityServiceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either an WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall
     * Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting Amazon Web Services Support.
     * </p>
     * 
     * @param type
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either an WAF policy, a Shield Advanced policy, or a security group policy. For security group
     *        policies, Firewall Manager supports one security group for each common policy and for each content audit
     *        policy. This is an adjustable limit that you can increase by contacting Amazon Web Services Support.
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
     * either an WAF policy, a Shield Advanced policy, or a security group policy. For security group policies, Firewall
     * Manager supports one security group for each common policy and for each content audit policy. This is an
     * adjustable limit that you can increase by contacting Amazon Web Services Support.
     * </p>
     * 
     * @param type
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either an WAF policy, a Shield Advanced policy, or a security group policy. For security group
     *        policies, Firewall Manager supports one security group for each common policy and for each content audit
     *        policy. This is an adjustable limit that you can increase by contacting Amazon Web Services Support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public SecurityServicePolicyData withType(SecurityServiceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>DNS_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     * </p>
     * <note>
     * <p>
     * Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     * <code>postProcessRuleGroups</code> are between 9901 and 10000.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     * </p>
     * <p>
     * To use the centralized deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>CENTRALIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to create the
     * endpoints in. To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * With custom Availability Zone configuration, you define which specific Availability Zones to create endpoints in
     * by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     * <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     * <code>availabilityZoneId</code> parameter, not both parameters.
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * and route management
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     * </p>
     * <p>
     * <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     * </p>
     * <p>
     * Firewall Manager automatically distributes tags from the primary group to the security groups created by this
     * policy. To use security group tag distribution, you must also set <code>revertManualSecurityGroupChanges</code>
     * to <code>true</code>, otherwise Firewall Manager won't be able to create the policy. When you enable
     * <code>revertManualSecurityGroupChanges</code>, Firewall Manager identifies and reports when the security groups
     * created by this policy become non-compliant.
     * </p>
     * <p>
     * Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica security
     * groups. System tags begin with the <code>aws:</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs that the
     * account owns
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     * <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     * </p>
     * <p>
     * For example:
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     * </p>
     * <p>
     * The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     * <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     * <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is <code>false</code>.
     * </p>
     * <p>
     * For other resource types that you can protect with a Shield Advanced policy, this <code>ManagedServiceData</code>
     * configuration is an empty string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     * optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     * <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like to use.
     * If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit <code>versionEnabled</code>,
     * then Firewall Manager uses the default version of the WAF managed rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAF Classic</code>
     * </p>
     * <p>
     * <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedServiceData
     *        Details about the service that are specific to the service type, in JSON format. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example: <code>DNS_FIREWALL</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     *        </p>
     *        <note>
     *        <p>
     *        Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     *        <code>postProcessRuleGroups</code> are between 9901 and 10000.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     *        </p>
     *        <p>
     *        To use the centralized deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>CENTRALIZED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     *        configuration
     *        </p>
     *        <p>
     *        <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     *        </p>
     *        <p>
     *        With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to create
     *        the endpoints in. To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     *        configuration and route management
     *        </p>
     *        <p>
     *        <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     *        </p>
     *        <p>
     *        To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone
     *        configuration
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     *        </p>
     *        <p>
     *        With custom Availability Zone configuration, you define which specific Availability Zones to create
     *        endpoints in by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     *        <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     *        <code>availabilityZoneId</code> parameter, not both parameters.
     *        </p>
     *        <p>
     *        To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone
     *        configuration and route management
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     *        </p>
     *        <p>
     *        To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>THIRD_PARTY_FIREWALL</code>
     *        </p>
     *        <p>
     *        <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_COMMON</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     *        </p>
     *        <p>
     *        <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     *        </p>
     *        <p>
     *        Firewall Manager automatically distributes tags from the primary group to the security groups created by
     *        this policy. To use security group tag distribution, you must also set
     *        <code>revertManualSecurityGroupChanges</code> to <code>true</code>, otherwise Firewall Manager won't be
     *        able to create the policy. When you enable <code>revertManualSecurityGroupChanges</code>, Firewall Manager
     *        identifies and reports when the security groups created by this policy become non-compliant.
     *        </p>
     *        <p>
     *        Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica
     *        security groups. System tags begin with the <code>aws:</code> prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs
     *        that the account owns
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     *        <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     *        </p>
     *        <p>
     *        For example:
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     *        </p>
     *        <p>
     *        The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     *        <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     *        <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        For other resource types that you can protect with a Shield Advanced policy, this
     *        <code>ManagedServiceData</code> configuration is an empty string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     *        </p>
     *        <p>
     *        In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     *        optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be
     *        one of <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     *        </p>
     *        <p>
     *        To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     *        <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like
     *        to use. If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit
     *        <code>versionEnabled</code>, then Firewall Manager uses the default version of the WAF managed rule group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAF Classic</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     *        </p>
     *        </li>
     */

    public void setManagedServiceData(String managedServiceData) {
        this.managedServiceData = managedServiceData;
    }

    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>DNS_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     * </p>
     * <note>
     * <p>
     * Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     * <code>postProcessRuleGroups</code> are between 9901 and 10000.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     * </p>
     * <p>
     * To use the centralized deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>CENTRALIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to create the
     * endpoints in. To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * With custom Availability Zone configuration, you define which specific Availability Zones to create endpoints in
     * by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     * <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     * <code>availabilityZoneId</code> parameter, not both parameters.
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * and route management
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     * </p>
     * <p>
     * <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     * </p>
     * <p>
     * Firewall Manager automatically distributes tags from the primary group to the security groups created by this
     * policy. To use security group tag distribution, you must also set <code>revertManualSecurityGroupChanges</code>
     * to <code>true</code>, otherwise Firewall Manager won't be able to create the policy. When you enable
     * <code>revertManualSecurityGroupChanges</code>, Firewall Manager identifies and reports when the security groups
     * created by this policy become non-compliant.
     * </p>
     * <p>
     * Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica security
     * groups. System tags begin with the <code>aws:</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs that the
     * account owns
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     * <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     * </p>
     * <p>
     * For example:
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     * </p>
     * <p>
     * The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     * <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     * <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is <code>false</code>.
     * </p>
     * <p>
     * For other resource types that you can protect with a Shield Advanced policy, this <code>ManagedServiceData</code>
     * configuration is an empty string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     * optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     * <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like to use.
     * If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit <code>versionEnabled</code>,
     * then Firewall Manager uses the default version of the WAF managed rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAF Classic</code>
     * </p>
     * <p>
     * <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Details about the service that are specific to the service type, in JSON format. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Example: <code>DNS_FIREWALL</code>
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     *         </p>
     *         <note>
     *         <p>
     *         Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     *         <code>postProcessRuleGroups</code> are between 9901 and 10000.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     *         </p>
     *         <p>
     *         To use the centralized deployment model, you must set <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *         <code>CENTRALIZED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     *         configuration
     *         </p>
     *         <p>
     *         <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     *         </p>
     *         <p>
     *         With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to
     *         create the endpoints in. To use the distributed deployment model, you must set <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *         <code>NULL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     *         configuration and route management
     *         </p>
     *         <p>
     *         <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     *         </p>
     *         <p>
     *         To use the distributed deployment model, you must set <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *         <code>NULL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone
     *         configuration
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     *         </p>
     *         <p>
     *         With custom Availability Zone configuration, you define which specific Availability Zones to create
     *         endpoints in by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     *         <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     *         <code>availabilityZoneId</code> parameter, not both parameters.
     *         </p>
     *         <p>
     *         To use the distributed deployment model, you must set <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *         <code>NULL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone
     *         configuration and route management
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     *         </p>
     *         <p>
     *         To use the distributed deployment model, you must set <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *         <code>NULL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>THIRD_PARTY_FIREWALL</code>
     *         </p>
     *         <p>
     *         <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>SECURITY_GROUPS_COMMON</code>
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     *         </p>
     *         <p>
     *         <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     *         </p>
     *         <p>
     *         Firewall Manager automatically distributes tags from the primary group to the security groups created by
     *         this policy. To use security group tag distribution, you must also set
     *         <code>revertManualSecurityGroupChanges</code> to <code>true</code>, otherwise Firewall Manager won't be
     *         able to create the policy. When you enable <code>revertManualSecurityGroupChanges</code>, Firewall
     *         Manager identifies and reports when the security groups created by this policy become non-compliant.
     *         </p>
     *         <p>
     *         Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica
     *         security groups. System tags begin with the <code>aws:</code> prefix.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs
     *         that the account owns
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     *         <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     *         </p>
     *         <p>
     *         For example:
     *         <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     *         </p>
     *         <p>
     *         The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     *         <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     *         <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         For other resource types that you can protect with a Shield Advanced policy, this
     *         <code>ManagedServiceData</code> configuration is an empty string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>WAFV2</code>
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     *         </p>
     *         <p>
     *         In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     *         optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be
     *         one of <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     *         </p>
     *         <p>
     *         To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     *         <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like
     *         to use. If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit
     *         <code>versionEnabled</code>, then Firewall Manager uses the default version of the WAF managed rule
     *         group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>WAF Classic</code>
     *         </p>
     *         <p>
     *         <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     *         </p>
     *         </li>
     */

    public String getManagedServiceData() {
        return this.managedServiceData;
    }

    /**
     * <p>
     * Details about the service that are specific to the service type, in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Example: <code>DNS_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     * </p>
     * <note>
     * <p>
     * Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     * <code>postProcessRuleGroups</code> are between 9901 and 10000.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     * </p>
     * <p>
     * To use the centralized deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>CENTRALIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to create the
     * endpoints in. To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     * configuration and route management
     * </p>
     * <p>
     * <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * With custom Availability Zone configuration, you define which specific Availability Zones to create endpoints in
     * by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     * <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     * <code>availabilityZoneId</code> parameter, not both parameters.
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone configuration
     * and route management
     * </p>
     * <p>
     * <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     * </p>
     * <p>
     * To use the distributed deployment model, you must set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     * </p>
     * <p>
     * <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     * </p>
     * <p>
     * Firewall Manager automatically distributes tags from the primary group to the security groups created by this
     * policy. To use security group tag distribution, you must also set <code>revertManualSecurityGroupChanges</code>
     * to <code>true</code>, otherwise Firewall Manager won't be able to create the policy. When you enable
     * <code>revertManualSecurityGroupChanges</code>, Firewall Manager identifies and reports when the security groups
     * created by this policy become non-compliant.
     * </p>
     * <p>
     * Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica security
     * groups. System tags begin with the <code>aws:</code> prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs that the
     * account owns
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     * <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     * </p>
     * <p>
     * For example:
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     * </p>
     * <p>
     * The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     * <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     * <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is <code>false</code>.
     * </p>
     * <p>
     * For other resource types that you can protect with a Shield Advanced policy, this <code>ManagedServiceData</code>
     * configuration is an empty string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     * optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     * </p>
     * <p>
     * To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     * <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like to use.
     * If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit <code>versionEnabled</code>,
     * then Firewall Manager uses the default version of the WAF managed rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAF Classic</code>
     * </p>
     * <p>
     * <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedServiceData
     *        Details about the service that are specific to the service type, in JSON format. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Example: <code>DNS_FIREWALL</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"DNS_FIREWALL\",\"preProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-1\",\"priority\":10}],\"postProcessRuleGroups\":[{\"ruleGroupId\":\"rslvr-frg-2\",\"priority\":9911}]}"</code>
     *        </p>
     *        <note>
     *        <p>
     *        Valid values for <code>preProcessRuleGroups</code> are between 1 and 99. Valid values for
     *        <code>postProcessRuleGroups</code> are between 9901 and 10000.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Centralized deployment model
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}},\"firewallDeploymentModel\":{\"centralizedFirewallDeploymentModel\":{\"centralizedFirewallOrchestrationConfig\":{\"inspectionVpcIds\":[{\"resourceId\":\"vpc-1234\",\"accountId\":\"123456789011\"}],\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneId\":null,\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"allowedIPV4CidrList\":[]}}}}"</code>
     *        </p>
     *        <p>
     *        To use the centralized deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>CENTRALIZED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     *        configuration
     *        </p>
     *        <p>
     *        <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"OFF\"},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     *        </p>
     *        <p>
     *        With automatic Availbility Zone configuration, Firewall Manager chooses which Availability Zones to create
     *        the endpoints in. To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with automatic Availability Zone
     *        configuration and route management
     *        </p>
     *        <p>
     *        <code> "{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":[\"10.0.0.0/28\",\"192.168.0.0/28\"],\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"]},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\": \"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":true}}" </code>
     *        </p>
     *        <p>
     *        To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone
     *        configuration
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\", \"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{ \"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[ \"10.0.0.0/28\"]}]} },\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"OFF\",\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     *        </p>
     *        <p>
     *        With custom Availability Zone configuration, you define which specific Availability Zones to create
     *        endpoints in by configuring <code>firewallCreationConfig</code>. To configure the Availability Zones in
     *        <code>firewallCreationConfig</code>, specify either the <code>availabilityZoneName</code> or
     *        <code>availabilityZoneId</code> parameter, not both parameters.
     *        </p>
     *        <p>
     *        To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>NETWORK_FIREWALL</code> - Distributed deployment model with custom Availability Zone
     *        configuration and route management
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"NETWORK_FIREWALL\",\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateless-rulegroup/test\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:forward_to_sfe\",\"customActionName\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:forward_to_sfe\",\"fragmentcustomactionname\"],\"networkFirewallStatelessCustomActions\":[{\"actionName\":\"customActionName\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"metricdimensionvalue\"}]}}},{\"actionName\":\"fragmentcustomactionname\",\"actionDefinition\":{\"publishMetricAction\":{\"dimensions\":[{\"value\":\"fragmentmetricdimensionvalue\"}]}}}],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-east-1:123456789011:stateful-rulegroup/test\"}],\"networkFirewallOrchestrationConfig\":{\"firewallCreationConfig\":{\"endpointLocation\":{\"availabilityZoneConfigList\":[{\"availabilityZoneName\":\"us-east-1a\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]},{\"availabilityZoneName\":\"us-east-1b\",\"allowedIPV4CidrList\":[\"10.0.0.0/28\"]}]}},\"singleFirewallEndpointPerVPC\":false,\"allowedIPV4CidrList\":null,\"routeManagementAction\":\"MONITOR\",\"routeManagementTargetTypes\":[\"InternetGateway\"],\"routeManagementConfig\":{\"allowCrossAZTrafficIfNoEndpoint\":true}},\"networkFirewallLoggingConfiguration\":{\"logDestinationConfigs\":[{\"logDestinationType\":\"S3\",\"logType\":\"ALERT\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}},{\"logDestinationType\":\"S3\",\"logType\":\"FLOW\",\"logDestination\":{\"bucketName\":\"s3-bucket-name\"}}],\"overrideExistingConfig\":boolean}}" </code>
     *        </p>
     *        <p>
     *        To use the distributed deployment model, you must set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>THIRD_PARTY_FIREWALL</code>
     *        </p>
     *        <p>
     *        <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"PALO_ALTO_NETWORKS_CLOUD_NGFW", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_COMMON</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_COMMON</code> - Security group tag distribution
     *        </p>
     *        <p>
     *        <code>""{\"type\":\"SECURITY_GROUPS_COMMON\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"revertManualSecurityGroupChanges\":true,\"exclusiveResourceSecurityGroupManagement\":false,\"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":false,\"enableTagDistribution\":true}""</code>
     *        </p>
     *        <p>
     *        Firewall Manager automatically distributes tags from the primary group to the security groups created by
     *        this policy. To use security group tag distribution, you must also set
     *        <code>revertManualSecurityGroupChanges</code> to <code>true</code>, otherwise Firewall Manager won't be
     *        able to create the policy. When you enable <code>revertManualSecurityGroupChanges</code>, Firewall Manager
     *        identifies and reports when the security groups created by this policy become non-compliant.
     *        </p>
     *        <p>
     *        Firewall Manager won't distrubute system tags added by Amazon Web Services services into the replica
     *        security groups. System tags begin with the <code>aws:</code> prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: Shared VPCs. Apply the preceding policy to resources in shared VPCs as well as to those in VPCs
     *        that the account owns
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SECURITY_GROUPS_COMMON\",\"revertManualSecurityGroupChanges\":false,\"exclusiveResourceSecurityGroupManagement\":false, \"applyToAllEC2InstanceENIs\":false,\"includeSharedVPC\":true,\"securityGroups\":[{\"id\":\" sg-000e55995d61a06bd\"}]}"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>SECURITY_GROUPS_CONTENT_AUDIT</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SECURITY_GROUPS_CONTENT_AUDIT\",\"securityGroups\":[{\"id\":\"sg-000e55995d61a06bd\"}],\"securityGroupAction\":{\"type\":\"ALLOW\"}}"</code>
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
     *        <code>"{\"type\":\"SECURITY_GROUPS_USAGE_AUDIT\",\"deleteUnusedSecurityGroups\":true,\"coalesceRedundantSecurityGroups\":true}"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false}"</code>
     *        </p>
     *        <p>
     *        For example:
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED\", \"automaticResponseAction\":\"COUNT\"}}"</code>
     *        </p>
     *        <p>
     *        The default value for <code>automaticResponseStatus</code> is <code>IGNORED</code>. The value for
     *        <code>automaticResponseAction</code> is only required when <code>automaticResponseStatus</code> is set to
     *        <code>ENABLED</code>. The default value for <code>overrideCustomerWebaclClassic</code> is
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        For other resource types that you can protect with a Shield Advanced policy, this
     *        <code>ManagedServiceData</code> configuration is an empty string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAmazonIpReputationList\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     *        </p>
     *        <p>
     *        In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>, you can
     *        optionally provide up to 20 <code>redactedFields</code>, and the <code>RedactedFieldType</code> must be
     *        one of <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code> - Firewall Manager support for WAF managed rule group versioning
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":true,\"version\":\"Version_2.0\",\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesCommonRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[{\"name\":\"NoUserAgent_HEADER\"}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":{\"logDestinationConfigs\":[\"arn:aws:firehose:us-west-2:12345678912:deliverystream/aws-waf-logs-fms-admin-destination\"],\"redactedFields\":[{\"redactedFieldType\":\"SingleHeader\",\"redactedFieldValue\":\"Cookies\"},{\"redactedFieldType\":\"Method\"}]}}"</code>
     *        </p>
     *        <p>
     *        To use a specific version of a WAF managed rule group in your Firewall Manager policy, you must set
     *        <code>versionEnabled</code> to <code>true</code>, and set <code>version</code> to the version you'd like
     *        to use. If you don't set <code>versionEnabled</code> to <code>true</code>, or if you omit
     *        <code>versionEnabled</code>, then Firewall Manager uses the default version of the WAF managed rule group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAF Classic</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\": \"WAF\", \"ruleGroups\": [{\"id\":\"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityServicePolicyData withManagedServiceData(String managedServiceData) {
        setManagedServiceData(managedServiceData);
        return this;
    }

    /**
     * <p>
     * Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     * </p>
     * 
     * @param policyOption
     *        Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     */

    public void setPolicyOption(PolicyOption policyOption) {
        this.policyOption = policyOption;
    }

    /**
     * <p>
     * Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     * </p>
     * 
     * @return Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     */

    public PolicyOption getPolicyOption() {
        return this.policyOption;
    }

    /**
     * <p>
     * Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     * </p>
     * 
     * @param policyOption
     *        Contains the Network Firewall firewall policy options to configure a centralized deployment model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityServicePolicyData withPolicyOption(PolicyOption policyOption) {
        setPolicyOption(policyOption);
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
            sb.append("ManagedServiceData: ").append(getManagedServiceData()).append(",");
        if (getPolicyOption() != null)
            sb.append("PolicyOption: ").append(getPolicyOption());
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
        if (other.getPolicyOption() == null ^ this.getPolicyOption() == null)
            return false;
        if (other.getPolicyOption() != null && other.getPolicyOption().equals(this.getPolicyOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getManagedServiceData() == null) ? 0 : getManagedServiceData().hashCode());
        hashCode = prime * hashCode + ((getPolicyOption() == null) ? 0 : getPolicyOption().hashCode());
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
