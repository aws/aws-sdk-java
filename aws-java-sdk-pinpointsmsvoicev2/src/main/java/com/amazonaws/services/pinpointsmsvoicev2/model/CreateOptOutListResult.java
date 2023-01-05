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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateOptOutList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOptOutListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the OptOutList.
     * </p>
     */
    private String optOutListArn;
    /**
     * <p>
     * The name of the new OptOutList.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * An array of tags (key and value pairs) associated with the new OptOutList.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the OptOutList.
     * </p>
     * 
     * @param optOutListArn
     *        The Amazon Resource Name (ARN) for the OptOutList.
     */

    public void setOptOutListArn(String optOutListArn) {
        this.optOutListArn = optOutListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the OptOutList.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the OptOutList.
     */

    public String getOptOutListArn() {
        return this.optOutListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the OptOutList.
     * </p>
     * 
     * @param optOutListArn
     *        The Amazon Resource Name (ARN) for the OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOptOutListResult withOptOutListArn(String optOutListArn) {
        setOptOutListArn(optOutListArn);
        return this;
    }

    /**
     * <p>
     * The name of the new OptOutList.
     * </p>
     * 
     * @param optOutListName
     *        The name of the new OptOutList.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The name of the new OptOutList.
     * </p>
     * 
     * @return The name of the new OptOutList.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The name of the new OptOutList.
     * </p>
     * 
     * @param optOutListName
     *        The name of the new OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOptOutListResult withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) associated with the new OptOutList.
     * </p>
     * 
     * @return An array of tags (key and value pairs) associated with the new OptOutList.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) associated with the new OptOutList.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associated with the new OptOutList.
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
     * An array of tags (key and value pairs) associated with the new OptOutList.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associated with the new OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOptOutListResult withTags(Tag... tags) {
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
     * An array of tags (key and value pairs) associated with the new OptOutList.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) associated with the new OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOptOutListResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *        format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @return The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *         format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the pool was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOptOutListResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getOptOutListArn() != null)
            sb.append("OptOutListArn: ").append(getOptOutListArn()).append(",");
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOptOutListResult == false)
            return false;
        CreateOptOutListResult other = (CreateOptOutListResult) obj;
        if (other.getOptOutListArn() == null ^ this.getOptOutListArn() == null)
            return false;
        if (other.getOptOutListArn() != null && other.getOptOutListArn().equals(this.getOptOutListArn()) == false)
            return false;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptOutListArn() == null) ? 0 : getOptOutListArn().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateOptOutListResult clone() {
        try {
            return (CreateOptOutListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
