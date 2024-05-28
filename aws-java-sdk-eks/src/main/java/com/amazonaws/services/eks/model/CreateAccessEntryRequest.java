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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateAccessEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessEntryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access entry. You
     * can't specify the same ARN in more than one access entry. This value can't be changed after access entry
     * creation.
     * </p>
     * <p>
     * The valid principals differ depending on the type of the access entry in the <code>type</code> field. The only
     * valid ARN is IAM roles for the types of access entries for nodes:
     * <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't use the
     * STS session principal type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM best
     * practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The value for <code>name</code> that you've specified for <code>kind: Group</code> as a <code>subject</code> in a
     * Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object. Amazon EKS doesn't confirm that
     * the value for <code>name</code> exists in any bindings on your cluster. You can specify one or more names.
     * </p>
     * <p>
     * Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that you've
     * specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also specified in a
     * binding's <code>roleRef</code>. For more information about creating Kubernetes <code>RoleBinding</code>,
     * <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code> objects, see <a
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC Authorization in the Kubernetes
     * documentation</a>.
     * </p>
     * <p>
     * If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to Kubernetes
     * authorizing the <code>principalArn</code>), you can associate one or more access policies to the access entry
     * using <code>AssociateAccessPolicy</code>. If you associate any access policies, the <code>principalARN</code> has
     * all permissions assigned in the associated access policies and all permissions in any Kubernetes
     * <code>Role</code> or <code>ClusterRole</code> objects that the group names are bound to.
     * </p>
     */
    private java.util.List<String> kubernetesGroups;
    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The username to authenticate to Kubernetes with. We recommend not specifying a username and letting Amazon EKS
     * specify it for you. For more information about the value Amazon EKS specifies for you, or constraints before
     * specifying your own username, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries">Creating
     * access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     * <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.
     * </p>
     * <p>
     * If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
     * <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions to the node for
     * you. If the <code>principalArn</code> is for any other purpose, specify <code>STANDARD</code>. If you don't
     * specify a value, Amazon EKS sets the value to <code>STANDARD</code>. It's unnecessary to create access entries
     * for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in the
     * <code>aws-auth</code> <code>ConfigMap</code> for the roles. You can't change this value once you've created the
     * access entry.
     * </p>
     * <p>
     * If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     * <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @return The name of your cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access entry. You
     * can't specify the same ARN in more than one access entry. This value can't be changed after access entry
     * creation.
     * </p>
     * <p>
     * The valid principals differ depending on the type of the access entry in the <code>type</code> field. The only
     * valid ARN is IAM roles for the types of access entries for nodes:
     * <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't use the
     * STS session principal type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM best
     * practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access
     *        entry. You can't specify the same ARN in more than one access entry. This value can't be changed after
     *        access entry creation.</p>
     *        <p>
     *        The valid principals differ depending on the type of the access entry in the <code>type</code> field. The
     *        only valid ARN is IAM roles for the types of access entries for nodes:
     *        <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't
     *        use the STS session principal type with access entries because this is a temporary principal for each
     *        session and not a permanent identity that can be assigned permissions.
     *        </p>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM
     *        best practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with
     *        long-term credentials.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access entry. You
     * can't specify the same ARN in more than one access entry. This value can't be changed after access entry
     * creation.
     * </p>
     * <p>
     * The valid principals differ depending on the type of the access entry in the <code>type</code> field. The only
     * valid ARN is IAM roles for the types of access entries for nodes:
     * <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't use the
     * STS session principal type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM best
     * practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     * </p>
     * 
     * @return The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access
     *         entry. You can't specify the same ARN in more than one access entry. This value can't be changed after
     *         access entry creation.</p>
     *         <p>
     *         The valid principals differ depending on the type of the access entry in the <code>type</code> field. The
     *         only valid ARN is IAM roles for the types of access entries for nodes:
     *         <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't
     *         use the STS session principal type with access entries because this is a temporary principal for each
     *         session and not a permanent identity that can be assigned permissions.
     *         </p>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM
     *         best practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with
     *         long-term credentials.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access entry. You
     * can't specify the same ARN in more than one access entry. This value can't be changed after access entry
     * creation.
     * </p>
     * <p>
     * The valid principals differ depending on the type of the access entry in the <code>type</code> field. The only
     * valid ARN is IAM roles for the types of access entries for nodes:
     * <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't use the
     * STS session principal type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM best
     * practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the <code>AccessEntry</code>. You can specify one ARN for each access
     *        entry. You can't specify the same ARN in more than one access entry. This value can't be changed after
     *        access entry creation.</p>
     *        <p>
     *        The valid principals differ depending on the type of the access entry in the <code>type</code> field. The
     *        only valid ARN is IAM roles for the types of access entries for nodes:
     *        <code/> <code/>. You can use every IAM principal type for <code>STANDARD</code> access entries. You can't
     *        use the STS session principal type with access entries because this is a temporary principal for each
     *        session and not a permanent identity that can be assigned permissions.
     *        </p>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp">IAM
     *        best practices</a> recommend using IAM roles with temporary credentials, rather than IAM users with
     *        long-term credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The value for <code>name</code> that you've specified for <code>kind: Group</code> as a <code>subject</code> in a
     * Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object. Amazon EKS doesn't confirm that
     * the value for <code>name</code> exists in any bindings on your cluster. You can specify one or more names.
     * </p>
     * <p>
     * Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that you've
     * specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also specified in a
     * binding's <code>roleRef</code>. For more information about creating Kubernetes <code>RoleBinding</code>,
     * <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code> objects, see <a
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC Authorization in the Kubernetes
     * documentation</a>.
     * </p>
     * <p>
     * If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to Kubernetes
     * authorizing the <code>principalArn</code>), you can associate one or more access policies to the access entry
     * using <code>AssociateAccessPolicy</code>. If you associate any access policies, the <code>principalARN</code> has
     * all permissions assigned in the associated access policies and all permissions in any Kubernetes
     * <code>Role</code> or <code>ClusterRole</code> objects that the group names are bound to.
     * </p>
     * 
     * @return The value for <code>name</code> that you've specified for <code>kind: Group</code> as a
     *         <code>subject</code> in a Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object.
     *         Amazon EKS doesn't confirm that the value for <code>name</code> exists in any bindings on your cluster.
     *         You can specify one or more names.</p>
     *         <p>
     *         Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects
     *         that you've specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also
     *         specified in a binding's <code>roleRef</code>. For more information about creating Kubernetes
     *         <code>RoleBinding</code>, <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code>
     *         objects, see <a href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC
     *         Authorization in the Kubernetes documentation</a>.
     *         </p>
     *         <p>
     *         If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to
     *         Kubernetes authorizing the <code>principalArn</code>), you can associate one or more access policies to
     *         the access entry using <code>AssociateAccessPolicy</code>. If you associate any access policies, the
     *         <code>principalARN</code> has all permissions assigned in the associated access policies and all
     *         permissions in any Kubernetes <code>Role</code> or <code>ClusterRole</code> objects that the group names
     *         are bound to.
     */

    public java.util.List<String> getKubernetesGroups() {
        return kubernetesGroups;
    }

    /**
     * <p>
     * The value for <code>name</code> that you've specified for <code>kind: Group</code> as a <code>subject</code> in a
     * Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object. Amazon EKS doesn't confirm that
     * the value for <code>name</code> exists in any bindings on your cluster. You can specify one or more names.
     * </p>
     * <p>
     * Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that you've
     * specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also specified in a
     * binding's <code>roleRef</code>. For more information about creating Kubernetes <code>RoleBinding</code>,
     * <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code> objects, see <a
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC Authorization in the Kubernetes
     * documentation</a>.
     * </p>
     * <p>
     * If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to Kubernetes
     * authorizing the <code>principalArn</code>), you can associate one or more access policies to the access entry
     * using <code>AssociateAccessPolicy</code>. If you associate any access policies, the <code>principalARN</code> has
     * all permissions assigned in the associated access policies and all permissions in any Kubernetes
     * <code>Role</code> or <code>ClusterRole</code> objects that the group names are bound to.
     * </p>
     * 
     * @param kubernetesGroups
     *        The value for <code>name</code> that you've specified for <code>kind: Group</code> as a
     *        <code>subject</code> in a Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object.
     *        Amazon EKS doesn't confirm that the value for <code>name</code> exists in any bindings on your cluster.
     *        You can specify one or more names.</p>
     *        <p>
     *        Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that
     *        you've specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also
     *        specified in a binding's <code>roleRef</code>. For more information about creating Kubernetes
     *        <code>RoleBinding</code>, <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code>
     *        objects, see <a href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC
     *        Authorization in the Kubernetes documentation</a>.
     *        </p>
     *        <p>
     *        If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to
     *        Kubernetes authorizing the <code>principalArn</code>), you can associate one or more access policies to
     *        the access entry using <code>AssociateAccessPolicy</code>. If you associate any access policies, the
     *        <code>principalARN</code> has all permissions assigned in the associated access policies and all
     *        permissions in any Kubernetes <code>Role</code> or <code>ClusterRole</code> objects that the group names
     *        are bound to.
     */

    public void setKubernetesGroups(java.util.Collection<String> kubernetesGroups) {
        if (kubernetesGroups == null) {
            this.kubernetesGroups = null;
            return;
        }

        this.kubernetesGroups = new java.util.ArrayList<String>(kubernetesGroups);
    }

    /**
     * <p>
     * The value for <code>name</code> that you've specified for <code>kind: Group</code> as a <code>subject</code> in a
     * Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object. Amazon EKS doesn't confirm that
     * the value for <code>name</code> exists in any bindings on your cluster. You can specify one or more names.
     * </p>
     * <p>
     * Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that you've
     * specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also specified in a
     * binding's <code>roleRef</code>. For more information about creating Kubernetes <code>RoleBinding</code>,
     * <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code> objects, see <a
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC Authorization in the Kubernetes
     * documentation</a>.
     * </p>
     * <p>
     * If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to Kubernetes
     * authorizing the <code>principalArn</code>), you can associate one or more access policies to the access entry
     * using <code>AssociateAccessPolicy</code>. If you associate any access policies, the <code>principalARN</code> has
     * all permissions assigned in the associated access policies and all permissions in any Kubernetes
     * <code>Role</code> or <code>ClusterRole</code> objects that the group names are bound to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKubernetesGroups(java.util.Collection)} or {@link #withKubernetesGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param kubernetesGroups
     *        The value for <code>name</code> that you've specified for <code>kind: Group</code> as a
     *        <code>subject</code> in a Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object.
     *        Amazon EKS doesn't confirm that the value for <code>name</code> exists in any bindings on your cluster.
     *        You can specify one or more names.</p>
     *        <p>
     *        Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that
     *        you've specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also
     *        specified in a binding's <code>roleRef</code>. For more information about creating Kubernetes
     *        <code>RoleBinding</code>, <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code>
     *        objects, see <a href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC
     *        Authorization in the Kubernetes documentation</a>.
     *        </p>
     *        <p>
     *        If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to
     *        Kubernetes authorizing the <code>principalArn</code>), you can associate one or more access policies to
     *        the access entry using <code>AssociateAccessPolicy</code>. If you associate any access policies, the
     *        <code>principalARN</code> has all permissions assigned in the associated access policies and all
     *        permissions in any Kubernetes <code>Role</code> or <code>ClusterRole</code> objects that the group names
     *        are bound to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withKubernetesGroups(String... kubernetesGroups) {
        if (this.kubernetesGroups == null) {
            setKubernetesGroups(new java.util.ArrayList<String>(kubernetesGroups.length));
        }
        for (String ele : kubernetesGroups) {
            this.kubernetesGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value for <code>name</code> that you've specified for <code>kind: Group</code> as a <code>subject</code> in a
     * Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object. Amazon EKS doesn't confirm that
     * the value for <code>name</code> exists in any bindings on your cluster. You can specify one or more names.
     * </p>
     * <p>
     * Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that you've
     * specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also specified in a
     * binding's <code>roleRef</code>. For more information about creating Kubernetes <code>RoleBinding</code>,
     * <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code> objects, see <a
     * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC Authorization in the Kubernetes
     * documentation</a>.
     * </p>
     * <p>
     * If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to Kubernetes
     * authorizing the <code>principalArn</code>), you can associate one or more access policies to the access entry
     * using <code>AssociateAccessPolicy</code>. If you associate any access policies, the <code>principalARN</code> has
     * all permissions assigned in the associated access policies and all permissions in any Kubernetes
     * <code>Role</code> or <code>ClusterRole</code> objects that the group names are bound to.
     * </p>
     * 
     * @param kubernetesGroups
     *        The value for <code>name</code> that you've specified for <code>kind: Group</code> as a
     *        <code>subject</code> in a Kubernetes <code>RoleBinding</code> or <code>ClusterRoleBinding</code> object.
     *        Amazon EKS doesn't confirm that the value for <code>name</code> exists in any bindings on your cluster.
     *        You can specify one or more names.</p>
     *        <p>
     *        Kubernetes authorizes the <code>principalArn</code> of the access entry to access any cluster objects that
     *        you've specified in a Kubernetes <code>Role</code> or <code>ClusterRole</code> object that is also
     *        specified in a binding's <code>roleRef</code>. For more information about creating Kubernetes
     *        <code>RoleBinding</code>, <code>ClusterRoleBinding</code>, <code>Role</code>, or <code>ClusterRole</code>
     *        objects, see <a href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/">Using RBAC
     *        Authorization in the Kubernetes documentation</a>.
     *        </p>
     *        <p>
     *        If you want Amazon EKS to authorize the <code>principalArn</code> (instead of, or in addition to
     *        Kubernetes authorizing the <code>principalArn</code>), you can associate one or more access policies to
     *        the access entry using <code>AssociateAccessPolicy</code>. If you associate any access policies, the
     *        <code>principalARN</code> has all permissions assigned in the associated access policies and all
     *        permissions in any Kubernetes <code>Role</code> or <code>ClusterRole</code> objects that the group names
     *        are bound to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withKubernetesGroups(java.util.Collection<String> kubernetesGroups) {
        setKubernetesGroups(kubernetesGroups);
        return this;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * 
     * @return Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *         value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * 
     * @param tags
     *        Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *        value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * 
     * @param tags
     *        Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *        value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAccessEntryRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest addTagsEntry(String key, String value) {
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

    public CreateAccessEntryRequest clearTagsEntries() {
        this.tags = null;
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

    public CreateAccessEntryRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The username to authenticate to Kubernetes with. We recommend not specifying a username and letting Amazon EKS
     * specify it for you. For more information about the value Amazon EKS specifies for you, or constraints before
     * specifying your own username, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries">Creating
     * access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param username
     *        The username to authenticate to Kubernetes with. We recommend not specifying a username and letting Amazon
     *        EKS specify it for you. For more information about the value Amazon EKS specifies for you, or constraints
     *        before specifying your own username, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries"
     *        >Creating access entries</a> in the <i>Amazon EKS User Guide</i>.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username to authenticate to Kubernetes with. We recommend not specifying a username and letting Amazon EKS
     * specify it for you. For more information about the value Amazon EKS specifies for you, or constraints before
     * specifying your own username, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries">Creating
     * access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The username to authenticate to Kubernetes with. We recommend not specifying a username and letting
     *         Amazon EKS specify it for you. For more information about the value Amazon EKS specifies for you, or
     *         constraints before specifying your own username, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries"
     *         >Creating access entries</a> in the <i>Amazon EKS User Guide</i>.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username to authenticate to Kubernetes with. We recommend not specifying a username and letting Amazon EKS
     * specify it for you. For more information about the value Amazon EKS specifies for you, or constraints before
     * specifying your own username, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries">Creating
     * access entries</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param username
     *        The username to authenticate to Kubernetes with. We recommend not specifying a username and letting Amazon
     *        EKS specify it for you. For more information about the value Amazon EKS specifies for you, or constraints
     *        before specifying your own username, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries"
     *        >Creating access entries</a> in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     * <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.
     * </p>
     * <p>
     * If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
     * <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions to the node for
     * you. If the <code>principalArn</code> is for any other purpose, specify <code>STANDARD</code>. If you don't
     * specify a value, Amazon EKS sets the value to <code>STANDARD</code>. It's unnecessary to create access entries
     * for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in the
     * <code>aws-auth</code> <code>ConfigMap</code> for the roles. You can't change this value once you've created the
     * access entry.
     * </p>
     * <p>
     * If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     * <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     * </p>
     * 
     * @param type
     *        The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     *        <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.</p>
     *        <p>
     *        If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
     *        <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions to the
     *        node for you. If the <code>principalArn</code> is for any other purpose, specify <code>STANDARD</code>. If
     *        you don't specify a value, Amazon EKS sets the value to <code>STANDARD</code>. It's unnecessary to create
     *        access entries for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS
     *        creates entries in the <code>aws-auth</code> <code>ConfigMap</code> for the roles. You can't change this
     *        value once you've created the access entry.
     *        </p>
     *        <p>
     *        If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     *        <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     * <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.
     * </p>
     * <p>
     * If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
     * <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions to the node for
     * you. If the <code>principalArn</code> is for any other purpose, specify <code>STANDARD</code>. If you don't
     * specify a value, Amazon EKS sets the value to <code>STANDARD</code>. It's unnecessary to create access entries
     * for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in the
     * <code>aws-auth</code> <code>ConfigMap</code> for the roles. You can't change this value once you've created the
     * access entry.
     * </p>
     * <p>
     * If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     * <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     * </p>
     * 
     * @return The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     *         <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.</p>
     *         <p>
     *         If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes,
     *         specify <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions
     *         to the node for you. If the <code>principalArn</code> is for any other purpose, specify
     *         <code>STANDARD</code>. If you don't specify a value, Amazon EKS sets the value to <code>STANDARD</code>.
     *         It's unnecessary to create access entries for IAM roles used with Fargate profiles or managed Amazon EC2
     *         nodes, because Amazon EKS creates entries in the <code>aws-auth</code> <code>ConfigMap</code> for the
     *         roles. You can't change this value once you've created the access entry.
     *         </p>
     *         <p>
     *         If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     *         <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     * <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.
     * </p>
     * <p>
     * If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
     * <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions to the node for
     * you. If the <code>principalArn</code> is for any other purpose, specify <code>STANDARD</code>. If you don't
     * specify a value, Amazon EKS sets the value to <code>STANDARD</code>. It's unnecessary to create access entries
     * for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in the
     * <code>aws-auth</code> <code>ConfigMap</code> for the roles. You can't change this value once you've created the
     * access entry.
     * </p>
     * <p>
     * If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     * <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     * </p>
     * 
     * @param type
     *        The type of the new access entry. Valid values are <code>Standard</code>, <code>FARGATE_LINUX</code>,
     *        <code>EC2_LINUX</code>, and <code>EC2_WINDOWS</code>.</p>
     *        <p>
     *        If the <code>principalArn</code> is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
     *        <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>. Amazon EKS grants the necessary permissions to the
     *        node for you. If the <code>principalArn</code> is for any other purpose, specify <code>STANDARD</code>. If
     *        you don't specify a value, Amazon EKS sets the value to <code>STANDARD</code>. It's unnecessary to create
     *        access entries for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS
     *        creates entries in the <code>aws-auth</code> <code>ConfigMap</code> for the roles. You can't change this
     *        value once you've created the access entry.
     *        </p>
     *        <p>
     *        If you set the value to <code>EC2_LINUX</code> or <code>EC2_WINDOWS</code>, you can't specify values for
     *        <code>kubernetesGroups</code>, or associate an <code>AccessPolicy</code> to the access entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessEntryRequest withType(String type) {
        setType(type);
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getKubernetesGroups() != null)
            sb.append("KubernetesGroups: ").append(getKubernetesGroups()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessEntryRequest == false)
            return false;
        CreateAccessEntryRequest other = (CreateAccessEntryRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getKubernetesGroups() == null ^ this.getKubernetesGroups() == null)
            return false;
        if (other.getKubernetesGroups() != null && other.getKubernetesGroups().equals(this.getKubernetesGroups()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getKubernetesGroups() == null) ? 0 : getKubernetesGroups().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessEntryRequest clone() {
        return (CreateAccessEntryRequest) super.clone();
    }

}
