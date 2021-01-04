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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Action to prepare an input for a future immediate input switch.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputPrepareScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputPrepareScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The name of the input attachment that should be prepared by this action. If no name is provided, the action will
     * stop the most recent prepare (if any) when activated.
     */
    private String inputAttachmentNameReference;
    /**
     * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the
     * file.
     */
    private InputClippingSettings inputClippingSettings;
    /**
     * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time
     * you use the same dynamic input in an input switch action, you can provide a different value, in order to connect
     * the input to a different content source.
     */
    private java.util.List<String> urlPath;

    /**
     * The name of the input attachment that should be prepared by this action. If no name is provided, the action will
     * stop the most recent prepare (if any) when activated.
     * 
     * @param inputAttachmentNameReference
     *        The name of the input attachment that should be prepared by this action. If no name is provided, the
     *        action will stop the most recent prepare (if any) when activated.
     */

    public void setInputAttachmentNameReference(String inputAttachmentNameReference) {
        this.inputAttachmentNameReference = inputAttachmentNameReference;
    }

    /**
     * The name of the input attachment that should be prepared by this action. If no name is provided, the action will
     * stop the most recent prepare (if any) when activated.
     * 
     * @return The name of the input attachment that should be prepared by this action. If no name is provided, the
     *         action will stop the most recent prepare (if any) when activated.
     */

    public String getInputAttachmentNameReference() {
        return this.inputAttachmentNameReference;
    }

    /**
     * The name of the input attachment that should be prepared by this action. If no name is provided, the action will
     * stop the most recent prepare (if any) when activated.
     * 
     * @param inputAttachmentNameReference
     *        The name of the input attachment that should be prepared by this action. If no name is provided, the
     *        action will stop the most recent prepare (if any) when activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputPrepareScheduleActionSettings withInputAttachmentNameReference(String inputAttachmentNameReference) {
        setInputAttachmentNameReference(inputAttachmentNameReference);
        return this;
    }

    /**
     * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the
     * file.
     * 
     * @param inputClippingSettings
     *        Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion
     *        of the file.
     */

    public void setInputClippingSettings(InputClippingSettings inputClippingSettings) {
        this.inputClippingSettings = inputClippingSettings;
    }

    /**
     * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the
     * file.
     * 
     * @return Settings to let you create a clip of the file input, in order to set up the input to ingest only a
     *         portion of the file.
     */

    public InputClippingSettings getInputClippingSettings() {
        return this.inputClippingSettings;
    }

    /**
     * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the
     * file.
     * 
     * @param inputClippingSettings
     *        Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion
     *        of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputPrepareScheduleActionSettings withInputClippingSettings(InputClippingSettings inputClippingSettings) {
        setInputClippingSettings(inputClippingSettings);
        return this;
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time
     * you use the same dynamic input in an input switch action, you can provide a different value, in order to connect
     * the input to a different content source.
     * 
     * @return The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each
     *         time you use the same dynamic input in an input switch action, you can provide a different value, in
     *         order to connect the input to a different content source.
     */

    public java.util.List<String> getUrlPath() {
        return urlPath;
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time
     * you use the same dynamic input in an input switch action, you can provide a different value, in order to connect
     * the input to a different content source.
     * 
     * @param urlPath
     *        The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each
     *        time you use the same dynamic input in an input switch action, you can provide a different value, in order
     *        to connect the input to a different content source.
     */

    public void setUrlPath(java.util.Collection<String> urlPath) {
        if (urlPath == null) {
            this.urlPath = null;
            return;
        }

        this.urlPath = new java.util.ArrayList<String>(urlPath);
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time
     * you use the same dynamic input in an input switch action, you can provide a different value, in order to connect
     * the input to a different content source.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrlPath(java.util.Collection)} or {@link #withUrlPath(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param urlPath
     *        The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each
     *        time you use the same dynamic input in an input switch action, you can provide a different value, in order
     *        to connect the input to a different content source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputPrepareScheduleActionSettings withUrlPath(String... urlPath) {
        if (this.urlPath == null) {
            setUrlPath(new java.util.ArrayList<String>(urlPath.length));
        }
        for (String ele : urlPath) {
            this.urlPath.add(ele);
        }
        return this;
    }

    /**
     * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time
     * you use the same dynamic input in an input switch action, you can provide a different value, in order to connect
     * the input to a different content source.
     * 
     * @param urlPath
     *        The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each
     *        time you use the same dynamic input in an input switch action, you can provide a different value, in order
     *        to connect the input to a different content source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputPrepareScheduleActionSettings withUrlPath(java.util.Collection<String> urlPath) {
        setUrlPath(urlPath);
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
        if (getInputAttachmentNameReference() != null)
            sb.append("InputAttachmentNameReference: ").append(getInputAttachmentNameReference()).append(",");
        if (getInputClippingSettings() != null)
            sb.append("InputClippingSettings: ").append(getInputClippingSettings()).append(",");
        if (getUrlPath() != null)
            sb.append("UrlPath: ").append(getUrlPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputPrepareScheduleActionSettings == false)
            return false;
        InputPrepareScheduleActionSettings other = (InputPrepareScheduleActionSettings) obj;
        if (other.getInputAttachmentNameReference() == null ^ this.getInputAttachmentNameReference() == null)
            return false;
        if (other.getInputAttachmentNameReference() != null && other.getInputAttachmentNameReference().equals(this.getInputAttachmentNameReference()) == false)
            return false;
        if (other.getInputClippingSettings() == null ^ this.getInputClippingSettings() == null)
            return false;
        if (other.getInputClippingSettings() != null && other.getInputClippingSettings().equals(this.getInputClippingSettings()) == false)
            return false;
        if (other.getUrlPath() == null ^ this.getUrlPath() == null)
            return false;
        if (other.getUrlPath() != null && other.getUrlPath().equals(this.getUrlPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputAttachmentNameReference() == null) ? 0 : getInputAttachmentNameReference().hashCode());
        hashCode = prime * hashCode + ((getInputClippingSettings() == null) ? 0 : getInputClippingSettings().hashCode());
        hashCode = prime * hashCode + ((getUrlPath() == null) ? 0 : getUrlPath().hashCode());
        return hashCode;
    }

    @Override
    public InputPrepareScheduleActionSettings clone() {
        try {
            return (InputPrepareScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputPrepareScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
