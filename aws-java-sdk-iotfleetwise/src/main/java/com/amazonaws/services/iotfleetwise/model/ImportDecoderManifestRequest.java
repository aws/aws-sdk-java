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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportDecoderManifest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDecoderManifestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the decoder manifest to import.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The file to load into an Amazon Web Services account.
     * </p>
     */
    private java.util.List<NetworkFileDefinition> networkFileDefinitions;

    /**
     * <p>
     * The name of the decoder manifest to import.
     * </p>
     * 
     * @param name
     *        The name of the decoder manifest to import.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the decoder manifest to import.
     * </p>
     * 
     * @return The name of the decoder manifest to import.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the decoder manifest to import.
     * </p>
     * 
     * @param name
     *        The name of the decoder manifest to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDecoderManifestRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The file to load into an Amazon Web Services account.
     * </p>
     * 
     * @return The file to load into an Amazon Web Services account.
     */

    public java.util.List<NetworkFileDefinition> getNetworkFileDefinitions() {
        return networkFileDefinitions;
    }

    /**
     * <p>
     * The file to load into an Amazon Web Services account.
     * </p>
     * 
     * @param networkFileDefinitions
     *        The file to load into an Amazon Web Services account.
     */

    public void setNetworkFileDefinitions(java.util.Collection<NetworkFileDefinition> networkFileDefinitions) {
        if (networkFileDefinitions == null) {
            this.networkFileDefinitions = null;
            return;
        }

        this.networkFileDefinitions = new java.util.ArrayList<NetworkFileDefinition>(networkFileDefinitions);
    }

    /**
     * <p>
     * The file to load into an Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkFileDefinitions(java.util.Collection)} or
     * {@link #withNetworkFileDefinitions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkFileDefinitions
     *        The file to load into an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDecoderManifestRequest withNetworkFileDefinitions(NetworkFileDefinition... networkFileDefinitions) {
        if (this.networkFileDefinitions == null) {
            setNetworkFileDefinitions(new java.util.ArrayList<NetworkFileDefinition>(networkFileDefinitions.length));
        }
        for (NetworkFileDefinition ele : networkFileDefinitions) {
            this.networkFileDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file to load into an Amazon Web Services account.
     * </p>
     * 
     * @param networkFileDefinitions
     *        The file to load into an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDecoderManifestRequest withNetworkFileDefinitions(java.util.Collection<NetworkFileDefinition> networkFileDefinitions) {
        setNetworkFileDefinitions(networkFileDefinitions);
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
        if (getNetworkFileDefinitions() != null)
            sb.append("NetworkFileDefinitions: ").append(getNetworkFileDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDecoderManifestRequest == false)
            return false;
        ImportDecoderManifestRequest other = (ImportDecoderManifestRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkFileDefinitions() == null ^ this.getNetworkFileDefinitions() == null)
            return false;
        if (other.getNetworkFileDefinitions() != null && other.getNetworkFileDefinitions().equals(this.getNetworkFileDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkFileDefinitions() == null) ? 0 : getNetworkFileDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public ImportDecoderManifestRequest clone() {
        return (ImportDecoderManifestRequest) super.clone();
    }

}
