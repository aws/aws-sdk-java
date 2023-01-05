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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Request object for UpdateStorage api. Its used to update the storage attributes for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStorageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The version of cluster to update from. A successful operation will then generate a new version.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * EBS volume provisioned throughput information.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;
    /**
     * <p>
     * Controls storage mode for supported storage tiers.
     * </p>
     */
    private String storageMode;
    /**
     * <p>
     * size of the EBS volume to update.
     * </p>
     */
    private Integer volumeSizeGB;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster to be updated.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster to be updated.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the cluster to be updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The version of cluster to update from. A successful operation will then generate a new version.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The version of cluster to update from. A successful operation will then generate a new version.
     *        </p>
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of cluster to update from. A successful operation will then generate a new version.
     * </p>
     * 
     * @return <p>
     *         The version of cluster to update from. A successful operation will then generate a new version.
     *         </p>
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of cluster to update from. A successful operation will then generate a new version.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The version of cluster to update from. A successful operation will then generate a new version.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * EBS volume provisioned throughput information.
     * </p>
     * 
     * @param provisionedThroughput
     *        <p>
     *        EBS volume provisioned throughput information.
     *        </p>
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * EBS volume provisioned throughput information.
     * </p>
     * 
     * @return <p>
     *         EBS volume provisioned throughput information.
     *         </p>
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * EBS volume provisioned throughput information.
     * </p>
     * 
     * @param provisionedThroughput
     *        <p>
     *        EBS volume provisioned throughput information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * Controls storage mode for supported storage tiers.
     * </p>
     * 
     * @param storageMode
     *        <p>
     *        Controls storage mode for supported storage tiers.
     *        </p>
     * @see StorageMode
     */

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * <p>
     * Controls storage mode for supported storage tiers.
     * </p>
     * 
     * @return <p>
     *         Controls storage mode for supported storage tiers.
     *         </p>
     * @see StorageMode
     */

    public String getStorageMode() {
        return this.storageMode;
    }

    /**
     * <p>
     * Controls storage mode for supported storage tiers.
     * </p>
     * 
     * @param storageMode
     *        <p>
     *        Controls storage mode for supported storage tiers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageMode
     */

    public UpdateStorageRequest withStorageMode(String storageMode) {
        setStorageMode(storageMode);
        return this;
    }

    /**
     * <p>
     * Controls storage mode for supported storage tiers.
     * </p>
     * 
     * @param storageMode
     *        <p>
     *        Controls storage mode for supported storage tiers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageMode
     */

    public UpdateStorageRequest withStorageMode(StorageMode storageMode) {
        this.storageMode = storageMode.toString();
        return this;
    }

    /**
     * <p>
     * size of the EBS volume to update.
     * </p>
     * 
     * @param volumeSizeGB
     *        <p>
     *        size of the EBS volume to update.
     *        </p>
     */

    public void setVolumeSizeGB(Integer volumeSizeGB) {
        this.volumeSizeGB = volumeSizeGB;
    }

    /**
     * <p>
     * size of the EBS volume to update.
     * </p>
     * 
     * @return <p>
     *         size of the EBS volume to update.
     *         </p>
     */

    public Integer getVolumeSizeGB() {
        return this.volumeSizeGB;
    }

    /**
     * <p>
     * size of the EBS volume to update.
     * </p>
     * 
     * @param volumeSizeGB
     *        <p>
     *        size of the EBS volume to update.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageRequest withVolumeSizeGB(Integer volumeSizeGB) {
        setVolumeSizeGB(volumeSizeGB);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput()).append(",");
        if (getStorageMode() != null)
            sb.append("StorageMode: ").append(getStorageMode()).append(",");
        if (getVolumeSizeGB() != null)
            sb.append("VolumeSizeGB: ").append(getVolumeSizeGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStorageRequest == false)
            return false;
        UpdateStorageRequest other = (UpdateStorageRequest) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getStorageMode() == null ^ this.getStorageMode() == null)
            return false;
        if (other.getStorageMode() != null && other.getStorageMode().equals(this.getStorageMode()) == false)
            return false;
        if (other.getVolumeSizeGB() == null ^ this.getVolumeSizeGB() == null)
            return false;
        if (other.getVolumeSizeGB() != null && other.getVolumeSizeGB().equals(this.getVolumeSizeGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getStorageMode() == null) ? 0 : getStorageMode().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeGB() == null) ? 0 : getVolumeSizeGB().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStorageRequest clone() {
        return (UpdateStorageRequest) super.clone();
    }

}
