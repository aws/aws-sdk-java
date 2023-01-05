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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains data processing unit (DPU) configuration settings and parameter mappings for a notebook engine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/EngineConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates processing
     * work and manages other executors in a notebook session.
     * </p>
     */
    private Integer coordinatorDpuSize;
    /**
     * <p>
     * The maximum number of DPUs that can run concurrently.
     * </p>
     */
    private Integer maxConcurrentDpus;
    /**
     * <p>
     * The default number of DPUs to use for executors. An executor is the smallest unit of compute that a notebook
     * session can request from Athena.
     * </p>
     */
    private Integer defaultExecutorDpuSize;
    /**
     * <p>
     * Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form of
     * key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify a value for
     * the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named <code>NotebookFileURI</code> to
     * <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     * </p>
     */
    private java.util.Map<String, String> additionalConfigs;

    /**
     * <p>
     * The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates processing
     * work and manages other executors in a notebook session.
     * </p>
     * 
     * @param coordinatorDpuSize
     *        The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates
     *        processing work and manages other executors in a notebook session.
     */

    public void setCoordinatorDpuSize(Integer coordinatorDpuSize) {
        this.coordinatorDpuSize = coordinatorDpuSize;
    }

    /**
     * <p>
     * The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates processing
     * work and manages other executors in a notebook session.
     * </p>
     * 
     * @return The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates
     *         processing work and manages other executors in a notebook session.
     */

    public Integer getCoordinatorDpuSize() {
        return this.coordinatorDpuSize;
    }

    /**
     * <p>
     * The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates processing
     * work and manages other executors in a notebook session.
     * </p>
     * 
     * @param coordinatorDpuSize
     *        The number of DPUs to use for the coordinator. A coordinator is a special executor that orchestrates
     *        processing work and manages other executors in a notebook session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineConfiguration withCoordinatorDpuSize(Integer coordinatorDpuSize) {
        setCoordinatorDpuSize(coordinatorDpuSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of DPUs that can run concurrently.
     * </p>
     * 
     * @param maxConcurrentDpus
     *        The maximum number of DPUs that can run concurrently.
     */

    public void setMaxConcurrentDpus(Integer maxConcurrentDpus) {
        this.maxConcurrentDpus = maxConcurrentDpus;
    }

    /**
     * <p>
     * The maximum number of DPUs that can run concurrently.
     * </p>
     * 
     * @return The maximum number of DPUs that can run concurrently.
     */

    public Integer getMaxConcurrentDpus() {
        return this.maxConcurrentDpus;
    }

    /**
     * <p>
     * The maximum number of DPUs that can run concurrently.
     * </p>
     * 
     * @param maxConcurrentDpus
     *        The maximum number of DPUs that can run concurrently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineConfiguration withMaxConcurrentDpus(Integer maxConcurrentDpus) {
        setMaxConcurrentDpus(maxConcurrentDpus);
        return this;
    }

    /**
     * <p>
     * The default number of DPUs to use for executors. An executor is the smallest unit of compute that a notebook
     * session can request from Athena.
     * </p>
     * 
     * @param defaultExecutorDpuSize
     *        The default number of DPUs to use for executors. An executor is the smallest unit of compute that a
     *        notebook session can request from Athena.
     */

    public void setDefaultExecutorDpuSize(Integer defaultExecutorDpuSize) {
        this.defaultExecutorDpuSize = defaultExecutorDpuSize;
    }

    /**
     * <p>
     * The default number of DPUs to use for executors. An executor is the smallest unit of compute that a notebook
     * session can request from Athena.
     * </p>
     * 
     * @return The default number of DPUs to use for executors. An executor is the smallest unit of compute that a
     *         notebook session can request from Athena.
     */

    public Integer getDefaultExecutorDpuSize() {
        return this.defaultExecutorDpuSize;
    }

    /**
     * <p>
     * The default number of DPUs to use for executors. An executor is the smallest unit of compute that a notebook
     * session can request from Athena.
     * </p>
     * 
     * @param defaultExecutorDpuSize
     *        The default number of DPUs to use for executors. An executor is the smallest unit of compute that a
     *        notebook session can request from Athena.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineConfiguration withDefaultExecutorDpuSize(Integer defaultExecutorDpuSize) {
        setDefaultExecutorDpuSize(defaultExecutorDpuSize);
        return this;
    }

    /**
     * <p>
     * Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form of
     * key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify a value for
     * the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named <code>NotebookFileURI</code> to
     * <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     * </p>
     * 
     * @return Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form
     *         of key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify
     *         a value for the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named
     *         <code>NotebookFileURI</code> to <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     */

    public java.util.Map<String, String> getAdditionalConfigs() {
        return additionalConfigs;
    }

    /**
     * <p>
     * Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form of
     * key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify a value for
     * the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named <code>NotebookFileURI</code> to
     * <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     * </p>
     * 
     * @param additionalConfigs
     *        Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form
     *        of key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify a
     *        value for the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named
     *        <code>NotebookFileURI</code> to <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     */

    public void setAdditionalConfigs(java.util.Map<String, String> additionalConfigs) {
        this.additionalConfigs = additionalConfigs;
    }

    /**
     * <p>
     * Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form of
     * key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify a value for
     * the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named <code>NotebookFileURI</code> to
     * <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     * </p>
     * 
     * @param additionalConfigs
     *        Contains additional notebook engine <code>MAP&lt;string, string&gt;</code> parameter mappings in the form
     *        of key-value pairs. To specify an Amazon S3 URI that the Jupyter server will download and serve, specify a
     *        value for the <a>StartSessionRequest$NotebookVersion</a> field, and then add a key named
     *        <code>NotebookFileURI</code> to <code>AdditionalConfigs</code> that has value of the Amazon S3 URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineConfiguration withAdditionalConfigs(java.util.Map<String, String> additionalConfigs) {
        setAdditionalConfigs(additionalConfigs);
        return this;
    }

    /**
     * Add a single AdditionalConfigs entry
     *
     * @see EngineConfiguration#withAdditionalConfigs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EngineConfiguration addAdditionalConfigsEntry(String key, String value) {
        if (null == this.additionalConfigs) {
            this.additionalConfigs = new java.util.HashMap<String, String>();
        }
        if (this.additionalConfigs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalConfigs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalConfigs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineConfiguration clearAdditionalConfigsEntries() {
        this.additionalConfigs = null;
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
        if (getCoordinatorDpuSize() != null)
            sb.append("CoordinatorDpuSize: ").append(getCoordinatorDpuSize()).append(",");
        if (getMaxConcurrentDpus() != null)
            sb.append("MaxConcurrentDpus: ").append(getMaxConcurrentDpus()).append(",");
        if (getDefaultExecutorDpuSize() != null)
            sb.append("DefaultExecutorDpuSize: ").append(getDefaultExecutorDpuSize()).append(",");
        if (getAdditionalConfigs() != null)
            sb.append("AdditionalConfigs: ").append(getAdditionalConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineConfiguration == false)
            return false;
        EngineConfiguration other = (EngineConfiguration) obj;
        if (other.getCoordinatorDpuSize() == null ^ this.getCoordinatorDpuSize() == null)
            return false;
        if (other.getCoordinatorDpuSize() != null && other.getCoordinatorDpuSize().equals(this.getCoordinatorDpuSize()) == false)
            return false;
        if (other.getMaxConcurrentDpus() == null ^ this.getMaxConcurrentDpus() == null)
            return false;
        if (other.getMaxConcurrentDpus() != null && other.getMaxConcurrentDpus().equals(this.getMaxConcurrentDpus()) == false)
            return false;
        if (other.getDefaultExecutorDpuSize() == null ^ this.getDefaultExecutorDpuSize() == null)
            return false;
        if (other.getDefaultExecutorDpuSize() != null && other.getDefaultExecutorDpuSize().equals(this.getDefaultExecutorDpuSize()) == false)
            return false;
        if (other.getAdditionalConfigs() == null ^ this.getAdditionalConfigs() == null)
            return false;
        if (other.getAdditionalConfigs() != null && other.getAdditionalConfigs().equals(this.getAdditionalConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoordinatorDpuSize() == null) ? 0 : getCoordinatorDpuSize().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentDpus() == null) ? 0 : getMaxConcurrentDpus().hashCode());
        hashCode = prime * hashCode + ((getDefaultExecutorDpuSize() == null) ? 0 : getDefaultExecutorDpuSize().hashCode());
        hashCode = prime * hashCode + ((getAdditionalConfigs() == null) ? 0 : getAdditionalConfigs().hashCode());
        return hashCode;
    }

    @Override
    public EngineConfiguration clone() {
        try {
            return (EngineConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.EngineConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
