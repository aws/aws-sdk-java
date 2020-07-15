/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<Channel> channels;
    /**
     * <p>
     * Each error object is related to a specific ARN in the request.
     * </p>
     */
    private java.util.List<BatchError> errors;

    /**
     * @return
     */

    public java.util.List<Channel> getChannels() {
        return channels;
    }

    /**
     * @param channels
     */

    public void setChannels(java.util.Collection<Channel> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<Channel>(channels);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetChannelResult withChannels(Channel... channels) {
        if (this.channels == null) {
            setChannels(new java.util.ArrayList<Channel>(channels.length));
        }
        for (Channel ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * @param channels
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetChannelResult withChannels(java.util.Collection<Channel> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * Each error object is related to a specific ARN in the request.
     * </p>
     * 
     * @return Each error object is related to a specific ARN in the request.
     */

    public java.util.List<BatchError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Each error object is related to a specific ARN in the request.
     * </p>
     * 
     * @param errors
     *        Each error object is related to a specific ARN in the request.
     */

    public void setErrors(java.util.Collection<BatchError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchError>(errors);
    }

    /**
     * <p>
     * Each error object is related to a specific ARN in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Each error object is related to a specific ARN in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetChannelResult withErrors(BatchError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchError>(errors.length));
        }
        for (BatchError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each error object is related to a specific ARN in the request.
     * </p>
     * 
     * @param errors
     *        Each error object is related to a specific ARN in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetChannelResult withErrors(java.util.Collection<BatchError> errors) {
        setErrors(errors);
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
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetChannelResult == false)
            return false;
        BatchGetChannelResult other = (BatchGetChannelResult) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetChannelResult clone() {
        try {
            return (BatchGetChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
