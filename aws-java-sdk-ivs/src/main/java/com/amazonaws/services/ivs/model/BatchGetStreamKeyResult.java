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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetStreamKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<StreamKey> streamKeys;

    private java.util.List<BatchError> errors;

    /**
     * @return
     */

    public java.util.List<StreamKey> getStreamKeys() {
        return streamKeys;
    }

    /**
     * @param streamKeys
     */

    public void setStreamKeys(java.util.Collection<StreamKey> streamKeys) {
        if (streamKeys == null) {
            this.streamKeys = null;
            return;
        }

        this.streamKeys = new java.util.ArrayList<StreamKey>(streamKeys);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamKeys(java.util.Collection)} or {@link #withStreamKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param streamKeys
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStreamKeyResult withStreamKeys(StreamKey... streamKeys) {
        if (this.streamKeys == null) {
            setStreamKeys(new java.util.ArrayList<StreamKey>(streamKeys.length));
        }
        for (StreamKey ele : streamKeys) {
            this.streamKeys.add(ele);
        }
        return this;
    }

    /**
     * @param streamKeys
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStreamKeyResult withStreamKeys(java.util.Collection<StreamKey> streamKeys) {
        setStreamKeys(streamKeys);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<BatchError> getErrors() {
        return errors;
    }

    /**
     * @param errors
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStreamKeyResult withErrors(BatchError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchError>(errors.length));
        }
        for (BatchError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * @param errors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetStreamKeyResult withErrors(java.util.Collection<BatchError> errors) {
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
        if (getStreamKeys() != null)
            sb.append("StreamKeys: ").append(getStreamKeys()).append(",");
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

        if (obj instanceof BatchGetStreamKeyResult == false)
            return false;
        BatchGetStreamKeyResult other = (BatchGetStreamKeyResult) obj;
        if (other.getStreamKeys() == null ^ this.getStreamKeys() == null)
            return false;
        if (other.getStreamKeys() != null && other.getStreamKeys().equals(this.getStreamKeys()) == false)
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

        hashCode = prime * hashCode + ((getStreamKeys() == null) ? 0 : getStreamKeys().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetStreamKeyResult clone() {
        try {
            return (BatchGetStreamKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
