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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SimulateCustomPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulateCustomPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html">GetFederationToken</a> or
     * one of the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     * operations. In other words, do not use policies designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyInputList;
    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     * resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> actionNames;
    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value
     * defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for
     * each resource in this list. The simulation determines the access result (allowed or denied) of each combination
     * and reports it in the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included in the
     * simulation or you receive an invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceArns;
    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is
     * treated as if it had this policy attached. You can include only one resource-based policy in a simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private String resourcePolicy;
    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not identify
     * its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code> included in the simulation. If the
     * <code>ResourceOwner</code> parameter is not specified, then the owner of the resources and the resource policy
     * defaults to the account of the identity provided in <code>CallerArn</code>. This parameter is required only if
     * you specify a resource-based policy and account that owns the resource is different from the account that owns
     * the simulated calling user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     * example, to represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     * <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     * <code>Principal</code> element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a
     * service principal.
     * </p>
     */
    private String callerArn;
    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in
     * one of the simulated IAM permission policies, the corresponding value is supplied.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContextEntry> contextEntries;
    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that support resource-based policies require
     * different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator
     * to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does
     * not match one of the following scenarios, then you can omit this parameter. The following list shows each of the
     * supported scenario values and the resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your
     * scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you must specify the
     * subnet resource. For more information on the EC2 scenario options, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     */
    private String resourceHandlingOption;
    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html">GetFederationToken</a> or
     * one of the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     * operations. In other words, do not use policies designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of policy documents to include in the simulation. Each document is specified as a string
     *         containing the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in
     *         this parameter. Any resource-based policy must be submitted with the <code>ResourcePolicy</code>
     *         parameter. The policies cannot be "scope-down" policies, such as you could include in a call to <a
     *         href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *         >GetFederationToken</a> or one of the <a
     *         href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     *         operations. In other words, do not use policies designed to restrict what a user can do while using the
     *         temporary credentials.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
            policyInputList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyInputList;
    }

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html">GetFederationToken</a> or
     * one of the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     * operations. In other words, do not use policies designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyInputList
     *        A list of policy documents to include in the simulation. Each document is specified as a string containing
     *        the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this
     *        parameter. Any resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The
     *        policies cannot be "scope-down" policies, such as you could include in a call to <a
     *        href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *        >GetFederationToken</a> or one of the <a
     *        href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     *        operations. In other words, do not use policies designed to restrict what a user can do while using the
     *        temporary credentials.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }

        this.policyInputList = new com.amazonaws.internal.SdkInternalList<String>(policyInputList);
    }

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html">GetFederationToken</a> or
     * one of the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     * operations. In other words, do not use policies designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyInputList(java.util.Collection)} or {@link #withPolicyInputList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyInputList
     *        A list of policy documents to include in the simulation. Each document is specified as a string containing
     *        the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this
     *        parameter. Any resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The
     *        policies cannot be "scope-down" policies, such as you could include in a call to <a
     *        href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *        >GetFederationToken</a> or one of the <a
     *        href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     *        operations. In other words, do not use policies designed to restrict what a user can do while using the
     *        temporary credentials.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withPolicyInputList(String... policyInputList) {
        if (this.policyInputList == null) {
            setPolicyInputList(new com.amazonaws.internal.SdkInternalList<String>(policyInputList.length));
        }
        for (String ele : policyInputList) {
            this.policyInputList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of policy documents to include in the simulation. Each document is specified as a string containing the
     * complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any
     * resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The policies cannot be
     * "scope-down" policies, such as you could include in a call to <a
     * href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html">GetFederationToken</a> or
     * one of the <a href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     * operations. In other words, do not use policies designed to restrict what a user can do while using the temporary
     * credentials.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyInputList
     *        A list of policy documents to include in the simulation. Each document is specified as a string containing
     *        the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this
     *        parameter. Any resource-based policy must be submitted with the <code>ResourcePolicy</code> parameter. The
     *        policies cannot be "scope-down" policies, such as you could include in a call to <a
     *        href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_GetFederationToken.html"
     *        >GetFederationToken</a> or one of the <a
     *        href="https://docs.aws.amazon.com/IAM/latest/APIReference/API_AssumeRole.html">AssumeRole</a> API
     *        operations. In other words, do not use policies designed to restrict what a user can do while using the
     *        temporary credentials.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withPolicyInputList(java.util.Collection<String> policyInputList) {
        setPolicyInputList(policyInputList);
        return this;
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     * resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * </p>
     * 
     * @return A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     *         resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     */

    public java.util.List<String> getActionNames() {
        if (actionNames == null) {
            actionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return actionNames;
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     * resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * </p>
     * 
     * @param actionNames
     *        A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     *        resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     */

    public void setActionNames(java.util.Collection<String> actionNames) {
        if (actionNames == null) {
            this.actionNames = null;
            return;
        }

        this.actionNames = new com.amazonaws.internal.SdkInternalList<String>(actionNames);
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     * resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionNames(java.util.Collection)} or {@link #withActionNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionNames
     *        A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     *        resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withActionNames(String... actionNames) {
        if (this.actionNames == null) {
            setActionNames(new com.amazonaws.internal.SdkInternalList<String>(actionNames.length));
        }
        for (String ele : actionNames) {
            this.actionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     * resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * </p>
     * 
     * @param actionNames
     *        A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each
     *        resource. Each operation must include the service identifier, such as <code>iam:CreateUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withActionNames(java.util.Collection<String> actionNames) {
        setActionNames(actionNames);
        return this;
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value
     * defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for
     * each resource in this list. The simulation determines the access result (allowed or denied) of each combination
     * and reports it in the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included in the
     * simulation or you receive an invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the
     *         value defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is
     *         evaluated for each resource in this list. The simulation determines the access result (allowed or denied)
     *         of each combination and reports it in the response.</p>
     *         <p>
     *         The simulation does not automatically retrieve policies for the specified resources. If you want to
     *         include a resource policy in the simulation, then you must include the policy as a string in the
     *         <code>ResourcePolicy</code> parameter.
     *         </p>
     *         <p>
     *         If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included
     *         in the simulation or you receive an invalid input error.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public java.util.List<String> getResourceArns() {
        if (resourceArns == null) {
            resourceArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceArns;
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value
     * defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for
     * each resource in this list. The simulation determines the access result (allowed or denied) of each combination
     * and reports it in the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included in the
     * simulation or you receive an invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceArns
     *        A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the
     *        value defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is
     *        evaluated for each resource in this list. The simulation determines the access result (allowed or denied)
     *        of each combination and reports it in the response.</p>
     *        <p>
     *        The simulation does not automatically retrieve policies for the specified resources. If you want to
     *        include a resource policy in the simulation, then you must include the policy as a string in the
     *        <code>ResourcePolicy</code> parameter.
     *        </p>
     *        <p>
     *        If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included
     *        in the simulation or you receive an invalid input error.
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new com.amazonaws.internal.SdkInternalList<String>(resourceArns);
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value
     * defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for
     * each resource in this list. The simulation determines the access result (allowed or denied) of each combination
     * and reports it in the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included in the
     * simulation or you receive an invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the
     *        value defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is
     *        evaluated for each resource in this list. The simulation determines the access result (allowed or denied)
     *        of each combination and reports it in the response.</p>
     *        <p>
     *        The simulation does not automatically retrieve policies for the specified resources. If you want to
     *        include a resource policy in the simulation, then you must include the policy as a string in the
     *        <code>ResourcePolicy</code> parameter.
     *        </p>
     *        <p>
     *        If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included
     *        in the simulation or you receive an invalid input error.
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new com.amazonaws.internal.SdkInternalList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value
     * defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is evaluated for
     * each resource in this list. The simulation determines the access result (allowed or denied) of each combination
     * and reports it in the response.
     * </p>
     * <p>
     * The simulation does not automatically retrieve policies for the specified resources. If you want to include a
     * resource policy in the simulation, then you must include the policy as a string in the
     * <code>ResourcePolicy</code> parameter.
     * </p>
     * <p>
     * If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included in the
     * simulation or you receive an invalid input error.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceArns
     *        A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the
     *        value defaults to <code>*</code> (all resources). Each API in the <code>ActionNames</code> parameter is
     *        evaluated for each resource in this list. The simulation determines the access result (allowed or denied)
     *        of each combination and reports it in the response.</p>
     *        <p>
     *        The simulation does not automatically retrieve policies for the specified resources. If you want to
     *        include a resource policy in the simulation, then you must include the policy as a string in the
     *        <code>ResourcePolicy</code> parameter.
     *        </p>
     *        <p>
     *        If you include a <code>ResourcePolicy</code>, then it must be applicable to all of the resources included
     *        in the simulation or you receive an invalid input error.
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is
     * treated as if it had this policy attached. You can include only one resource-based policy in a simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourcePolicy
     *        A resource-based policy to include in the simulation provided as a string. Each resource in the simulation
     *        is treated as if it had this policy attached. You can include only one resource-based policy in a
     *        simulation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is
     * treated as if it had this policy attached. You can include only one resource-based policy in a simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return A resource-based policy to include in the simulation provided as a string. Each resource in the
     *         simulation is treated as if it had this policy attached. You can include only one resource-based policy
     *         in a simulation.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is
     * treated as if it had this policy attached. You can include only one resource-based policy in a simulation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourcePolicy
     *        A resource-based policy to include in the simulation provided as a string. Each resource in the simulation
     *        is treated as if it had this policy attached. You can include only one resource-based policy in a
     *        simulation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
        return this;
    }

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not identify
     * its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code> included in the simulation. If the
     * <code>ResourceOwner</code> parameter is not specified, then the owner of the resources and the resource policy
     * defaults to the account of the identity provided in <code>CallerArn</code>. This parameter is required only if
     * you specify a resource-based policy and account that owns the resource is different from the account that owns
     * the simulated calling user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     * example, to represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * 
     * @param resourceOwner
     *        An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not
     *        identify its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is
     *        specified, it is also used as the account owner of any <code>ResourcePolicy</code> included in the
     *        simulation. If the <code>ResourceOwner</code> parameter is not specified, then the owner of the resources
     *        and the resource policy defaults to the account of the identity provided in <code>CallerArn</code>. This
     *        parameter is required only if you specify a resource-based policy and account that owns the resource is
     *        different from the account that owns the simulated calling user <code>CallerArn</code>.</p>
     *        <p>
     *        The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>.
     *        For example, to represent the account with the 112233445566 ID, use the following ARN:
     *        <code>arn:aws:iam::112233445566-ID:root</code>.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not identify
     * its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code> included in the simulation. If the
     * <code>ResourceOwner</code> parameter is not specified, then the owner of the resources and the resource policy
     * defaults to the account of the identity provided in <code>CallerArn</code>. This parameter is required only if
     * you specify a resource-based policy and account that owns the resource is different from the account that owns
     * the simulated calling user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     * example, to represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * 
     * @return An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not
     *         identify its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is
     *         specified, it is also used as the account owner of any <code>ResourcePolicy</code> included in the
     *         simulation. If the <code>ResourceOwner</code> parameter is not specified, then the owner of the resources
     *         and the resource policy defaults to the account of the identity provided in <code>CallerArn</code>. This
     *         parameter is required only if you specify a resource-based policy and account that owns the resource is
     *         different from the account that owns the simulated calling user <code>CallerArn</code>.</p>
     *         <p>
     *         The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>.
     *         For example, to represent the account with the 112233445566 ID, use the following ARN:
     *         <code>arn:aws:iam::112233445566-ID:root</code>.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not identify
     * its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is specified, it is
     * also used as the account owner of any <code>ResourcePolicy</code> included in the simulation. If the
     * <code>ResourceOwner</code> parameter is not specified, then the owner of the resources and the resource policy
     * defaults to the account of the identity provided in <code>CallerArn</code>. This parameter is required only if
     * you specify a resource-based policy and account that owns the resource is different from the account that owns
     * the simulated calling user <code>CallerArn</code>.
     * </p>
     * <p>
     * The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>. For
     * example, to represent the account with the 112233445566 ID, use the following ARN:
     * <code>arn:aws:iam::112233445566-ID:root</code>.
     * </p>
     * 
     * @param resourceOwner
     *        An ARN representing the AWS account ID that specifies the owner of any simulated resource that does not
     *        identify its owner in the resource ARN, such as an S3 bucket or object. If <code>ResourceOwner</code> is
     *        specified, it is also used as the account owner of any <code>ResourcePolicy</code> included in the
     *        simulation. If the <code>ResourceOwner</code> parameter is not specified, then the owner of the resources
     *        and the resource policy defaults to the account of the identity provided in <code>CallerArn</code>. This
     *        parameter is required only if you specify a resource-based policy and account that owns the resource is
     *        different from the account that owns the simulated calling user <code>CallerArn</code>.</p>
     *        <p>
     *        The ARN for an account uses the following syntax: <code>arn:aws:iam::<i>AWS-account-ID</i>:root</code>.
     *        For example, to represent the account with the 112233445566 ID, use the following ARN:
     *        <code>arn:aws:iam::112233445566-ID:root</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     * <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     * <code>Principal</code> element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a
     * service principal.
     * </p>
     * 
     * @param callerArn
     *        The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     *        <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     *        <code>Principal</code> element has a value to use in evaluating the policy.</p>
     *        <p>
     *        You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated
     *        user, or a service principal.
     */

    public void setCallerArn(String callerArn) {
        this.callerArn = callerArn;
    }

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     * <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     * <code>Principal</code> element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a
     * service principal.
     * </p>
     * 
     * @return The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     *         <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     *         <code>Principal</code> element has a value to use in evaluating the policy.</p>
     *         <p>
     *         You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated
     *         user, or a service principal.
     */

    public String getCallerArn() {
        return this.callerArn;
    }

    /**
     * <p>
     * The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     * <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     * <code>Principal</code> element has a value to use in evaluating the policy.
     * </p>
     * <p>
     * You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a
     * service principal.
     * </p>
     * 
     * @param callerArn
     *        The ARN of the IAM user that you want to use as the simulated caller of the API operations.
     *        <code>CallerArn</code> is required if you include a <code>ResourcePolicy</code> so that the policy's
     *        <code>Principal</code> element has a value to use in evaluating the policy.</p>
     *        <p>
     *        You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated
     *        user, or a service principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withCallerArn(String callerArn) {
        setCallerArn(callerArn);
        return this;
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in
     * one of the simulated IAM permission policies, the corresponding value is supplied.
     * </p>
     * 
     * @return A list of context keys and corresponding values for the simulation to use. Whenever a context key is
     *         evaluated in one of the simulated IAM permission policies, the corresponding value is supplied.
     */

    public java.util.List<ContextEntry> getContextEntries() {
        if (contextEntries == null) {
            contextEntries = new com.amazonaws.internal.SdkInternalList<ContextEntry>();
        }
        return contextEntries;
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in
     * one of the simulated IAM permission policies, the corresponding value is supplied.
     * </p>
     * 
     * @param contextEntries
     *        A list of context keys and corresponding values for the simulation to use. Whenever a context key is
     *        evaluated in one of the simulated IAM permission policies, the corresponding value is supplied.
     */

    public void setContextEntries(java.util.Collection<ContextEntry> contextEntries) {
        if (contextEntries == null) {
            this.contextEntries = null;
            return;
        }

        this.contextEntries = new com.amazonaws.internal.SdkInternalList<ContextEntry>(contextEntries);
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in
     * one of the simulated IAM permission policies, the corresponding value is supplied.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContextEntries(java.util.Collection)} or {@link #withContextEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param contextEntries
     *        A list of context keys and corresponding values for the simulation to use. Whenever a context key is
     *        evaluated in one of the simulated IAM permission policies, the corresponding value is supplied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withContextEntries(ContextEntry... contextEntries) {
        if (this.contextEntries == null) {
            setContextEntries(new com.amazonaws.internal.SdkInternalList<ContextEntry>(contextEntries.length));
        }
        for (ContextEntry ele : contextEntries) {
            this.contextEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in
     * one of the simulated IAM permission policies, the corresponding value is supplied.
     * </p>
     * 
     * @param contextEntries
     *        A list of context keys and corresponding values for the simulation to use. Whenever a context key is
     *        evaluated in one of the simulated IAM permission policies, the corresponding value is supplied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withContextEntries(java.util.Collection<ContextEntry> contextEntries) {
        setContextEntries(contextEntries);
        return this;
    }

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that support resource-based policies require
     * different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator
     * to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does
     * not match one of the following scenarios, then you can omit this parameter. The following list shows each of the
     * supported scenario values and the resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your
     * scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you must specify the
     * subnet resource. For more information on the EC2 scenario options, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceHandlingOption
     *        Specifies the type of simulation to run. Different API operations that support resource-based policies
     *        require different combinations of resources. By specifying the type of simulation to run, you enable the
     *        policy simulator to enforce the presence of the required resources to ensure reliable simulation results.
     *        If your simulation does not match one of the following scenarios, then you can omit this parameter. The
     *        following list shows each of the supported scenario values and the resources that you must define to run
     *        the simulation.</p>
     *        <p>
     *        Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your
     *        scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario
     *        includes VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you
     *        must specify the subnet resource. For more information on the EC2 scenario options, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>EC2-Classic-InstanceStore</b>
     *        </p>
     *        <p>
     *        instance, image, security-group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-Classic-EBS</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, volume
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-InstanceStore</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-InstanceStore-Subnet</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface, subnet
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-EBS</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface, volume
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-EBS-Subnet</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface, subnet, volume
     *        </p>
     *        </li>
     */

    public void setResourceHandlingOption(String resourceHandlingOption) {
        this.resourceHandlingOption = resourceHandlingOption;
    }

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that support resource-based policies require
     * different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator
     * to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does
     * not match one of the following scenarios, then you can omit this parameter. The following list shows each of the
     * supported scenario values and the resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your
     * scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you must specify the
     * subnet resource. For more information on the EC2 scenario options, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of simulation to run. Different API operations that support resource-based policies
     *         require different combinations of resources. By specifying the type of simulation to run, you enable the
     *         policy simulator to enforce the presence of the required resources to ensure reliable simulation results.
     *         If your simulation does not match one of the following scenarios, then you can omit this parameter. The
     *         following list shows each of the supported scenario values and the resources that you must define to run
     *         the simulation.</p>
     *         <p>
     *         Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If
     *         your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2
     *         scenario includes VPC, then you must supply the network-interface resource. If it includes an IP subnet,
     *         then you must specify the subnet resource. For more information on the EC2 scenario options, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *         Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>EC2-Classic-InstanceStore</b>
     *         </p>
     *         <p>
     *         instance, image, security-group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-Classic-EBS</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, volume
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-InstanceStore</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-InstanceStore-Subnet</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface, subnet
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-EBS</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface, volume
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EC2-VPC-EBS-Subnet</b>
     *         </p>
     *         <p>
     *         instance, image, security-group, network-interface, subnet, volume
     *         </p>
     *         </li>
     */

    public String getResourceHandlingOption() {
        return this.resourceHandlingOption;
    }

    /**
     * <p>
     * Specifies the type of simulation to run. Different API operations that support resource-based policies require
     * different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator
     * to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does
     * not match one of the following scenarios, then you can omit this parameter. The following list shows each of the
     * supported scenario values and the resources that you must define to run the simulation.
     * </p>
     * <p>
     * Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your
     * scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes
     * VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you must specify the
     * subnet resource. For more information on the EC2 scenario options, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2-Classic-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-Classic-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-InstanceStore-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, volume
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EC2-VPC-EBS-Subnet</b>
     * </p>
     * <p>
     * instance, image, security-group, network-interface, subnet, volume
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceHandlingOption
     *        Specifies the type of simulation to run. Different API operations that support resource-based policies
     *        require different combinations of resources. By specifying the type of simulation to run, you enable the
     *        policy simulator to enforce the presence of the required resources to ensure reliable simulation results.
     *        If your simulation does not match one of the following scenarios, then you can omit this parameter. The
     *        following list shows each of the supported scenario values and the resources that you must define to run
     *        the simulation.</p>
     *        <p>
     *        Each of the EC2 scenarios requires that you specify instance, image, and security-group resources. If your
     *        scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario
     *        includes VPC, then you must supply the network-interface resource. If it includes an IP subnet, then you
     *        must specify the subnet resource. For more information on the EC2 scenario options, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a> in the <i>Amazon EC2 User Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>EC2-Classic-InstanceStore</b>
     *        </p>
     *        <p>
     *        instance, image, security-group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-Classic-EBS</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, volume
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-InstanceStore</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-InstanceStore-Subnet</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface, subnet
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-EBS</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface, volume
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EC2-VPC-EBS-Subnet</b>
     *        </p>
     *        <p>
     *        instance, image, security-group, network-interface, subnet, volume
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withResourceHandlingOption(String resourceHandlingOption) {
        setResourceHandlingOption(resourceHandlingOption);
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @return Use this only when paginating results to indicate the maximum number of items you want in the response.
     *         If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *         fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *         response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *         subsequent call that tells the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulateCustomPolicyRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getPolicyInputList() != null)
            sb.append("PolicyInputList: ").append(getPolicyInputList()).append(",");
        if (getActionNames() != null)
            sb.append("ActionNames: ").append(getActionNames()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getCallerArn() != null)
            sb.append("CallerArn: ").append(getCallerArn()).append(",");
        if (getContextEntries() != null)
            sb.append("ContextEntries: ").append(getContextEntries()).append(",");
        if (getResourceHandlingOption() != null)
            sb.append("ResourceHandlingOption: ").append(getResourceHandlingOption()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulateCustomPolicyRequest == false)
            return false;
        SimulateCustomPolicyRequest other = (SimulateCustomPolicyRequest) obj;
        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null)
            return false;
        if (other.getPolicyInputList() != null && other.getPolicyInputList().equals(this.getPolicyInputList()) == false)
            return false;
        if (other.getActionNames() == null ^ this.getActionNames() == null)
            return false;
        if (other.getActionNames() != null && other.getActionNames().equals(this.getActionNames()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getCallerArn() == null ^ this.getCallerArn() == null)
            return false;
        if (other.getCallerArn() != null && other.getCallerArn().equals(this.getCallerArn()) == false)
            return false;
        if (other.getContextEntries() == null ^ this.getContextEntries() == null)
            return false;
        if (other.getContextEntries() != null && other.getContextEntries().equals(this.getContextEntries()) == false)
            return false;
        if (other.getResourceHandlingOption() == null ^ this.getResourceHandlingOption() == null)
            return false;
        if (other.getResourceHandlingOption() != null && other.getResourceHandlingOption().equals(this.getResourceHandlingOption()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
    public SimulateCustomPolicyRequest clone() {
        return (SimulateCustomPolicyRequest) super.clone();
    }

}
