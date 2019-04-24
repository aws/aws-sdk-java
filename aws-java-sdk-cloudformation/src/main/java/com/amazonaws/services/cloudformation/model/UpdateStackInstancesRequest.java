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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack instances.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The names of one or more AWS accounts for which you want to update parameter values for stack instances. The
     * overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accounts;
    /**
     * <p>
     * The names of one or more regions in which you want to update parameter values for stack instances. The overridden
     * parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;
    /**
     * <p>
     * A list of input parameters whose values you want to update for the specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify both a
     * value and set <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do
     * not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     * parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter to a
     * template, before you can override the parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameterOverrides;
    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;
    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack instances.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set associated with the stack instances.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack instances.
     * </p>
     * 
     * @return The name or unique ID of the stack set associated with the stack instances.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack instances.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set associated with the stack instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to update parameter values for stack instances. The
     * overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * 
     * @return The names of one or more AWS accounts for which you want to update parameter values for stack instances.
     *         The overridden parameter values will be applied to all stack instances in the specified accounts and
     *         regions.
     */

    public java.util.List<String> getAccounts() {
        if (accounts == null) {
            accounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accounts;
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to update parameter values for stack instances. The
     * overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * 
     * @param accounts
     *        The names of one or more AWS accounts for which you want to update parameter values for stack instances.
     *        The overridden parameter values will be applied to all stack instances in the specified accounts and
     *        regions.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new com.amazonaws.internal.SdkInternalList<String>(accounts);
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to update parameter values for stack instances. The
     * overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The names of one or more AWS accounts for which you want to update parameter values for stack instances.
     *        The overridden parameter values will be applied to all stack instances in the specified accounts and
     *        regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new com.amazonaws.internal.SdkInternalList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to update parameter values for stack instances. The
     * overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * 
     * @param accounts
     *        The names of one or more AWS accounts for which you want to update parameter values for stack instances.
     *        The overridden parameter values will be applied to all stack instances in the specified accounts and
     *        regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The names of one or more regions in which you want to update parameter values for stack instances. The overridden
     * parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * 
     * @return The names of one or more regions in which you want to update parameter values for stack instances. The
     *         overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * The names of one or more regions in which you want to update parameter values for stack instances. The overridden
     * parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * 
     * @param regions
     *        The names of one or more regions in which you want to update parameter values for stack instances. The
     *        overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(regions);
    }

    /**
     * <p>
     * The names of one or more regions in which you want to update parameter values for stack instances. The overridden
     * parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The names of one or more regions in which you want to update parameter values for stack instances. The
     *        overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more regions in which you want to update parameter values for stack instances. The overridden
     * parameter values will be applied to all stack instances in the specified accounts and regions.
     * </p>
     * 
     * @param regions
     *        The names of one or more regions in which you want to update parameter values for stack instances. The
     *        overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify both a
     * value and set <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do
     * not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     * parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter to a
     * template, before you can override the parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @return A list of input parameters whose values you want to update for the specified stack instances. </p>
     *         <p>
     *         Any overridden parameter values will be applied to all stack instances in the specified accounts and
     *         regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter
     *         values during stack instance update operations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To override the current value for a parameter, include the parameter and specify its value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To leave a parameter set to its present value, you can do one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do not include the parameter in the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify
     *         both a value and set <code>UsePreviousValue</code> to <code>true</code>.)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         To set all overridden parameter back to the values specified in the stack set, specify a parameter list
     *         but do not include any parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To leave all parameters set to their present values, do not specify this property at all.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         During stack set updates, any parameter values overridden for a stack instance are not updated, but
     *         retain their overridden value.
     *         </p>
     *         <p>
     *         You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     *         parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a
     *         parameter to a template, before you can override the parameter value specified in the stack set you must
     *         first use <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     *         >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified
     *         in the stack set. Once a stack instance has been updated with the new parameter, you can then override
     *         the parameter value using <code>UpdateStackInstances</code>.
     */

    public java.util.List<Parameter> getParameterOverrides() {
        if (parameterOverrides == null) {
            parameterOverrides = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameterOverrides;
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify both a
     * value and set <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do
     * not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     * parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter to a
     * template, before you can override the parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of input parameters whose values you want to update for the specified stack instances. </p>
     *        <p>
     *        Any overridden parameter values will be applied to all stack instances in the specified accounts and
     *        regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter
     *        values during stack instance update operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To override the current value for a parameter, include the parameter and specify its value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To leave a parameter set to its present value, you can do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do not include the parameter in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify
     *        both a value and set <code>UsePreviousValue</code> to <code>true</code>.)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        To set all overridden parameter back to the values specified in the stack set, specify a parameter list
     *        but do not include any parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To leave all parameters set to their present values, do not specify this property at all.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        During stack set updates, any parameter values overridden for a stack instance are not updated, but retain
     *        their overridden value.
     *        </p>
     *        <p>
     *        You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     *        parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter
     *        to a template, before you can override the parameter value specified in the stack set you must first use
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">
     *        UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified
     *        in the stack set. Once a stack instance has been updated with the new parameter, you can then override the
     *        parameter value using <code>UpdateStackInstances</code>.
     */

    public void setParameterOverrides(java.util.Collection<Parameter> parameterOverrides) {
        if (parameterOverrides == null) {
            this.parameterOverrides = null;
            return;
        }

        this.parameterOverrides = new com.amazonaws.internal.SdkInternalList<Parameter>(parameterOverrides);
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify both a
     * value and set <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do
     * not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     * parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter to a
     * template, before you can override the parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterOverrides(java.util.Collection)} or {@link #withParameterOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of input parameters whose values you want to update for the specified stack instances. </p>
     *        <p>
     *        Any overridden parameter values will be applied to all stack instances in the specified accounts and
     *        regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter
     *        values during stack instance update operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To override the current value for a parameter, include the parameter and specify its value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To leave a parameter set to its present value, you can do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do not include the parameter in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify
     *        both a value and set <code>UsePreviousValue</code> to <code>true</code>.)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        To set all overridden parameter back to the values specified in the stack set, specify a parameter list
     *        but do not include any parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To leave all parameters set to their present values, do not specify this property at all.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        During stack set updates, any parameter values overridden for a stack instance are not updated, but retain
     *        their overridden value.
     *        </p>
     *        <p>
     *        You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     *        parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter
     *        to a template, before you can override the parameter value specified in the stack set you must first use
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">
     *        UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified
     *        in the stack set. Once a stack instance has been updated with the new parameter, you can then override the
     *        parameter value using <code>UpdateStackInstances</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withParameterOverrides(Parameter... parameterOverrides) {
        if (this.parameterOverrides == null) {
            setParameterOverrides(new com.amazonaws.internal.SdkInternalList<Parameter>(parameterOverrides.length));
        }
        for (Parameter ele : parameterOverrides) {
            this.parameterOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in the specified accounts and regions.
     * When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify both a
     * value and set <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do
     * not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     * parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter to a
     * template, before you can override the parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of input parameters whose values you want to update for the specified stack instances. </p>
     *        <p>
     *        Any overridden parameter values will be applied to all stack instances in the specified accounts and
     *        regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter
     *        values during stack instance update operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        To override the current value for a parameter, include the parameter and specify its value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To leave a parameter set to its present value, you can do one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Do not include the parameter in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Include the parameter and specify <code>UsePreviousValue</code> as <code>true</code>. (You cannot specify
     *        both a value and set <code>UsePreviousValue</code> to <code>true</code>.)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        To set all overridden parameter back to the values specified in the stack set, specify a parameter list
     *        but do not include any parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To leave all parameters set to their present values, do not specify this property at all.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        During stack set updates, any parameter values overridden for a stack instance are not updated, but retain
     *        their overridden value.
     *        </p>
     *        <p>
     *        You can only override the parameter <i>values</i> that are specified in the stack set; to add or delete a
     *        parameter itself, use <code>UpdateStackSet</code> to update the stack set template. If you add a parameter
     *        to a template, before you can override the parameter value specified in the stack set you must first use
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">
     *        UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified
     *        in the stack set. Once a stack instance has been updated with the new parameter, you can then override the
     *        parameter value using <code>UpdateStackInstances</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withParameterOverrides(java.util.Collection<Parameter> parameterOverrides) {
        setParameterOverrides(parameterOverrides);
        return this;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        Preferences for how AWS CloudFormation performs this stack set operation.
     */

    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @return Preferences for how AWS CloudFormation performs this stack set operation.
     */

    public StackSetOperationPreferences getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        Preferences for how AWS CloudFormation performs this stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withOperationPreferences(StackSetOperationPreferences operationPreferences) {
        setOperationPreferences(operationPreferences);
        return this;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * 
     * @param operationId
     *        The unique identifier for this stack set operation. </p>
     *        <p>
     *        The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *        stack set operation only once, even if you retry the request multiple times. You might retry stack set
     *        operation requests to ensure that AWS CloudFormation successfully received them.
     *        </p>
     *        <p>
     *        If you don't specify an operation ID, the SDK generates one automatically.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * 
     * @return The unique identifier for this stack set operation. </p>
     *         <p>
     *         The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *         stack set operation only once, even if you retry the request multiple times. You might retry stack set
     *         operation requests to ensure that AWS CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         If you don't specify an operation ID, the SDK generates one automatically.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set
     * operation only once, even if you retry the request multiple times. You might retry stack set operation requests
     * to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * 
     * @param operationId
     *        The unique identifier for this stack set operation. </p>
     *        <p>
     *        The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the
     *        stack set operation only once, even if you retry the request multiple times. You might retry stack set
     *        operation requests to ensure that AWS CloudFormation successfully received them.
     *        </p>
     *        <p>
     *        If you don't specify an operation ID, the SDK generates one automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackInstancesRequest withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getParameterOverrides() != null)
            sb.append("ParameterOverrides: ").append(getParameterOverrides()).append(",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: ").append(getOperationPreferences()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackInstancesRequest == false)
            return false;
        UpdateStackInstancesRequest other = (UpdateStackInstancesRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getParameterOverrides() == null ^ this.getParameterOverrides() == null)
            return false;
        if (other.getParameterOverrides() != null && other.getParameterOverrides().equals(this.getParameterOverrides()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getParameterOverrides() == null) ? 0 : getParameterOverrides().hashCode());
        hashCode = prime * hashCode + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackInstancesRequest clone() {
        return (UpdateStackInstancesRequest) super.clone();
    }

}
