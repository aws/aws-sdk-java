/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UnlabelParameterVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnlabelParameterVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter from which you want to delete one or more labels.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The specific version of the parameter which you want to delete one or more labels from. If it isn't present, the
     * call will fail.
     * </p>
     */
    private Long parameterVersion;
    /**
     * <p>
     * One or more labels to delete from the specified parameter version.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> labels;

    /**
     * <p>
     * The name of the parameter from which you want to delete one or more labels.
     * </p>
     * 
     * @param name
     *        The name of the parameter from which you want to delete one or more labels.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter from which you want to delete one or more labels.
     * </p>
     * 
     * @return The name of the parameter from which you want to delete one or more labels.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter from which you want to delete one or more labels.
     * </p>
     * 
     * @param name
     *        The name of the parameter from which you want to delete one or more labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The specific version of the parameter which you want to delete one or more labels from. If it isn't present, the
     * call will fail.
     * </p>
     * 
     * @param parameterVersion
     *        The specific version of the parameter which you want to delete one or more labels from. If it isn't
     *        present, the call will fail.
     */

    public void setParameterVersion(Long parameterVersion) {
        this.parameterVersion = parameterVersion;
    }

    /**
     * <p>
     * The specific version of the parameter which you want to delete one or more labels from. If it isn't present, the
     * call will fail.
     * </p>
     * 
     * @return The specific version of the parameter which you want to delete one or more labels from. If it isn't
     *         present, the call will fail.
     */

    public Long getParameterVersion() {
        return this.parameterVersion;
    }

    /**
     * <p>
     * The specific version of the parameter which you want to delete one or more labels from. If it isn't present, the
     * call will fail.
     * </p>
     * 
     * @param parameterVersion
     *        The specific version of the parameter which you want to delete one or more labels from. If it isn't
     *        present, the call will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionRequest withParameterVersion(Long parameterVersion) {
        setParameterVersion(parameterVersion);
        return this;
    }

    /**
     * <p>
     * One or more labels to delete from the specified parameter version.
     * </p>
     * 
     * @return One or more labels to delete from the specified parameter version.
     */

    public java.util.List<String> getLabels() {
        if (labels == null) {
            labels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return labels;
    }

    /**
     * <p>
     * One or more labels to delete from the specified parameter version.
     * </p>
     * 
     * @param labels
     *        One or more labels to delete from the specified parameter version.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new com.amazonaws.internal.SdkInternalList<String>(labels);
    }

    /**
     * <p>
     * One or more labels to delete from the specified parameter version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        One or more labels to delete from the specified parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionRequest withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new com.amazonaws.internal.SdkInternalList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more labels to delete from the specified parameter version.
     * </p>
     * 
     * @param labels
     *        One or more labels to delete from the specified parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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
        if (getParameterVersion() != null)
            sb.append("ParameterVersion: ").append(getParameterVersion()).append(",");
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

        if (obj instanceof UnlabelParameterVersionRequest == false)
            return false;
        UnlabelParameterVersionRequest other = (UnlabelParameterVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameterVersion() == null ^ this.getParameterVersion() == null)
            return false;
        if (other.getParameterVersion() != null && other.getParameterVersion().equals(this.getParameterVersion()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameterVersion() == null) ? 0 : getParameterVersion().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public UnlabelParameterVersionRequest clone() {
        return (UnlabelParameterVersionRequest) super.clone();
    }

}
