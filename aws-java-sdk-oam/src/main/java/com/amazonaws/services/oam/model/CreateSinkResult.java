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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateSink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the sink that is newly created.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the sink.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags assigned to the sink.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the sink that is newly created.
     * </p>
     * 
     * @param arn
     *        The ARN of the sink that is newly created.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the sink that is newly created.
     * </p>
     * 
     * @return The ARN of the sink that is newly created.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the sink that is newly created.
     * </p>
     * 
     * @param arn
     *        The ARN of the sink that is newly created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSinkResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @param id
     *        The random ID string that Amazon Web Services generated as part of the sink ARN.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @return The random ID string that Amazon Web Services generated as part of the sink ARN.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @param id
     *        The random ID string that Amazon Web Services generated as part of the sink ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSinkResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the sink.
     * </p>
     * 
     * @param name
     *        The name of the sink.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the sink.
     * </p>
     * 
     * @return The name of the sink.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the sink.
     * </p>
     * 
     * @param name
     *        The name of the sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSinkResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the sink.
     * </p>
     * 
     * @return The tags assigned to the sink.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the sink.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the sink.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the sink.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSinkResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSinkResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSinkResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSinkResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateSinkResult == false)
            return false;
        CreateSinkResult other = (CreateSinkResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSinkResult clone() {
        try {
            return (CreateSinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
