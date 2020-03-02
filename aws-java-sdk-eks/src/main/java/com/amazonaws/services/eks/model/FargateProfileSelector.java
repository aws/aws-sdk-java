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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Fargate profile selector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/FargateProfileSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FargateProfileSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Kubernetes namespace that the selector should match.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in
     * the selector for it to be considered a match.
     * </p>
     */
    private java.util.Map<String, String> labels;

    /**
     * <p>
     * The Kubernetes namespace that the selector should match.
     * </p>
     * 
     * @param namespace
     *        The Kubernetes namespace that the selector should match.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The Kubernetes namespace that the selector should match.
     * </p>
     * 
     * @return The Kubernetes namespace that the selector should match.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The Kubernetes namespace that the selector should match.
     * </p>
     * 
     * @param namespace
     *        The Kubernetes namespace that the selector should match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileSelector withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in
     * the selector for it to be considered a match.
     * </p>
     * 
     * @return The Kubernetes labels that the selector should match. A pod must contain all of the labels that are
     *         specified in the selector for it to be considered a match.
     */

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in
     * the selector for it to be considered a match.
     * </p>
     * 
     * @param labels
     *        The Kubernetes labels that the selector should match. A pod must contain all of the labels that are
     *        specified in the selector for it to be considered a match.
     */

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in
     * the selector for it to be considered a match.
     * </p>
     * 
     * @param labels
     *        The Kubernetes labels that the selector should match. A pod must contain all of the labels that are
     *        specified in the selector for it to be considered a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileSelector withLabels(java.util.Map<String, String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * Add a single Labels entry
     *
     * @see FargateProfileSelector#withLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileSelector addLabelsEntry(String key, String value) {
        if (null == this.labels) {
            this.labels = new java.util.HashMap<String, String>();
        }
        if (this.labels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.labels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Labels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileSelector clearLabelsEntries() {
        this.labels = null;
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FargateProfileSelector == false)
            return false;
        FargateProfileSelector other = (FargateProfileSelector) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public FargateProfileSelector clone() {
        try {
            return (FargateProfileSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.FargateProfileSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
