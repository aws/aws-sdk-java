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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/Definition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Definition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique model handle.
     * </p>
     */
    private String modelHandle;
    /**
     * <p>
     * The absolute S3 location of the model.
     * </p>
     */
    private String s3Url;
    /**
     * <p>
     * The checksum information of the model.
     * </p>
     */
    private Checksum checksum;
    /**
     * <p>
     * The desired state of the model.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The unique model handle.
     * </p>
     * 
     * @param modelHandle
     *        The unique model handle.
     */

    public void setModelHandle(String modelHandle) {
        this.modelHandle = modelHandle;
    }

    /**
     * <p>
     * The unique model handle.
     * </p>
     * 
     * @return The unique model handle.
     */

    public String getModelHandle() {
        return this.modelHandle;
    }

    /**
     * <p>
     * The unique model handle.
     * </p>
     * 
     * @param modelHandle
     *        The unique model handle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withModelHandle(String modelHandle) {
        setModelHandle(modelHandle);
        return this;
    }

    /**
     * <p>
     * The absolute S3 location of the model.
     * </p>
     * 
     * @param s3Url
     *        The absolute S3 location of the model.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * The absolute S3 location of the model.
     * </p>
     * 
     * @return The absolute S3 location of the model.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * The absolute S3 location of the model.
     * </p>
     * 
     * @param s3Url
     *        The absolute S3 location of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withS3Url(String s3Url) {
        setS3Url(s3Url);
        return this;
    }

    /**
     * <p>
     * The checksum information of the model.
     * </p>
     * 
     * @param checksum
     *        The checksum information of the model.
     */

    public void setChecksum(Checksum checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum information of the model.
     * </p>
     * 
     * @return The checksum information of the model.
     */

    public Checksum getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The checksum information of the model.
     * </p>
     * 
     * @param checksum
     *        The checksum information of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withChecksum(Checksum checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @param state
     *        The desired state of the model.
     * @see ModelState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @return The desired state of the model.
     * @see ModelState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @param state
     *        The desired state of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelState
     */

    public Definition withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @param state
     *        The desired state of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelState
     */

    public Definition withState(ModelState state) {
        this.state = state.toString();
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
        if (getModelHandle() != null)
            sb.append("ModelHandle: ").append(getModelHandle()).append(",");
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Definition == false)
            return false;
        Definition other = (Definition) obj;
        if (other.getModelHandle() == null ^ this.getModelHandle() == null)
            return false;
        if (other.getModelHandle() != null && other.getModelHandle().equals(this.getModelHandle()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelHandle() == null) ? 0 : getModelHandle().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Definition clone() {
        try {
            return (Definition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakeredgemanager.model.transform.DefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
