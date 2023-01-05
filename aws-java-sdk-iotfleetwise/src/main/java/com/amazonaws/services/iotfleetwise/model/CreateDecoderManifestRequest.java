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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateDecoderManifest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDecoderManifestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the decoder manifest to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     * </p>
     */
    private String modelManifestArn;
    /**
     * <p>
     * A list of information about signal decoders.
     * </p>
     */
    private java.util.List<SignalDecoder> signalDecoders;
    /**
     * <p>
     * A list of information about available network interfaces.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;
    /**
     * <p>
     * Metadata that can be used to manage the decoder manifest.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique name of the decoder manifest to create.
     * </p>
     * 
     * @param name
     *        The unique name of the decoder manifest to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the decoder manifest to create.
     * </p>
     * 
     * @return The unique name of the decoder manifest to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the decoder manifest to create.
     * </p>
     * 
     * @param name
     *        The unique name of the decoder manifest to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     * 
     * @param description
     *        A brief description of the decoder manifest.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     * 
     * @return A brief description of the decoder manifest.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the decoder manifest.
     * </p>
     * 
     * @param description
     *        A brief description of the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     * </p>
     * 
     * @param modelManifestArn
     *        The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     */

    public void setModelManifestArn(String modelManifestArn) {
        this.modelManifestArn = modelManifestArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     */

    public String getModelManifestArn() {
        return this.modelManifestArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     * </p>
     * 
     * @param modelManifestArn
     *        The Amazon Resource Name (ARN) of the vehicle model (model manifest).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withModelManifestArn(String modelManifestArn) {
        setModelManifestArn(modelManifestArn);
        return this;
    }

    /**
     * <p>
     * A list of information about signal decoders.
     * </p>
     * 
     * @return A list of information about signal decoders.
     */

    public java.util.List<SignalDecoder> getSignalDecoders() {
        return signalDecoders;
    }

    /**
     * <p>
     * A list of information about signal decoders.
     * </p>
     * 
     * @param signalDecoders
     *        A list of information about signal decoders.
     */

    public void setSignalDecoders(java.util.Collection<SignalDecoder> signalDecoders) {
        if (signalDecoders == null) {
            this.signalDecoders = null;
            return;
        }

        this.signalDecoders = new java.util.ArrayList<SignalDecoder>(signalDecoders);
    }

    /**
     * <p>
     * A list of information about signal decoders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalDecoders(java.util.Collection)} or {@link #withSignalDecoders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param signalDecoders
     *        A list of information about signal decoders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withSignalDecoders(SignalDecoder... signalDecoders) {
        if (this.signalDecoders == null) {
            setSignalDecoders(new java.util.ArrayList<SignalDecoder>(signalDecoders.length));
        }
        for (SignalDecoder ele : signalDecoders) {
            this.signalDecoders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about signal decoders.
     * </p>
     * 
     * @param signalDecoders
     *        A list of information about signal decoders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withSignalDecoders(java.util.Collection<SignalDecoder> signalDecoders) {
        setSignalDecoders(signalDecoders);
        return this;
    }

    /**
     * <p>
     * A list of information about available network interfaces.
     * </p>
     * 
     * @return A list of information about available network interfaces.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * A list of information about available network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        A list of information about available network interfaces.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * A list of information about available network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        A list of information about available network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about available network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        A list of information about available network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the decoder manifest.
     * </p>
     * 
     * @return Metadata that can be used to manage the decoder manifest.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the decoder manifest.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the decoder manifest.
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
     * Metadata that can be used to manage the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withTags(Tag... tags) {
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
     * Metadata that can be used to manage the decoder manifest.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDecoderManifestRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getModelManifestArn() != null)
            sb.append("ModelManifestArn: ").append(getModelManifestArn()).append(",");
        if (getSignalDecoders() != null)
            sb.append("SignalDecoders: ").append(getSignalDecoders()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
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

        if (obj instanceof CreateDecoderManifestRequest == false)
            return false;
        CreateDecoderManifestRequest other = (CreateDecoderManifestRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getModelManifestArn() == null ^ this.getModelManifestArn() == null)
            return false;
        if (other.getModelManifestArn() != null && other.getModelManifestArn().equals(this.getModelManifestArn()) == false)
            return false;
        if (other.getSignalDecoders() == null ^ this.getSignalDecoders() == null)
            return false;
        if (other.getSignalDecoders() != null && other.getSignalDecoders().equals(this.getSignalDecoders()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getModelManifestArn() == null) ? 0 : getModelManifestArn().hashCode());
        hashCode = prime * hashCode + ((getSignalDecoders() == null) ? 0 : getSignalDecoders().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDecoderManifestRequest clone() {
        return (CreateDecoderManifestRequest) super.clone();
    }

}
