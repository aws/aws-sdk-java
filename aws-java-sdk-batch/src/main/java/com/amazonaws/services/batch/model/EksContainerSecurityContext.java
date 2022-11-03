/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The security context for a job. For more information, see <a
 * href="https://kubernetes.io/docs/tasks/configure-pod-container/security-context/">Configure a security context for a
 * pod or container</a> in the <i>Kubernetes documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksContainerSecurityContext" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksContainerSecurityContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If this
     * parameter isn't specified, the default is the user that's specified in the image metadata. This parameter maps to
     * <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private Long runAsUser;
    /**
     * <p>
     * When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If this
     * parameter isn't specified, the default is the group that's specified in the image metadata. This parameter maps
     * to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private Long runAsGroup;
    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated permissions on the host container
     * instance. The level of permissions are similar to the <code>root</code> user permissions. The default value is
     * <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod security
     * policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private Boolean privileged;
    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given read-only access to its root file system. The
     * default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes and
     * file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private Boolean readOnlyRootFilesystem;
    /**
     * <p>
     * When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If this
     * parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code> and
     * <code>MustRunAsNonRoot</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private Boolean runAsNonRoot;

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If this
     * parameter isn't specified, the default is the user that's specified in the image metadata. This parameter maps to
     * <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param runAsUser
     *        When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If
     *        this parameter isn't specified, the default is the user that's specified in the image metadata. This
     *        parameter maps to <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups
     *        pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public void setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If this
     * parameter isn't specified, the default is the user that's specified in the image metadata. This parameter maps to
     * <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If
     *         this parameter isn't specified, the default is the user that's specified in the image metadata. This
     *         parameter maps to <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and
     *         groups pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Long getRunAsUser() {
        return this.runAsUser;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If this
     * parameter isn't specified, the default is the user that's specified in the image metadata. This parameter maps to
     * <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param runAsUser
     *        When this parameter is specified, the container is run as the specified user ID (<code>uid</code>). If
     *        this parameter isn't specified, the default is the user that's specified in the image metadata. This
     *        parameter maps to <code>RunAsUser</code> and <code>MustRanAs</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups
     *        pod security policies</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerSecurityContext withRunAsUser(Long runAsUser) {
        setRunAsUser(runAsUser);
        return this;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If this
     * parameter isn't specified, the default is the group that's specified in the image metadata. This parameter maps
     * to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param runAsGroup
     *        When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If
     *        this parameter isn't specified, the default is the group that's specified in the image metadata. This
     *        parameter maps to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups
     *        pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public void setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If this
     * parameter isn't specified, the default is the group that's specified in the image metadata. This parameter maps
     * to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If
     *         this parameter isn't specified, the default is the group that's specified in the image metadata. This
     *         parameter maps to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and
     *         groups pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Long getRunAsGroup() {
        return this.runAsGroup;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If this
     * parameter isn't specified, the default is the group that's specified in the image metadata. This parameter maps
     * to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param runAsGroup
     *        When this parameter is specified, the container is run as the specified group ID (<code>gid</code>). If
     *        this parameter isn't specified, the default is the group that's specified in the image metadata. This
     *        parameter maps to <code>RunAsGroup</code> and <code>MustRunAs</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups
     *        pod security policies</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerSecurityContext withRunAsGroup(Long runAsGroup) {
        setRunAsGroup(runAsGroup);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated permissions on the host container
     * instance. The level of permissions are similar to the <code>root</code> user permissions. The default value is
     * <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod security
     * policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param privileged
     *        When this parameter is <code>true</code>, the container is given elevated permissions on the host
     *        container instance. The level of permissions are similar to the <code>root</code> user permissions. The
     *        default value is <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod
     *        security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated permissions on the host container
     * instance. The level of permissions are similar to the <code>root</code> user permissions. The default value is
     * <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod security
     * policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, the container is given elevated permissions on the host
     *         container instance. The level of permissions are similar to the <code>root</code> user permissions. The
     *         default value is <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod
     *         security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated permissions on the host container
     * instance. The level of permissions are similar to the <code>root</code> user permissions. The default value is
     * <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod security
     * policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param privileged
     *        When this parameter is <code>true</code>, the container is given elevated permissions on the host
     *        container instance. The level of permissions are similar to the <code>root</code> user permissions. The
     *        default value is <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod
     *        security policies</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerSecurityContext withPrivileged(Boolean privileged) {
        setPrivileged(privileged);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given elevated permissions on the host container
     * instance. The level of permissions are similar to the <code>root</code> user permissions. The default value is
     * <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod security
     * policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, the container is given elevated permissions on the host
     *         container instance. The level of permissions are similar to the <code>root</code> user permissions. The
     *         default value is <code>false</code>. This parameter maps to <code>privileged</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#privileged">Privileged pod
     *         security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean isPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given read-only access to its root file system. The
     * default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes and
     * file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param readOnlyRootFilesystem
     *        When this parameter is <code>true</code>, the container is given read-only access to its root file system.
     *        The default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy
     *        in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes
     *        and file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given read-only access to its root file system. The
     * default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes and
     * file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, the container is given read-only access to its root file
     *         system. The default value is <code>false</code>. This parameter maps to
     *         <code>ReadOnlyRootFilesystem</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes
     *         and file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean getReadOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given read-only access to its root file system. The
     * default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes and
     * file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param readOnlyRootFilesystem
     *        When this parameter is <code>true</code>, the container is given read-only access to its root file system.
     *        The default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy
     *        in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes
     *        and file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerSecurityContext withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        setReadOnlyRootFilesystem(readOnlyRootFilesystem);
        return this;
    }

    /**
     * <p>
     * When this parameter is <code>true</code>, the container is given read-only access to its root file system. The
     * default value is <code>false</code>. This parameter maps to <code>ReadOnlyRootFilesystem</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes and
     * file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is <code>true</code>, the container is given read-only access to its root file
     *         system. The default value is <code>false</code>. This parameter maps to
     *         <code>ReadOnlyRootFilesystem</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems">Volumes
     *         and file systems pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean isReadOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If this
     * parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code> and
     * <code>MustRunAsNonRoot</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param runAsNonRoot
     *        When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If
     *        this parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code>
     *        and <code>MustRunAsNonRoot</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups
     *        pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If this
     * parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code> and
     * <code>MustRunAsNonRoot</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If
     *         this parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code>
     *         and <code>MustRunAsNonRoot</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and
     *         groups pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If this
     * parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code> and
     * <code>MustRunAsNonRoot</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param runAsNonRoot
     *        When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If
     *        this parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code>
     *        and <code>MustRunAsNonRoot</code> policy in the <a
     *        href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups
     *        pod security policies</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksContainerSecurityContext withRunAsNonRoot(Boolean runAsNonRoot) {
        setRunAsNonRoot(runAsNonRoot);
        return this;
    }

    /**
     * <p>
     * When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If this
     * parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code> and
     * <code>MustRunAsNonRoot</code> policy in the <a
     * href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and groups pod
     * security policies</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return When this parameter is specified, the container is run as a user with a <code>uid</code> other than 0. If
     *         this parameter isn't specified, so such rule is enforced. This parameter maps to <code>RunAsUser</code>
     *         and <code>MustRunAsNonRoot</code> policy in the <a
     *         href="https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups">Users and
     *         groups pod security policies</a> in the <i>Kubernetes documentation</i>.
     */

    public Boolean isRunAsNonRoot() {
        return this.runAsNonRoot;
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
        if (getRunAsUser() != null)
            sb.append("RunAsUser: ").append(getRunAsUser()).append(",");
        if (getRunAsGroup() != null)
            sb.append("RunAsGroup: ").append(getRunAsGroup()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged()).append(",");
        if (getReadOnlyRootFilesystem() != null)
            sb.append("ReadOnlyRootFilesystem: ").append(getReadOnlyRootFilesystem()).append(",");
        if (getRunAsNonRoot() != null)
            sb.append("RunAsNonRoot: ").append(getRunAsNonRoot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksContainerSecurityContext == false)
            return false;
        EksContainerSecurityContext other = (EksContainerSecurityContext) obj;
        if (other.getRunAsUser() == null ^ this.getRunAsUser() == null)
            return false;
        if (other.getRunAsUser() != null && other.getRunAsUser().equals(this.getRunAsUser()) == false)
            return false;
        if (other.getRunAsGroup() == null ^ this.getRunAsGroup() == null)
            return false;
        if (other.getRunAsGroup() != null && other.getRunAsGroup().equals(this.getRunAsGroup()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        if (other.getReadOnlyRootFilesystem() == null ^ this.getReadOnlyRootFilesystem() == null)
            return false;
        if (other.getReadOnlyRootFilesystem() != null && other.getReadOnlyRootFilesystem().equals(this.getReadOnlyRootFilesystem()) == false)
            return false;
        if (other.getRunAsNonRoot() == null ^ this.getRunAsNonRoot() == null)
            return false;
        if (other.getRunAsNonRoot() != null && other.getRunAsNonRoot().equals(this.getRunAsNonRoot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunAsUser() == null) ? 0 : getRunAsUser().hashCode());
        hashCode = prime * hashCode + ((getRunAsGroup() == null) ? 0 : getRunAsGroup().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        hashCode = prime * hashCode + ((getReadOnlyRootFilesystem() == null) ? 0 : getReadOnlyRootFilesystem().hashCode());
        hashCode = prime * hashCode + ((getRunAsNonRoot() == null) ? 0 : getRunAsNonRoot().hashCode());
        return hashCode;
    }

    @Override
    public EksContainerSecurityContext clone() {
        try {
            return (EksContainerSecurityContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksContainerSecurityContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
