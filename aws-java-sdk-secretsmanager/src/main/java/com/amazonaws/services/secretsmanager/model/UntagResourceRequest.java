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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * A list of tag key names to remove from the secret. You don't specify the value. Both the key and its associated
     * value are removed.
     * </p>
     * <p>
     * This parameter requires a JSON text string argument.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter values for
     * the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret.</p>
     *         <p>
     *         For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *         >Finding a secret from a partial ARN</a>.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A list of tag key names to remove from the secret. You don't specify the value. Both the key and its associated
     * value are removed.
     * </p>
     * <p>
     * This parameter requires a JSON text string argument.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter values for
     * the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * </p>
     * 
     * @return A list of tag key names to remove from the secret. You don't specify the value. Both the key and its
     *         associated value are removed.</p>
     *         <p>
     *         This parameter requires a JSON text string argument.
     *         </p>
     *         <p>
     *         For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *         pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter
     *         values for the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of tag key names to remove from the secret. You don't specify the value. Both the key and its associated
     * value are removed.
     * </p>
     * <p>
     * This parameter requires a JSON text string argument.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter values for
     * the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag key names to remove from the secret. You don't specify the value. Both the key and its
     *        associated value are removed.</p>
     *        <p>
     *        This parameter requires a JSON text string argument.
     *        </p>
     *        <p>
     *        For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *        pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter
     *        values for the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of tag key names to remove from the secret. You don't specify the value. Both the key and its associated
     * value are removed.
     * </p>
     * <p>
     * This parameter requires a JSON text string argument.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter values for
     * the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag key names to remove from the secret. You don't specify the value. Both the key and its
     *        associated value are removed.</p>
     *        <p>
     *        This parameter requires a JSON text string argument.
     *        </p>
     *        <p>
     *        For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *        pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter
     *        values for the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag key names to remove from the secret. You don't specify the value. Both the key and its associated
     * value are removed.
     * </p>
     * <p>
     * This parameter requires a JSON text string argument.
     * </p>
     * <p>
     * For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter values for
     * the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag key names to remove from the secret. You don't specify the value. Both the key and its
     *        associated value are removed.</p>
     *        <p>
     *        This parameter requires a JSON text string argument.
     *        </p>
     *        <p>
     *        For storing multiple values, we recommend that you use a JSON text string argument and specify key/value
     *        pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters.html">Specifying parameter
     *        values for the Amazon Web Services CLI</a> in the Amazon Web Services CLI User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
