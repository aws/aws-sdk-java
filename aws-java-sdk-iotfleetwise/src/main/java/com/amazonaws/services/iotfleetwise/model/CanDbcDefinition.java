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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configurations used to create a decoder manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CanDbcDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanDbcDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about a network interface.
     * </p>
     */
    private String networkInterface;
    /**
     * <p>
     * A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     * (inclusive) files in the list.
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> canDbcFiles;
    /**
     * <p>
     * Pairs every signal specified in your vehicle model with a signal decoder.
     * </p>
     */
    private java.util.Map<String, String> signalsMap;

    /**
     * <p>
     * Contains information about a network interface.
     * </p>
     * 
     * @param networkInterface
     *        Contains information about a network interface.
     */

    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
    }

    /**
     * <p>
     * Contains information about a network interface.
     * </p>
     * 
     * @return Contains information about a network interface.
     */

    public String getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * <p>
     * Contains information about a network interface.
     * </p>
     * 
     * @param networkInterface
     *        Contains information about a network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanDbcDefinition withNetworkInterface(String networkInterface) {
        setNetworkInterface(networkInterface);
        return this;
    }

    /**
     * <p>
     * A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     * (inclusive) files in the list.
     * </p>
     * 
     * @return A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     *         (inclusive) files in the list.
     */

    public java.util.List<java.nio.ByteBuffer> getCanDbcFiles() {
        return canDbcFiles;
    }

    /**
     * <p>
     * A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     * (inclusive) files in the list.
     * </p>
     * 
     * @param canDbcFiles
     *        A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     *        (inclusive) files in the list.
     */

    public void setCanDbcFiles(java.util.Collection<java.nio.ByteBuffer> canDbcFiles) {
        if (canDbcFiles == null) {
            this.canDbcFiles = null;
            return;
        }

        this.canDbcFiles = new java.util.ArrayList<java.nio.ByteBuffer>(canDbcFiles);
    }

    /**
     * <p>
     * A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     * (inclusive) files in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCanDbcFiles(java.util.Collection)} or {@link #withCanDbcFiles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param canDbcFiles
     *        A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     *        (inclusive) files in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanDbcDefinition withCanDbcFiles(java.nio.ByteBuffer... canDbcFiles) {
        if (this.canDbcFiles == null) {
            setCanDbcFiles(new java.util.ArrayList<java.nio.ByteBuffer>(canDbcFiles.length));
        }
        for (java.nio.ByteBuffer ele : canDbcFiles) {
            this.canDbcFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     * (inclusive) files in the list.
     * </p>
     * 
     * @param canDbcFiles
     *        A list of DBC files. You can upload only one DBC file for each network interface and specify up to five
     *        (inclusive) files in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanDbcDefinition withCanDbcFiles(java.util.Collection<java.nio.ByteBuffer> canDbcFiles) {
        setCanDbcFiles(canDbcFiles);
        return this;
    }

    /**
     * <p>
     * Pairs every signal specified in your vehicle model with a signal decoder.
     * </p>
     * 
     * @return Pairs every signal specified in your vehicle model with a signal decoder.
     */

    public java.util.Map<String, String> getSignalsMap() {
        return signalsMap;
    }

    /**
     * <p>
     * Pairs every signal specified in your vehicle model with a signal decoder.
     * </p>
     * 
     * @param signalsMap
     *        Pairs every signal specified in your vehicle model with a signal decoder.
     */

    public void setSignalsMap(java.util.Map<String, String> signalsMap) {
        this.signalsMap = signalsMap;
    }

    /**
     * <p>
     * Pairs every signal specified in your vehicle model with a signal decoder.
     * </p>
     * 
     * @param signalsMap
     *        Pairs every signal specified in your vehicle model with a signal decoder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanDbcDefinition withSignalsMap(java.util.Map<String, String> signalsMap) {
        setSignalsMap(signalsMap);
        return this;
    }

    /**
     * Add a single SignalsMap entry
     *
     * @see CanDbcDefinition#withSignalsMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CanDbcDefinition addSignalsMapEntry(String key, String value) {
        if (null == this.signalsMap) {
            this.signalsMap = new java.util.HashMap<String, String>();
        }
        if (this.signalsMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.signalsMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SignalsMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanDbcDefinition clearSignalsMapEntries() {
        this.signalsMap = null;
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
        if (getNetworkInterface() != null)
            sb.append("NetworkInterface: ").append(getNetworkInterface()).append(",");
        if (getCanDbcFiles() != null)
            sb.append("CanDbcFiles: ").append(getCanDbcFiles()).append(",");
        if (getSignalsMap() != null)
            sb.append("SignalsMap: ").append(getSignalsMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanDbcDefinition == false)
            return false;
        CanDbcDefinition other = (CanDbcDefinition) obj;
        if (other.getNetworkInterface() == null ^ this.getNetworkInterface() == null)
            return false;
        if (other.getNetworkInterface() != null && other.getNetworkInterface().equals(this.getNetworkInterface()) == false)
            return false;
        if (other.getCanDbcFiles() == null ^ this.getCanDbcFiles() == null)
            return false;
        if (other.getCanDbcFiles() != null && other.getCanDbcFiles().equals(this.getCanDbcFiles()) == false)
            return false;
        if (other.getSignalsMap() == null ^ this.getSignalsMap() == null)
            return false;
        if (other.getSignalsMap() != null && other.getSignalsMap().equals(this.getSignalsMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode());
        hashCode = prime * hashCode + ((getCanDbcFiles() == null) ? 0 : getCanDbcFiles().hashCode());
        hashCode = prime * hashCode + ((getSignalsMap() == null) ? 0 : getSignalsMap().hashCode());
        return hashCode;
    }

    @Override
    public CanDbcDefinition clone() {
        try {
            return (CanDbcDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CanDbcDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
