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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteObservabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteObservabilityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     */
    private String observabilityConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.</p>
     *        <p>
     *        The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     *        <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't
     *        specified, the latest active revision is deleted.
     */

    public void setObservabilityConfigurationArn(String observabilityConfigurationArn) {
        this.observabilityConfigurationArn = observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.</p>
     *         <p>
     *         The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     *         <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't
     *         specified, the latest active revision is deleted.
     */

    public String getObservabilityConfigurationArn() {
        return this.observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.
     * </p>
     * <p>
     * The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     * <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't specified,
     * the latest active revision is deleted.
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete.</p>
     *        <p>
     *        The ARN can be a full observability configuration ARN, or a partial ARN ending with either
     *        <code>.../<i>name</i> </code> or <code>.../<i>name</i>/<i>revision</i> </code>. If a revision isn't
     *        specified, the latest active revision is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObservabilityConfigurationRequest withObservabilityConfigurationArn(String observabilityConfigurationArn) {
        setObservabilityConfigurationArn(observabilityConfigurationArn);
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
        if (getObservabilityConfigurationArn() != null)
            sb.append("ObservabilityConfigurationArn: ").append(getObservabilityConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObservabilityConfigurationRequest == false)
            return false;
        DeleteObservabilityConfigurationRequest other = (DeleteObservabilityConfigurationRequest) obj;
        if (other.getObservabilityConfigurationArn() == null ^ this.getObservabilityConfigurationArn() == null)
            return false;
        if (other.getObservabilityConfigurationArn() != null
                && other.getObservabilityConfigurationArn().equals(this.getObservabilityConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObservabilityConfigurationArn() == null) ? 0 : getObservabilityConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteObservabilityConfigurationRequest clone() {
        return (DeleteObservabilityConfigurationRequest) super.clone();
    }

}
