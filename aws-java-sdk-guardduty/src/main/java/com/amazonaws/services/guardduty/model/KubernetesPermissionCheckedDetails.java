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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Kubernetes API for which you check if you have permission to call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesPermissionCheckedDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesPermissionCheckedDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The verb component of the Kubernetes API call. For example, when you check whether or not you have the permission
     * to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     * </p>
     */
    private String verb;
    /**
     * <p>
     * The Kubernetes resource with which your Kubernetes API call will interact.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The namespace where the Kubernetes API action will take place.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * Information whether the user has the permission to call the Kubernetes API.
     * </p>
     */
    private Boolean allowed;

    /**
     * <p>
     * The verb component of the Kubernetes API call. For example, when you check whether or not you have the permission
     * to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     * </p>
     * 
     * @param verb
     *        The verb component of the Kubernetes API call. For example, when you check whether or not you have the
     *        permission to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     */

    public void setVerb(String verb) {
        this.verb = verb;
    }

    /**
     * <p>
     * The verb component of the Kubernetes API call. For example, when you check whether or not you have the permission
     * to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     * </p>
     * 
     * @return The verb component of the Kubernetes API call. For example, when you check whether or not you have the
     *         permission to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     */

    public String getVerb() {
        return this.verb;
    }

    /**
     * <p>
     * The verb component of the Kubernetes API call. For example, when you check whether or not you have the permission
     * to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     * </p>
     * 
     * @param verb
     *        The verb component of the Kubernetes API call. For example, when you check whether or not you have the
     *        permission to call the <code>CreatePod</code> API, the verb component will be <code>Create</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesPermissionCheckedDetails withVerb(String verb) {
        setVerb(verb);
        return this;
    }

    /**
     * <p>
     * The Kubernetes resource with which your Kubernetes API call will interact.
     * </p>
     * 
     * @param resource
     *        The Kubernetes resource with which your Kubernetes API call will interact.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The Kubernetes resource with which your Kubernetes API call will interact.
     * </p>
     * 
     * @return The Kubernetes resource with which your Kubernetes API call will interact.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The Kubernetes resource with which your Kubernetes API call will interact.
     * </p>
     * 
     * @param resource
     *        The Kubernetes resource with which your Kubernetes API call will interact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesPermissionCheckedDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The namespace where the Kubernetes API action will take place.
     * </p>
     * 
     * @param namespace
     *        The namespace where the Kubernetes API action will take place.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace where the Kubernetes API action will take place.
     * </p>
     * 
     * @return The namespace where the Kubernetes API action will take place.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace where the Kubernetes API action will take place.
     * </p>
     * 
     * @param namespace
     *        The namespace where the Kubernetes API action will take place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesPermissionCheckedDetails withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * Information whether the user has the permission to call the Kubernetes API.
     * </p>
     * 
     * @param allowed
     *        Information whether the user has the permission to call the Kubernetes API.
     */

    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }

    /**
     * <p>
     * Information whether the user has the permission to call the Kubernetes API.
     * </p>
     * 
     * @return Information whether the user has the permission to call the Kubernetes API.
     */

    public Boolean getAllowed() {
        return this.allowed;
    }

    /**
     * <p>
     * Information whether the user has the permission to call the Kubernetes API.
     * </p>
     * 
     * @param allowed
     *        Information whether the user has the permission to call the Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesPermissionCheckedDetails withAllowed(Boolean allowed) {
        setAllowed(allowed);
        return this;
    }

    /**
     * <p>
     * Information whether the user has the permission to call the Kubernetes API.
     * </p>
     * 
     * @return Information whether the user has the permission to call the Kubernetes API.
     */

    public Boolean isAllowed() {
        return this.allowed;
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
        if (getVerb() != null)
            sb.append("Verb: ").append(getVerb()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getAllowed() != null)
            sb.append("Allowed: ").append(getAllowed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesPermissionCheckedDetails == false)
            return false;
        KubernetesPermissionCheckedDetails other = (KubernetesPermissionCheckedDetails) obj;
        if (other.getVerb() == null ^ this.getVerb() == null)
            return false;
        if (other.getVerb() != null && other.getVerb().equals(this.getVerb()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getAllowed() == null ^ this.getAllowed() == null)
            return false;
        if (other.getAllowed() != null && other.getAllowed().equals(this.getAllowed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerb() == null) ? 0 : getVerb().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getAllowed() == null) ? 0 : getAllowed().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesPermissionCheckedDetails clone() {
        try {
            return (KubernetesPermissionCheckedDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesPermissionCheckedDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
