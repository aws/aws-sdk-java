/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateHITTypeOfHIT" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHITTypeOfHITRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The HIT to update.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The ID of the new HIT type.
     * </p>
     */
    private String hITTypeId;

    /**
     * <p>
     * The HIT to update.
     * </p>
     * 
     * @param hITId
     *        The HIT to update.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The HIT to update.
     * </p>
     * 
     * @return The HIT to update.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The HIT to update.
     * </p>
     * 
     * @param hITId
     *        The HIT to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHITTypeOfHITRequest withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The ID of the new HIT type.
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the new HIT type.
     */

    public void setHITTypeId(String hITTypeId) {
        this.hITTypeId = hITTypeId;
    }

    /**
     * <p>
     * The ID of the new HIT type.
     * </p>
     * 
     * @return The ID of the new HIT type.
     */

    public String getHITTypeId() {
        return this.hITTypeId;
    }

    /**
     * <p>
     * The ID of the new HIT type.
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the new HIT type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHITTypeOfHITRequest withHITTypeId(String hITTypeId) {
        setHITTypeId(hITTypeId);
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
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getHITTypeId() != null)
            sb.append("HITTypeId: ").append(getHITTypeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHITTypeOfHITRequest == false)
            return false;
        UpdateHITTypeOfHITRequest other = (UpdateHITTypeOfHITRequest) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getHITTypeId() == null ^ this.getHITTypeId() == null)
            return false;
        if (other.getHITTypeId() != null && other.getHITTypeId().equals(this.getHITTypeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getHITTypeId() == null) ? 0 : getHITTypeId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHITTypeOfHITRequest clone() {
        return (UpdateHITTypeOfHITRequest) super.clone();
    }

}
