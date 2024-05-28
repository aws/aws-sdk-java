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
 * The information that DataSync Discovery collects about a storage virtual machine (SVM) in your on-premises storage
 * system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/NetAppONTAPSVM" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetAppONTAPSVM implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster associated with the SVM.
     * </p>
     */
    private String clusterUuid;
    /**
     * <p>
     * The UUID of the SVM.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The name of the SVM
     * </p>
     */
    private String svmName;
    /**
     * <p>
     * The number of CIFS shares in the SVM.
     * </p>
     */
    private Long cifsShareCount;
    /**
     * <p>
     * The data transfer protocols (such as NFS) configured for the SVM.
     * </p>
     */
    private java.util.List<String> enabledProtocols;
    /**
     * <p>
     * The storage space that's being used in the SVM.
     * </p>
     */
    private Long totalCapacityUsed;
    /**
     * <p>
     * The total storage space that's available in the SVM.
     * </p>
     */
    private Long totalCapacityProvisioned;
    /**
     * <p>
     * The storage space that's being used in the SVM without accounting for compression or deduplication.
     * </p>
     */
    private Long totalLogicalCapacityUsed;
    /**
     * <p>
     * The performance data that DataSync Discovery collects about the SVM.
     * </p>
     */
    private MaxP95Performance maxP95Performance;
    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     */
    private java.util.List<Recommendation> recommendations;
    /**
     * <p>
     * The number of NFS volumes in the SVM.
     * </p>
     */
    private Long nfsExportedVolumes;
    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't be
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
     * The amount of storage in the SVM that's being used for snapshots.
     * </p>
     */
    private Long totalSnapshotCapacityUsed;
    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the SVM.
     * </p>
     */
    private Long lunCount;

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster associated with the SVM.
     * </p>
     * 
     * @param clusterUuid
     *        The universally unique identifier (UUID) of the cluster associated with the SVM.
     */

    public void setClusterUuid(String clusterUuid) {
        this.clusterUuid = clusterUuid;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster associated with the SVM.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the cluster associated with the SVM.
     */

    public String getClusterUuid() {
        return this.clusterUuid;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the cluster associated with the SVM.
     * </p>
     * 
     * @param clusterUuid
     *        The universally unique identifier (UUID) of the cluster associated with the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withClusterUuid(String clusterUuid) {
        setClusterUuid(clusterUuid);
        return this;
    }

    /**
     * <p>
     * The UUID of the SVM.
     * </p>
     * 
     * @param resourceId
     *        The UUID of the SVM.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The UUID of the SVM.
     * </p>
     * 
     * @return The UUID of the SVM.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The UUID of the SVM.
     * </p>
     * 
     * @param resourceId
     *        The UUID of the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The name of the SVM
     * </p>
     * 
     * @param svmName
     *        The name of the SVM
     */

    public void setSvmName(String svmName) {
        this.svmName = svmName;
    }

    /**
     * <p>
     * The name of the SVM
     * </p>
     * 
     * @return The name of the SVM
     */

    public String getSvmName() {
        return this.svmName;
    }

    /**
     * <p>
     * The name of the SVM
     * </p>
     * 
     * @param svmName
     *        The name of the SVM
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withSvmName(String svmName) {
        setSvmName(svmName);
        return this;
    }

    /**
     * <p>
     * The number of CIFS shares in the SVM.
     * </p>
     * 
     * @param cifsShareCount
     *        The number of CIFS shares in the SVM.
     */

    public void setCifsShareCount(Long cifsShareCount) {
        this.cifsShareCount = cifsShareCount;
    }

    /**
     * <p>
     * The number of CIFS shares in the SVM.
     * </p>
     * 
     * @return The number of CIFS shares in the SVM.
     */

    public Long getCifsShareCount() {
        return this.cifsShareCount;
    }

    /**
     * <p>
     * The number of CIFS shares in the SVM.
     * </p>
     * 
     * @param cifsShareCount
     *        The number of CIFS shares in the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withCifsShareCount(Long cifsShareCount) {
        setCifsShareCount(cifsShareCount);
        return this;
    }

    /**
     * <p>
     * The data transfer protocols (such as NFS) configured for the SVM.
     * </p>
     * 
     * @return The data transfer protocols (such as NFS) configured for the SVM.
     */

    public java.util.List<String> getEnabledProtocols() {
        return enabledProtocols;
    }

    /**
     * <p>
     * The data transfer protocols (such as NFS) configured for the SVM.
     * </p>
     * 
     * @param enabledProtocols
     *        The data transfer protocols (such as NFS) configured for the SVM.
     */

    public void setEnabledProtocols(java.util.Collection<String> enabledProtocols) {
        if (enabledProtocols == null) {
            this.enabledProtocols = null;
            return;
        }

        this.enabledProtocols = new java.util.ArrayList<String>(enabledProtocols);
    }

    /**
     * <p>
     * The data transfer protocols (such as NFS) configured for the SVM.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledProtocols(java.util.Collection)} or {@link #withEnabledProtocols(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param enabledProtocols
     *        The data transfer protocols (such as NFS) configured for the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withEnabledProtocols(String... enabledProtocols) {
        if (this.enabledProtocols == null) {
            setEnabledProtocols(new java.util.ArrayList<String>(enabledProtocols.length));
        }
        for (String ele : enabledProtocols) {
            this.enabledProtocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data transfer protocols (such as NFS) configured for the SVM.
     * </p>
     * 
     * @param enabledProtocols
     *        The data transfer protocols (such as NFS) configured for the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withEnabledProtocols(java.util.Collection<String> enabledProtocols) {
        setEnabledProtocols(enabledProtocols);
        return this;
    }

    /**
     * <p>
     * The storage space that's being used in the SVM.
     * </p>
     * 
     * @param totalCapacityUsed
     *        The storage space that's being used in the SVM.
     */

    public void setTotalCapacityUsed(Long totalCapacityUsed) {
        this.totalCapacityUsed = totalCapacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the SVM.
     * </p>
     * 
     * @return The storage space that's being used in the SVM.
     */

    public Long getTotalCapacityUsed() {
        return this.totalCapacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the SVM.
     * </p>
     * 
     * @param totalCapacityUsed
     *        The storage space that's being used in the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withTotalCapacityUsed(Long totalCapacityUsed) {
        setTotalCapacityUsed(totalCapacityUsed);
        return this;
    }

    /**
     * <p>
     * The total storage space that's available in the SVM.
     * </p>
     * 
     * @param totalCapacityProvisioned
     *        The total storage space that's available in the SVM.
     */

    public void setTotalCapacityProvisioned(Long totalCapacityProvisioned) {
        this.totalCapacityProvisioned = totalCapacityProvisioned;
    }

    /**
     * <p>
     * The total storage space that's available in the SVM.
     * </p>
     * 
     * @return The total storage space that's available in the SVM.
     */

    public Long getTotalCapacityProvisioned() {
        return this.totalCapacityProvisioned;
    }

    /**
     * <p>
     * The total storage space that's available in the SVM.
     * </p>
     * 
     * @param totalCapacityProvisioned
     *        The total storage space that's available in the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withTotalCapacityProvisioned(Long totalCapacityProvisioned) {
        setTotalCapacityProvisioned(totalCapacityProvisioned);
        return this;
    }

    /**
     * <p>
     * The storage space that's being used in the SVM without accounting for compression or deduplication.
     * </p>
     * 
     * @param totalLogicalCapacityUsed
     *        The storage space that's being used in the SVM without accounting for compression or deduplication.
     */

    public void setTotalLogicalCapacityUsed(Long totalLogicalCapacityUsed) {
        this.totalLogicalCapacityUsed = totalLogicalCapacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the SVM without accounting for compression or deduplication.
     * </p>
     * 
     * @return The storage space that's being used in the SVM without accounting for compression or deduplication.
     */

    public Long getTotalLogicalCapacityUsed() {
        return this.totalLogicalCapacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the SVM without accounting for compression or deduplication.
     * </p>
     * 
     * @param totalLogicalCapacityUsed
     *        The storage space that's being used in the SVM without accounting for compression or deduplication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withTotalLogicalCapacityUsed(Long totalLogicalCapacityUsed) {
        setTotalLogicalCapacityUsed(totalLogicalCapacityUsed);
        return this;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the SVM.
     * </p>
     * 
     * @param maxP95Performance
     *        The performance data that DataSync Discovery collects about the SVM.
     */

    public void setMaxP95Performance(MaxP95Performance maxP95Performance) {
        this.maxP95Performance = maxP95Performance;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the SVM.
     * </p>
     * 
     * @return The performance data that DataSync Discovery collects about the SVM.
     */

    public MaxP95Performance getMaxP95Performance() {
        return this.maxP95Performance;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the SVM.
     * </p>
     * 
     * @param maxP95Performance
     *        The performance data that DataSync Discovery collects about the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withMaxP95Performance(MaxP95Performance maxP95Performance) {
        setMaxP95Performance(maxP95Performance);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @return The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *         >Recommendations provided by DataSync Discovery</a>.
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more
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
     * The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withRecommendations(Recommendation... recommendations) {
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
     * The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the SVM. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * The number of NFS volumes in the SVM.
     * </p>
     * 
     * @param nfsExportedVolumes
     *        The number of NFS volumes in the SVM.
     */

    public void setNfsExportedVolumes(Long nfsExportedVolumes) {
        this.nfsExportedVolumes = nfsExportedVolumes;
    }

    /**
     * <p>
     * The number of NFS volumes in the SVM.
     * </p>
     * 
     * @return The number of NFS volumes in the SVM.
     */

    public Long getNfsExportedVolumes() {
        return this.nfsExportedVolumes;
    }

    /**
     * <p>
     * The number of NFS volumes in the SVM.
     * </p>
     * 
     * @param nfsExportedVolumes
     *        The number of NFS volumes in the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withNfsExportedVolumes(Long nfsExportedVolumes) {
        setNfsExportedVolumes(nfsExportedVolumes);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't
     *        be determined.</p>
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
     * Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @return Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't
     *         be determined.</p>
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
     * Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't
     *        be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public NetAppONTAPSVM withRecommendationStatus(String recommendationStatus) {
        setRecommendationStatus(recommendationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the SVM are ready to view, incomplete, or can't
     *        be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public NetAppONTAPSVM withRecommendationStatus(RecommendationStatus recommendationStatus) {
        this.recommendationStatus = recommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The amount of storage in the SVM that's being used for snapshots.
     * </p>
     * 
     * @param totalSnapshotCapacityUsed
     *        The amount of storage in the SVM that's being used for snapshots.
     */

    public void setTotalSnapshotCapacityUsed(Long totalSnapshotCapacityUsed) {
        this.totalSnapshotCapacityUsed = totalSnapshotCapacityUsed;
    }

    /**
     * <p>
     * The amount of storage in the SVM that's being used for snapshots.
     * </p>
     * 
     * @return The amount of storage in the SVM that's being used for snapshots.
     */

    public Long getTotalSnapshotCapacityUsed() {
        return this.totalSnapshotCapacityUsed;
    }

    /**
     * <p>
     * The amount of storage in the SVM that's being used for snapshots.
     * </p>
     * 
     * @param totalSnapshotCapacityUsed
     *        The amount of storage in the SVM that's being used for snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withTotalSnapshotCapacityUsed(Long totalSnapshotCapacityUsed) {
        setTotalSnapshotCapacityUsed(totalSnapshotCapacityUsed);
        return this;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the SVM.
     * </p>
     * 
     * @param lunCount
     *        The number of LUNs (logical unit numbers) in the SVM.
     */

    public void setLunCount(Long lunCount) {
        this.lunCount = lunCount;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the SVM.
     * </p>
     * 
     * @return The number of LUNs (logical unit numbers) in the SVM.
     */

    public Long getLunCount() {
        return this.lunCount;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the SVM.
     * </p>
     * 
     * @param lunCount
     *        The number of LUNs (logical unit numbers) in the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPSVM withLunCount(Long lunCount) {
        setLunCount(lunCount);
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
        if (getClusterUuid() != null)
            sb.append("ClusterUuid: ").append(getClusterUuid()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSvmName() != null)
            sb.append("SvmName: ").append(getSvmName()).append(",");
        if (getCifsShareCount() != null)
            sb.append("CifsShareCount: ").append(getCifsShareCount()).append(",");
        if (getEnabledProtocols() != null)
            sb.append("EnabledProtocols: ").append(getEnabledProtocols()).append(",");
        if (getTotalCapacityUsed() != null)
            sb.append("TotalCapacityUsed: ").append(getTotalCapacityUsed()).append(",");
        if (getTotalCapacityProvisioned() != null)
            sb.append("TotalCapacityProvisioned: ").append(getTotalCapacityProvisioned()).append(",");
        if (getTotalLogicalCapacityUsed() != null)
            sb.append("TotalLogicalCapacityUsed: ").append(getTotalLogicalCapacityUsed()).append(",");
        if (getMaxP95Performance() != null)
            sb.append("MaxP95Performance: ").append(getMaxP95Performance()).append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
        if (getNfsExportedVolumes() != null)
            sb.append("NfsExportedVolumes: ").append(getNfsExportedVolumes()).append(",");
        if (getRecommendationStatus() != null)
            sb.append("RecommendationStatus: ").append(getRecommendationStatus()).append(",");
        if (getTotalSnapshotCapacityUsed() != null)
            sb.append("TotalSnapshotCapacityUsed: ").append(getTotalSnapshotCapacityUsed()).append(",");
        if (getLunCount() != null)
            sb.append("LunCount: ").append(getLunCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetAppONTAPSVM == false)
            return false;
        NetAppONTAPSVM other = (NetAppONTAPSVM) obj;
        if (other.getClusterUuid() == null ^ this.getClusterUuid() == null)
            return false;
        if (other.getClusterUuid() != null && other.getClusterUuid().equals(this.getClusterUuid()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSvmName() == null ^ this.getSvmName() == null)
            return false;
        if (other.getSvmName() != null && other.getSvmName().equals(this.getSvmName()) == false)
            return false;
        if (other.getCifsShareCount() == null ^ this.getCifsShareCount() == null)
            return false;
        if (other.getCifsShareCount() != null && other.getCifsShareCount().equals(this.getCifsShareCount()) == false)
            return false;
        if (other.getEnabledProtocols() == null ^ this.getEnabledProtocols() == null)
            return false;
        if (other.getEnabledProtocols() != null && other.getEnabledProtocols().equals(this.getEnabledProtocols()) == false)
            return false;
        if (other.getTotalCapacityUsed() == null ^ this.getTotalCapacityUsed() == null)
            return false;
        if (other.getTotalCapacityUsed() != null && other.getTotalCapacityUsed().equals(this.getTotalCapacityUsed()) == false)
            return false;
        if (other.getTotalCapacityProvisioned() == null ^ this.getTotalCapacityProvisioned() == null)
            return false;
        if (other.getTotalCapacityProvisioned() != null && other.getTotalCapacityProvisioned().equals(this.getTotalCapacityProvisioned()) == false)
            return false;
        if (other.getTotalLogicalCapacityUsed() == null ^ this.getTotalLogicalCapacityUsed() == null)
            return false;
        if (other.getTotalLogicalCapacityUsed() != null && other.getTotalLogicalCapacityUsed().equals(this.getTotalLogicalCapacityUsed()) == false)
            return false;
        if (other.getMaxP95Performance() == null ^ this.getMaxP95Performance() == null)
            return false;
        if (other.getMaxP95Performance() != null && other.getMaxP95Performance().equals(this.getMaxP95Performance()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        if (other.getNfsExportedVolumes() == null ^ this.getNfsExportedVolumes() == null)
            return false;
        if (other.getNfsExportedVolumes() != null && other.getNfsExportedVolumes().equals(this.getNfsExportedVolumes()) == false)
            return false;
        if (other.getRecommendationStatus() == null ^ this.getRecommendationStatus() == null)
            return false;
        if (other.getRecommendationStatus() != null && other.getRecommendationStatus().equals(this.getRecommendationStatus()) == false)
            return false;
        if (other.getTotalSnapshotCapacityUsed() == null ^ this.getTotalSnapshotCapacityUsed() == null)
            return false;
        if (other.getTotalSnapshotCapacityUsed() != null && other.getTotalSnapshotCapacityUsed().equals(this.getTotalSnapshotCapacityUsed()) == false)
            return false;
        if (other.getLunCount() == null ^ this.getLunCount() == null)
            return false;
        if (other.getLunCount() != null && other.getLunCount().equals(this.getLunCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterUuid() == null) ? 0 : getClusterUuid().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSvmName() == null) ? 0 : getSvmName().hashCode());
        hashCode = prime * hashCode + ((getCifsShareCount() == null) ? 0 : getCifsShareCount().hashCode());
        hashCode = prime * hashCode + ((getEnabledProtocols() == null) ? 0 : getEnabledProtocols().hashCode());
        hashCode = prime * hashCode + ((getTotalCapacityUsed() == null) ? 0 : getTotalCapacityUsed().hashCode());
        hashCode = prime * hashCode + ((getTotalCapacityProvisioned() == null) ? 0 : getTotalCapacityProvisioned().hashCode());
        hashCode = prime * hashCode + ((getTotalLogicalCapacityUsed() == null) ? 0 : getTotalLogicalCapacityUsed().hashCode());
        hashCode = prime * hashCode + ((getMaxP95Performance() == null) ? 0 : getMaxP95Performance().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getNfsExportedVolumes() == null) ? 0 : getNfsExportedVolumes().hashCode());
        hashCode = prime * hashCode + ((getRecommendationStatus() == null) ? 0 : getRecommendationStatus().hashCode());
        hashCode = prime * hashCode + ((getTotalSnapshotCapacityUsed() == null) ? 0 : getTotalSnapshotCapacityUsed().hashCode());
        hashCode = prime * hashCode + ((getLunCount() == null) ? 0 : getLunCount().hashCode());
        return hashCode;
    }

    @Override
    public NetAppONTAPSVM clone() {
        try {
            return (NetAppONTAPSVM) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.NetAppONTAPSVMMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
