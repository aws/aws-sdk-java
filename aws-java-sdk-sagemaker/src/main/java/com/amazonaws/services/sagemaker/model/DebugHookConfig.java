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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the debug hook parameters, collection configuration, and storage paths.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DebugHookConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DebugHookConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     */
    private java.util.Map<String, String> hookParameters;
    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     */
    private java.util.List<CollectionConfiguration> collectionConfigurations;

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     * </p>
     * 
     * @param localPath
     *        Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     * </p>
     * 
     * @return Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     * </p>
     * 
     * @param localPath
     *        Path to local storage location for tensors. Defaults to <code>/opt/ml/output/tensors/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for tensors.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * 
     * @return Path to Amazon S3 storage location for tensors.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for tensors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     * 
     * @return Configuration information for the debug hook parameters.
     */

    public java.util.Map<String, String> getHookParameters() {
        return hookParameters;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     * 
     * @param hookParameters
     *        Configuration information for the debug hook parameters.
     */

    public void setHookParameters(java.util.Map<String, String> hookParameters) {
        this.hookParameters = hookParameters;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     * 
     * @param hookParameters
     *        Configuration information for the debug hook parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig withHookParameters(java.util.Map<String, String> hookParameters) {
        setHookParameters(hookParameters);
        return this;
    }

    /**
     * Add a single HookParameters entry
     *
     * @see DebugHookConfig#withHookParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig addHookParametersEntry(String key, String value) {
        if (null == this.hookParameters) {
            this.hookParameters = new java.util.HashMap<String, String>();
        }
        if (this.hookParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hookParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HookParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig clearHookParametersEntries() {
        this.hookParameters = null;
        return this;
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     * 
     * @return Configuration information for tensor collections.
     */

    public java.util.List<CollectionConfiguration> getCollectionConfigurations() {
        return collectionConfigurations;
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     * 
     * @param collectionConfigurations
     *        Configuration information for tensor collections.
     */

    public void setCollectionConfigurations(java.util.Collection<CollectionConfiguration> collectionConfigurations) {
        if (collectionConfigurations == null) {
            this.collectionConfigurations = null;
            return;
        }

        this.collectionConfigurations = new java.util.ArrayList<CollectionConfiguration>(collectionConfigurations);
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectionConfigurations(java.util.Collection)} or
     * {@link #withCollectionConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param collectionConfigurations
     *        Configuration information for tensor collections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig withCollectionConfigurations(CollectionConfiguration... collectionConfigurations) {
        if (this.collectionConfigurations == null) {
            setCollectionConfigurations(new java.util.ArrayList<CollectionConfiguration>(collectionConfigurations.length));
        }
        for (CollectionConfiguration ele : collectionConfigurations) {
            this.collectionConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     * 
     * @param collectionConfigurations
     *        Configuration information for tensor collections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugHookConfig withCollectionConfigurations(java.util.Collection<CollectionConfiguration> collectionConfigurations) {
        setCollectionConfigurations(collectionConfigurations);
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
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getHookParameters() != null)
            sb.append("HookParameters: ").append(getHookParameters()).append(",");
        if (getCollectionConfigurations() != null)
            sb.append("CollectionConfigurations: ").append(getCollectionConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugHookConfig == false)
            return false;
        DebugHookConfig other = (DebugHookConfig) obj;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getHookParameters() == null ^ this.getHookParameters() == null)
            return false;
        if (other.getHookParameters() != null && other.getHookParameters().equals(this.getHookParameters()) == false)
            return false;
        if (other.getCollectionConfigurations() == null ^ this.getCollectionConfigurations() == null)
            return false;
        if (other.getCollectionConfigurations() != null && other.getCollectionConfigurations().equals(this.getCollectionConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getHookParameters() == null) ? 0 : getHookParameters().hashCode());
        hashCode = prime * hashCode + ((getCollectionConfigurations() == null) ? 0 : getCollectionConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DebugHookConfig clone() {
        try {
            return (DebugHookConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DebugHookConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
