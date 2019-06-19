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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDevEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * The list of public keys for the DevEndpoint to use.
     * </p>
     */
    private java.util.List<String> addPublicKeys;
    /**
     * <p>
     * The list of public keys to be deleted from the DevEndpoint.
     * </p>
     */
    private java.util.List<String> deletePublicKeys;
    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the DevEndpoint.
     * </p>
     */
    private DevEndpointCustomLibraries customLibraries;
    /**
     * <p>
     * True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False
     * otherwise.
     * </p>
     */
    private Boolean updateEtlLibraries;
    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * </p>
     */
    private java.util.List<String> deleteArguments;
    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the DevEndpoint.
     * </p>
     */
    private java.util.Map<String, String> addArguments;

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     * 
     * @param endpointName
     *        The name of the DevEndpoint to be updated.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     * 
     * @return The name of the DevEndpoint to be updated.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the DevEndpoint to be updated.
     * </p>
     * 
     * @param endpointName
     *        The name of the DevEndpoint to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     * 
     * @param publicKey
     *        The public key for the DevEndpoint to use.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     * 
     * @return The public key for the DevEndpoint to use.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key for the DevEndpoint to use.
     * </p>
     * 
     * @param publicKey
     *        The public key for the DevEndpoint to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The list of public keys for the DevEndpoint to use.
     * </p>
     * 
     * @return The list of public keys for the DevEndpoint to use.
     */

    public java.util.List<String> getAddPublicKeys() {
        return addPublicKeys;
    }

    /**
     * <p>
     * The list of public keys for the DevEndpoint to use.
     * </p>
     * 
     * @param addPublicKeys
     *        The list of public keys for the DevEndpoint to use.
     */

    public void setAddPublicKeys(java.util.Collection<String> addPublicKeys) {
        if (addPublicKeys == null) {
            this.addPublicKeys = null;
            return;
        }

        this.addPublicKeys = new java.util.ArrayList<String>(addPublicKeys);
    }

    /**
     * <p>
     * The list of public keys for the DevEndpoint to use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddPublicKeys(java.util.Collection)} or {@link #withAddPublicKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param addPublicKeys
     *        The list of public keys for the DevEndpoint to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withAddPublicKeys(String... addPublicKeys) {
        if (this.addPublicKeys == null) {
            setAddPublicKeys(new java.util.ArrayList<String>(addPublicKeys.length));
        }
        for (String ele : addPublicKeys) {
            this.addPublicKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of public keys for the DevEndpoint to use.
     * </p>
     * 
     * @param addPublicKeys
     *        The list of public keys for the DevEndpoint to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withAddPublicKeys(java.util.Collection<String> addPublicKeys) {
        setAddPublicKeys(addPublicKeys);
        return this;
    }

    /**
     * <p>
     * The list of public keys to be deleted from the DevEndpoint.
     * </p>
     * 
     * @return The list of public keys to be deleted from the DevEndpoint.
     */

    public java.util.List<String> getDeletePublicKeys() {
        return deletePublicKeys;
    }

    /**
     * <p>
     * The list of public keys to be deleted from the DevEndpoint.
     * </p>
     * 
     * @param deletePublicKeys
     *        The list of public keys to be deleted from the DevEndpoint.
     */

    public void setDeletePublicKeys(java.util.Collection<String> deletePublicKeys) {
        if (deletePublicKeys == null) {
            this.deletePublicKeys = null;
            return;
        }

        this.deletePublicKeys = new java.util.ArrayList<String>(deletePublicKeys);
    }

    /**
     * <p>
     * The list of public keys to be deleted from the DevEndpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletePublicKeys(java.util.Collection)} or {@link #withDeletePublicKeys(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deletePublicKeys
     *        The list of public keys to be deleted from the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withDeletePublicKeys(String... deletePublicKeys) {
        if (this.deletePublicKeys == null) {
            setDeletePublicKeys(new java.util.ArrayList<String>(deletePublicKeys.length));
        }
        for (String ele : deletePublicKeys) {
            this.deletePublicKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of public keys to be deleted from the DevEndpoint.
     * </p>
     * 
     * @param deletePublicKeys
     *        The list of public keys to be deleted from the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withDeletePublicKeys(java.util.Collection<String> deletePublicKeys) {
        setDeletePublicKeys(deletePublicKeys);
        return this;
    }

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the DevEndpoint.
     * </p>
     * 
     * @param customLibraries
     *        Custom Python or Java libraries to be loaded in the DevEndpoint.
     */

    public void setCustomLibraries(DevEndpointCustomLibraries customLibraries) {
        this.customLibraries = customLibraries;
    }

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the DevEndpoint.
     * </p>
     * 
     * @return Custom Python or Java libraries to be loaded in the DevEndpoint.
     */

    public DevEndpointCustomLibraries getCustomLibraries() {
        return this.customLibraries;
    }

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the DevEndpoint.
     * </p>
     * 
     * @param customLibraries
     *        Custom Python or Java libraries to be loaded in the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withCustomLibraries(DevEndpointCustomLibraries customLibraries) {
        setCustomLibraries(customLibraries);
        return this;
    }

    /**
     * <p>
     * True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False
     * otherwise.
     * </p>
     * 
     * @param updateEtlLibraries
     *        True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or
     *        False otherwise.
     */

    public void setUpdateEtlLibraries(Boolean updateEtlLibraries) {
        this.updateEtlLibraries = updateEtlLibraries;
    }

    /**
     * <p>
     * True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False
     * otherwise.
     * </p>
     * 
     * @return True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or
     *         False otherwise.
     */

    public Boolean getUpdateEtlLibraries() {
        return this.updateEtlLibraries;
    }

    /**
     * <p>
     * True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False
     * otherwise.
     * </p>
     * 
     * @param updateEtlLibraries
     *        True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or
     *        False otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withUpdateEtlLibraries(Boolean updateEtlLibraries) {
        setUpdateEtlLibraries(updateEtlLibraries);
        return this;
    }

    /**
     * <p>
     * True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False
     * otherwise.
     * </p>
     * 
     * @return True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or
     *         False otherwise.
     */

    public Boolean isUpdateEtlLibraries() {
        return this.updateEtlLibraries;
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @return The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     */

    public java.util.List<String> getDeleteArguments() {
        return deleteArguments;
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @param deleteArguments
     *        The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     */

    public void setDeleteArguments(java.util.Collection<String> deleteArguments) {
        if (deleteArguments == null) {
            this.deleteArguments = null;
            return;
        }

        this.deleteArguments = new java.util.ArrayList<String>(deleteArguments);
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleteArguments(java.util.Collection)} or {@link #withDeleteArguments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deleteArguments
     *        The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withDeleteArguments(String... deleteArguments) {
        if (this.deleteArguments == null) {
            setDeleteArguments(new java.util.ArrayList<String>(deleteArguments.length));
        }
        for (String ele : deleteArguments) {
            this.deleteArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @param deleteArguments
     *        The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withDeleteArguments(java.util.Collection<String> deleteArguments) {
        setDeleteArguments(deleteArguments);
        return this;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @return The map of arguments to add the map of arguments used to configure the DevEndpoint.
     */

    public java.util.Map<String, String> getAddArguments() {
        return addArguments;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @param addArguments
     *        The map of arguments to add the map of arguments used to configure the DevEndpoint.
     */

    public void setAddArguments(java.util.Map<String, String> addArguments) {
        this.addArguments = addArguments;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @param addArguments
     *        The map of arguments to add the map of arguments used to configure the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest withAddArguments(java.util.Map<String, String> addArguments) {
        setAddArguments(addArguments);
        return this;
    }

    public UpdateDevEndpointRequest addAddArgumentsEntry(String key, String value) {
        if (null == this.addArguments) {
            this.addArguments = new java.util.HashMap<String, String>();
        }
        if (this.addArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.addArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AddArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDevEndpointRequest clearAddArgumentsEntries() {
        this.addArguments = null;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getAddPublicKeys() != null)
            sb.append("AddPublicKeys: ").append(getAddPublicKeys()).append(",");
        if (getDeletePublicKeys() != null)
            sb.append("DeletePublicKeys: ").append(getDeletePublicKeys()).append(",");
        if (getCustomLibraries() != null)
            sb.append("CustomLibraries: ").append(getCustomLibraries()).append(",");
        if (getUpdateEtlLibraries() != null)
            sb.append("UpdateEtlLibraries: ").append(getUpdateEtlLibraries()).append(",");
        if (getDeleteArguments() != null)
            sb.append("DeleteArguments: ").append(getDeleteArguments()).append(",");
        if (getAddArguments() != null)
            sb.append("AddArguments: ").append(getAddArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDevEndpointRequest == false)
            return false;
        UpdateDevEndpointRequest other = (UpdateDevEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getAddPublicKeys() == null ^ this.getAddPublicKeys() == null)
            return false;
        if (other.getAddPublicKeys() != null && other.getAddPublicKeys().equals(this.getAddPublicKeys()) == false)
            return false;
        if (other.getDeletePublicKeys() == null ^ this.getDeletePublicKeys() == null)
            return false;
        if (other.getDeletePublicKeys() != null && other.getDeletePublicKeys().equals(this.getDeletePublicKeys()) == false)
            return false;
        if (other.getCustomLibraries() == null ^ this.getCustomLibraries() == null)
            return false;
        if (other.getCustomLibraries() != null && other.getCustomLibraries().equals(this.getCustomLibraries()) == false)
            return false;
        if (other.getUpdateEtlLibraries() == null ^ this.getUpdateEtlLibraries() == null)
            return false;
        if (other.getUpdateEtlLibraries() != null && other.getUpdateEtlLibraries().equals(this.getUpdateEtlLibraries()) == false)
            return false;
        if (other.getDeleteArguments() == null ^ this.getDeleteArguments() == null)
            return false;
        if (other.getDeleteArguments() != null && other.getDeleteArguments().equals(this.getDeleteArguments()) == false)
            return false;
        if (other.getAddArguments() == null ^ this.getAddArguments() == null)
            return false;
        if (other.getAddArguments() != null && other.getAddArguments().equals(this.getAddArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getAddPublicKeys() == null) ? 0 : getAddPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getDeletePublicKeys() == null) ? 0 : getDeletePublicKeys().hashCode());
        hashCode = prime * hashCode + ((getCustomLibraries() == null) ? 0 : getCustomLibraries().hashCode());
        hashCode = prime * hashCode + ((getUpdateEtlLibraries() == null) ? 0 : getUpdateEtlLibraries().hashCode());
        hashCode = prime * hashCode + ((getDeleteArguments() == null) ? 0 : getDeleteArguments().hashCode());
        hashCode = prime * hashCode + ((getAddArguments() == null) ? 0 : getAddArguments().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDevEndpointRequest clone() {
        return (UpdateDevEndpointRequest) super.clone();
    }

}
