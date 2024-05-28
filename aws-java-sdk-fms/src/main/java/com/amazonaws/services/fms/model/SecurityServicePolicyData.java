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
     * Example: <code>IMPORT_NETWORK_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     * Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica security
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
     * Example: <code>SHIELD_ADVANCED</code> with web ACL management
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web ACLs in
     * accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall Manager creates
     * web ACLs in the accounts within policy scope only if the web ACLs will be used by at least one resource. If at
     * any time an account comes into policy scope, Firewall Manager automatically creates a web ACL in the account if
     * at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall Manager to clean up the
     * web ACL, you must first manually disassociate the resources from the web ACL, and then enable the manage unused
     * web ACLs option in your policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager automatically
     * creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize unassociated
     * web ACL, and rule action override
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html">
     * AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fraud Control account takeover prevention (ATP) - For information about the properties available for
     * <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     * >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall
     * Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at least one
     * resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used
     * by at least one resource. If at any time an account comes into policy scope, Firewall Manager automatically
     * creates a web ACL in the account if at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused web ACL. Firewall
     * Manager only cleans up unused web ACLs when you first enable management of unused web ACLs in a policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage unused
     * web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     * configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     * <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule action
     * override, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html">RuleActionOverride</a> in
     * the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     * <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     * <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new value(s).
     * However, if you don't update the policy's <code>associationConfig</code>, <code>captchaConfig</code>,
     * <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values in your local web ACLs will remain
     * unchanged. For information about association configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html">AssociationConfig</a>. For
     * information about CAPTCHA and Challenge configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a> in the
     * <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component that an
     * associated Amazon CloudFront distribution should send to WAF for inspection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     * >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
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
     * Example: <code>WAFV2</code> - Logging configurations
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     * </p>
     * <p>
     * Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the <code>logDestinationConfigs</code> in
     * your <code>loggingConfiguration</code>. For information about WAF logging configurations, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html">LoggingConfiguration</a>
     * in the <i>WAF API Reference</i>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>. Optionally
     * provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     * Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment model, or
     * a third-party firewall policy.
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
     * Example: <code>IMPORT_NETWORK_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     * Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica security
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
     * Example: <code>SHIELD_ADVANCED</code> with web ACL management
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web ACLs in
     * accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall Manager creates
     * web ACLs in the accounts within policy scope only if the web ACLs will be used by at least one resource. If at
     * any time an account comes into policy scope, Firewall Manager automatically creates a web ACL in the account if
     * at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall Manager to clean up the
     * web ACL, you must first manually disassociate the resources from the web ACL, and then enable the manage unused
     * web ACLs option in your policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager automatically
     * creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize unassociated
     * web ACL, and rule action override
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html">
     * AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fraud Control account takeover prevention (ATP) - For information about the properties available for
     * <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     * >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall
     * Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at least one
     * resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used
     * by at least one resource. If at any time an account comes into policy scope, Firewall Manager automatically
     * creates a web ACL in the account if at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused web ACL. Firewall
     * Manager only cleans up unused web ACLs when you first enable management of unused web ACLs in a policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage unused
     * web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     * configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     * <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule action
     * override, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html">RuleActionOverride</a> in
     * the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     * <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     * <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new value(s).
     * However, if you don't update the policy's <code>associationConfig</code>, <code>captchaConfig</code>,
     * <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values in your local web ACLs will remain
     * unchanged. For information about association configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html">AssociationConfig</a>. For
     * information about CAPTCHA and Challenge configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a> in the
     * <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component that an
     * associated Amazon CloudFront distribution should send to WAF for inspection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     * >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
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
     * Example: <code>WAFV2</code> - Logging configurations
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     * </p>
     * <p>
     * Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the <code>logDestinationConfigs</code> in
     * your <code>loggingConfiguration</code>. For information about WAF logging configurations, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html">LoggingConfiguration</a>
     * in the <i>WAF API Reference</i>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>. Optionally
     * provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     *        Example: <code>IMPORT_NETWORK_FIREWALL</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     *        Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica
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
     *        Example: <code>SHIELD_ADVANCED</code> with web ACL management
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     *        </p>
     *        <p>
     *        If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web ACLs
     *        in accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall
     *        Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used by at least
     *        one resource. If at any time an account comes into policy scope, Firewall Manager automatically creates a
     *        web ACL in the account if at least one resource will use the web ACL.
     *        </p>
     *        <p>
     *        Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The
     *        cleanup process can take several hours. If a resource leaves policy scope after Firewall Manager creates a
     *        web ACL, Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall Manager
     *        to clean up the web ACL, you must first manually disassociate the resources from the web ACL, and then
     *        enable the manage unused web ACLs option in your policy.
     *        </p>
     *        <p>
     *        If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager
     *        automatically creates an empty web ACL in each account that's within policy scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     *        Example: <code>THIRD_PARTY_FIREWALL</code>
     *        </p>
     *        <p>
     *        Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     *        </p>
     *        <p>
     *        <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize
     *        unassociated web ACL, and rule action override
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups, see
     *        <a href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html">
     *        AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Fraud Control account takeover prevention (ATP) - For information about the properties available for
     *        <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     *        >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>,
     *        Firewall Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at
     *        least one resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web
     *        ACLs will be used by at least one resource. If at any time an account comes into policy scope, Firewall
     *        Manager automatically creates a web ACL in the account if at least one resource will use the web ACL.
     *        </p>
     *        <p>
     *        Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The
     *        cleanup process can take several hours. If a resource leaves policy scope after Firewall Manager creates a
     *        web ACL, Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused web
     *        ACL. Firewall Manager only cleans up unused web ACLs when you first enable management of unused web ACLs
     *        in a policy.
     *        </p>
     *        <p>
     *        If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage
     *        unused web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's within
     *        policy scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     *        configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     *        <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule
     *        action override, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html"
     *        >RuleActionOverride</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     *        <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     *        <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new
     *        value(s). However, if you don't update the policy's <code>associationConfig</code>,
     *        <code>captchaConfig</code>, <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values
     *        in your local web ACLs will remain unchanged. For information about association configs, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html"
     *        >AssociationConfig</a>. For information about CAPTCHA and Challenge configs, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a> in
     *        the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component
     *        that an associated Amazon CloudFront distribution should send to WAF for inspection. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     *        >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
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
     *        Example: <code>WAFV2</code> - Logging configurations
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     *        </p>
     *        <p>
     *        Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the
     *        <code>logDestinationConfigs</code> in your <code>loggingConfiguration</code>. For information about WAF
     *        logging configurations, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html"
     *        >LoggingConfiguration</a> in the <i>WAF API Reference</i>
     *        </p>
     *        <p>
     *        In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>.
     *        Optionally provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be
     *        one of <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     * Example: <code>IMPORT_NETWORK_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     * Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica security
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
     * Example: <code>SHIELD_ADVANCED</code> with web ACL management
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web ACLs in
     * accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall Manager creates
     * web ACLs in the accounts within policy scope only if the web ACLs will be used by at least one resource. If at
     * any time an account comes into policy scope, Firewall Manager automatically creates a web ACL in the account if
     * at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall Manager to clean up the
     * web ACL, you must first manually disassociate the resources from the web ACL, and then enable the manage unused
     * web ACLs option in your policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager automatically
     * creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize unassociated
     * web ACL, and rule action override
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html">
     * AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fraud Control account takeover prevention (ATP) - For information about the properties available for
     * <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     * >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall
     * Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at least one
     * resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used
     * by at least one resource. If at any time an account comes into policy scope, Firewall Manager automatically
     * creates a web ACL in the account if at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused web ACL. Firewall
     * Manager only cleans up unused web ACLs when you first enable management of unused web ACLs in a policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage unused
     * web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     * configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     * <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule action
     * override, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html">RuleActionOverride</a> in
     * the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     * <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     * <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new value(s).
     * However, if you don't update the policy's <code>associationConfig</code>, <code>captchaConfig</code>,
     * <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values in your local web ACLs will remain
     * unchanged. For information about association configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html">AssociationConfig</a>. For
     * information about CAPTCHA and Challenge configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a> in the
     * <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component that an
     * associated Amazon CloudFront distribution should send to WAF for inspection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     * >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
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
     * Example: <code>WAFV2</code> - Logging configurations
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     * </p>
     * <p>
     * Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the <code>logDestinationConfigs</code> in
     * your <code>loggingConfiguration</code>. For information about WAF logging configurations, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html">LoggingConfiguration</a>
     * in the <i>WAF API Reference</i>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>. Optionally
     * provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     *         Example: <code>IMPORT_NETWORK_FIREWALL</code>
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     *         Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica
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
     *         Example: <code>SHIELD_ADVANCED</code> with web ACL management
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     *         </p>
     *         <p>
     *         If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web
     *         ACLs in accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall
     *         Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used by at
     *         least one resource. If at any time an account comes into policy scope, Firewall Manager automatically
     *         creates a web ACL in the account if at least one resource will use the web ACL.
     *         </p>
     *         <p>
     *         Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The
     *         cleanup process can take several hours. If a resource leaves policy scope after Firewall Manager creates
     *         a web ACL, Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall
     *         Manager to clean up the web ACL, you must first manually disassociate the resources from the web ACL, and
     *         then enable the manage unused web ACLs option in your policy.
     *         </p>
     *         <p>
     *         If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager
     *         automatically creates an empty web ACL in each account that's within policy scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     *         Example: <code>THIRD_PARTY_FIREWALL</code>
     *         </p>
     *         <p>
     *         Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     *         </p>
     *         <p>
     *         <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize
     *         unassociated web ACL, and rule action override
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups,
     *         see <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html"
     *         >AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Fraud Control account takeover prevention (ATP) - For information about the properties available for
     *         <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     *         >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>,
     *         Firewall Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at
     *         least one resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web
     *         ACLs will be used by at least one resource. If at any time an account comes into policy scope, Firewall
     *         Manager automatically creates a web ACL in the account if at least one resource will use the web ACL.
     *         </p>
     *         <p>
     *         Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The
     *         cleanup process can take several hours. If a resource leaves policy scope after Firewall Manager creates
     *         a web ACL, Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused
     *         web ACL. Firewall Manager only cleans up unused web ACLs when you first enable management of unused web
     *         ACLs in a policy.
     *         </p>
     *         <p>
     *         If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage
     *         unused web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's
     *         within policy scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     *         configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     *         <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule
     *         action override, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html"
     *         >RuleActionOverride</a> in the <i>WAF API Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     *         <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     *         <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new
     *         value(s). However, if you don't update the policy's <code>associationConfig</code>,
     *         <code>captchaConfig</code>, <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values
     *         in your local web ACLs will remain unchanged. For information about association configs, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html"
     *         >AssociationConfig</a>. For information about CAPTCHA and Challenge configs, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and
     *         <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a>
     *         in the <i>WAF API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component
     *         that an associated Amazon CloudFront distribution should send to WAF for inspection. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     *         >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
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
     *         Example: <code>WAFV2</code> - Logging configurations
     *         </p>
     *         <p>
     *         <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     *         </p>
     *         <p>
     *         Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the
     *         <code>logDestinationConfigs</code> in your <code>loggingConfiguration</code>. For information about WAF
     *         logging configurations, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html"
     *         >LoggingConfiguration</a> in the <i>WAF API Reference</i>
     *         </p>
     *         <p>
     *         In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>.
     *         Optionally provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be
     *         one of <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     * Example: <code>IMPORT_NETWORK_FIREWALL</code>
     * </p>
     * <p>
     * <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     * Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica security
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
     * Example: <code>SHIELD_ADVANCED</code> with web ACL management
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web ACLs in
     * accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall Manager creates
     * web ACLs in the accounts within policy scope only if the web ACLs will be used by at least one resource. If at
     * any time an account comes into policy scope, Firewall Manager automatically creates a web ACL in the account if
     * at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall Manager to clean up the
     * web ACL, you must first manually disassociate the resources from the web ACL, and then enable the manage unused
     * web ACLs option in your policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager automatically
     * creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     * </p>
     * <p>
     * <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     * Example: <code>THIRD_PARTY_FIREWALL</code>
     * </p>
     * <p>
     * Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     * </p>
     * <p>
     * <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize unassociated
     * web ACL, and rule action override
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html">
     * AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fraud Control account takeover prevention (ATP) - For information about the properties available for
     * <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     * >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall
     * Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at least one
     * resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used
     * by at least one resource. If at any time an account comes into policy scope, Firewall Manager automatically
     * creates a web ACL in the account if at least one resource will use the web ACL.
     * </p>
     * <p>
     * Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The cleanup
     * process can take several hours. If a resource leaves policy scope after Firewall Manager creates a web ACL,
     * Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused web ACL. Firewall
     * Manager only cleans up unused web ACLs when you first enable management of unused web ACLs in a policy.
     * </p>
     * <p>
     * If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage unused
     * web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's within policy scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     * configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     * <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule action
     * override, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html">RuleActionOverride</a> in
     * the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     * <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     * <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new value(s).
     * However, if you don't update the policy's <code>associationConfig</code>, <code>captchaConfig</code>,
     * <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values in your local web ACLs will remain
     * unchanged. For information about association configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html">AssociationConfig</a>. For
     * information about CAPTCHA and Challenge configs, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a> in the
     * <i>WAF API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component that an
     * associated Amazon CloudFront distribution should send to WAF for inspection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     * >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     * </p>
     * </li>
     * </ul>
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
     * Example: <code>WAFV2</code> - Logging configurations
     * </p>
     * <p>
     * <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     * </p>
     * <p>
     * Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the <code>logDestinationConfigs</code> in
     * your <code>loggingConfiguration</code>. For information about WAF logging configurations, see <a
     * href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html">LoggingConfiguration</a>
     * in the <i>WAF API Reference</i>
     * </p>
     * <p>
     * In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>. Optionally
     * provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be one of
     * <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     *        Example: <code>IMPORT_NETWORK_FIREWALL</code>
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"IMPORT_NETWORK_FIREWALL\",\"awsNetworkFirewallConfig\":{\"networkFirewallStatelessRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:000000000000:stateless-rulegroup\/rg1\",\"priority\":1}],\"networkFirewallStatelessDefaultActions\":[\"aws:drop\"],\"networkFirewallStatelessFragmentDefaultActions\":[\"aws:pass\"],\"networkFirewallStatelessCustomActions\":[],\"networkFirewallStatefulRuleGroupReferences\":[{\"resourceARN\":\"arn:aws:network-firewall:us-west-2:aws-managed:stateful-rulegroup\/ThreatSignaturesEmergingEventsStrictOrder\",\"priority\":8}],\"networkFirewallStatefulEngineOptions\":{\"ruleOrder\":\"STRICT_ORDER\"},\"networkFirewallStatefulDefaultActions\":[\"aws:drop_strict\"]}}"</code>
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
     *        Firewall Manager won't distribute system tags added by Amazon Web Services services into the replica
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
     *        Example: <code>SHIELD_ADVANCED</code> with web ACL management
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"optimizeUnassociatedWebACL\":true}"</code>
     *        </p>
     *        <p>
     *        If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>, Firewall Manager creates web ACLs
     *        in accounts within the policy scope if the web ACLs will be used by at least one resource. Firewall
     *        Manager creates web ACLs in the accounts within policy scope only if the web ACLs will be used by at least
     *        one resource. If at any time an account comes into policy scope, Firewall Manager automatically creates a
     *        web ACL in the account if at least one resource will use the web ACL.
     *        </p>
     *        <p>
     *        Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The
     *        cleanup process can take several hours. If a resource leaves policy scope after Firewall Manager creates a
     *        web ACL, Firewall Manager doesn't disassociate the resource from the web ACL. If you want Firewall Manager
     *        to clean up the web ACL, you must first manually disassociate the resources from the web ACL, and then
     *        enable the manage unused web ACLs option in your policy.
     *        </p>
     *        <p>
     *        If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code>, and Firewall Manager
     *        automatically creates an empty web ACL in each account that's within policy scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specification for <code>SHIELD_ADVANCED</code> for Amazon CloudFront distributions
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"SHIELD_ADVANCED\",\"automaticResponseConfiguration\": {\"automaticResponseStatus\":\"ENABLED|IGNORED|DISABLED\", \"automaticResponseAction\":\"BLOCK|COUNT\"}, \"overrideCustomerWebaclClassic\":true|false, \"optimizeUnassociatedWebACL\":true|false}"</code>
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
     *        Example: <code>THIRD_PARTY_FIREWALL</code>
     *        </p>
     *        <p>
     *        Replace <code>THIRD_PARTY_FIREWALL_NAME</code> with the name of the third-party firewall.
     *        </p>
     *        <p>
     *        <code>"{ "type":"THIRD_PARTY_FIREWALL", "thirdPartyFirewall":"THIRD_PARTY_FIREWALL_NAME", "thirdPartyFirewallConfig":{ "thirdPartyFirewallPolicyList":["global-1"] }, "firewallDeploymentModel":{ "distributedFirewallDeploymentModel":{ "distributedFirewallOrchestrationConfig":{ "firewallCreationConfig":{ "endpointLocation":{ "availabilityZoneConfigList":[ { "availabilityZoneName":"${AvailabilityZone}" } ] } }, "allowedIPV4CidrList":[ ] } } } }"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code> - Account takeover prevention, Bot Control managed rule groups, optimize
     *        unassociated web ACL, and rule action override
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesATPRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesATPRuleSet\":{\"loginPath\":\"/loginpath\",\"requestInspection\":{\"payloadType\":\"FORM_ENCODED|JSON\",\"usernameField\":{\"identifier\":\"/form/username\"},\"passwordField\":{\"identifier\":\"/form/password\"}}}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true},{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesBotControlRuleSet\",\"managedRuleGroupConfigs\":[{\"awsmanagedRulesBotControlRuleSet\":{\"inspectionLevel\":\"TARGETED|COMMON\"}}]},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true,\"ruleActionOverrides\":[{\"name\":\"Rule1\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}},{\"name\":\"Rule2\",\"actionToUse\":{\"allow|block|count|captcha|challenge\":{}}}]}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"optimizeUnassociatedWebACL\":true}"</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Bot Control - For information about <code>AWSManagedRulesBotControlRuleSet</code> managed rule groups, see
     *        <a href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesBotControlRuleSet.html">
     *        AWSManagedRulesBotControlRuleSet</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Fraud Control account takeover prevention (ATP) - For information about the properties available for
     *        <code>AWSManagedRulesATPRuleSet</code> managed rule groups, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AWSManagedRulesATPRuleSet.html"
     *        >AWSManagedRulesATPRuleSet</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Optimize unassociated web ACL - If you set <code>optimizeUnassociatedWebACL</code> to <code>true</code>,
     *        Firewall Manager creates web ACLs in accounts within the policy scope if the web ACLs will be used by at
     *        least one resource. Firewall Manager creates web ACLs in the accounts within policy scope only if the web
     *        ACLs will be used by at least one resource. If at any time an account comes into policy scope, Firewall
     *        Manager automatically creates a web ACL in the account if at least one resource will use the web ACL.
     *        </p>
     *        <p>
     *        Upon enablement, Firewall Manager performs a one-time cleanup of unused web ACLs in your account. The
     *        cleanup process can take several hours. If a resource leaves policy scope after Firewall Manager creates a
     *        web ACL, Firewall Manager disassociates the resource from the web ACL, but won't clean up the unused web
     *        ACL. Firewall Manager only cleans up unused web ACLs when you first enable management of unused web ACLs
     *        in a policy.
     *        </p>
     *        <p>
     *        If you set <code>optimizeUnassociatedWebACL</code> to <code>false</code> Firewall Manager doesn't manage
     *        unused web ACLs, and Firewall Manager automatically creates an empty web ACL in each account that's within
     *        policy scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rule action overrides - Firewall Manager supports rule action overrides only for managed rule groups. To
     *        configure a <code>RuleActionOverrides</code> add the <code>Name</code> of the rule to override, and
     *        <code>ActionToUse</code>, which is the new action to use for the rule. For information about using rule
     *        action override, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleActionOverride.html"
     *        >RuleActionOverride</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>WAFV2</code> - <code>CAPTCHA</code> and <code>Challenge</code> configs
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null,\"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\":{\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\",\"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"},\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[],\"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[],\"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\":null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\":false,\"loggingConfiguration\":null,\"sampledRequestsEnabledForDefaultActions\":true,\"captchaConfig\":{\"immunityTimeProperty\":{\"immunityTime\":500}},\"challengeConfig\":{\"immunityTimeProperty\":{\"immunityTime\":800}},\"tokenDomains\":[\"google.com\",\"amazon.com\"],\"associationConfig\":{\"requestBody\":{\"CLOUDFRONT\":{\"defaultSizeInspectionLimit\":\"KB_16\"}}}}"</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPTCHA</code> and <code>Challenge</code> configs - If you update the policy's values for
     *        <code>associationConfig</code>, <code>captchaConfig</code>, <code>challengeConfig</code>, or
     *        <code>tokenDomains</code>, Firewall Manager will overwrite your local web ACLs to contain the new
     *        value(s). However, if you don't update the policy's <code>associationConfig</code>,
     *        <code>captchaConfig</code>, <code>challengeConfig</code>, or <code>tokenDomains</code> values, the values
     *        in your local web ACLs will remain unchanged. For information about association configs, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociationConfig.html"
     *        >AssociationConfig</a>. For information about CAPTCHA and Challenge configs, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_CaptchaConfig.html">CaptchaConfig</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_ChallengeConfig.html">ChallengeConfig</a> in
     *        the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>defaultSizeInspectionLimit</code> - Specifies the maximum size of the web request body component
     *        that an associated Amazon CloudFront distribution should send to WAF for inspection. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/waf/latest/APIReference/API_RequestBodyAssociatedResourceTypeConfig.html#WAF-Type-RequestBodyAssociatedResourceTypeConfig-DefaultSizeInspectionLimit"
     *        >DefaultSizeInspectionLimit</a> in the <i>WAF API Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
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
     *        Example: <code>WAFV2</code> - Logging configurations
     *        </p>
     *        <p>
     *        <code>"{\"type\":\"WAFV2\",\"preProcessRuleGroups\":[{\"ruleGroupArn\":null, \"overrideAction\":{\"type\":\"NONE\"},\"managedRuleGroupIdentifier\": {\"versionEnabled\":null,\"version\":null,\"vendorName\":\"AWS\", \"managedRuleGroupName\":\"AWSManagedRulesAdminProtectionRuleSet\"} ,\"ruleGroupType\":\"ManagedRuleGroup\",\"excludeRules\":[], \"sampledRequestsEnabled\":true}],\"postProcessRuleGroups\":[], \"defaultAction\":{\"type\":\"ALLOW\"},\"customRequestHandling\" :null,\"customResponse\":null,\"overrideCustomerWebACLAssociation\" :false,\"loggingConfiguration\":{\"logDestinationConfigs\": [\"arn:aws:s3:::aws-waf-logs-example-bucket\"] ,\"redactedFields\":[],\"loggingFilterConfigs\":{\"defaultBehavior\":\"KEEP\", \"filters\":[{\"behavior\":\"KEEP\",\"requirement\":\"MEETS_ALL\", \"conditions\":[{\"actionCondition\":\"CAPTCHA\"},{\"actionCondition\": \"CHALLENGE\"}, {\"actionCondition\":\"EXCLUDED_AS_COUNT\"}]}]}},\"sampledRequestsEnabledForDefaultActions\":true}"</code>
     *        </p>
     *        <p>
     *        Firewall Manager supports Amazon Kinesis Data Firehose and Amazon S3 as the
     *        <code>logDestinationConfigs</code> in your <code>loggingConfiguration</code>. For information about WAF
     *        logging configurations, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/APIReference/API_LoggingConfiguration.html"
     *        >LoggingConfiguration</a> in the <i>WAF API Reference</i>
     *        </p>
     *        <p>
     *        In the <code>loggingConfiguration</code>, you can specify one <code>logDestinationConfigs</code>.
     *        Optionally provide as many as 20 <code>redactedFields</code>. The <code>RedactedFieldType</code> must be
     *        one of <code>URI</code>, <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
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
     * Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment model, or
     * a third-party firewall policy.
     * </p>
     * 
     * @param policyOption
     *        Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment
     *        model, or a third-party firewall policy.
     */

    public void setPolicyOption(PolicyOption policyOption) {
        this.policyOption = policyOption;
    }

    /**
     * <p>
     * Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment model, or
     * a third-party firewall policy.
     * </p>
     * 
     * @return Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment
     *         model, or a third-party firewall policy.
     */

    public PolicyOption getPolicyOption() {
        return this.policyOption;
    }

    /**
     * <p>
     * Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment model, or
     * a third-party firewall policy.
     * </p>
     * 
     * @param policyOption
     *        Contains the settings to configure a network ACL policy, a Network Firewall firewall policy deployment
     *        model, or a third-party firewall policy.
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
