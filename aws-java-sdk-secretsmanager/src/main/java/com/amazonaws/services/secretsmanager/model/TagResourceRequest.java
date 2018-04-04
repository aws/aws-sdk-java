/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     * <code>Value</code>.
     * </p>
     * <p>
     * This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter
     * for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     * <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource
     *        Name (ARN) or the friendly name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret.
     * </p>
     * 
     * @return The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource
     *         Name (ARN) or the friendly name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource Name
     * (ARN) or the friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        The identifier for the secret that you want to attach tags to. You can specify either the Amazon Resource
     *        Name (ARN) or the friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     * <code>Value</code>.
     * </p>
     * <p>
     * This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter
     * for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     * <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * </p>
     * 
     * @return The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     *         <code>Value</code>.</p>
     *         <p>
     *         This parameter to the API requires a JSON text string argument. For information on how to format a JSON
     *         parameter for the various command line tool environments, see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *         JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     *         <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     * <code>Value</code>.
     * </p>
     * <p>
     * This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter
     * for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     * <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * </p>
     * 
     * @param tags
     *        The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     *        <code>Value</code>.</p>
     *        <p>
     *        This parameter to the API requires a JSON text string argument. For information on how to format a JSON
     *        parameter for the various command line tool environments, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     *        <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     * <code>Value</code>.
     * </p>
     * <p>
     * This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter
     * for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     * <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     *        <code>Value</code>.</p>
     *        <p>
     *        This parameter to the API requires a JSON text string argument. For information on how to format a JSON
     *        parameter for the various command line tool environments, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     *        <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     * <code>Value</code>.
     * </p>
     * <p>
     * This parameter to the API requires a JSON text string argument. For information on how to format a JSON parameter
     * for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     * <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * </p>
     * 
     * @param tags
     *        The tags to attach to the secret. Each element in the list consists of a <code>Key</code> and a
     *        <code>Value</code>.</p>
     *        <p>
     *        This parameter to the API requires a JSON text string argument. For information on how to format a JSON
     *        parameter for the various command line tool environments, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>. For the AWS CLI, you can also use the syntax:
     *        <code>--Tags Key="Key1",Value="Value1",Key="Key2",Value="Value2"[,…]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
