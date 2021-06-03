/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFirewallRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry failed requests without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The unique identifier of the firewall rule group where you want to create the rule.
     * </p>
     */
    private String firewallRuleGroupId;
    /**
     * <p>
     * The ID of the domain list that you want to use in the rule.
     * </p>
     */
    private String firewallDomainListId;
    /**
     * <p>
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later, leave
     * space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for the
     * rules in a rule group at any time.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     * <code>BlockResponse</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * The way that you want DNS Firewall to block the request, used with the rule action setting <code>BLOCK</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling details
     * in the rule's <code>BlockOverride*</code> settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting is required if the rule action setting is <code>BLOCK</code>.
     * </p>
     */
    private String blockResponse;
    /**
     * <p>
     * The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code> with a
     * <code>BlockResponse</code> setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     */
    private String blockOverrideDomain;
    /**
     * <p>
     * The DNS record's type. This determines the format of the record value that you provided in
     * <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code>
     * setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     */
    private String blockOverrideDnsType;
    /**
     * <p>
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override
     * record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     * <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     */
    private Integer blockOverrideTtl;
    /**
     * <p>
     * A name that lets you identify the rule in the rule group.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry failed requests without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows you to retry failed requests without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry failed requests without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows you to retry failed requests without the risk
     *         of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *         date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry failed requests without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows you to retry failed requests without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group where you want to create the rule.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group where you want to create the rule.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group where you want to create the rule.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group where you want to create the rule.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group where you want to create the rule.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group where you want to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the domain list that you want to use in the rule.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list that you want to use in the rule.
     */

    public void setFirewallDomainListId(String firewallDomainListId) {
        this.firewallDomainListId = firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list that you want to use in the rule.
     * </p>
     * 
     * @return The ID of the domain list that you want to use in the rule.
     */

    public String getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list that you want to use in the rule.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list that you want to use in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withFirewallDomainListId(String firewallDomainListId) {
        setFirewallDomainListId(firewallDomainListId);
        return this;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later, leave
     * space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for the
     * rules in a rule group at any time.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the
     *        rules in a rule group by order of priority, starting from the lowest setting.</p>
     *        <p>
     *        You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later,
     *        leave space between the numbers, for example, use 100, 200, and so on. You can change the priority setting
     *        for the rules in a rule group at any time.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later, leave
     * space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for the
     * rules in a rule group at any time.
     * </p>
     * 
     * @return The setting that determines the processing order of the rule in the rule group. DNS Firewall processes
     *         the rules in a rule group by order of priority, starting from the lowest setting.</p>
     *         <p>
     *         You must specify a unique priority for each rule in a rule group. To make it easier to insert rules
     *         later, leave space between the numbers, for example, use 100, 200, and so on. You can change the priority
     *         setting for the rules in a rule group at any time.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules
     * in a rule group by order of priority, starting from the lowest setting.
     * </p>
     * <p>
     * You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later, leave
     * space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for the
     * rules in a rule group at any time.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the
     *        rules in a rule group by order of priority, starting from the lowest setting.</p>
     *        <p>
     *        You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later,
     *        leave space between the numbers, for example, use 100, 200, and so on. You can change the priority setting
     *        for the rules in a rule group at any time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     * <code>BlockResponse</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *        domain list:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code> - Permit the request to go through.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     *        <code>BlockResponse</code>.
     *        </p>
     *        </li>
     * @see Action
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     * <code>BlockResponse</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *         domain list:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW</code> - Permit the request to go through.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     *         <code>BlockResponse</code>.
     *         </p>
     *         </li>
     * @see Action
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     * <code>BlockResponse</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *        domain list:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code> - Permit the request to go through.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     *        <code>BlockResponse</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public CreateFirewallRuleRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain
     * list:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code> - Permit the request to go through.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     * <code>BlockResponse</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's
     *        domain list:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code> - Permit the request to go through.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALERT</code> - Permit the request and send metrics and logs to Cloud Watch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code> - Disallow the request. This option requires additional details in the rule's
     *        <code>BlockResponse</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Action
     */

    public CreateFirewallRuleRequest withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The way that you want DNS Firewall to block the request, used with the rule action setting <code>BLOCK</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling details
     * in the rule's <code>BlockOverride*</code> settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting is required if the rule action setting is <code>BLOCK</code>.
     * </p>
     * 
     * @param blockResponse
     *        The way that you want DNS Firewall to block the request, used with the rule action setting
     *        <code>BLOCK</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for
     *        it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling
     *        details in the rule's <code>BlockOverride*</code> settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This setting is required if the rule action setting is <code>BLOCK</code>.
     * @see BlockResponse
     */

    public void setBlockResponse(String blockResponse) {
        this.blockResponse = blockResponse;
    }

    /**
     * <p>
     * The way that you want DNS Firewall to block the request, used with the rule action setting <code>BLOCK</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling details
     * in the rule's <code>BlockOverride*</code> settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting is required if the rule action setting is <code>BLOCK</code>.
     * </p>
     * 
     * @return The way that you want DNS Firewall to block the request, used with the rule action setting
     *         <code>BLOCK</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for
     *         it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling
     *         details in the rule's <code>BlockOverride*</code> settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This setting is required if the rule action setting is <code>BLOCK</code>.
     * @see BlockResponse
     */

    public String getBlockResponse() {
        return this.blockResponse;
    }

    /**
     * <p>
     * The way that you want DNS Firewall to block the request, used with the rule action setting <code>BLOCK</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling details
     * in the rule's <code>BlockOverride*</code> settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting is required if the rule action setting is <code>BLOCK</code>.
     * </p>
     * 
     * @param blockResponse
     *        The way that you want DNS Firewall to block the request, used with the rule action setting
     *        <code>BLOCK</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for
     *        it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling
     *        details in the rule's <code>BlockOverride*</code> settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This setting is required if the rule action setting is <code>BLOCK</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockResponse
     */

    public CreateFirewallRuleRequest withBlockResponse(String blockResponse) {
        setBlockResponse(blockResponse);
        return this;
    }

    /**
     * <p>
     * The way that you want DNS Firewall to block the request, used with the rule action setting <code>BLOCK</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling details
     * in the rule's <code>BlockOverride*</code> settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting is required if the rule action setting is <code>BLOCK</code>.
     * </p>
     * 
     * @param blockResponse
     *        The way that you want DNS Firewall to block the request, used with the rule action setting
     *        <code>BLOCK</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NODATA</code> - Respond indicating that the query was successful, but no response is available for
     *        it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NXDOMAIN</code> - Respond indicating that the domain name that's in the query doesn't exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OVERRIDE</code> - Provide a custom override in the response. This option requires custom handling
     *        details in the rule's <code>BlockOverride*</code> settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This setting is required if the rule action setting is <code>BLOCK</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockResponse
     */

    public CreateFirewallRuleRequest withBlockResponse(BlockResponse blockResponse) {
        this.blockResponse = blockResponse.toString();
        return this;
    }

    /**
     * <p>
     * The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code> with a
     * <code>BlockResponse</code> setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideDomain
     *        The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code>
     *        with a <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     */

    public void setBlockOverrideDomain(String blockOverrideDomain) {
        this.blockOverrideDomain = blockOverrideDomain;
    }

    /**
     * <p>
     * The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code> with a
     * <code>BlockResponse</code> setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @return The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code>
     *         with a <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *         <p>
     *         This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     */

    public String getBlockOverrideDomain() {
        return this.blockOverrideDomain;
    }

    /**
     * <p>
     * The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code> with a
     * <code>BlockResponse</code> setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideDomain
     *        The custom DNS record to send back in response to the query. Used for the rule action <code>BLOCK</code>
     *        with a <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withBlockOverrideDomain(String blockOverrideDomain) {
        setBlockOverrideDomain(blockOverrideDomain);
        return this;
    }

    /**
     * <p>
     * The DNS record's type. This determines the format of the record value that you provided in
     * <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code>
     * setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideDnsType
     *        The DNS record's type. This determines the format of the record value that you provided in
     *        <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a
     *        <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * @see BlockOverrideDnsType
     */

    public void setBlockOverrideDnsType(String blockOverrideDnsType) {
        this.blockOverrideDnsType = blockOverrideDnsType;
    }

    /**
     * <p>
     * The DNS record's type. This determines the format of the record value that you provided in
     * <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code>
     * setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @return The DNS record's type. This determines the format of the record value that you provided in
     *         <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a
     *         <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *         <p>
     *         This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * @see BlockOverrideDnsType
     */

    public String getBlockOverrideDnsType() {
        return this.blockOverrideDnsType;
    }

    /**
     * <p>
     * The DNS record's type. This determines the format of the record value that you provided in
     * <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code>
     * setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideDnsType
     *        The DNS record's type. This determines the format of the record value that you provided in
     *        <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a
     *        <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockOverrideDnsType
     */

    public CreateFirewallRuleRequest withBlockOverrideDnsType(String blockOverrideDnsType) {
        setBlockOverrideDnsType(blockOverrideDnsType);
        return this;
    }

    /**
     * <p>
     * The DNS record's type. This determines the format of the record value that you provided in
     * <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code>
     * setting of <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideDnsType
     *        The DNS record's type. This determines the format of the record value that you provided in
     *        <code>BlockOverrideDomain</code>. Used for the rule action <code>BLOCK</code> with a
     *        <code>BlockResponse</code> setting of <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockOverrideDnsType
     */

    public CreateFirewallRuleRequest withBlockOverrideDnsType(BlockOverrideDnsType blockOverrideDnsType) {
        this.blockOverrideDnsType = blockOverrideDnsType.toString();
        return this;
    }

    /**
     * <p>
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override
     * record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     * <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideTtl
     *        The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided
     *        override record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     *        <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     */

    public void setBlockOverrideTtl(Integer blockOverrideTtl) {
        this.blockOverrideTtl = blockOverrideTtl;
    }

    /**
     * <p>
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override
     * record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     * <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @return The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided
     *         override record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     *         <code>OVERRIDE</code>.</p>
     *         <p>
     *         This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     */

    public Integer getBlockOverrideTtl() {
        return this.blockOverrideTtl;
    }

    /**
     * <p>
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override
     * record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     * <code>OVERRIDE</code>.
     * </p>
     * <p>
     * This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * </p>
     * 
     * @param blockOverrideTtl
     *        The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided
     *        override record. Used for the rule action <code>BLOCK</code> with a <code>BlockResponse</code> setting of
     *        <code>OVERRIDE</code>.</p>
     *        <p>
     *        This setting is required if the <code>BlockResponse</code> setting is <code>OVERRIDE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withBlockOverrideTtl(Integer blockOverrideTtl) {
        setBlockOverrideTtl(blockOverrideTtl);
        return this;
    }

    /**
     * <p>
     * A name that lets you identify the rule in the rule group.
     * </p>
     * 
     * @param name
     *        A name that lets you identify the rule in the rule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name that lets you identify the rule in the rule group.
     * </p>
     * 
     * @return A name that lets you identify the rule in the rule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name that lets you identify the rule in the rule group.
     * </p>
     * 
     * @param name
     *        A name that lets you identify the rule in the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleRequest withName(String name) {
        setName(name);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getFirewallRuleGroupId() != null)
            sb.append("FirewallRuleGroupId: ").append(getFirewallRuleGroupId()).append(",");
        if (getFirewallDomainListId() != null)
            sb.append("FirewallDomainListId: ").append(getFirewallDomainListId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getBlockResponse() != null)
            sb.append("BlockResponse: ").append(getBlockResponse()).append(",");
        if (getBlockOverrideDomain() != null)
            sb.append("BlockOverrideDomain: ").append(getBlockOverrideDomain()).append(",");
        if (getBlockOverrideDnsType() != null)
            sb.append("BlockOverrideDnsType: ").append(getBlockOverrideDnsType()).append(",");
        if (getBlockOverrideTtl() != null)
            sb.append("BlockOverrideTtl: ").append(getBlockOverrideTtl()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFirewallRuleRequest == false)
            return false;
        CreateFirewallRuleRequest other = (CreateFirewallRuleRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        if (other.getFirewallDomainListId() == null ^ this.getFirewallDomainListId() == null)
            return false;
        if (other.getFirewallDomainListId() != null && other.getFirewallDomainListId().equals(this.getFirewallDomainListId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBlockResponse() == null ^ this.getBlockResponse() == null)
            return false;
        if (other.getBlockResponse() != null && other.getBlockResponse().equals(this.getBlockResponse()) == false)
            return false;
        if (other.getBlockOverrideDomain() == null ^ this.getBlockOverrideDomain() == null)
            return false;
        if (other.getBlockOverrideDomain() != null && other.getBlockOverrideDomain().equals(this.getBlockOverrideDomain()) == false)
            return false;
        if (other.getBlockOverrideDnsType() == null ^ this.getBlockOverrideDnsType() == null)
            return false;
        if (other.getBlockOverrideDnsType() != null && other.getBlockOverrideDnsType().equals(this.getBlockOverrideDnsType()) == false)
            return false;
        if (other.getBlockOverrideTtl() == null ^ this.getBlockOverrideTtl() == null)
            return false;
        if (other.getBlockOverrideTtl() != null && other.getBlockOverrideTtl().equals(this.getBlockOverrideTtl()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getFirewallRuleGroupId() == null) ? 0 : getFirewallRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getFirewallDomainListId() == null) ? 0 : getFirewallDomainListId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getBlockResponse() == null) ? 0 : getBlockResponse().hashCode());
        hashCode = prime * hashCode + ((getBlockOverrideDomain() == null) ? 0 : getBlockOverrideDomain().hashCode());
        hashCode = prime * hashCode + ((getBlockOverrideDnsType() == null) ? 0 : getBlockOverrideDnsType().hashCode());
        hashCode = prime * hashCode + ((getBlockOverrideTtl() == null) ? 0 : getBlockOverrideTtl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateFirewallRuleRequest clone() {
        return (CreateFirewallRuleRequest) super.clone();
    }

}
