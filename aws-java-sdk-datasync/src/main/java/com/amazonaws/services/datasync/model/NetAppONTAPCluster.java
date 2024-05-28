/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information that DataSync Discovery collects about an on-premises storage system cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/NetAppONTAPCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetAppONTAPCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of CIFS shares in the cluster.
     * </p>
     */
    private Long cifsShareCount;
    /**
     * <p>
     * The number of NFS volumes in the cluster.
     * </p>
     */
    private Long nfsExportedVolumes;
    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The performance data that DataSync Discovery collects about the cluster.
     * </p>
     */
    private MaxP95Performance maxP95Performance;
    /**
     * <p>
     * The total storage space that's available in the cluster.
     * </p>
     */
    private Long clusterBlockStorageSize;
    /**
     * <p>
     * The storage space that's being used in a cluster.
     * </p>
     */
    private Long clusterBlockStorageUsed;
    /**
     * <p>
     * The storage space that's being used in the cluster without accounting for compression or deduplication.
     * </p>
     */
    private Long clusterBlockStorageLogicalUsed;
    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >Recommendations provided by DataSync Discovery</a>.
     * </p>
     */
    private java.util.List<Recommendation> recommendations;
    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     */
    private String recommendationStatus;
    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the cluster.
     * </p>
     */
    private Long lunCount;
    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     */
    private Long clusterCloudStorageUsed;

    /**
     * <p>
     * The number of CIFS shares in the cluster.
     * </p>
     * 
     * @param cifsShareCount
     *        The number of CIFS shares in the cluster.
     */

    public void setCifsShareCount(Long cifsShareCount) {
        this.cifsShareCount = cifsShareCount;
    }

    /**
     * <p>
     * The number of CIFS shares in the cluster.
     * </p>
     * 
     * @return The number of CIFS shares in the cluster.
     */

    public Long getCifsShareCount() {
        return this.cifsShareCount;
    }

    /**
     * <p>
     * The number of CIFS shares in the cluster.
     * </p>
     * 
     * @param cifsShareCount
     *        The number of CIFS shares in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withCifsShareCount(Long cifsShareCount) {
        setCifsShareCount(cifsShareCount);
        return this;
    }

    /**
     * <p>
     * The number of NFS volumes in the cluster.
     * </p>
     * 
     * @param nfsExportedVolumes
     *        The number of NFS volumes in the cluster.
     */

    public void setNfsExportedVolumes(Long nfsExportedVolumes) {
        this.nfsExportedVolumes = nfsExportedVolumes;
    }

    /**
     * <p>
     * The number of NFS volumes in the cluster.
     * </p>
     * 
     * @return The number of NFS volumes in the cluster.
     */

    public Long getNfsExportedVolumes() {
        return this.nfsExportedVolumes;
    }

    /**
     * <p>
     * The number of NFS volumes in the cluster.
     * </p>
     * 
     * @param nfsExportedVolumes
     *        The number of NFS volumes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withNfsExportedVolumes(Long nfsExportedVolumes) {
        setNfsExportedVolumes(nfsExportedVolumes);
        return this;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster.
     * </p>
     * 
     * @param resourceId
     *        The universally unique identifier (UUID) of the cluster.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the cluster.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster.
     * </p>
     * 
     * @param resourceId
     *        The universally unique identifier (UUID) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the cluster.
     * </p>
     * 
     * @param maxP95Performance
     *        The performance data that DataSync Discovery collects about the cluster.
     */

    public void setMaxP95Performance(MaxP95Performance maxP95Performance) {
        this.maxP95Performance = maxP95Performance;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the cluster.
     * </p>
     * 
     * @return The performance data that DataSync Discovery collects about the cluster.
     */

    public MaxP95Performance getMaxP95Performance() {
        return this.maxP95Performance;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the cluster.
     * </p>
     * 
     * @param maxP95Performance
     *        The performance data that DataSync Discovery collects about the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withMaxP95Performance(MaxP95Performance maxP95Performance) {
        setMaxP95Performance(maxP95Performance);
        return this;
    }

    /**
     * <p>
     * The total storage space that's available in the cluster.
     * </p>
     * 
     * @param clusterBlockStorageSize
     *        The total storage space that's available in the cluster.
     */

    public void setClusterBlockStorageSize(Long clusterBlockStorageSize) {
        this.clusterBlockStorageSize = clusterBlockStorageSize;
    }

    /**
     * <p>
     * The total storage space that's available in the cluster.
     * </p>
     * 
     * @return The total storage space that's available in the cluster.
     */

    public Long getClusterBlockStorageSize() {
        return this.clusterBlockStorageSize;
    }

    /**
     * <p>
     * The total storage space that's available in the cluster.
     * </p>
     * 
     * @param clusterBlockStorageSize
     *        The total storage space that's available in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withClusterBlockStorageSize(Long clusterBlockStorageSize) {
        setClusterBlockStorageSize(clusterBlockStorageSize);
        return this;
    }

    /**
     * <p>
     * The storage space that's being used in a cluster.
     * </p>
     * 
     * @param clusterBlockStorageUsed
     *        The storage space that's being used in a cluster.
     */

    public void setClusterBlockStorageUsed(Long clusterBlockStorageUsed) {
        this.clusterBlockStorageUsed = clusterBlockStorageUsed;
    }

    /**
     * <p>
     * The storage space that's being used in a cluster.
     * </p>
     * 
     * @return The storage space that's being used in a cluster.
     */

    public Long getClusterBlockStorageUsed() {
        return this.clusterBlockStorageUsed;
    }

    /**
     * <p>
     * The storage space that's being used in a cluster.
     * </p>
     * 
     * @param clusterBlockStorageUsed
     *        The storage space that's being used in a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withClusterBlockStorageUsed(Long clusterBlockStorageUsed) {
        setClusterBlockStorageUsed(clusterBlockStorageUsed);
        return this;
    }

    /**
     * <p>
     * The storage space that's being used in the cluster without accounting for compression or deduplication.
     * </p>
     * 
     * @param clusterBlockStorageLogicalUsed
     *        The storage space that's being used in the cluster without accounting for compression or deduplication.
     */

    public void setClusterBlockStorageLogicalUsed(Long clusterBlockStorageLogicalUsed) {
        this.clusterBlockStorageLogicalUsed = clusterBlockStorageLogicalUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the cluster without accounting for compression or deduplication.
     * </p>
     * 
     * @return The storage space that's being used in the cluster without accounting for compression or deduplication.
     */

    public Long getClusterBlockStorageLogicalUsed() {
        return this.clusterBlockStorageLogicalUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the cluster without accounting for compression or deduplication.
     * </p>
     * 
     * @param clusterBlockStorageLogicalUsed
     *        The storage space that's being used in the cluster without accounting for compression or deduplication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withClusterBlockStorageLogicalUsed(Long clusterBlockStorageLogicalUsed) {
        setClusterBlockStorageLogicalUsed(clusterBlockStorageLogicalUsed);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @return The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *         >Recommendations provided by DataSync Discovery</a>.
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<Recommendation>(recommendations);
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >Recommendations provided by DataSync Discovery</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the cluster. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or
     *        can't be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @see RecommendationStatus
     */

    public void setRecommendationStatus(String recommendationStatus) {
        this.recommendationStatus = recommendationStatus;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @return Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or
     *         can't be determined.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *         >Recommendation statuses</a>.
     * @see RecommendationStatus
     */

    public String getRecommendationStatus() {
        return this.recommendationStatus;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or
     *        can't be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public NetAppONTAPCluster withRecommendationStatus(String recommendationStatus) {
        setRecommendationStatus(recommendationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the cluster are ready to view, incomplete, or
     *        can't be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public NetAppONTAPCluster withRecommendationStatus(RecommendationStatus recommendationStatus) {
        this.recommendationStatus = recommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the cluster.
     * </p>
     * 
     * @param lunCount
     *        The number of LUNs (logical unit numbers) in the cluster.
     */

    public void setLunCount(Long lunCount) {
        this.lunCount = lunCount;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the cluster.
     * </p>
     * 
     * @return The number of LUNs (logical unit numbers) in the cluster.
     */

    public Long getLunCount() {
        return this.lunCount;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the cluster.
     * </p>
     * 
     * @param lunCount
     *        The number of LUNs (logical unit numbers) in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withLunCount(Long lunCount) {
        setLunCount(lunCount);
        return this;
    }

    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     * 
     * @param clusterCloudStorageUsed
     *        The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     */

    public void setClusterCloudStorageUsed(Long clusterCloudStorageUsed) {
        this.clusterCloudStorageUsed = clusterCloudStorageUsed;
    }

    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     * 
     * @return The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     */

    public Long getClusterCloudStorageUsed() {
        return this.clusterCloudStorageUsed;
    }

    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     * 
     * @param clusterCloudStorageUsed
     *        The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPCluster withClusterCloudStorageUsed(Long clusterCloudStorageUsed) {
        setClusterCloudStorageUsed(clusterCloudStorageUsed);
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
        if (getCifsShareCount() != null)
            sb.append("CifsShareCount: ").append(getCifsShareCount()).append(",");
        if (getNfsExportedVolumes() != null)
            sb.append("NfsExportedVolumes: ").append(getNfsExportedVolumes()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getMaxP95Performance() != null)
            sb.append("MaxP95Performance: ").append(getMaxP95Performance()).append(",");
        if (getClusterBlockStorageSize() != null)
            sb.append("ClusterBlockStorageSize: ").append(getClusterBlockStorageSize()).append(",");
        if (getClusterBlockStorageUsed() != null)
            sb.append("ClusterBlockStorageUsed: ").append(getClusterBlockStorageUsed()).append(",");
        if (getClusterBlockStorageLogicalUsed() != null)
            sb.append("ClusterBlockStorageLogicalUsed: ").append(getClusterBlockStorageLogicalUsed()).append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
        if (getRecommendationStatus() != null)
            sb.append("RecommendationStatus: ").append(getRecommendationStatus()).append(",");
        if (getLunCount() != null)
            sb.append("LunCount: ").append(getLunCount()).append(",");
        if (getClusterCloudStorageUsed() != null)
            sb.append("ClusterCloudStorageUsed: ").append(getClusterCloudStorageUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetAppONTAPCluster == false)
            return false;
        NetAppONTAPCluster other = (NetAppONTAPCluster) obj;
        if (other.getCifsShareCount() == null ^ this.getCifsShareCount() == null)
            return false;
        if (other.getCifsShareCount() != null && other.getCifsShareCount().equals(this.getCifsShareCount()) == false)
            return false;
        if (other.getNfsExportedVolumes() == null ^ this.getNfsExportedVolumes() == null)
            return false;
        if (other.getNfsExportedVolumes() != null && other.getNfsExportedVolumes().equals(this.getNfsExportedVolumes()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getMaxP95Performance() == null ^ this.getMaxP95Performance() == null)
            return false;
        if (other.getMaxP95Performance() != null && other.getMaxP95Performance().equals(this.getMaxP95Performance()) == false)
            return false;
        if (other.getClusterBlockStorageSize() == null ^ this.getClusterBlockStorageSize() == null)
            return false;
        if (other.getClusterBlockStorageSize() != null && other.getClusterBlockStorageSize().equals(this.getClusterBlockStorageSize()) == false)
            return false;
        if (other.getClusterBlockStorageUsed() == null ^ this.getClusterBlockStorageUsed() == null)
            return false;
        if (other.getClusterBlockStorageUsed() != null && other.getClusterBlockStorageUsed().equals(this.getClusterBlockStorageUsed()) == false)
            return false;
        if (other.getClusterBlockStorageLogicalUsed() == null ^ this.getClusterBlockStorageLogicalUsed() == null)
            return false;
        if (other.getClusterBlockStorageLogicalUsed() != null
                && other.getClusterBlockStorageLogicalUsed().equals(this.getClusterBlockStorageLogicalUsed()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        if (other.getRecommendationStatus() == null ^ this.getRecommendationStatus() == null)
            return false;
        if (other.getRecommendationStatus() != null && other.getRecommendationStatus().equals(this.getRecommendationStatus()) == false)
            return false;
        if (other.getLunCount() == null ^ this.getLunCount() == null)
            return false;
        if (other.getLunCount() != null && other.getLunCount().equals(this.getLunCount()) == false)
            return false;
        if (other.getClusterCloudStorageUsed() == null ^ this.getClusterCloudStorageUsed() == null)
            return false;
        if (other.getClusterCloudStorageUsed() != null && other.getClusterCloudStorageUsed().equals(this.getClusterCloudStorageUsed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCifsShareCount() == null) ? 0 : getCifsShareCount().hashCode());
        hashCode = prime * hashCode + ((getNfsExportedVolumes() == null) ? 0 : getNfsExportedVolumes().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getMaxP95Performance() == null) ? 0 : getMaxP95Performance().hashCode());
        hashCode = prime * hashCode + ((getClusterBlockStorageSize() == null) ? 0 : getClusterBlockStorageSize().hashCode());
        hashCode = prime * hashCode + ((getClusterBlockStorageUsed() == null) ? 0 : getClusterBlockStorageUsed().hashCode());
        hashCode = prime * hashCode + ((getClusterBlockStorageLogicalUsed() == null) ? 0 : getClusterBlockStorageLogicalUsed().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getRecommendationStatus() == null) ? 0 : getRecommendationStatus().hashCode());
        hashCode = prime * hashCode + ((getLunCount() == null) ? 0 : getLunCount().hashCode());
        hashCode = prime * hashCode + ((getClusterCloudStorageUsed() == null) ? 0 : getClusterCloudStorageUsed().hashCode());
        return hashCode;
    }

    @Override
    public NetAppONTAPCluster clone() {
        try {
            return (NetAppONTAPCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.NetAppONTAPClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
