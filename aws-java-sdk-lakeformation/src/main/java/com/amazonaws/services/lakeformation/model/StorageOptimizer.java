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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure describing the configuration and details of a storage optimizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StorageOptimizer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageOptimizer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * </p>
     */
    private String storageOptimizerType;
    /**
     * <p>
     * A map of the storage optimizer configuration. Currently contains only one key-value pair: <code>is_enabled</code>
     * indicates true or false for acceleration.
     * </p>
     */
    private java.util.Map<String, String> config;
    /**
     * <p>
     * A message that contains information about any error (if present).
     * </p>
     * <p>
     * When an acceleration result has an enabled status, the error message is empty.
     * </p>
     * <p>
     * When an acceleration result has a disabled status, the message describes an error or simply indicates
     * "disabled by the user".
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * A message that contains information about any warnings (if present).
     * </p>
     */
    private String warnings;
    /**
     * <p>
     * When an acceleration result has an enabled status, contains the details of the last job run.
     * </p>
     */
    private String lastRunDetails;

    /**
     * <p>
     * The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * </p>
     * 
     * @param storageOptimizerType
     *        The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * @see OptimizerType
     */

    public void setStorageOptimizerType(String storageOptimizerType) {
        this.storageOptimizerType = storageOptimizerType;
    }

    /**
     * <p>
     * The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * </p>
     * 
     * @return The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * @see OptimizerType
     */

    public String getStorageOptimizerType() {
        return this.storageOptimizerType;
    }

    /**
     * <p>
     * The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * </p>
     * 
     * @param storageOptimizerType
     *        The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptimizerType
     */

    public StorageOptimizer withStorageOptimizerType(String storageOptimizerType) {
        setStorageOptimizerType(storageOptimizerType);
        return this;
    }

    /**
     * <p>
     * The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * </p>
     * 
     * @param storageOptimizerType
     *        The specific type of storage optimizer. The supported value is <code>compaction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptimizerType
     */

    public StorageOptimizer withStorageOptimizerType(OptimizerType storageOptimizerType) {
        this.storageOptimizerType = storageOptimizerType.toString();
        return this;
    }

    /**
     * <p>
     * A map of the storage optimizer configuration. Currently contains only one key-value pair: <code>is_enabled</code>
     * indicates true or false for acceleration.
     * </p>
     * 
     * @return A map of the storage optimizer configuration. Currently contains only one key-value pair:
     *         <code>is_enabled</code> indicates true or false for acceleration.
     */

    public java.util.Map<String, String> getConfig() {
        return config;
    }

    /**
     * <p>
     * A map of the storage optimizer configuration. Currently contains only one key-value pair: <code>is_enabled</code>
     * indicates true or false for acceleration.
     * </p>
     * 
     * @param config
     *        A map of the storage optimizer configuration. Currently contains only one key-value pair:
     *        <code>is_enabled</code> indicates true or false for acceleration.
     */

    public void setConfig(java.util.Map<String, String> config) {
        this.config = config;
    }

    /**
     * <p>
     * A map of the storage optimizer configuration. Currently contains only one key-value pair: <code>is_enabled</code>
     * indicates true or false for acceleration.
     * </p>
     * 
     * @param config
     *        A map of the storage optimizer configuration. Currently contains only one key-value pair:
     *        <code>is_enabled</code> indicates true or false for acceleration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageOptimizer withConfig(java.util.Map<String, String> config) {
        setConfig(config);
        return this;
    }

    /**
     * Add a single Config entry
     *
     * @see StorageOptimizer#withConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StorageOptimizer addConfigEntry(String key, String value) {
        if (null == this.config) {
            this.config = new java.util.HashMap<String, String>();
        }
        if (this.config.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.config.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Config.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageOptimizer clearConfigEntries() {
        this.config = null;
        return this;
    }

    /**
     * <p>
     * A message that contains information about any error (if present).
     * </p>
     * <p>
     * When an acceleration result has an enabled status, the error message is empty.
     * </p>
     * <p>
     * When an acceleration result has a disabled status, the message describes an error or simply indicates
     * "disabled by the user".
     * </p>
     * 
     * @param errorMessage
     *        A message that contains information about any error (if present).</p>
     *        <p>
     *        When an acceleration result has an enabled status, the error message is empty.
     *        </p>
     *        <p>
     *        When an acceleration result has a disabled status, the message describes an error or simply indicates
     *        "disabled by the user".
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message that contains information about any error (if present).
     * </p>
     * <p>
     * When an acceleration result has an enabled status, the error message is empty.
     * </p>
     * <p>
     * When an acceleration result has a disabled status, the message describes an error or simply indicates
     * "disabled by the user".
     * </p>
     * 
     * @return A message that contains information about any error (if present).</p>
     *         <p>
     *         When an acceleration result has an enabled status, the error message is empty.
     *         </p>
     *         <p>
     *         When an acceleration result has a disabled status, the message describes an error or simply indicates
     *         "disabled by the user".
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message that contains information about any error (if present).
     * </p>
     * <p>
     * When an acceleration result has an enabled status, the error message is empty.
     * </p>
     * <p>
     * When an acceleration result has a disabled status, the message describes an error or simply indicates
     * "disabled by the user".
     * </p>
     * 
     * @param errorMessage
     *        A message that contains information about any error (if present).</p>
     *        <p>
     *        When an acceleration result has an enabled status, the error message is empty.
     *        </p>
     *        <p>
     *        When an acceleration result has a disabled status, the message describes an error or simply indicates
     *        "disabled by the user".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageOptimizer withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * A message that contains information about any warnings (if present).
     * </p>
     * 
     * @param warnings
     *        A message that contains information about any warnings (if present).
     */

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    /**
     * <p>
     * A message that contains information about any warnings (if present).
     * </p>
     * 
     * @return A message that contains information about any warnings (if present).
     */

    public String getWarnings() {
        return this.warnings;
    }

    /**
     * <p>
     * A message that contains information about any warnings (if present).
     * </p>
     * 
     * @param warnings
     *        A message that contains information about any warnings (if present).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageOptimizer withWarnings(String warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * When an acceleration result has an enabled status, contains the details of the last job run.
     * </p>
     * 
     * @param lastRunDetails
     *        When an acceleration result has an enabled status, contains the details of the last job run.
     */

    public void setLastRunDetails(String lastRunDetails) {
        this.lastRunDetails = lastRunDetails;
    }

    /**
     * <p>
     * When an acceleration result has an enabled status, contains the details of the last job run.
     * </p>
     * 
     * @return When an acceleration result has an enabled status, contains the details of the last job run.
     */

    public String getLastRunDetails() {
        return this.lastRunDetails;
    }

    /**
     * <p>
     * When an acceleration result has an enabled status, contains the details of the last job run.
     * </p>
     * 
     * @param lastRunDetails
     *        When an acceleration result has an enabled status, contains the details of the last job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageOptimizer withLastRunDetails(String lastRunDetails) {
        setLastRunDetails(lastRunDetails);
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
        if (getStorageOptimizerType() != null)
            sb.append("StorageOptimizerType: ").append(getStorageOptimizerType()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings()).append(",");
        if (getLastRunDetails() != null)
            sb.append("LastRunDetails: ").append(getLastRunDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageOptimizer == false)
            return false;
        StorageOptimizer other = (StorageOptimizer) obj;
        if (other.getStorageOptimizerType() == null ^ this.getStorageOptimizerType() == null)
            return false;
        if (other.getStorageOptimizerType() != null && other.getStorageOptimizerType().equals(this.getStorageOptimizerType()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getLastRunDetails() == null ^ this.getLastRunDetails() == null)
            return false;
        if (other.getLastRunDetails() != null && other.getLastRunDetails().equals(this.getLastRunDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageOptimizerType() == null) ? 0 : getStorageOptimizerType().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode + ((getLastRunDetails() == null) ? 0 : getLastRunDetails().hashCode());
        return hashCode;
    }

    @Override
    public StorageOptimizer clone() {
        try {
            return (StorageOptimizer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.StorageOptimizerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
