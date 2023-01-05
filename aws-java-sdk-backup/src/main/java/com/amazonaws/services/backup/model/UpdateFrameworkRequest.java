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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateFramework" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFrameworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     */
    private String frameworkName;
    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     */
    private String frameworkDescription;
    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     */
    private java.util.List<FrameworkControl> frameworkControls;
    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @return The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and
     *         consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public String getFrameworkName() {
        return this.frameworkName;
    }

    /**
     * <p>
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting
     * of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and
     *        consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFrameworkRequest withFrameworkName(String frameworkName) {
        setFrameworkName(frameworkName);
        return this;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework with a maximum 1,024 characters.
     */

    public void setFrameworkDescription(String frameworkDescription) {
        this.frameworkDescription = frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     * 
     * @return An optional description of the framework with a maximum 1,024 characters.
     */

    public String getFrameworkDescription() {
        return this.frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum 1,024 characters.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework with a maximum 1,024 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFrameworkRequest withFrameworkDescription(String frameworkDescription) {
        setFrameworkDescription(frameworkDescription);
        return this;
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * 
     * @return A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *         and scope.
     */

    public java.util.List<FrameworkControl> getFrameworkControls() {
        return frameworkControls;
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * 
     * @param frameworkControls
     *        A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *        and scope.
     */

    public void setFrameworkControls(java.util.Collection<FrameworkControl> frameworkControls) {
        if (frameworkControls == null) {
            this.frameworkControls = null;
            return;
        }

        this.frameworkControls = new java.util.ArrayList<FrameworkControl>(frameworkControls);
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworkControls(java.util.Collection)} or {@link #withFrameworkControls(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param frameworkControls
     *        A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *        and scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFrameworkRequest withFrameworkControls(FrameworkControl... frameworkControls) {
        if (this.frameworkControls == null) {
            setFrameworkControls(new java.util.ArrayList<FrameworkControl>(frameworkControls.length));
        }
        for (FrameworkControl ele : frameworkControls) {
            this.frameworkControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and
     * scope.
     * </p>
     * 
     * @param frameworkControls
     *        A list of the controls that make up the framework. Each control in the list has a name, input parameters,
     *        and scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFrameworkRequest withFrameworkControls(java.util.Collection<FrameworkControl> frameworkControls) {
        setFrameworkControls(frameworkControls);
        return this;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results
     *        in a success message with no action taken.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @return A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *         <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results
     *         in a success message with no action taken.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>UpdateFrameworkInput</code>. Retrying a successful request with the same idempotency token results
     *        in a success message with no action taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFrameworkRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getFrameworkName() != null)
            sb.append("FrameworkName: ").append(getFrameworkName()).append(",");
        if (getFrameworkDescription() != null)
            sb.append("FrameworkDescription: ").append(getFrameworkDescription()).append(",");
        if (getFrameworkControls() != null)
            sb.append("FrameworkControls: ").append(getFrameworkControls()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFrameworkRequest == false)
            return false;
        UpdateFrameworkRequest other = (UpdateFrameworkRequest) obj;
        if (other.getFrameworkName() == null ^ this.getFrameworkName() == null)
            return false;
        if (other.getFrameworkName() != null && other.getFrameworkName().equals(this.getFrameworkName()) == false)
            return false;
        if (other.getFrameworkDescription() == null ^ this.getFrameworkDescription() == null)
            return false;
        if (other.getFrameworkDescription() != null && other.getFrameworkDescription().equals(this.getFrameworkDescription()) == false)
            return false;
        if (other.getFrameworkControls() == null ^ this.getFrameworkControls() == null)
            return false;
        if (other.getFrameworkControls() != null && other.getFrameworkControls().equals(this.getFrameworkControls()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameworkName() == null) ? 0 : getFrameworkName().hashCode());
        hashCode = prime * hashCode + ((getFrameworkDescription() == null) ? 0 : getFrameworkDescription().hashCode());
        hashCode = prime * hashCode + ((getFrameworkControls() == null) ? 0 : getFrameworkControls().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFrameworkRequest clone() {
        return (UpdateFrameworkRequest) super.clone();
    }

}
