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
 * The information that DataSync Discovery collects about a volume in your on-premises storage system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/NetAppONTAPVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetAppONTAPVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume.
     * </p>
     */
    private String volumeName;
    /**
     * <p>
     * The universally unique identifier (UUID) of the volume.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The number of CIFS shares in the volume.
     * </p>
     */
    private Long cifsShareCount;
    /**
     * <p>
     * The volume's security style (such as Unix or NTFS).
     * </p>
     */
    private String securityStyle;
    /**
     * <p>
     * The UUID of the storage virtual machine (SVM) associated with the volume.
     * </p>
     */
    private String svmUuid;
    /**
     * <p>
     * The name of the SVM associated with the volume.
     * </p>
     */
    private String svmName;
    /**
     * <p>
     * The storage space that's being used in the volume.
     * </p>
     */
    private Long capacityUsed;
    /**
     * <p>
     * The total storage space that's available in the volume.
     * </p>
     */
    private Long capacityProvisioned;
    /**
     * <p>
     * The storage space that's being used in the volume without accounting for compression or deduplication.
     * </p>
     */
    private Long logicalCapacityUsed;
    /**
     * <p>
     * The number of NFS volumes in the volume.
     * </p>
     */
    private Boolean nfsExported;
    /**
     * <p>
     * The amount of storage in the volume that's being used for snapshots.
     * </p>
     */
    private Long snapshotCapacityUsed;
    /**
     * <p>
     * The performance data that DataSync Discovery collects about the volume.
     * </p>
     */
    private MaxP95Performance maxP95Performance;
    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     */
    private java.util.List<Recommendation> recommendations;
    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or can't be
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
     * The number of LUNs (logical unit numbers) in the volume.
     * </p>
     */
    private Long lunCount;

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @param volumeName
     *        The name of the volume.
     */

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @return The name of the volume.
     */

    public String getVolumeName() {
        return this.volumeName;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @param volumeName
     *        The name of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withVolumeName(String volumeName) {
        setVolumeName(volumeName);
        return this;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the volume.
     * </p>
     * 
     * @param resourceId
     *        The universally unique identifier (UUID) of the volume.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the volume.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the volume.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the volume.
     * </p>
     * 
     * @param resourceId
     *        The universally unique identifier (UUID) of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The number of CIFS shares in the volume.
     * </p>
     * 
     * @param cifsShareCount
     *        The number of CIFS shares in the volume.
     */

    public void setCifsShareCount(Long cifsShareCount) {
        this.cifsShareCount = cifsShareCount;
    }

    /**
     * <p>
     * The number of CIFS shares in the volume.
     * </p>
     * 
     * @return The number of CIFS shares in the volume.
     */

    public Long getCifsShareCount() {
        return this.cifsShareCount;
    }

    /**
     * <p>
     * The number of CIFS shares in the volume.
     * </p>
     * 
     * @param cifsShareCount
     *        The number of CIFS shares in the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withCifsShareCount(Long cifsShareCount) {
        setCifsShareCount(cifsShareCount);
        return this;
    }

    /**
     * <p>
     * The volume's security style (such as Unix or NTFS).
     * </p>
     * 
     * @param securityStyle
     *        The volume's security style (such as Unix or NTFS).
     */

    public void setSecurityStyle(String securityStyle) {
        this.securityStyle = securityStyle;
    }

    /**
     * <p>
     * The volume's security style (such as Unix or NTFS).
     * </p>
     * 
     * @return The volume's security style (such as Unix or NTFS).
     */

    public String getSecurityStyle() {
        return this.securityStyle;
    }

    /**
     * <p>
     * The volume's security style (such as Unix or NTFS).
     * </p>
     * 
     * @param securityStyle
     *        The volume's security style (such as Unix or NTFS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withSecurityStyle(String securityStyle) {
        setSecurityStyle(securityStyle);
        return this;
    }

    /**
     * <p>
     * The UUID of the storage virtual machine (SVM) associated with the volume.
     * </p>
     * 
     * @param svmUuid
     *        The UUID of the storage virtual machine (SVM) associated with the volume.
     */

    public void setSvmUuid(String svmUuid) {
        this.svmUuid = svmUuid;
    }

    /**
     * <p>
     * The UUID of the storage virtual machine (SVM) associated with the volume.
     * </p>
     * 
     * @return The UUID of the storage virtual machine (SVM) associated with the volume.
     */

    public String getSvmUuid() {
        return this.svmUuid;
    }

    /**
     * <p>
     * The UUID of the storage virtual machine (SVM) associated with the volume.
     * </p>
     * 
     * @param svmUuid
     *        The UUID of the storage virtual machine (SVM) associated with the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withSvmUuid(String svmUuid) {
        setSvmUuid(svmUuid);
        return this;
    }

    /**
     * <p>
     * The name of the SVM associated with the volume.
     * </p>
     * 
     * @param svmName
     *        The name of the SVM associated with the volume.
     */

    public void setSvmName(String svmName) {
        this.svmName = svmName;
    }

    /**
     * <p>
     * The name of the SVM associated with the volume.
     * </p>
     * 
     * @return The name of the SVM associated with the volume.
     */

    public String getSvmName() {
        return this.svmName;
    }

    /**
     * <p>
     * The name of the SVM associated with the volume.
     * </p>
     * 
     * @param svmName
     *        The name of the SVM associated with the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withSvmName(String svmName) {
        setSvmName(svmName);
        return this;
    }

    /**
     * <p>
     * The storage space that's being used in the volume.
     * </p>
     * 
     * @param capacityUsed
     *        The storage space that's being used in the volume.
     */

    public void setCapacityUsed(Long capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the volume.
     * </p>
     * 
     * @return The storage space that's being used in the volume.
     */

    public Long getCapacityUsed() {
        return this.capacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the volume.
     * </p>
     * 
     * @param capacityUsed
     *        The storage space that's being used in the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withCapacityUsed(Long capacityUsed) {
        setCapacityUsed(capacityUsed);
        return this;
    }

    /**
     * <p>
     * The total storage space that's available in the volume.
     * </p>
     * 
     * @param capacityProvisioned
     *        The total storage space that's available in the volume.
     */

    public void setCapacityProvisioned(Long capacityProvisioned) {
        this.capacityProvisioned = capacityProvisioned;
    }

    /**
     * <p>
     * The total storage space that's available in the volume.
     * </p>
     * 
     * @return The total storage space that's available in the volume.
     */

    public Long getCapacityProvisioned() {
        return this.capacityProvisioned;
    }

    /**
     * <p>
     * The total storage space that's available in the volume.
     * </p>
     * 
     * @param capacityProvisioned
     *        The total storage space that's available in the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withCapacityProvisioned(Long capacityProvisioned) {
        setCapacityProvisioned(capacityProvisioned);
        return this;
    }

    /**
     * <p>
     * The storage space that's being used in the volume without accounting for compression or deduplication.
     * </p>
     * 
     * @param logicalCapacityUsed
     *        The storage space that's being used in the volume without accounting for compression or deduplication.
     */

    public void setLogicalCapacityUsed(Long logicalCapacityUsed) {
        this.logicalCapacityUsed = logicalCapacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the volume without accounting for compression or deduplication.
     * </p>
     * 
     * @return The storage space that's being used in the volume without accounting for compression or deduplication.
     */

    public Long getLogicalCapacityUsed() {
        return this.logicalCapacityUsed;
    }

    /**
     * <p>
     * The storage space that's being used in the volume without accounting for compression or deduplication.
     * </p>
     * 
     * @param logicalCapacityUsed
     *        The storage space that's being used in the volume without accounting for compression or deduplication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withLogicalCapacityUsed(Long logicalCapacityUsed) {
        setLogicalCapacityUsed(logicalCapacityUsed);
        return this;
    }

    /**
     * <p>
     * The number of NFS volumes in the volume.
     * </p>
     * 
     * @param nfsExported
     *        The number of NFS volumes in the volume.
     */

    public void setNfsExported(Boolean nfsExported) {
        this.nfsExported = nfsExported;
    }

    /**
     * <p>
     * The number of NFS volumes in the volume.
     * </p>
     * 
     * @return The number of NFS volumes in the volume.
     */

    public Boolean getNfsExported() {
        return this.nfsExported;
    }

    /**
     * <p>
     * The number of NFS volumes in the volume.
     * </p>
     * 
     * @param nfsExported
     *        The number of NFS volumes in the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withNfsExported(Boolean nfsExported) {
        setNfsExported(nfsExported);
        return this;
    }

    /**
     * <p>
     * The number of NFS volumes in the volume.
     * </p>
     * 
     * @return The number of NFS volumes in the volume.
     */

    public Boolean isNfsExported() {
        return this.nfsExported;
    }

    /**
     * <p>
     * The amount of storage in the volume that's being used for snapshots.
     * </p>
     * 
     * @param snapshotCapacityUsed
     *        The amount of storage in the volume that's being used for snapshots.
     */

    public void setSnapshotCapacityUsed(Long snapshotCapacityUsed) {
        this.snapshotCapacityUsed = snapshotCapacityUsed;
    }

    /**
     * <p>
     * The amount of storage in the volume that's being used for snapshots.
     * </p>
     * 
     * @return The amount of storage in the volume that's being used for snapshots.
     */

    public Long getSnapshotCapacityUsed() {
        return this.snapshotCapacityUsed;
    }

    /**
     * <p>
     * The amount of storage in the volume that's being used for snapshots.
     * </p>
     * 
     * @param snapshotCapacityUsed
     *        The amount of storage in the volume that's being used for snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withSnapshotCapacityUsed(Long snapshotCapacityUsed) {
        setSnapshotCapacityUsed(snapshotCapacityUsed);
        return this;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the volume.
     * </p>
     * 
     * @param maxP95Performance
     *        The performance data that DataSync Discovery collects about the volume.
     */

    public void setMaxP95Performance(MaxP95Performance maxP95Performance) {
        this.maxP95Performance = maxP95Performance;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the volume.
     * </p>
     * 
     * @return The performance data that DataSync Discovery collects about the volume.
     */

    public MaxP95Performance getMaxP95Performance() {
        return this.maxP95Performance;
    }

    /**
     * <p>
     * The performance data that DataSync Discovery collects about the volume.
     * </p>
     * 
     * @param maxP95Performance
     *        The performance data that DataSync Discovery collects about the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withMaxP95Performance(MaxP95Performance maxP95Performance) {
        setMaxP95Performance(maxP95Performance);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @return The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *         >Recommendations provided by DataSync Discovery</a>.
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more
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
     * The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more information,
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
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withRecommendations(Recommendation... recommendations) {
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
     * The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html">
     * Recommendations provided by DataSync Discovery</a>.
     * </p>
     * 
     * @param recommendations
     *        The Amazon Web Services storage services that DataSync Discovery recommends for the volume. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >Recommendations provided by DataSync Discovery</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or
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
     * Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @return Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or
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
     * Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or
     *        can't be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public NetAppONTAPVolume withRecommendationStatus(String recommendationStatus) {
        setRecommendationStatus(recommendationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or can't be
     * determined.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     * >Recommendation statuses</a>.
     * </p>
     * 
     * @param recommendationStatus
     *        Indicates whether DataSync Discovery recommendations for the volume are ready to view, incomplete, or
     *        can't be determined.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#recommendation-statuses-table"
     *        >Recommendation statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public NetAppONTAPVolume withRecommendationStatus(RecommendationStatus recommendationStatus) {
        this.recommendationStatus = recommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the volume.
     * </p>
     * 
     * @param lunCount
     *        The number of LUNs (logical unit numbers) in the volume.
     */

    public void setLunCount(Long lunCount) {
        this.lunCount = lunCount;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the volume.
     * </p>
     * 
     * @return The number of LUNs (logical unit numbers) in the volume.
     */

    public Long getLunCount() {
        return this.lunCount;
    }

    /**
     * <p>
     * The number of LUNs (logical unit numbers) in the volume.
     * </p>
     * 
     * @param lunCount
     *        The number of LUNs (logical unit numbers) in the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetAppONTAPVolume withLunCount(Long lunCount) {
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
        if (getVolumeName() != null)
            sb.append("VolumeName: ").append(getVolumeName()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getCifsShareCount() != null)
            sb.append("CifsShareCount: ").append(getCifsShareCount()).append(",");
        if (getSecurityStyle() != null)
            sb.append("SecurityStyle: ").append(getSecurityStyle()).append(",");
        if (getSvmUuid() != null)
            sb.append("SvmUuid: ").append(getSvmUuid()).append(",");
        if (getSvmName() != null)
            sb.append("SvmName: ").append(getSvmName()).append(",");
        if (getCapacityUsed() != null)
            sb.append("CapacityUsed: ").append(getCapacityUsed()).append(",");
        if (getCapacityProvisioned() != null)
            sb.append("CapacityProvisioned: ").append(getCapacityProvisioned()).append(",");
        if (getLogicalCapacityUsed() != null)
            sb.append("LogicalCapacityUsed: ").append(getLogicalCapacityUsed()).append(",");
        if (getNfsExported() != null)
            sb.append("NfsExported: ").append(getNfsExported()).append(",");
        if (getSnapshotCapacityUsed() != null)
            sb.append("SnapshotCapacityUsed: ").append(getSnapshotCapacityUsed()).append(",");
        if (getMaxP95Performance() != null)
            sb.append("MaxP95Performance: ").append(getMaxP95Performance()).append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
        if (getRecommendationStatus() != null)
            sb.append("RecommendationStatus: ").append(getRecommendationStatus()).append(",");
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

        if (obj instanceof NetAppONTAPVolume == false)
            return false;
        NetAppONTAPVolume other = (NetAppONTAPVolume) obj;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getCifsShareCount() == null ^ this.getCifsShareCount() == null)
            return false;
        if (other.getCifsShareCount() != null && other.getCifsShareCount().equals(this.getCifsShareCount()) == false)
            return false;
        if (other.getSecurityStyle() == null ^ this.getSecurityStyle() == null)
            return false;
        if (other.getSecurityStyle() != null && other.getSecurityStyle().equals(this.getSecurityStyle()) == false)
            return false;
        if (other.getSvmUuid() == null ^ this.getSvmUuid() == null)
            return false;
        if (other.getSvmUuid() != null && other.getSvmUuid().equals(this.getSvmUuid()) == false)
            return false;
        if (other.getSvmName() == null ^ this.getSvmName() == null)
            return false;
        if (other.getSvmName() != null && other.getSvmName().equals(this.getSvmName()) == false)
            return false;
        if (other.getCapacityUsed() == null ^ this.getCapacityUsed() == null)
            return false;
        if (other.getCapacityUsed() != null && other.getCapacityUsed().equals(this.getCapacityUsed()) == false)
            return false;
        if (other.getCapacityProvisioned() == null ^ this.getCapacityProvisioned() == null)
            return false;
        if (other.getCapacityProvisioned() != null && other.getCapacityProvisioned().equals(this.getCapacityProvisioned()) == false)
            return false;
        if (other.getLogicalCapacityUsed() == null ^ this.getLogicalCapacityUsed() == null)
            return false;
        if (other.getLogicalCapacityUsed() != null && other.getLogicalCapacityUsed().equals(this.getLogicalCapacityUsed()) == false)
            return false;
        if (other.getNfsExported() == null ^ this.getNfsExported() == null)
            return false;
        if (other.getNfsExported() != null && other.getNfsExported().equals(this.getNfsExported()) == false)
            return false;
        if (other.getSnapshotCapacityUsed() == null ^ this.getSnapshotCapacityUsed() == null)
            return false;
        if (other.getSnapshotCapacityUsed() != null && other.getSnapshotCapacityUsed().equals(this.getSnapshotCapacityUsed()) == false)
            return false;
        if (other.getMaxP95Performance() == null ^ this.getMaxP95Performance() == null)
            return false;
        if (other.getMaxP95Performance() != null && other.getMaxP95Performance().equals(this.getMaxP95Performance()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getCifsShareCount() == null) ? 0 : getCifsShareCount().hashCode());
        hashCode = prime * hashCode + ((getSecurityStyle() == null) ? 0 : getSecurityStyle().hashCode());
        hashCode = prime * hashCode + ((getSvmUuid() == null) ? 0 : getSvmUuid().hashCode());
        hashCode = prime * hashCode + ((getSvmName() == null) ? 0 : getSvmName().hashCode());
        hashCode = prime * hashCode + ((getCapacityUsed() == null) ? 0 : getCapacityUsed().hashCode());
        hashCode = prime * hashCode + ((getCapacityProvisioned() == null) ? 0 : getCapacityProvisioned().hashCode());
        hashCode = prime * hashCode + ((getLogicalCapacityUsed() == null) ? 0 : getLogicalCapacityUsed().hashCode());
        hashCode = prime * hashCode + ((getNfsExported() == null) ? 0 : getNfsExported().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCapacityUsed() == null) ? 0 : getSnapshotCapacityUsed().hashCode());
        hashCode = prime * hashCode + ((getMaxP95Performance() == null) ? 0 : getMaxP95Performance().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getRecommendationStatus() == null) ? 0 : getRecommendationStatus().hashCode());
        hashCode = prime * hashCode + ((getLunCount() == null) ? 0 : getLunCount().hashCode());
        return hashCode;
    }

    @Override
    public NetAppONTAPVolume clone() {
        try {
            return (NetAppONTAPVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.NetAppONTAPVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
