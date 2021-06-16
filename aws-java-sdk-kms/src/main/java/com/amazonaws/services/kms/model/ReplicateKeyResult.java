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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ReplicateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicateKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Displays details about the new replica CMK, including its Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also includes the
     * ARN and AWS Region of its primary key and other replica keys.
     * </p>
     */
    private KeyMetadata replicaKeyMetadata;
    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document in JSON format.
     * </p>
     */
    private String replicaPolicy;
    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> replicaTags;

    /**
     * <p>
     * Displays details about the new replica CMK, including its Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also includes the
     * ARN and AWS Region of its primary key and other replica keys.
     * </p>
     * 
     * @param replicaKeyMetadata
     *        Displays details about the new replica CMK, including its Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also
     *        includes the ARN and AWS Region of its primary key and other replica keys.
     */

    public void setReplicaKeyMetadata(KeyMetadata replicaKeyMetadata) {
        this.replicaKeyMetadata = replicaKeyMetadata;
    }

    /**
     * <p>
     * Displays details about the new replica CMK, including its Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also includes the
     * ARN and AWS Region of its primary key and other replica keys.
     * </p>
     * 
     * @return Displays details about the new replica CMK, including its Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>)
     *         and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also
     *         includes the ARN and AWS Region of its primary key and other replica keys.
     */

    public KeyMetadata getReplicaKeyMetadata() {
        return this.replicaKeyMetadata;
    }

    /**
     * <p>
     * Displays details about the new replica CMK, including its Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also includes the
     * ARN and AWS Region of its primary key and other replica keys.
     * </p>
     * 
     * @param replicaKeyMetadata
     *        Displays details about the new replica CMK, including its Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">key state</a>. It also
     *        includes the ARN and AWS Region of its primary key and other replica keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyResult withReplicaKeyMetadata(KeyMetadata replicaKeyMetadata) {
        setReplicaKeyMetadata(replicaKeyMetadata);
        return this;
    }

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document in JSON format.
     * </p>
     * 
     * @param replicaPolicy
     *        The key policy of the new replica key. The value is a key policy document in JSON format.
     */

    public void setReplicaPolicy(String replicaPolicy) {
        this.replicaPolicy = replicaPolicy;
    }

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document in JSON format.
     * </p>
     * 
     * @return The key policy of the new replica key. The value is a key policy document in JSON format.
     */

    public String getReplicaPolicy() {
        return this.replicaPolicy;
    }

    /**
     * <p>
     * The key policy of the new replica key. The value is a key policy document in JSON format.
     * </p>
     * 
     * @param replicaPolicy
     *        The key policy of the new replica key. The value is a key policy document in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyResult withReplicaPolicy(String replicaPolicy) {
        setReplicaPolicy(replicaPolicy);
        return this;
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * </p>
     * 
     * @return The tags on the new replica key. The value is a list of tag key and tag value pairs.
     */

    public java.util.List<Tag> getReplicaTags() {
        if (replicaTags == null) {
            replicaTags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return replicaTags;
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * </p>
     * 
     * @param replicaTags
     *        The tags on the new replica key. The value is a list of tag key and tag value pairs.
     */

    public void setReplicaTags(java.util.Collection<Tag> replicaTags) {
        if (replicaTags == null) {
            this.replicaTags = null;
            return;
        }

        this.replicaTags = new com.amazonaws.internal.SdkInternalList<Tag>(replicaTags);
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaTags(java.util.Collection)} or {@link #withReplicaTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param replicaTags
     *        The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyResult withReplicaTags(Tag... replicaTags) {
        if (this.replicaTags == null) {
            setReplicaTags(new com.amazonaws.internal.SdkInternalList<Tag>(replicaTags.length));
        }
        for (Tag ele : replicaTags) {
            this.replicaTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * </p>
     * 
     * @param replicaTags
     *        The tags on the new replica key. The value is a list of tag key and tag value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyResult withReplicaTags(java.util.Collection<Tag> replicaTags) {
        setReplicaTags(replicaTags);
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
        if (getReplicaKeyMetadata() != null)
            sb.append("ReplicaKeyMetadata: ").append(getReplicaKeyMetadata()).append(",");
        if (getReplicaPolicy() != null)
            sb.append("ReplicaPolicy: ").append(getReplicaPolicy()).append(",");
        if (getReplicaTags() != null)
            sb.append("ReplicaTags: ").append(getReplicaTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateKeyResult == false)
            return false;
        ReplicateKeyResult other = (ReplicateKeyResult) obj;
        if (other.getReplicaKeyMetadata() == null ^ this.getReplicaKeyMetadata() == null)
            return false;
        if (other.getReplicaKeyMetadata() != null && other.getReplicaKeyMetadata().equals(this.getReplicaKeyMetadata()) == false)
            return false;
        if (other.getReplicaPolicy() == null ^ this.getReplicaPolicy() == null)
            return false;
        if (other.getReplicaPolicy() != null && other.getReplicaPolicy().equals(this.getReplicaPolicy()) == false)
            return false;
        if (other.getReplicaTags() == null ^ this.getReplicaTags() == null)
            return false;
        if (other.getReplicaTags() != null && other.getReplicaTags().equals(this.getReplicaTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicaKeyMetadata() == null) ? 0 : getReplicaKeyMetadata().hashCode());
        hashCode = prime * hashCode + ((getReplicaPolicy() == null) ? 0 : getReplicaPolicy().hashCode());
        hashCode = prime * hashCode + ((getReplicaTags() == null) ? 0 : getReplicaTags().hashCode());
        return hashCode;
    }

    @Override
    public ReplicateKeyResult clone() {
        try {
            return (ReplicateKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
