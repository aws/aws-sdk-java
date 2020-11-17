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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The firewall policy defines the behavior of a firewall using a collection of stateless and stateful rule groups and
 * other settings. You can use one firewall policy for multiple firewalls.
 * </p>
 * <p>
 * This, along with <a>FirewallPolicyResponse</a>, define the policy. You can retrieve all objects for a firewall policy
 * by calling <a>DescribeFirewallPolicy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/FirewallPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the matching criteria in
     * stateless rules.
     * </p>
     */
    private java.util.List<StatelessRuleGroupReference> statelessRuleGroupReferences;
    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     * non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     */
    private java.util.List<String> statelessDefaultActions;
    /**
     * <p>
     * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy. If you
     * want non-matching fragmented packets to be forwarded for stateful inspection, specify
     * <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     */
    private java.util.List<String> statelessFragmentDefaultActions;
    /**
     * <p>
     * The custom action definitions that are available for use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you can use
     * it by name in your default actions specifications.
     * </p>
     */
    private java.util.List<CustomAction> statelessCustomActions;
    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the inspection criteria in
     * stateful rules.
     * </p>
     */
    private java.util.List<StatefulRuleGroupReference> statefulRuleGroupReferences;

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the matching criteria in
     * stateless rules.
     * </p>
     * 
     * @return References to the stateless rule groups that are used in the policy. These define the matching criteria
     *         in stateless rules.
     */

    public java.util.List<StatelessRuleGroupReference> getStatelessRuleGroupReferences() {
        return statelessRuleGroupReferences;
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the matching criteria in
     * stateless rules.
     * </p>
     * 
     * @param statelessRuleGroupReferences
     *        References to the stateless rule groups that are used in the policy. These define the matching criteria in
     *        stateless rules.
     */

    public void setStatelessRuleGroupReferences(java.util.Collection<StatelessRuleGroupReference> statelessRuleGroupReferences) {
        if (statelessRuleGroupReferences == null) {
            this.statelessRuleGroupReferences = null;
            return;
        }

        this.statelessRuleGroupReferences = new java.util.ArrayList<StatelessRuleGroupReference>(statelessRuleGroupReferences);
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the matching criteria in
     * stateless rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessRuleGroupReferences(java.util.Collection)} or
     * {@link #withStatelessRuleGroupReferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessRuleGroupReferences
     *        References to the stateless rule groups that are used in the policy. These define the matching criteria in
     *        stateless rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessRuleGroupReferences(StatelessRuleGroupReference... statelessRuleGroupReferences) {
        if (this.statelessRuleGroupReferences == null) {
            setStatelessRuleGroupReferences(new java.util.ArrayList<StatelessRuleGroupReference>(statelessRuleGroupReferences.length));
        }
        for (StatelessRuleGroupReference ele : statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the matching criteria in
     * stateless rules.
     * </p>
     * 
     * @param statelessRuleGroupReferences
     *        References to the stateless rule groups that are used in the policy. These define the matching criteria in
     *        stateless rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessRuleGroupReferences(java.util.Collection<StatelessRuleGroupReference> statelessRuleGroupReferences) {
        setStatelessRuleGroupReferences(statelessRuleGroupReferences);
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     * non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * 
     * @return The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     *         non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     *         </p>
     *         <p>
     *         You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *         <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with
     *         your standard section choice.
     *         </p>
     *         <p>
     *         For example, you could specify <code>["aws:pass"]</code> or you could specify
     *         <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *         descriptions under <a>CustomAction</a>.
     */

    public java.util.List<String> getStatelessDefaultActions() {
        return statelessDefaultActions;
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     * non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     *        non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     *        </p>
     *        <p>
     *        You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     *        standard section choice.
     *        </p>
     *        <p>
     *        For example, you could specify <code>["aws:pass"]</code> or you could specify
     *        <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *        descriptions under <a>CustomAction</a>.
     */

    public void setStatelessDefaultActions(java.util.Collection<String> statelessDefaultActions) {
        if (statelessDefaultActions == null) {
            this.statelessDefaultActions = null;
            return;
        }

        this.statelessDefaultActions = new java.util.ArrayList<String>(statelessDefaultActions);
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     * non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessDefaultActions(java.util.Collection)} or
     * {@link #withStatelessDefaultActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     *        non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     *        </p>
     *        <p>
     *        You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     *        standard section choice.
     *        </p>
     *        <p>
     *        For example, you could specify <code>["aws:pass"]</code> or you could specify
     *        <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *        descriptions under <a>CustomAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessDefaultActions(String... statelessDefaultActions) {
        if (this.statelessDefaultActions == null) {
            setStatelessDefaultActions(new java.util.ArrayList<String>(statelessDefaultActions.length));
        }
        for (String ele : statelessDefaultActions) {
            this.statelessDefaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     * non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * 
     * @param statelessDefaultActions
     *        The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want
     *        non-matching packets to be forwarded for stateful inspection, specify <code>aws:forward_to_sfe</code>.
     *        </p>
     *        <p>
     *        You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     *        standard section choice.
     *        </p>
     *        <p>
     *        For example, you could specify <code>["aws:pass"]</code> or you could specify
     *        <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *        descriptions under <a>CustomAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessDefaultActions(java.util.Collection<String> statelessDefaultActions) {
        setStatelessDefaultActions(statelessDefaultActions);
        return this;
    }

    /**
     * <p>
     * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy. If you
     * want non-matching fragmented packets to be forwarded for stateful inspection, specify
     * <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * 
     * @return The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy.
     *         If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
     *         <code>aws:forward_to_sfe</code>. </p>
     *         <p>
     *         You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *         <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with
     *         your standard section choice.
     *         </p>
     *         <p>
     *         For example, you could specify <code>["aws:pass"]</code> or you could specify
     *         <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *         descriptions under <a>CustomAction</a>.
     */

    public java.util.List<String> getStatelessFragmentDefaultActions() {
        return statelessFragmentDefaultActions;
    }

    /**
     * <p>
     * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy. If you
     * want non-matching fragmented packets to be forwarded for stateful inspection, specify
     * <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy.
     *        If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
     *        <code>aws:forward_to_sfe</code>. </p>
     *        <p>
     *        You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     *        standard section choice.
     *        </p>
     *        <p>
     *        For example, you could specify <code>["aws:pass"]</code> or you could specify
     *        <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *        descriptions under <a>CustomAction</a>.
     */

    public void setStatelessFragmentDefaultActions(java.util.Collection<String> statelessFragmentDefaultActions) {
        if (statelessFragmentDefaultActions == null) {
            this.statelessFragmentDefaultActions = null;
            return;
        }

        this.statelessFragmentDefaultActions = new java.util.ArrayList<String>(statelessFragmentDefaultActions);
    }

    /**
     * <p>
     * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy. If you
     * want non-matching fragmented packets to be forwarded for stateful inspection, specify
     * <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessFragmentDefaultActions(java.util.Collection)} or
     * {@link #withStatelessFragmentDefaultActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy.
     *        If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
     *        <code>aws:forward_to_sfe</code>. </p>
     *        <p>
     *        You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     *        standard section choice.
     *        </p>
     *        <p>
     *        For example, you could specify <code>["aws:pass"]</code> or you could specify
     *        <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *        descriptions under <a>CustomAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessFragmentDefaultActions(String... statelessFragmentDefaultActions) {
        if (this.statelessFragmentDefaultActions == null) {
            setStatelessFragmentDefaultActions(new java.util.ArrayList<String>(statelessFragmentDefaultActions.length));
        }
        for (String ele : statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy. If you
     * want non-matching fragmented packets to be forwarded for stateful inspection, specify
     * <code>aws:forward_to_sfe</code>.
     * </p>
     * <p>
     * You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     * <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     * standard section choice.
     * </p>
     * <p>
     * For example, you could specify <code>["aws:pass"]</code> or you could specify
     * <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     * descriptions under <a>CustomAction</a>.
     * </p>
     * 
     * @param statelessFragmentDefaultActions
     *        The actions to take on a fragmented packet if it doesn't match any of the stateless rules in the policy.
     *        If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
     *        <code>aws:forward_to_sfe</code>. </p>
     *        <p>
     *        You must specify one of the standard actions: <code>aws:pass</code>, <code>aws:drop</code>, or
     *        <code>aws:forward_to_sfe</code>. In addition, you can specify custom actions that are compatible with your
     *        standard section choice.
     *        </p>
     *        <p>
     *        For example, you could specify <code>["aws:pass"]</code> or you could specify
     *        <code>["aws:pass", “customActionName”]</code>. For information about compatibility, see the custom action
     *        descriptions under <a>CustomAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessFragmentDefaultActions(java.util.Collection<String> statelessFragmentDefaultActions) {
        setStatelessFragmentDefaultActions(statelessFragmentDefaultActions);
        return this;
    }

    /**
     * <p>
     * The custom action definitions that are available for use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you can use
     * it by name in your default actions specifications.
     * </p>
     * 
     * @return The custom action definitions that are available for use in the firewall policy's
     *         <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you
     *         can use it by name in your default actions specifications.
     */

    public java.util.List<CustomAction> getStatelessCustomActions() {
        return statelessCustomActions;
    }

    /**
     * <p>
     * The custom action definitions that are available for use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you can use
     * it by name in your default actions specifications.
     * </p>
     * 
     * @param statelessCustomActions
     *        The custom action definitions that are available for use in the firewall policy's
     *        <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you
     *        can use it by name in your default actions specifications.
     */

    public void setStatelessCustomActions(java.util.Collection<CustomAction> statelessCustomActions) {
        if (statelessCustomActions == null) {
            this.statelessCustomActions = null;
            return;
        }

        this.statelessCustomActions = new java.util.ArrayList<CustomAction>(statelessCustomActions);
    }

    /**
     * <p>
     * The custom action definitions that are available for use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you can use
     * it by name in your default actions specifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatelessCustomActions(java.util.Collection)} or
     * {@link #withStatelessCustomActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statelessCustomActions
     *        The custom action definitions that are available for use in the firewall policy's
     *        <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you
     *        can use it by name in your default actions specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessCustomActions(CustomAction... statelessCustomActions) {
        if (this.statelessCustomActions == null) {
            setStatelessCustomActions(new java.util.ArrayList<CustomAction>(statelessCustomActions.length));
        }
        for (CustomAction ele : statelessCustomActions) {
            this.statelessCustomActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom action definitions that are available for use in the firewall policy's
     * <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you can use
     * it by name in your default actions specifications.
     * </p>
     * 
     * @param statelessCustomActions
     *        The custom action definitions that are available for use in the firewall policy's
     *        <code>StatelessDefaultActions</code> setting. You name each custom action that you define, and then you
     *        can use it by name in your default actions specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatelessCustomActions(java.util.Collection<CustomAction> statelessCustomActions) {
        setStatelessCustomActions(statelessCustomActions);
        return this;
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the inspection criteria in
     * stateful rules.
     * </p>
     * 
     * @return References to the stateless rule groups that are used in the policy. These define the inspection criteria
     *         in stateful rules.
     */

    public java.util.List<StatefulRuleGroupReference> getStatefulRuleGroupReferences() {
        return statefulRuleGroupReferences;
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the inspection criteria in
     * stateful rules.
     * </p>
     * 
     * @param statefulRuleGroupReferences
     *        References to the stateless rule groups that are used in the policy. These define the inspection criteria
     *        in stateful rules.
     */

    public void setStatefulRuleGroupReferences(java.util.Collection<StatefulRuleGroupReference> statefulRuleGroupReferences) {
        if (statefulRuleGroupReferences == null) {
            this.statefulRuleGroupReferences = null;
            return;
        }

        this.statefulRuleGroupReferences = new java.util.ArrayList<StatefulRuleGroupReference>(statefulRuleGroupReferences);
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the inspection criteria in
     * stateful rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatefulRuleGroupReferences(java.util.Collection)} or
     * {@link #withStatefulRuleGroupReferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param statefulRuleGroupReferences
     *        References to the stateless rule groups that are used in the policy. These define the inspection criteria
     *        in stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatefulRuleGroupReferences(StatefulRuleGroupReference... statefulRuleGroupReferences) {
        if (this.statefulRuleGroupReferences == null) {
            setStatefulRuleGroupReferences(new java.util.ArrayList<StatefulRuleGroupReference>(statefulRuleGroupReferences.length));
        }
        for (StatefulRuleGroupReference ele : statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * References to the stateless rule groups that are used in the policy. These define the inspection criteria in
     * stateful rules.
     * </p>
     * 
     * @param statefulRuleGroupReferences
     *        References to the stateless rule groups that are used in the policy. These define the inspection criteria
     *        in stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicy withStatefulRuleGroupReferences(java.util.Collection<StatefulRuleGroupReference> statefulRuleGroupReferences) {
        setStatefulRuleGroupReferences(statefulRuleGroupReferences);
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
        if (getStatelessRuleGroupReferences() != null)
            sb.append("StatelessRuleGroupReferences: ").append(getStatelessRuleGroupReferences()).append(",");
        if (getStatelessDefaultActions() != null)
            sb.append("StatelessDefaultActions: ").append(getStatelessDefaultActions()).append(",");
        if (getStatelessFragmentDefaultActions() != null)
            sb.append("StatelessFragmentDefaultActions: ").append(getStatelessFragmentDefaultActions()).append(",");
        if (getStatelessCustomActions() != null)
            sb.append("StatelessCustomActions: ").append(getStatelessCustomActions()).append(",");
        if (getStatefulRuleGroupReferences() != null)
            sb.append("StatefulRuleGroupReferences: ").append(getStatefulRuleGroupReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallPolicy == false)
            return false;
        FirewallPolicy other = (FirewallPolicy) obj;
        if (other.getStatelessRuleGroupReferences() == null ^ this.getStatelessRuleGroupReferences() == null)
            return false;
        if (other.getStatelessRuleGroupReferences() != null && other.getStatelessRuleGroupReferences().equals(this.getStatelessRuleGroupReferences()) == false)
            return false;
        if (other.getStatelessDefaultActions() == null ^ this.getStatelessDefaultActions() == null)
            return false;
        if (other.getStatelessDefaultActions() != null && other.getStatelessDefaultActions().equals(this.getStatelessDefaultActions()) == false)
            return false;
        if (other.getStatelessFragmentDefaultActions() == null ^ this.getStatelessFragmentDefaultActions() == null)
            return false;
        if (other.getStatelessFragmentDefaultActions() != null
                && other.getStatelessFragmentDefaultActions().equals(this.getStatelessFragmentDefaultActions()) == false)
            return false;
        if (other.getStatelessCustomActions() == null ^ this.getStatelessCustomActions() == null)
            return false;
        if (other.getStatelessCustomActions() != null && other.getStatelessCustomActions().equals(this.getStatelessCustomActions()) == false)
            return false;
        if (other.getStatefulRuleGroupReferences() == null ^ this.getStatefulRuleGroupReferences() == null)
            return false;
        if (other.getStatefulRuleGroupReferences() != null && other.getStatefulRuleGroupReferences().equals(this.getStatefulRuleGroupReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatelessRuleGroupReferences() == null) ? 0 : getStatelessRuleGroupReferences().hashCode());
        hashCode = prime * hashCode + ((getStatelessDefaultActions() == null) ? 0 : getStatelessDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessFragmentDefaultActions() == null) ? 0 : getStatelessFragmentDefaultActions().hashCode());
        hashCode = prime * hashCode + ((getStatelessCustomActions() == null) ? 0 : getStatelessCustomActions().hashCode());
        hashCode = prime * hashCode + ((getStatefulRuleGroupReferences() == null) ? 0 : getStatefulRuleGroupReferences().hashCode());
        return hashCode;
    }

    @Override
    public FirewallPolicy clone() {
        try {
            return (FirewallPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.FirewallPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
