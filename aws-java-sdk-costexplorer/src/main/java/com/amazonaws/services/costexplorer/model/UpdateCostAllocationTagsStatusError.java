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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gives a detailed description of the result of an action. It's on each cost allocation tag entry in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostAllocationTagsStatusError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCostAllocationTagsStatusError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @param tagKey
     *        The key for the cost allocation tag.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @return The key for the cost allocation tag.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @param tagKey
     *        The key for the cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostAllocationTagsStatusError withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * 
     * @param code
     *        An error code representing why the action failed on this entry.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * 
     * @return An error code representing why the action failed on this entry.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * 
     * @param code
     *        An error code representing why the action failed on this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostAllocationTagsStatusError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * 
     * @param message
     *        A message explaining why the action failed on this entry.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * 
     * @return A message explaining why the action failed on this entry.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * 
     * @param message
     *        A message explaining why the action failed on this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCostAllocationTagsStatusError withMessage(String message) {
        setMessage(message);
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCostAllocationTagsStatusError == false)
            return false;
        UpdateCostAllocationTagsStatusError other = (UpdateCostAllocationTagsStatusError) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCostAllocationTagsStatusError clone() {
        try {
            return (UpdateCostAllocationTagsStatusError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.UpdateCostAllocationTagsStatusErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
