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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateKeyspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyspaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace to be created.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * A list of key-value pair tags to be attached to the keyspace.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the keyspace to be created.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace to be created.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace to be created.
     * </p>
     * 
     * @return The name of the keyspace to be created.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace to be created.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyspaceRequest withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the keyspace.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pair tags to be attached to the keyspace.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and
     *         labels to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the keyspace.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the keyspace.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
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
     * A list of key-value pair tags to be attached to the keyspace.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the keyspace.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyspaceRequest withTags(Tag... tags) {
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
     * A list of key-value pair tags to be attached to the keyspace.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the keyspace.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyspaceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
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

        if (obj instanceof CreateKeyspaceRequest == false)
            return false;
        CreateKeyspaceRequest other = (CreateKeyspaceRequest) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
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

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyspaceRequest clone() {
        return (CreateKeyspaceRequest) super.clone();
    }

}
