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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateDecoderManifest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDecoderManifestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the decoder manifest to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the decoder manifest to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of information about decoding additional signals to add to the decoder manifest.
     * </p>
     */
    private java.util.List<SignalDecoder> signalDecodersToAdd;
    /**
     * <p>
     * A list of updated information about decoding signals to update in the decoder manifest.
     * </p>
     */
    private java.util.List<SignalDecoder> signalDecodersToUpdate;
    /**
     * <p>
     * A list of signal decoders to remove from the decoder manifest.
     * </p>
     */
    private java.util.List<String> signalDecodersToRemove;
    /**
     * <p>
     * A list of information about the network interfaces to add to the decoder manifest.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfacesToAdd;
    /**
     * <p>
     * A list of information about the network interfaces to update in the decoder manifest.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfacesToUpdate;
    /**
     * <p>
     * A list of network interfaces to remove from the decoder manifest.
     * </p>
     */
    private java.util.List<String> networkInterfacesToRemove;
    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the decoder manifest to update.
     * </p>
     * 
     * @param name
     *        The name of the decoder manifest to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the decoder manifest to update.
     * </p>
     * 
     * @return The name of the decoder manifest to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the decoder manifest to update.
     * </p>
     * 
     * @param name
     *        The name of the decoder manifest to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the decoder manifest to update.
     * </p>
     * 
     * @param description
     *        A brief description of the decoder manifest to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the decoder manifest to update.
     * </p>
     * 
     * @return A brief description of the decoder manifest to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the decoder manifest to update.
     * </p>
     * 
     * @param description
     *        A brief description of the decoder manifest to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of information about decoding additional signals to add to the decoder manifest.
     * </p>
     * 
     * @return A list of information about decoding additional signals to add to the decoder manifest.
     */

    public java.util.List<SignalDecoder> getSignalDecodersToAdd() {
        return signalDecodersToAdd;
    }

    /**
     * <p>
     * A list of information about decoding additional signals to add to the decoder manifest.
     * </p>
     * 
     * @param signalDecodersToAdd
     *        A list of information about decoding additional signals to add to the decoder manifest.
     */

    public void setSignalDecodersToAdd(java.util.Collection<SignalDecoder> signalDecodersToAdd) {
        if (signalDecodersToAdd == null) {
            this.signalDecodersToAdd = null;
            return;
        }

        this.signalDecodersToAdd = new java.util.ArrayList<SignalDecoder>(signalDecodersToAdd);
    }

    /**
     * <p>
     * A list of information about decoding additional signals to add to the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalDecodersToAdd(java.util.Collection)} or {@link #withSignalDecodersToAdd(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param signalDecodersToAdd
     *        A list of information about decoding additional signals to add to the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withSignalDecodersToAdd(SignalDecoder... signalDecodersToAdd) {
        if (this.signalDecodersToAdd == null) {
            setSignalDecodersToAdd(new java.util.ArrayList<SignalDecoder>(signalDecodersToAdd.length));
        }
        for (SignalDecoder ele : signalDecodersToAdd) {
            this.signalDecodersToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about decoding additional signals to add to the decoder manifest.
     * </p>
     * 
     * @param signalDecodersToAdd
     *        A list of information about decoding additional signals to add to the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withSignalDecodersToAdd(java.util.Collection<SignalDecoder> signalDecodersToAdd) {
        setSignalDecodersToAdd(signalDecodersToAdd);
        return this;
    }

    /**
     * <p>
     * A list of updated information about decoding signals to update in the decoder manifest.
     * </p>
     * 
     * @return A list of updated information about decoding signals to update in the decoder manifest.
     */

    public java.util.List<SignalDecoder> getSignalDecodersToUpdate() {
        return signalDecodersToUpdate;
    }

    /**
     * <p>
     * A list of updated information about decoding signals to update in the decoder manifest.
     * </p>
     * 
     * @param signalDecodersToUpdate
     *        A list of updated information about decoding signals to update in the decoder manifest.
     */

    public void setSignalDecodersToUpdate(java.util.Collection<SignalDecoder> signalDecodersToUpdate) {
        if (signalDecodersToUpdate == null) {
            this.signalDecodersToUpdate = null;
            return;
        }

        this.signalDecodersToUpdate = new java.util.ArrayList<SignalDecoder>(signalDecodersToUpdate);
    }

    /**
     * <p>
     * A list of updated information about decoding signals to update in the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalDecodersToUpdate(java.util.Collection)} or
     * {@link #withSignalDecodersToUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param signalDecodersToUpdate
     *        A list of updated information about decoding signals to update in the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withSignalDecodersToUpdate(SignalDecoder... signalDecodersToUpdate) {
        if (this.signalDecodersToUpdate == null) {
            setSignalDecodersToUpdate(new java.util.ArrayList<SignalDecoder>(signalDecodersToUpdate.length));
        }
        for (SignalDecoder ele : signalDecodersToUpdate) {
            this.signalDecodersToUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of updated information about decoding signals to update in the decoder manifest.
     * </p>
     * 
     * @param signalDecodersToUpdate
     *        A list of updated information about decoding signals to update in the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withSignalDecodersToUpdate(java.util.Collection<SignalDecoder> signalDecodersToUpdate) {
        setSignalDecodersToUpdate(signalDecodersToUpdate);
        return this;
    }

    /**
     * <p>
     * A list of signal decoders to remove from the decoder manifest.
     * </p>
     * 
     * @return A list of signal decoders to remove from the decoder manifest.
     */

    public java.util.List<String> getSignalDecodersToRemove() {
        return signalDecodersToRemove;
    }

    /**
     * <p>
     * A list of signal decoders to remove from the decoder manifest.
     * </p>
     * 
     * @param signalDecodersToRemove
     *        A list of signal decoders to remove from the decoder manifest.
     */

    public void setSignalDecodersToRemove(java.util.Collection<String> signalDecodersToRemove) {
        if (signalDecodersToRemove == null) {
            this.signalDecodersToRemove = null;
            return;
        }

        this.signalDecodersToRemove = new java.util.ArrayList<String>(signalDecodersToRemove);
    }

    /**
     * <p>
     * A list of signal decoders to remove from the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalDecodersToRemove(java.util.Collection)} or
     * {@link #withSignalDecodersToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param signalDecodersToRemove
     *        A list of signal decoders to remove from the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withSignalDecodersToRemove(String... signalDecodersToRemove) {
        if (this.signalDecodersToRemove == null) {
            setSignalDecodersToRemove(new java.util.ArrayList<String>(signalDecodersToRemove.length));
        }
        for (String ele : signalDecodersToRemove) {
            this.signalDecodersToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of signal decoders to remove from the decoder manifest.
     * </p>
     * 
     * @param signalDecodersToRemove
     *        A list of signal decoders to remove from the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withSignalDecodersToRemove(java.util.Collection<String> signalDecodersToRemove) {
        setSignalDecodersToRemove(signalDecodersToRemove);
        return this;
    }

    /**
     * <p>
     * A list of information about the network interfaces to add to the decoder manifest.
     * </p>
     * 
     * @return A list of information about the network interfaces to add to the decoder manifest.
     */

    public java.util.List<NetworkInterface> getNetworkInterfacesToAdd() {
        return networkInterfacesToAdd;
    }

    /**
     * <p>
     * A list of information about the network interfaces to add to the decoder manifest.
     * </p>
     * 
     * @param networkInterfacesToAdd
     *        A list of information about the network interfaces to add to the decoder manifest.
     */

    public void setNetworkInterfacesToAdd(java.util.Collection<NetworkInterface> networkInterfacesToAdd) {
        if (networkInterfacesToAdd == null) {
            this.networkInterfacesToAdd = null;
            return;
        }

        this.networkInterfacesToAdd = new java.util.ArrayList<NetworkInterface>(networkInterfacesToAdd);
    }

    /**
     * <p>
     * A list of information about the network interfaces to add to the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfacesToAdd(java.util.Collection)} or
     * {@link #withNetworkInterfacesToAdd(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfacesToAdd
     *        A list of information about the network interfaces to add to the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withNetworkInterfacesToAdd(NetworkInterface... networkInterfacesToAdd) {
        if (this.networkInterfacesToAdd == null) {
            setNetworkInterfacesToAdd(new java.util.ArrayList<NetworkInterface>(networkInterfacesToAdd.length));
        }
        for (NetworkInterface ele : networkInterfacesToAdd) {
            this.networkInterfacesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about the network interfaces to add to the decoder manifest.
     * </p>
     * 
     * @param networkInterfacesToAdd
     *        A list of information about the network interfaces to add to the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withNetworkInterfacesToAdd(java.util.Collection<NetworkInterface> networkInterfacesToAdd) {
        setNetworkInterfacesToAdd(networkInterfacesToAdd);
        return this;
    }

    /**
     * <p>
     * A list of information about the network interfaces to update in the decoder manifest.
     * </p>
     * 
     * @return A list of information about the network interfaces to update in the decoder manifest.
     */

    public java.util.List<NetworkInterface> getNetworkInterfacesToUpdate() {
        return networkInterfacesToUpdate;
    }

    /**
     * <p>
     * A list of information about the network interfaces to update in the decoder manifest.
     * </p>
     * 
     * @param networkInterfacesToUpdate
     *        A list of information about the network interfaces to update in the decoder manifest.
     */

    public void setNetworkInterfacesToUpdate(java.util.Collection<NetworkInterface> networkInterfacesToUpdate) {
        if (networkInterfacesToUpdate == null) {
            this.networkInterfacesToUpdate = null;
            return;
        }

        this.networkInterfacesToUpdate = new java.util.ArrayList<NetworkInterface>(networkInterfacesToUpdate);
    }

    /**
     * <p>
     * A list of information about the network interfaces to update in the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfacesToUpdate(java.util.Collection)} or
     * {@link #withNetworkInterfacesToUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfacesToUpdate
     *        A list of information about the network interfaces to update in the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withNetworkInterfacesToUpdate(NetworkInterface... networkInterfacesToUpdate) {
        if (this.networkInterfacesToUpdate == null) {
            setNetworkInterfacesToUpdate(new java.util.ArrayList<NetworkInterface>(networkInterfacesToUpdate.length));
        }
        for (NetworkInterface ele : networkInterfacesToUpdate) {
            this.networkInterfacesToUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about the network interfaces to update in the decoder manifest.
     * </p>
     * 
     * @param networkInterfacesToUpdate
     *        A list of information about the network interfaces to update in the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withNetworkInterfacesToUpdate(java.util.Collection<NetworkInterface> networkInterfacesToUpdate) {
        setNetworkInterfacesToUpdate(networkInterfacesToUpdate);
        return this;
    }

    /**
     * <p>
     * A list of network interfaces to remove from the decoder manifest.
     * </p>
     * 
     * @return A list of network interfaces to remove from the decoder manifest.
     */

    public java.util.List<String> getNetworkInterfacesToRemove() {
        return networkInterfacesToRemove;
    }

    /**
     * <p>
     * A list of network interfaces to remove from the decoder manifest.
     * </p>
     * 
     * @param networkInterfacesToRemove
     *        A list of network interfaces to remove from the decoder manifest.
     */

    public void setNetworkInterfacesToRemove(java.util.Collection<String> networkInterfacesToRemove) {
        if (networkInterfacesToRemove == null) {
            this.networkInterfacesToRemove = null;
            return;
        }

        this.networkInterfacesToRemove = new java.util.ArrayList<String>(networkInterfacesToRemove);
    }

    /**
     * <p>
     * A list of network interfaces to remove from the decoder manifest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfacesToRemove(java.util.Collection)} or
     * {@link #withNetworkInterfacesToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfacesToRemove
     *        A list of network interfaces to remove from the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withNetworkInterfacesToRemove(String... networkInterfacesToRemove) {
        if (this.networkInterfacesToRemove == null) {
            setNetworkInterfacesToRemove(new java.util.ArrayList<String>(networkInterfacesToRemove.length));
        }
        for (String ele : networkInterfacesToRemove) {
            this.networkInterfacesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of network interfaces to remove from the decoder manifest.
     * </p>
     * 
     * @param networkInterfacesToRemove
     *        A list of network interfaces to remove from the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDecoderManifestRequest withNetworkInterfacesToRemove(java.util.Collection<String> networkInterfacesToRemove) {
        setNetworkInterfacesToRemove(networkInterfacesToRemove);
        return this;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @param status
     *        The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *        edited. If the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * @see ManifestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @return The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *         edited. If the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * @see ManifestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @param status
     *        The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *        edited. If the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public UpdateDecoderManifestRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be edited. If
     * the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * </p>
     * 
     * @param status
     *        The state of the decoder manifest. If the status is <code>ACTIVE</code>, the decoder manifest can't be
     *        edited. If the status is <code>DRAFT</code>, you can edit the decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public UpdateDecoderManifestRequest withStatus(ManifestStatus status) {
        this.status = status.toString();
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
        if (getSignalDecodersToAdd() != null)
            sb.append("SignalDecodersToAdd: ").append(getSignalDecodersToAdd()).append(",");
        if (getSignalDecodersToUpdate() != null)
            sb.append("SignalDecodersToUpdate: ").append(getSignalDecodersToUpdate()).append(",");
        if (getSignalDecodersToRemove() != null)
            sb.append("SignalDecodersToRemove: ").append(getSignalDecodersToRemove()).append(",");
        if (getNetworkInterfacesToAdd() != null)
            sb.append("NetworkInterfacesToAdd: ").append(getNetworkInterfacesToAdd()).append(",");
        if (getNetworkInterfacesToUpdate() != null)
            sb.append("NetworkInterfacesToUpdate: ").append(getNetworkInterfacesToUpdate()).append(",");
        if (getNetworkInterfacesToRemove() != null)
            sb.append("NetworkInterfacesToRemove: ").append(getNetworkInterfacesToRemove()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDecoderManifestRequest == false)
            return false;
        UpdateDecoderManifestRequest other = (UpdateDecoderManifestRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSignalDecodersToAdd() == null ^ this.getSignalDecodersToAdd() == null)
            return false;
        if (other.getSignalDecodersToAdd() != null && other.getSignalDecodersToAdd().equals(this.getSignalDecodersToAdd()) == false)
            return false;
        if (other.getSignalDecodersToUpdate() == null ^ this.getSignalDecodersToUpdate() == null)
            return false;
        if (other.getSignalDecodersToUpdate() != null && other.getSignalDecodersToUpdate().equals(this.getSignalDecodersToUpdate()) == false)
            return false;
        if (other.getSignalDecodersToRemove() == null ^ this.getSignalDecodersToRemove() == null)
            return false;
        if (other.getSignalDecodersToRemove() != null && other.getSignalDecodersToRemove().equals(this.getSignalDecodersToRemove()) == false)
            return false;
        if (other.getNetworkInterfacesToAdd() == null ^ this.getNetworkInterfacesToAdd() == null)
            return false;
        if (other.getNetworkInterfacesToAdd() != null && other.getNetworkInterfacesToAdd().equals(this.getNetworkInterfacesToAdd()) == false)
            return false;
        if (other.getNetworkInterfacesToUpdate() == null ^ this.getNetworkInterfacesToUpdate() == null)
            return false;
        if (other.getNetworkInterfacesToUpdate() != null && other.getNetworkInterfacesToUpdate().equals(this.getNetworkInterfacesToUpdate()) == false)
            return false;
        if (other.getNetworkInterfacesToRemove() == null ^ this.getNetworkInterfacesToRemove() == null)
            return false;
        if (other.getNetworkInterfacesToRemove() != null && other.getNetworkInterfacesToRemove().equals(this.getNetworkInterfacesToRemove()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSignalDecodersToAdd() == null) ? 0 : getSignalDecodersToAdd().hashCode());
        hashCode = prime * hashCode + ((getSignalDecodersToUpdate() == null) ? 0 : getSignalDecodersToUpdate().hashCode());
        hashCode = prime * hashCode + ((getSignalDecodersToRemove() == null) ? 0 : getSignalDecodersToRemove().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfacesToAdd() == null) ? 0 : getNetworkInterfacesToAdd().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfacesToUpdate() == null) ? 0 : getNetworkInterfacesToUpdate().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfacesToRemove() == null) ? 0 : getNetworkInterfacesToRemove().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDecoderManifestRequest clone() {
        return (UpdateDecoderManifestRequest) super.clone();
    }

}
