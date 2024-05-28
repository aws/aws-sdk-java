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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes and uniquely identifies Kubernetes resources. For example, the compute environment that a pod runs in or
 * the <code>jobID</code> for a job running in the pod. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/">Understanding Kubernetes
 * Objects</a> in the <i>Kubernetes documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase letters,
     * lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at any time. Each
     * resource can have multiple labels, but each key must be unique for a given object.
     * </p>
     */
    private java.util.Map<String, String> labels;

    /**
     * <p>
     * Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase letters,
     * lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at any time. Each
     * resource can have multiple labels, but each key must be unique for a given object.
     * </p>
     * 
     * @return Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase
     *         letters, lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at
     *         any time. Each resource can have multiple labels, but each key must be unique for a given object.
     */

    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase letters,
     * lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at any time. Each
     * resource can have multiple labels, but each key must be unique for a given object.
     * </p>
     * 
     * @param labels
     *        Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase
     *        letters, lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at
     *        any time. Each resource can have multiple labels, but each key must be unique for a given object.
     */

    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase letters,
     * lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at any time. Each
     * resource can have multiple labels, but each key must be unique for a given object.
     * </p>
     * 
     * @param labels
     *        Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase
     *        letters, lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at
     *        any time. Each resource can have multiple labels, but each key must be unique for a given object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksMetadata withLabels(java.util.Map<String, String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * Add a single Labels entry
     *
     * @see EksMetadata#withLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EksMetadata addLabelsEntry(String key, String value) {
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

    public EksMetadata clearLabelsEntries() {
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

        if (obj instanceof EksMetadata == false)
            return false;
        EksMetadata other = (EksMetadata) obj;
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

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public EksMetadata clone() {
        try {
            return (EksMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
