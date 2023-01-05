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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAddon" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAddonRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to create the add-on for.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the add-on. The name must match one of the names that <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a> returns.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     */
    private String addonVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role, then the add-on
     * uses the permissions assigned to the node IAM role. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your cluster.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html">Enabling IAM
     * roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * </note>
     */
    private String serviceAccountRoleArn;
    /**
     * <p>
     * How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value you
     * choose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't change
     * the value. Creation of the add-on might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon EKS
     * default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon EKS
     * add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you specify.
     * </p>
     */
    private String resolveConflicts;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key
     * and an optional value. You define both.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The set of configuration values for the add-on that's created. The values that you provide are validated against
     * the schema in <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     * <code>DescribeAddonConfiguration</code> </a>.
     * </p>
     */
    private String configurationValues;

    /**
     * <p>
     * The name of the cluster to create the add-on for.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to create the add-on for.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to create the add-on for.
     * </p>
     * 
     * @return The name of the cluster to create the add-on for.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to create the add-on for.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to create the add-on for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names that <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a> returns.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names that <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *        <code>DescribeAddonVersions</code> </a> returns.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names that <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a> returns.
     * </p>
     * 
     * @return The name of the add-on. The name must match one of the names that <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *         <code>DescribeAddonVersions</code> </a> returns.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names that <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a> returns.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names that <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *        <code>DescribeAddonVersions</code> </a> returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on. The version must match one of the versions returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *        <code>DescribeAddonVersions</code> </a>.
     */

    public void setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
    }

    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     * 
     * @return The version of the add-on. The version must match one of the versions returned by <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *         <code>DescribeAddonVersions</code> </a>.
     */

    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on. The version must match one of the versions returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *        <code>DescribeAddonVersions</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withAddonVersion(String addonVersion) {
        setAddonVersion(addonVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role, then the add-on
     * uses the permissions assigned to the node IAM role. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your cluster.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html">Enabling IAM
     * roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param serviceAccountRoleArn
     *        The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role
     *        must be assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role,
     *        then the add-on uses the permissions assigned to the node IAM role. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM role</a>
     *        in the <i>Amazon EKS User Guide</i>.</p> <note>
     *        <p>
     *        To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your
     *        cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html"
     *        >Enabling IAM roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     *        </p>
     */

    public void setServiceAccountRoleArn(String serviceAccountRoleArn) {
        this.serviceAccountRoleArn = serviceAccountRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role, then the add-on
     * uses the permissions assigned to the node IAM role. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your cluster.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html">Enabling IAM
     * roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role
     *         must be assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role,
     *         then the add-on uses the permissions assigned to the node IAM role. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM
     *         role</a> in the <i>Amazon EKS User Guide</i>.</p> <note>
     *         <p>
     *         To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your
     *         cluster. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html"
     *         >Enabling IAM roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     *         </p>
     */

    public String getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role, then the add-on
     * uses the permissions assigned to the node IAM role. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your cluster.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html">Enabling IAM
     * roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param serviceAccountRoleArn
     *        The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role
     *        must be assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role,
     *        then the add-on uses the permissions assigned to the node IAM role. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html">Amazon EKS node IAM role</a>
     *        in the <i>Amazon EKS User Guide</i>.</p> <note>
     *        <p>
     *        To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your
     *        cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html"
     *        >Enabling IAM roles for service accounts on your cluster</a> in the <i>Amazon EKS User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withServiceAccountRoleArn(String serviceAccountRoleArn) {
        setServiceAccountRoleArn(serviceAccountRoleArn);
        return this;
    }

    /**
     * <p>
     * How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value you
     * choose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't change
     * the value. Creation of the add-on might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon EKS
     * default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon EKS
     * add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you specify.
     * </p>
     * 
     * @param resolveConflicts
     *        How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value
     *        you choose:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't
     *        change the value. Creation of the add-on might fail.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon
     *        EKS default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS
     *        default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon
     *        EKS add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you
     *        specify.
     * @see ResolveConflicts
     */

    public void setResolveConflicts(String resolveConflicts) {
        this.resolveConflicts = resolveConflicts;
    }

    /**
     * <p>
     * How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value you
     * choose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't change
     * the value. Creation of the add-on might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon EKS
     * default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon EKS
     * add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you specify.
     * </p>
     * 
     * @return How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value
     *         you choose:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't
     *         change the value. Creation of the add-on might fail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon
     *         EKS default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS
     *         default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon
     *         EKS add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you
     *         specify.
     * @see ResolveConflicts
     */

    public String getResolveConflicts() {
        return this.resolveConflicts;
    }

    /**
     * <p>
     * How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value you
     * choose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't change
     * the value. Creation of the add-on might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon EKS
     * default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon EKS
     * add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you specify.
     * </p>
     * 
     * @param resolveConflicts
     *        How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value
     *        you choose:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't
     *        change the value. Creation of the add-on might fail.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon
     *        EKS default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS
     *        default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon
     *        EKS add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolveConflicts
     */

    public CreateAddonRequest withResolveConflicts(String resolveConflicts) {
        setResolveConflicts(resolveConflicts);
        return this;
    }

    /**
     * <p>
     * How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value you
     * choose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't change
     * the value. Creation of the add-on might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon EKS
     * default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon EKS
     * add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you specify.
     * </p>
     * 
     * @param resolveConflicts
     *        How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value
     *        you choose:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>None</b> – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't
     *        change the value. Creation of the add-on might fail.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Overwrite</b> – If the self-managed version of the add-on is installed on your cluster and the Amazon
     *        EKS default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS
     *        default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Preserve</b> – Not supported. You can set this value when updating an add-on though. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html">UpdateAddon</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon
     *        EKS add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolveConflicts
     */

    public CreateAddonRequest withResolveConflicts(ResolveConflicts resolveConflicts) {
        this.resolveConflicts = resolveConflicts.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key
     * and an optional value. You define both.
     * </p>
     * 
     * @return The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of
     *         a key and an optional value. You define both.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key
     * and an optional value. You define both.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of
     *        a key and an optional value. You define both.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key
     * and an optional value. You define both.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of
     *        a key and an optional value. You define both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAddonRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The set of configuration values for the add-on that's created. The values that you provide are validated against
     * the schema in <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     * <code>DescribeAddonConfiguration</code> </a>.
     * </p>
     * 
     * @param configurationValues
     *        The set of configuration values for the add-on that's created. The values that you provide are validated
     *        against the schema in <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     *        <code>DescribeAddonConfiguration</code> </a>.
     */

    public void setConfigurationValues(String configurationValues) {
        this.configurationValues = configurationValues;
    }

    /**
     * <p>
     * The set of configuration values for the add-on that's created. The values that you provide are validated against
     * the schema in <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     * <code>DescribeAddonConfiguration</code> </a>.
     * </p>
     * 
     * @return The set of configuration values for the add-on that's created. The values that you provide are validated
     *         against the schema in <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     *         <code>DescribeAddonConfiguration</code> </a>.
     */

    public String getConfigurationValues() {
        return this.configurationValues;
    }

    /**
     * <p>
     * The set of configuration values for the add-on that's created. The values that you provide are validated against
     * the schema in <a href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     * <code>DescribeAddonConfiguration</code> </a>.
     * </p>
     * 
     * @param configurationValues
     *        The set of configuration values for the add-on that's created. The values that you provide are validated
     *        against the schema in <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonConfiguration.html">
     *        <code>DescribeAddonConfiguration</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonRequest withConfigurationValues(String configurationValues) {
        setConfigurationValues(configurationValues);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getAddonVersion() != null)
            sb.append("AddonVersion: ").append(getAddonVersion()).append(",");
        if (getServiceAccountRoleArn() != null)
            sb.append("ServiceAccountRoleArn: ").append(getServiceAccountRoleArn()).append(",");
        if (getResolveConflicts() != null)
            sb.append("ResolveConflicts: ").append(getResolveConflicts()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getConfigurationValues() != null)
            sb.append("ConfigurationValues: ").append(getConfigurationValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAddonRequest == false)
            return false;
        CreateAddonRequest other = (CreateAddonRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getAddonVersion() == null ^ this.getAddonVersion() == null)
            return false;
        if (other.getAddonVersion() != null && other.getAddonVersion().equals(this.getAddonVersion()) == false)
            return false;
        if (other.getServiceAccountRoleArn() == null ^ this.getServiceAccountRoleArn() == null)
            return false;
        if (other.getServiceAccountRoleArn() != null && other.getServiceAccountRoleArn().equals(this.getServiceAccountRoleArn()) == false)
            return false;
        if (other.getResolveConflicts() == null ^ this.getResolveConflicts() == null)
            return false;
        if (other.getResolveConflicts() != null && other.getResolveConflicts().equals(this.getResolveConflicts()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConfigurationValues() == null ^ this.getConfigurationValues() == null)
            return false;
        if (other.getConfigurationValues() != null && other.getConfigurationValues().equals(this.getConfigurationValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getAddonVersion() == null) ? 0 : getAddonVersion().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountRoleArn() == null) ? 0 : getServiceAccountRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResolveConflicts() == null) ? 0 : getResolveConflicts().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConfigurationValues() == null) ? 0 : getConfigurationValues().hashCode());
        return hashCode;
    }

    @Override
    public CreateAddonRequest clone() {
        return (CreateAddonRequest) super.clone();
    }

}
