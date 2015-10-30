/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#simulatePrincipalPolicy(SimulatePrincipalPolicyRequest) SimulatePrincipalPolicy operation}.
 * <p>
 * Simulate how a set of IAM policies attached to an IAM entity works
 * with a list of API actions and AWS resources to determine the
 * policies' effective permissions. The entity can be an IAM user, group,
 * or role. If you specify a user, then the simulation also includes all
 * of the policies that are attached to groups that the user belongs to .
 * </p>
 * <p>
 * You can optionally include a list of one or more additional policies
 * specified as strings to include in the simulation. If you want to
 * simulate only policies specified as strings, use SimulateCustomPolicy
 * instead.
 * </p>
 * <p>
 * You can also optionally include one resource-based policy to be
 * evaluated with each of the resources included in the simulation.
 * </p>
 * <p>
 * The simulation does not perform the API actions, it only checks the
 * authorization to determine if the simulated policies allow or deny the
 * actions.
 * </p>
 * <p>
 * <b>Note:</b> This API discloses information about the permissions
 * granted to other users. If you do not want users to see other user's
 * permissions, then consider allowing them to use SimulateCustomPolicy
 * instead.
 * </p>
 * <p>
 * Context keys are variables maintained by AWS and its services that
 * provide details about the context of an API query request. You can use
 * the <code>Condition</code> element of an IAM policy to evaluate
 * context keys. To get the list of context keys that the policies
 * require for correct simulation, use GetContextKeysForPrincipalPolicy.
 * </p>
 * <p>
 * If the output is long, you can use the <code>MaxItems</code> and
 * <code>Marker</code> parameters to paginate the results.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#simulatePrincipalPolicy(SimulatePrincipalPolicyRequest)
 */
public class SimulatePrincipalPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies that are
     * associated with that entity. If you specify a user, the simulation
     * also includes all policies that are attached to any groups the user
     * belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policySourceArn;

    /**
     * An optional list of additional policy documents to include in the
     * simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputList;

    /**
     * A list of names of API actions to evaluate in the simulation. Each
     * action is evaluated for each resource. Each action must include the
     * service identifier, such as <code>iam:CreateUser</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> actionNames;

    /**
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided then the value defaults to <code>*</code>
     * (all resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines
     * the access result (allowed or denied) of each combination and reports
     * it in the response. <p>The simulation does not automatically retrieve
     * policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as
     * a string in the <code>ResourcePolicy</code> parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceArns;

    /**
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String resourcePolicy;

    /**
     * An AWS account ID that specifies the owner of any simulated resource
     * that does not identify its owner in the resource ARN, such as an S3
     * bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code>
     * included in the simulation. If the <code>ResourceOwner</code>
     * parameter is not specified, then the owner of the resources and the
     * resource policy defaults to the account of the identity provided in
     * <code>CallerArn</code>. This parameter is required only if you specify
     * a resource-based policy and account that owns the resource is
     * different from the account that owns the simulated calling user
     * <code>CallerArn</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String resourceOwner;

    /**
     * The ARN of the user that you want to specify as the simulated caller
     * of the APIs. If you do not specify a <code>CallerArn</code>, it
     * defaults to the ARN of the user that you specify in
     * <code>PolicySourceArn</code>, if you specified a user. If you include
     * both a <code>PolicySourceArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/David</code>) and a
     * <code>CallerArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     * you simulate calling the APIs as Bob, as if Bob had David's policies.
     * <p>You can specify only the ARN of an IAM user. You cannot specify the
     * ARN of an assumed role, federated user, or a service principal.
     * <p><code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     * not the ARN for an IAM user. This is required so that the
     * resource-based policy's <code>Principal</code> element has a value to
     * use in evaluating the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String callerArn;

    /**
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated by a <code>Condition</code>
     * element in one of the simulated policies, the corresponding value is
     * supplied.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry> contextEntries;

    /**
     * Specifies the type of simulation to run. Different APIs that support
     * resource-based policies require different combinations of resources.
     * By specifying the type of simulation to run, you enable the policy
     * simulator to enforce the presence of the required resources to ensure
     * reliable simulation results. If your simulation does not match one of
     * the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation. <p>Each of the
     * EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume,
     * then you must specify that volume as a resource. If the EC2 scenario
     * includes VPC, then you must supply the network-interface resource. If
     * it includes an IP subnet, then you must specify the subnet resource.
     * For more information on the EC2 scenario options, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     * Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     * <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     * security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     * security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     * <p>instance, image, security-group, network-interface </li>
     * <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     * security-group, network-interface, subnet </li>
     * <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     * network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     * <p>instance, image, security-group, network-interface, subnet, volume
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String resourceHandlingOption;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies that are
     * associated with that entity. If you specify a user, the simulation
     * also includes all policies that are attached to any groups the user
     * belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of a user, group, or role whose
     *         policies you want to include in the simulation. If you specify a user,
     *         group, or role, the simulation includes all policies that are
     *         associated with that entity. If you specify a user, the simulation
     *         also includes all policies that are attached to any groups the user
     *         belongs to.
     */
    public String getPolicySourceArn() {
        return policySourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies that are
     * associated with that entity. If you specify a user, the simulation
     * also includes all policies that are attached to any groups the user
     * belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn The Amazon Resource Name (ARN) of a user, group, or role whose
     *         policies you want to include in the simulation. If you specify a user,
     *         group, or role, the simulation includes all policies that are
     *         associated with that entity. If you specify a user, the simulation
     *         also includes all policies that are attached to any groups the user
     *         belongs to.
     */
    public void setPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies that are
     * associated with that entity. If you specify a user, the simulation
     * also includes all policies that are attached to any groups the user
     * belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn The Amazon Resource Name (ARN) of a user, group, or role whose
     *         policies you want to include in the simulation. If you specify a user,
     *         group, or role, the simulation includes all policies that are
     *         associated with that entity. If you specify a user, the simulation
     *         also includes all policies that are attached to any groups the user
     *         belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
        return this;
    }

    /**
     * An optional list of additional policy documents to include in the
     * simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy.
     *
     * @return An optional list of additional policy documents to include in the
     *         simulation. Each document is specified as a string containing the
     *         complete, valid JSON text of an IAM policy.
     */
    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
              policyInputList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyInputList.setAutoConstruct(true);
        }
        return policyInputList;
    }
    
    /**
     * An optional list of additional policy documents to include in the
     * simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy.
     *
     * @param policyInputList An optional list of additional policy documents to include in the
     *         simulation. Each document is specified as a string containing the
     *         complete, valid JSON text of an IAM policy.
     */
    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyInputList.size());
        policyInputListCopy.addAll(policyInputList);
        this.policyInputList = policyInputListCopy;
    }
    
    /**
     * An optional list of additional policy documents to include in the
     * simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyInputList(java.util.Collection)} or {@link
     * #withPolicyInputList(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyInputList An optional list of additional policy documents to include in the
     *         simulation. Each document is specified as a string containing the
     *         complete, valid JSON text of an IAM policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withPolicyInputList(String... policyInputList) {
        if (getPolicyInputList() == null) setPolicyInputList(new java.util.ArrayList<String>(policyInputList.length));
        for (String value : policyInputList) {
            getPolicyInputList().add(value);
        }
        return this;
    }
    
    /**
     * An optional list of additional policy documents to include in the
     * simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyInputList An optional list of additional policy documents to include in the
     *         simulation. Each document is specified as a string containing the
     *         complete, valid JSON text of an IAM policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyInputList.size());
            policyInputListCopy.addAll(policyInputList);
            this.policyInputList = policyInputListCopy;
        }

        return this;
    }

    /**
     * A list of names of API actions to evaluate in the simulation. Each
     * action is evaluated for each resource. Each action must include the
     * service identifier, such as <code>iam:CreateUser</code>.
     *
     * @return A list of names of API actions to evaluate in the simulation. Each
     *         action is evaluated for each resource. Each action must include the
     *         service identifier, such as <code>iam:CreateUser</code>.
     */
    public java.util.List<String> getActionNames() {
        if (actionNames == null) {
              actionNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              actionNames.setAutoConstruct(true);
        }
        return actionNames;
    }
    
    /**
     * A list of names of API actions to evaluate in the simulation. Each
     * action is evaluated for each resource. Each action must include the
     * service identifier, such as <code>iam:CreateUser</code>.
     *
     * @param actionNames A list of names of API actions to evaluate in the simulation. Each
     *         action is evaluated for each resource. Each action must include the
     *         service identifier, such as <code>iam:CreateUser</code>.
     */
    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> actionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actionNames.size());
        actionNamesCopy.addAll(actionNames);
        this.actionNames = actionNamesCopy;
    }
    
    /**
     * A list of names of API actions to evaluate in the simulation. Each
     * action is evaluated for each resource. Each action must include the
     * service identifier, such as <code>iam:CreateUser</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActionNames(java.util.Collection)} or {@link
     * #withActionNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionNames A list of names of API actions to evaluate in the simulation. Each
     *         action is evaluated for each resource. Each action must include the
     *         service identifier, such as <code>iam:CreateUser</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withActionNames(String... actionNames) {
        if (getActionNames() == null) setActionNames(new java.util.ArrayList<String>(actionNames.length));
        for (String value : actionNames) {
            getActionNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of names of API actions to evaluate in the simulation. Each
     * action is evaluated for each resource. Each action must include the
     * service identifier, such as <code>iam:CreateUser</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actionNames A list of names of API actions to evaluate in the simulation. Each
     *         action is evaluated for each resource. Each action must include the
     *         service identifier, such as <code>iam:CreateUser</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> actionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actionNames.size());
            actionNamesCopy.addAll(actionNames);
            this.actionNames = actionNamesCopy;
        }

        return this;
    }

    /**
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided then the value defaults to <code>*</code>
     * (all resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines
     * the access result (allowed or denied) of each combination and reports
     * it in the response. <p>The simulation does not automatically retrieve
     * policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as
     * a string in the <code>ResourcePolicy</code> parameter.
     *
     * @return A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response. <p>The simulation does not automatically retrieve
     *         policies for the specified resources. If you want to include a
     *         resource policy in the simulation, then you must include the policy as
     *         a string in the <code>ResourcePolicy</code> parameter.
     */
    public java.util.List<String> getResourceArns() {
        if (resourceArns == null) {
              resourceArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceArns.setAutoConstruct(true);
        }
        return resourceArns;
    }
    
    /**
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided then the value defaults to <code>*</code>
     * (all resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines
     * the access result (allowed or denied) of each combination and reports
     * it in the response. <p>The simulation does not automatically retrieve
     * policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as
     * a string in the <code>ResourcePolicy</code> parameter.
     *
     * @param resourceArns A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response. <p>The simulation does not automatically retrieve
     *         policies for the specified resources. If you want to include a
     *         resource policy in the simulation, then you must include the policy as
     *         a string in the <code>ResourcePolicy</code> parameter.
     */
    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceArns.size());
        resourceArnsCopy.addAll(resourceArns);
        this.resourceArns = resourceArnsCopy;
    }
    
    /**
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided then the value defaults to <code>*</code>
     * (all resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines
     * the access result (allowed or denied) of each combination and reports
     * it in the response. <p>The simulation does not automatically retrieve
     * policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as
     * a string in the <code>ResourcePolicy</code> parameter.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceArns(java.util.Collection)} or {@link
     * #withResourceArns(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceArns A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response. <p>The simulation does not automatically retrieve
     *         policies for the specified resources. If you want to include a
     *         resource policy in the simulation, then you must include the policy as
     *         a string in the <code>ResourcePolicy</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withResourceArns(String... resourceArns) {
        if (getResourceArns() == null) setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        for (String value : resourceArns) {
            getResourceArns().add(value);
        }
        return this;
    }
    
    /**
     * A list of ARNs of AWS resources to include in the simulation. If this
     * parameter is not provided then the value defaults to <code>*</code>
     * (all resources). Each API in the <code>ActionNames</code> parameter is
     * evaluated for each resource in this list. The simulation determines
     * the access result (allowed or denied) of each combination and reports
     * it in the response. <p>The simulation does not automatically retrieve
     * policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as
     * a string in the <code>ResourcePolicy</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceArns A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response. <p>The simulation does not automatically retrieve
     *         policies for the specified resources. If you want to include a
     *         resource policy in the simulation, then you must include the policy as
     *         a string in the <code>ResourcePolicy</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceArns.size());
            resourceArnsCopy.addAll(resourceArns);
            this.resourceArns = resourceArnsCopy;
        }

        return this;
    }

    /**
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return A resource-based policy to include in the simulation provided as a
     *         string. Each resource in the simulation is treated as if it had this
     *         policy attached. You can include only one resource-based policy in a
     *         simulation.
     */
    public String getResourcePolicy() {
        return resourcePolicy;
    }
    
    /**
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param resourcePolicy A resource-based policy to include in the simulation provided as a
     *         string. Each resource in the simulation is treated as if it had this
     *         policy attached. You can include only one resource-based policy in a
     *         simulation.
     */
    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }
    
    /**
     * A resource-based policy to include in the simulation provided as a
     * string. Each resource in the simulation is treated as if it had this
     * policy attached. You can include only one resource-based policy in a
     * simulation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param resourcePolicy A resource-based policy to include in the simulation provided as a
     *         string. Each resource in the simulation is treated as if it had this
     *         policy attached. You can include only one resource-based policy in a
     *         simulation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
        return this;
    }

    /**
     * An AWS account ID that specifies the owner of any simulated resource
     * that does not identify its owner in the resource ARN, such as an S3
     * bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code>
     * included in the simulation. If the <code>ResourceOwner</code>
     * parameter is not specified, then the owner of the resources and the
     * resource policy defaults to the account of the identity provided in
     * <code>CallerArn</code>. This parameter is required only if you specify
     * a resource-based policy and account that owns the resource is
     * different from the account that owns the simulated calling user
     * <code>CallerArn</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return An AWS account ID that specifies the owner of any simulated resource
     *         that does not identify its owner in the resource ARN, such as an S3
     *         bucket or object. If <code>ResourceOwner</code> is specified, it is
     *         also used as the account owner of any <code>ResourcePolicy</code>
     *         included in the simulation. If the <code>ResourceOwner</code>
     *         parameter is not specified, then the owner of the resources and the
     *         resource policy defaults to the account of the identity provided in
     *         <code>CallerArn</code>. This parameter is required only if you specify
     *         a resource-based policy and account that owns the resource is
     *         different from the account that owns the simulated calling user
     *         <code>CallerArn</code>.
     */
    public String getResourceOwner() {
        return resourceOwner;
    }
    
    /**
     * An AWS account ID that specifies the owner of any simulated resource
     * that does not identify its owner in the resource ARN, such as an S3
     * bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code>
     * included in the simulation. If the <code>ResourceOwner</code>
     * parameter is not specified, then the owner of the resources and the
     * resource policy defaults to the account of the identity provided in
     * <code>CallerArn</code>. This parameter is required only if you specify
     * a resource-based policy and account that owns the resource is
     * different from the account that owns the simulated calling user
     * <code>CallerArn</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param resourceOwner An AWS account ID that specifies the owner of any simulated resource
     *         that does not identify its owner in the resource ARN, such as an S3
     *         bucket or object. If <code>ResourceOwner</code> is specified, it is
     *         also used as the account owner of any <code>ResourcePolicy</code>
     *         included in the simulation. If the <code>ResourceOwner</code>
     *         parameter is not specified, then the owner of the resources and the
     *         resource policy defaults to the account of the identity provided in
     *         <code>CallerArn</code>. This parameter is required only if you specify
     *         a resource-based policy and account that owns the resource is
     *         different from the account that owns the simulated calling user
     *         <code>CallerArn</code>.
     */
    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }
    
    /**
     * An AWS account ID that specifies the owner of any simulated resource
     * that does not identify its owner in the resource ARN, such as an S3
     * bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code>
     * included in the simulation. If the <code>ResourceOwner</code>
     * parameter is not specified, then the owner of the resources and the
     * resource policy defaults to the account of the identity provided in
     * <code>CallerArn</code>. This parameter is required only if you specify
     * a resource-based policy and account that owns the resource is
     * different from the account that owns the simulated calling user
     * <code>CallerArn</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param resourceOwner An AWS account ID that specifies the owner of any simulated resource
     *         that does not identify its owner in the resource ARN, such as an S3
     *         bucket or object. If <code>ResourceOwner</code> is specified, it is
     *         also used as the account owner of any <code>ResourcePolicy</code>
     *         included in the simulation. If the <code>ResourceOwner</code>
     *         parameter is not specified, then the owner of the resources and the
     *         resource policy defaults to the account of the identity provided in
     *         <code>CallerArn</code>. This parameter is required only if you specify
     *         a resource-based policy and account that owns the resource is
     *         different from the account that owns the simulated calling user
     *         <code>CallerArn</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * The ARN of the user that you want to specify as the simulated caller
     * of the APIs. If you do not specify a <code>CallerArn</code>, it
     * defaults to the ARN of the user that you specify in
     * <code>PolicySourceArn</code>, if you specified a user. If you include
     * both a <code>PolicySourceArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/David</code>) and a
     * <code>CallerArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     * you simulate calling the APIs as Bob, as if Bob had David's policies.
     * <p>You can specify only the ARN of an IAM user. You cannot specify the
     * ARN of an assumed role, federated user, or a service principal.
     * <p><code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     * not the ARN for an IAM user. This is required so that the
     * resource-based policy's <code>Principal</code> element has a value to
     * use in evaluating the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return The ARN of the user that you want to specify as the simulated caller
     *         of the APIs. If you do not specify a <code>CallerArn</code>, it
     *         defaults to the ARN of the user that you specify in
     *         <code>PolicySourceArn</code>, if you specified a user. If you include
     *         both a <code>PolicySourceArn</code> (for example,
     *         <code>arn:aws:iam::123456789012:user/David</code>) and a
     *         <code>CallerArn</code> (for example,
     *         <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     *         you simulate calling the APIs as Bob, as if Bob had David's policies.
     *         <p>You can specify only the ARN of an IAM user. You cannot specify the
     *         ARN of an assumed role, federated user, or a service principal.
     *         <p><code>CallerArn</code> is required if you include a
     *         <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     *         not the ARN for an IAM user. This is required so that the
     *         resource-based policy's <code>Principal</code> element has a value to
     *         use in evaluating the policy.
     */
    public String getCallerArn() {
        return callerArn;
    }
    
    /**
     * The ARN of the user that you want to specify as the simulated caller
     * of the APIs. If you do not specify a <code>CallerArn</code>, it
     * defaults to the ARN of the user that you specify in
     * <code>PolicySourceArn</code>, if you specified a user. If you include
     * both a <code>PolicySourceArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/David</code>) and a
     * <code>CallerArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     * you simulate calling the APIs as Bob, as if Bob had David's policies.
     * <p>You can specify only the ARN of an IAM user. You cannot specify the
     * ARN of an assumed role, federated user, or a service principal.
     * <p><code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     * not the ARN for an IAM user. This is required so that the
     * resource-based policy's <code>Principal</code> element has a value to
     * use in evaluating the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param callerArn The ARN of the user that you want to specify as the simulated caller
     *         of the APIs. If you do not specify a <code>CallerArn</code>, it
     *         defaults to the ARN of the user that you specify in
     *         <code>PolicySourceArn</code>, if you specified a user. If you include
     *         both a <code>PolicySourceArn</code> (for example,
     *         <code>arn:aws:iam::123456789012:user/David</code>) and a
     *         <code>CallerArn</code> (for example,
     *         <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     *         you simulate calling the APIs as Bob, as if Bob had David's policies.
     *         <p>You can specify only the ARN of an IAM user. You cannot specify the
     *         ARN of an assumed role, federated user, or a service principal.
     *         <p><code>CallerArn</code> is required if you include a
     *         <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     *         not the ARN for an IAM user. This is required so that the
     *         resource-based policy's <code>Principal</code> element has a value to
     *         use in evaluating the policy.
     */
    public void setCallerArn(String callerArn) {
        this.callerArn = callerArn;
    }
    
    /**
     * The ARN of the user that you want to specify as the simulated caller
     * of the APIs. If you do not specify a <code>CallerArn</code>, it
     * defaults to the ARN of the user that you specify in
     * <code>PolicySourceArn</code>, if you specified a user. If you include
     * both a <code>PolicySourceArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/David</code>) and a
     * <code>CallerArn</code> (for example,
     * <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     * you simulate calling the APIs as Bob, as if Bob had David's policies.
     * <p>You can specify only the ARN of an IAM user. You cannot specify the
     * ARN of an assumed role, federated user, or a service principal.
     * <p><code>CallerArn</code> is required if you include a
     * <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     * not the ARN for an IAM user. This is required so that the
     * resource-based policy's <code>Principal</code> element has a value to
     * use in evaluating the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param callerArn The ARN of the user that you want to specify as the simulated caller
     *         of the APIs. If you do not specify a <code>CallerArn</code>, it
     *         defaults to the ARN of the user that you specify in
     *         <code>PolicySourceArn</code>, if you specified a user. If you include
     *         both a <code>PolicySourceArn</code> (for example,
     *         <code>arn:aws:iam::123456789012:user/David</code>) and a
     *         <code>CallerArn</code> (for example,
     *         <code>arn:aws:iam::123456789012:user/Bob</code>), the result is that
     *         you simulate calling the APIs as Bob, as if Bob had David's policies.
     *         <p>You can specify only the ARN of an IAM user. You cannot specify the
     *         ARN of an assumed role, federated user, or a service principal.
     *         <p><code>CallerArn</code> is required if you include a
     *         <code>ResourcePolicy</code> and the <code>PolicySourceArn</code> is
     *         not the ARN for an IAM user. This is required so that the
     *         resource-based policy's <code>Principal</code> element has a value to
     *         use in evaluating the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withCallerArn(String callerArn) {
        this.callerArn = callerArn;
        return this;
    }

    /**
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated by a <code>Condition</code>
     * element in one of the simulated policies, the corresponding value is
     * supplied.
     *
     * @return A list of context keys and corresponding values for the simulation to
     *         use. Whenever a context key is evaluated by a <code>Condition</code>
     *         element in one of the simulated policies, the corresponding value is
     *         supplied.
     */
    public java.util.List<ContextEntry> getContextEntries() {
        if (contextEntries == null) {
              contextEntries = new com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry>();
              contextEntries.setAutoConstruct(true);
        }
        return contextEntries;
    }
    
    /**
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated by a <code>Condition</code>
     * element in one of the simulated policies, the corresponding value is
     * supplied.
     *
     * @param contextEntries A list of context keys and corresponding values for the simulation to
     *         use. Whenever a context key is evaluated by a <code>Condition</code>
     *         element in one of the simulated policies, the corresponding value is
     *         supplied.
     */
    public void setContextEntries(java.util.Collection<ContextEntry> contextEntries) {
        if (contextEntries == null) {
            this.contextEntries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry> contextEntriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry>(contextEntries.size());
        contextEntriesCopy.addAll(contextEntries);
        this.contextEntries = contextEntriesCopy;
    }
    
    /**
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated by a <code>Condition</code>
     * element in one of the simulated policies, the corresponding value is
     * supplied.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContextEntries(java.util.Collection)} or {@link
     * #withContextEntries(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextEntries A list of context keys and corresponding values for the simulation to
     *         use. Whenever a context key is evaluated by a <code>Condition</code>
     *         element in one of the simulated policies, the corresponding value is
     *         supplied.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withContextEntries(ContextEntry... contextEntries) {
        if (getContextEntries() == null) setContextEntries(new java.util.ArrayList<ContextEntry>(contextEntries.length));
        for (ContextEntry value : contextEntries) {
            getContextEntries().add(value);
        }
        return this;
    }
    
    /**
     * A list of context keys and corresponding values for the simulation to
     * use. Whenever a context key is evaluated by a <code>Condition</code>
     * element in one of the simulated policies, the corresponding value is
     * supplied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextEntries A list of context keys and corresponding values for the simulation to
     *         use. Whenever a context key is evaluated by a <code>Condition</code>
     *         element in one of the simulated policies, the corresponding value is
     *         supplied.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withContextEntries(java.util.Collection<ContextEntry> contextEntries) {
        if (contextEntries == null) {
            this.contextEntries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry> contextEntriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry>(contextEntries.size());
            contextEntriesCopy.addAll(contextEntries);
            this.contextEntries = contextEntriesCopy;
        }

        return this;
    }

    /**
     * Specifies the type of simulation to run. Different APIs that support
     * resource-based policies require different combinations of resources.
     * By specifying the type of simulation to run, you enable the policy
     * simulator to enforce the presence of the required resources to ensure
     * reliable simulation results. If your simulation does not match one of
     * the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation. <p>Each of the
     * EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume,
     * then you must specify that volume as a resource. If the EC2 scenario
     * includes VPC, then you must supply the network-interface resource. If
     * it includes an IP subnet, then you must specify the subnet resource.
     * For more information on the EC2 scenario options, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     * Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     * <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     * security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     * security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     * <p>instance, image, security-group, network-interface </li>
     * <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     * security-group, network-interface, subnet </li>
     * <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     * network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     * <p>instance, image, security-group, network-interface, subnet, volume
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return Specifies the type of simulation to run. Different APIs that support
     *         resource-based policies require different combinations of resources.
     *         By specifying the type of simulation to run, you enable the policy
     *         simulator to enforce the presence of the required resources to ensure
     *         reliable simulation results. If your simulation does not match one of
     *         the following scenarios, then you can omit this parameter. The
     *         following list shows each of the supported scenario values and the
     *         resources that you must define to run the simulation. <p>Each of the
     *         EC2 scenarios requires that you specify instance, image, and
     *         security-group resources. If your scenario includes an EBS volume,
     *         then you must specify that volume as a resource. If the EC2 scenario
     *         includes VPC, then you must supply the network-interface resource. If
     *         it includes an IP subnet, then you must specify the subnet resource.
     *         For more information on the EC2 scenario options, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *         Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     *         <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     *         security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     *         security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     *         <p>instance, image, security-group, network-interface </li>
     *         <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     *         security-group, network-interface, subnet </li>
     *         <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     *         network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     *         <p>instance, image, security-group, network-interface, subnet, volume
     *         </li> </ul>
     */
    public String getResourceHandlingOption() {
        return resourceHandlingOption;
    }
    
    /**
     * Specifies the type of simulation to run. Different APIs that support
     * resource-based policies require different combinations of resources.
     * By specifying the type of simulation to run, you enable the policy
     * simulator to enforce the presence of the required resources to ensure
     * reliable simulation results. If your simulation does not match one of
     * the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation. <p>Each of the
     * EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume,
     * then you must specify that volume as a resource. If the EC2 scenario
     * includes VPC, then you must supply the network-interface resource. If
     * it includes an IP subnet, then you must specify the subnet resource.
     * For more information on the EC2 scenario options, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     * Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     * <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     * security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     * security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     * <p>instance, image, security-group, network-interface </li>
     * <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     * security-group, network-interface, subnet </li>
     * <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     * network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     * <p>instance, image, security-group, network-interface, subnet, volume
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceHandlingOption Specifies the type of simulation to run. Different APIs that support
     *         resource-based policies require different combinations of resources.
     *         By specifying the type of simulation to run, you enable the policy
     *         simulator to enforce the presence of the required resources to ensure
     *         reliable simulation results. If your simulation does not match one of
     *         the following scenarios, then you can omit this parameter. The
     *         following list shows each of the supported scenario values and the
     *         resources that you must define to run the simulation. <p>Each of the
     *         EC2 scenarios requires that you specify instance, image, and
     *         security-group resources. If your scenario includes an EBS volume,
     *         then you must specify that volume as a resource. If the EC2 scenario
     *         includes VPC, then you must supply the network-interface resource. If
     *         it includes an IP subnet, then you must specify the subnet resource.
     *         For more information on the EC2 scenario options, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *         Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     *         <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     *         security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     *         security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     *         <p>instance, image, security-group, network-interface </li>
     *         <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     *         security-group, network-interface, subnet </li>
     *         <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     *         network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     *         <p>instance, image, security-group, network-interface, subnet, volume
     *         </li> </ul>
     */
    public void setResourceHandlingOption(String resourceHandlingOption) {
        this.resourceHandlingOption = resourceHandlingOption;
    }
    
    /**
     * Specifies the type of simulation to run. Different APIs that support
     * resource-based policies require different combinations of resources.
     * By specifying the type of simulation to run, you enable the policy
     * simulator to enforce the presence of the required resources to ensure
     * reliable simulation results. If your simulation does not match one of
     * the following scenarios, then you can omit this parameter. The
     * following list shows each of the supported scenario values and the
     * resources that you must define to run the simulation. <p>Each of the
     * EC2 scenarios requires that you specify instance, image, and
     * security-group resources. If your scenario includes an EBS volume,
     * then you must specify that volume as a resource. If the EC2 scenario
     * includes VPC, then you must supply the network-interface resource. If
     * it includes an IP subnet, then you must specify the subnet resource.
     * For more information on the EC2 scenario options, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     * Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     * <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     * security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     * security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     * <p>instance, image, security-group, network-interface </li>
     * <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     * security-group, network-interface, subnet </li>
     * <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     * network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     * <p>instance, image, security-group, network-interface, subnet, volume
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param resourceHandlingOption Specifies the type of simulation to run. Different APIs that support
     *         resource-based policies require different combinations of resources.
     *         By specifying the type of simulation to run, you enable the policy
     *         simulator to enforce the presence of the required resources to ensure
     *         reliable simulation results. If your simulation does not match one of
     *         the following scenarios, then you can omit this parameter. The
     *         following list shows each of the supported scenario values and the
     *         resources that you must define to run the simulation. <p>Each of the
     *         EC2 scenarios requires that you specify instance, image, and
     *         security-group resources. If your scenario includes an EBS volume,
     *         then you must specify that volume as a resource. If the EC2 scenario
     *         includes VPC, then you must supply the network-interface resource. If
     *         it includes an IP subnet, then you must specify the subnet resource.
     *         For more information on the EC2 scenario options, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *         Platforms</a> in the <i>AWS EC2 User Guide</i>. <ul>
     *         <li><p><b>EC2-Classic-InstanceStore</b> <p>instance, image,
     *         security-group </li> <li><p><b>EC2-Classic-EBS</b> <p>instance, image,
     *         security-group, volume </li> <li><p><b>EC2-VPC-InstanceStore</b>
     *         <p>instance, image, security-group, network-interface </li>
     *         <li><p><b>EC2-VPC-InstanceStore-Subnet</b> <p>instance, image,
     *         security-group, network-interface, subnet </li>
     *         <li><p><b>EC2-VPC-EBS</b> <p>instance, image, security-group,
     *         network-interface, volume </li> <li><p><b>EC2-VPC-EBS-Subnet</b>
     *         <p>instance, image, security-group, network-interface, subnet, volume
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withResourceHandlingOption(String resourceHandlingOption) {
        this.resourceHandlingOption = resourceHandlingOption;
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicySourceArn() != null) sb.append("PolicySourceArn: " + getPolicySourceArn() + ",");
        if (getPolicyInputList() != null) sb.append("PolicyInputList: " + getPolicyInputList() + ",");
        if (getActionNames() != null) sb.append("ActionNames: " + getActionNames() + ",");
        if (getResourceArns() != null) sb.append("ResourceArns: " + getResourceArns() + ",");
        if (getResourcePolicy() != null) sb.append("ResourcePolicy: " + getResourcePolicy() + ",");
        if (getResourceOwner() != null) sb.append("ResourceOwner: " + getResourceOwner() + ",");
        if (getCallerArn() != null) sb.append("CallerArn: " + getCallerArn() + ",");
        if (getContextEntries() != null) sb.append("ContextEntries: " + getContextEntries() + ",");
        if (getResourceHandlingOption() != null) sb.append("ResourceHandlingOption: " + getResourceHandlingOption() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicySourceArn() == null) ? 0 : getPolicySourceArn().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyInputList() == null) ? 0 : getPolicyInputList().hashCode()); 
        hashCode = prime * hashCode + ((getActionNames() == null) ? 0 : getActionNames().hashCode()); 
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode()); 
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode()); 
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode()); 
        hashCode = prime * hashCode + ((getCallerArn() == null) ? 0 : getCallerArn().hashCode()); 
        hashCode = prime * hashCode + ((getContextEntries() == null) ? 0 : getContextEntries().hashCode()); 
        hashCode = prime * hashCode + ((getResourceHandlingOption() == null) ? 0 : getResourceHandlingOption().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SimulatePrincipalPolicyRequest == false) return false;
        SimulatePrincipalPolicyRequest other = (SimulatePrincipalPolicyRequest)obj;
        
        if (other.getPolicySourceArn() == null ^ this.getPolicySourceArn() == null) return false;
        if (other.getPolicySourceArn() != null && other.getPolicySourceArn().equals(this.getPolicySourceArn()) == false) return false; 
        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null) return false;
        if (other.getPolicyInputList() != null && other.getPolicyInputList().equals(this.getPolicyInputList()) == false) return false; 
        if (other.getActionNames() == null ^ this.getActionNames() == null) return false;
        if (other.getActionNames() != null && other.getActionNames().equals(this.getActionNames()) == false) return false; 
        if (other.getResourceArns() == null ^ this.getResourceArns() == null) return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false) return false; 
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null) return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false) return false; 
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null) return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false) return false; 
        if (other.getCallerArn() == null ^ this.getCallerArn() == null) return false;
        if (other.getCallerArn() != null && other.getCallerArn().equals(this.getCallerArn()) == false) return false; 
        if (other.getContextEntries() == null ^ this.getContextEntries() == null) return false;
        if (other.getContextEntries() != null && other.getContextEntries().equals(this.getContextEntries()) == false) return false; 
        if (other.getResourceHandlingOption() == null ^ this.getResourceHandlingOption() == null) return false;
        if (other.getResourceHandlingOption() != null && other.getResourceHandlingOption().equals(this.getResourceHandlingOption()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public SimulatePrincipalPolicyRequest clone() {
        
            return (SimulatePrincipalPolicyRequest) super.clone();
    }

}
    