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
 * Specifies an Amazon EKS volume for a job definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     */
    private EksHostPath hostPath;
    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     */
    private EksEmptyDir emptyDir;
    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     */
    private EksSecret secret;

    /**
     * <p>
     * The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param name
     *        The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS
     *        subdomain names</a> in the <i>Kubernetes documentation</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS
     *         subdomain names</a> in the <i>Kubernetes documentation</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param name
     *        The name of the volume. The name must be allowed as a DNS subdomain name. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS
     *        subdomain names</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksVolume withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @param hostPath
     *        Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     *        documentation</i>.
     */

    public void setHostPath(EksHostPath hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @return Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     *         documentation</i>.
     */

    public EksHostPath getHostPath() {
        return this.hostPath;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @param hostPath
     *        Specifies the configuration of a Kubernetes <code>hostPath</code> volume. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
     *        documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksVolume withHostPath(EksHostPath hostPath) {
        setHostPath(hostPath);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @param emptyDir
     *        Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     *        documentation</i>.
     */

    public void setEmptyDir(EksEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @return Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     *         documentation</i>.
     */

    public EksEmptyDir getEmptyDir() {
        return this.emptyDir;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @param emptyDir
     *        Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a> in the <i>Kubernetes
     *        documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksVolume withEmptyDir(EksEmptyDir emptyDir) {
        setEmptyDir(emptyDir);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @param secret
     *        Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     *        documentation</i>.
     */

    public void setSecret(EksSecret secret) {
        this.secret = secret;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @return Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     *         documentation</i>.
     */

    public EksSecret getSecret() {
        return this.secret;
    }

    /**
     * <p>
     * Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     * documentation</i>.
     * </p>
     * 
     * @param secret
     *        Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes
     *        documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksVolume withSecret(EksSecret secret) {
        setSecret(secret);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getHostPath() != null)
            sb.append("HostPath: ").append(getHostPath()).append(",");
        if (getEmptyDir() != null)
            sb.append("EmptyDir: ").append(getEmptyDir()).append(",");
        if (getSecret() != null)
            sb.append("Secret: ").append(getSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksVolume == false)
            return false;
        EksVolume other = (EksVolume) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHostPath() == null ^ this.getHostPath() == null)
            return false;
        if (other.getHostPath() != null && other.getHostPath().equals(this.getHostPath()) == false)
            return false;
        if (other.getEmptyDir() == null ^ this.getEmptyDir() == null)
            return false;
        if (other.getEmptyDir() != null && other.getEmptyDir().equals(this.getEmptyDir()) == false)
            return false;
        if (other.getSecret() == null ^ this.getSecret() == null)
            return false;
        if (other.getSecret() != null && other.getSecret().equals(this.getSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHostPath() == null) ? 0 : getHostPath().hashCode());
        hashCode = prime * hashCode + ((getEmptyDir() == null) ? 0 : getEmptyDir().hashCode());
        hashCode = prime * hashCode + ((getSecret() == null) ? 0 : getSecret().hashCode());
        return hashCode;
    }

    @Override
    public EksVolume clone() {
        try {
            return (EksVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
