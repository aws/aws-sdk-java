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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateFramework" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFrameworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     */
    private String frameworkName;
    /**
     * <p>
     * An optional description of the framework with a maximum of 1,024 characters.
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
     * <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> frameworkTags;

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter,
     *        and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @return The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter,
     *         and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public String getFrameworkName() {
        return this.frameworkName;
    }

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter,
     *        and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkRequest withFrameworkName(String frameworkName) {
        setFrameworkName(frameworkName);
        return this;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum of 1,024 characters.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework with a maximum of 1,024 characters.
     */

    public void setFrameworkDescription(String frameworkDescription) {
        this.frameworkDescription = frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum of 1,024 characters.
     * </p>
     * 
     * @return An optional description of the framework with a maximum of 1,024 characters.
     */

    public String getFrameworkDescription() {
        return this.frameworkDescription;
    }

    /**
     * <p>
     * An optional description of the framework with a maximum of 1,024 characters.
     * </p>
     * 
     * @param frameworkDescription
     *        An optional description of the framework with a maximum of 1,024 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkRequest withFrameworkDescription(String frameworkDescription) {
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

    public CreateFrameworkRequest withFrameworkControls(FrameworkControl... frameworkControls) {
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

    public CreateFrameworkRequest withFrameworkControls(java.util.Collection<FrameworkControl> frameworkControls) {
        setFrameworkControls(frameworkControls);
        return this;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results
     *        in a success message with no action taken.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @return A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *         <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results
     *         in a success message with no action taken.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>CreateFrameworkInput</code>. Retrying a successful request with the same idempotency token results
     *        in a success message with no action taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * </p>
     * 
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value
     *         pair.
     */

    public java.util.Map<String, String> getFrameworkTags() {
        return frameworkTags;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * </p>
     * 
     * @param frameworkTags
     *        Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value
     *        pair.
     */

    public void setFrameworkTags(java.util.Map<String, String> frameworkTags) {
        this.frameworkTags = frameworkTags;
    }

    /**
     * <p>
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * </p>
     * 
     * @param frameworkTags
     *        Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkRequest withFrameworkTags(java.util.Map<String, String> frameworkTags) {
        setFrameworkTags(frameworkTags);
        return this;
    }

    /**
     * Add a single FrameworkTags entry
     *
     * @see CreateFrameworkRequest#withFrameworkTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkRequest addFrameworkTagsEntry(String key, String value) {
        if (null == this.frameworkTags) {
            this.frameworkTags = new java.util.HashMap<String, String>();
        }
        if (this.frameworkTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.frameworkTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FrameworkTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkRequest clearFrameworkTagsEntries() {
        this.frameworkTags = null;
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
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getFrameworkTags() != null)
            sb.append("FrameworkTags: ").append(getFrameworkTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFrameworkRequest == false)
            return false;
        CreateFrameworkRequest other = (CreateFrameworkRequest) obj;
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
        if (other.getFrameworkTags() == null ^ this.getFrameworkTags() == null)
            return false;
        if (other.getFrameworkTags() != null && other.getFrameworkTags().equals(this.getFrameworkTags()) == false)
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
        hashCode = prime * hashCode + ((getFrameworkTags() == null) ? 0 : getFrameworkTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFrameworkRequest clone() {
        return (CreateFrameworkRequest) super.clone();
    }

}
