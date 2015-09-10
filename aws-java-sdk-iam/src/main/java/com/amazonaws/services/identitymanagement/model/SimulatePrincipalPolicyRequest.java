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
 * Simulate the set of IAM policies attached to an IAM entity against a
 * list of API actions and AWS resources to determine the policies'
 * effective permissions. The entity can be an IAM user, group, or role.
 * If you specify a user, then the simulation also includes all of the
 * policies attached to groups that the user is a member of.
 * </p>
 * <p>
 * You can optionally include a list of one or more additional policies
 * specified as strings to include in the simulation. If you want to
 * simulate only policies specified as strings, use SimulateCustomPolicy
 * instead.
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
 * provide details about the context of an API query request, and can be
 * evaluated by using the <code>Condition</code> element of an IAM
 * policy. To get the list of context keys required by the policies to
 * simulate them correctly, use GetContextKeysForPrincipalPolicy.
 * </p>
 * <p>
 * If the output is long, you can paginate the results using the
 * <code>MaxItems</code> and <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#simulatePrincipalPolicy(SimulatePrincipalPolicyRequest)
 */
public class SimulatePrincipalPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies associated with
     * that entity. If you specify a user, the simulation also includes all
     * policies attached to any groups the user is a member of.
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
     * it in the response.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceArns;

    /**
     * A list of context keys and corresponding values that are used by the
     * simulation. Whenever a context key is evaluated by a
     * <code>Condition</code> element in one of the simulated IAM permission
     * policies, the corresponding value is supplied.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry> contextEntries;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies associated with
     * that entity. If you specify a user, the simulation also includes all
     * policies attached to any groups the user is a member of.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of a user, group, or role whose
     *         policies you want to include in the simulation. If you specify a user,
     *         group, or role, the simulation includes all policies associated with
     *         that entity. If you specify a user, the simulation also includes all
     *         policies attached to any groups the user is a member of.
     */
    public String getPolicySourceArn() {
        return policySourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies associated with
     * that entity. If you specify a user, the simulation also includes all
     * policies attached to any groups the user is a member of.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn The Amazon Resource Name (ARN) of a user, group, or role whose
     *         policies you want to include in the simulation. If you specify a user,
     *         group, or role, the simulation includes all policies associated with
     *         that entity. If you specify a user, the simulation also includes all
     *         policies attached to any groups the user is a member of.
     */
    public void setPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of a user, group, or role whose
     * policies you want to include in the simulation. If you specify a user,
     * group, or role, the simulation includes all policies associated with
     * that entity. If you specify a user, the simulation also includes all
     * policies attached to any groups the user is a member of.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn The Amazon Resource Name (ARN) of a user, group, or role whose
     *         policies you want to include in the simulation. If you specify a user,
     *         group, or role, the simulation includes all policies associated with
     *         that entity. If you specify a user, the simulation also includes all
     *         policies attached to any groups the user is a member of.
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
     * it in the response.
     *
     * @return A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response.
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
     * it in the response.
     *
     * @param resourceArns A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response.
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
     * it in the response.
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
     *         it in the response.
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
     * it in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceArns A list of ARNs of AWS resources to include in the simulation. If this
     *         parameter is not provided then the value defaults to <code>*</code>
     *         (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines
     *         the access result (allowed or denied) of each combination and reports
     *         it in the response.
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
     * A list of context keys and corresponding values that are used by the
     * simulation. Whenever a context key is evaluated by a
     * <code>Condition</code> element in one of the simulated IAM permission
     * policies, the corresponding value is supplied.
     *
     * @return A list of context keys and corresponding values that are used by the
     *         simulation. Whenever a context key is evaluated by a
     *         <code>Condition</code> element in one of the simulated IAM permission
     *         policies, the corresponding value is supplied.
     */
    public java.util.List<ContextEntry> getContextEntries() {
        if (contextEntries == null) {
              contextEntries = new com.amazonaws.internal.ListWithAutoConstructFlag<ContextEntry>();
              contextEntries.setAutoConstruct(true);
        }
        return contextEntries;
    }
    
    /**
     * A list of context keys and corresponding values that are used by the
     * simulation. Whenever a context key is evaluated by a
     * <code>Condition</code> element in one of the simulated IAM permission
     * policies, the corresponding value is supplied.
     *
     * @param contextEntries A list of context keys and corresponding values that are used by the
     *         simulation. Whenever a context key is evaluated by a
     *         <code>Condition</code> element in one of the simulated IAM permission
     *         policies, the corresponding value is supplied.
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
     * A list of context keys and corresponding values that are used by the
     * simulation. Whenever a context key is evaluated by a
     * <code>Condition</code> element in one of the simulated IAM permission
     * policies, the corresponding value is supplied.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContextEntries(java.util.Collection)} or {@link
     * #withContextEntries(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextEntries A list of context keys and corresponding values that are used by the
     *         simulation. Whenever a context key is evaluated by a
     *         <code>Condition</code> element in one of the simulated IAM permission
     *         policies, the corresponding value is supplied.
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
     * A list of context keys and corresponding values that are used by the
     * simulation. Whenever a context key is evaluated by a
     * <code>Condition</code> element in one of the simulated IAM permission
     * policies, the corresponding value is supplied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextEntries A list of context keys and corresponding values that are used by the
     *         simulation. Whenever a context key is evaluated by a
     *         <code>Condition</code> element in one of the simulated IAM permission
     *         policies, the corresponding value is supplied.
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
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. <p>This parameter is optional. If you do
     *         not include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. If this is the
     *         case, the <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to include
     *         in the subsequent call that tells the service where to continue from.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. <p>This parameter is optional. If you do
     *         not include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. If this is the
     *         case, the <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to include
     *         in the subsequent call that tells the service where to continue from.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. <p>This parameter is optional. If you do
     *         not include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. If this is the
     *         case, the <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to include
     *         in the subsequent call that tells the service where to continue from.
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
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response you
     *         received to inform the next call about where to start.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response you
     *         received to inform the next call about where to start.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response you
     *         received to inform the next call about where to start.
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
        if (getContextEntries() != null) sb.append("ContextEntries: " + getContextEntries() + ",");
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
        hashCode = prime * hashCode + ((getContextEntries() == null) ? 0 : getContextEntries().hashCode()); 
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
        if (other.getContextEntries() == null ^ this.getContextEntries() == null) return false;
        if (other.getContextEntries() != null && other.getContextEntries().equals(this.getContextEntries()) == false) return false; 
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
    