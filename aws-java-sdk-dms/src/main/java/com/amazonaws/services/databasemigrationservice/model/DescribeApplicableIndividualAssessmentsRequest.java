/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeApplicableIndividualAssessments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicableIndividualAssessmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     * assessments.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * ARN of a replication instance on which you want to base the default list of individual assessments.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a source.
     * </p>
     */
    private String sourceEngineName;
    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a target.
     * </p>
     */
    private String targetEngineName;
    /**
     * <p>
     * Name of the migration type that each provided individual assessment must support.
     * </p>
     */
    private String migrationType;
    /**
     * <p>
     * Maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * Optional pagination token provided by a previous request. If this parameter is specified, the response includes
     * only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     * assessments.
     * </p>
     * 
     * @param replicationTaskArn
     *        Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     *        assessments.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     * assessments.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     *         assessments.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     * assessments.
     * </p>
     * 
     * @param replicationTaskArn
     *        Amazon Resource Name (ARN) of a migration task on which you want to base the default list of individual
     *        assessments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * ARN of a replication instance on which you want to base the default list of individual assessments.
     * </p>
     * 
     * @param replicationInstanceArn
     *        ARN of a replication instance on which you want to base the default list of individual assessments.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * ARN of a replication instance on which you want to base the default list of individual assessments.
     * </p>
     * 
     * @return ARN of a replication instance on which you want to base the default list of individual assessments.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * ARN of a replication instance on which you want to base the default list of individual assessments.
     * </p>
     * 
     * @param replicationInstanceArn
     *        ARN of a replication instance on which you want to base the default list of individual assessments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsRequest withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a source.
     * </p>
     * 
     * @param sourceEngineName
     *        Name of a database engine that the specified replication instance supports as a source.
     */

    public void setSourceEngineName(String sourceEngineName) {
        this.sourceEngineName = sourceEngineName;
    }

    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a source.
     * </p>
     * 
     * @return Name of a database engine that the specified replication instance supports as a source.
     */

    public String getSourceEngineName() {
        return this.sourceEngineName;
    }

    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a source.
     * </p>
     * 
     * @param sourceEngineName
     *        Name of a database engine that the specified replication instance supports as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsRequest withSourceEngineName(String sourceEngineName) {
        setSourceEngineName(sourceEngineName);
        return this;
    }

    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a target.
     * </p>
     * 
     * @param targetEngineName
     *        Name of a database engine that the specified replication instance supports as a target.
     */

    public void setTargetEngineName(String targetEngineName) {
        this.targetEngineName = targetEngineName;
    }

    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a target.
     * </p>
     * 
     * @return Name of a database engine that the specified replication instance supports as a target.
     */

    public String getTargetEngineName() {
        return this.targetEngineName;
    }

    /**
     * <p>
     * Name of a database engine that the specified replication instance supports as a target.
     * </p>
     * 
     * @param targetEngineName
     *        Name of a database engine that the specified replication instance supports as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsRequest withTargetEngineName(String targetEngineName) {
        setTargetEngineName(targetEngineName);
        return this;
    }

    /**
     * <p>
     * Name of the migration type that each provided individual assessment must support.
     * </p>
     * 
     * @param migrationType
     *        Name of the migration type that each provided individual assessment must support.
     * @see MigrationTypeValue
     */

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * Name of the migration type that each provided individual assessment must support.
     * </p>
     * 
     * @return Name of the migration type that each provided individual assessment must support.
     * @see MigrationTypeValue
     */

    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * <p>
     * Name of the migration type that each provided individual assessment must support.
     * </p>
     * 
     * @param migrationType
     *        Name of the migration type that each provided individual assessment must support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public DescribeApplicableIndividualAssessmentsRequest withMigrationType(String migrationType) {
        setMigrationType(migrationType);
        return this;
    }

    /**
     * <p>
     * Name of the migration type that each provided individual assessment must support.
     * </p>
     * 
     * @param migrationType
     *        Name of the migration type that each provided individual assessment must support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public DescribeApplicableIndividualAssessmentsRequest withMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
        return this;
    }

    /**
     * <p>
     * Maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * 
     * @param maxRecords
     *        Maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * Maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * 
     * @return Maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *         remaining results can be retrieved.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * Maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     * remaining results can be retrieved.
     * </p>
     * 
     * @param maxRecords
     *        Maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that the
     *        remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * Optional pagination token provided by a previous request. If this parameter is specified, the response includes
     * only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        Optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Optional pagination token provided by a previous request. If this parameter is specified, the response includes
     * only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return Optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Optional pagination token provided by a previous request. If this parameter is specified, the response includes
     * only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        Optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicableIndividualAssessmentsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getSourceEngineName() != null)
            sb.append("SourceEngineName: ").append(getSourceEngineName()).append(",");
        if (getTargetEngineName() != null)
            sb.append("TargetEngineName: ").append(getTargetEngineName()).append(",");
        if (getMigrationType() != null)
            sb.append("MigrationType: ").append(getMigrationType()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicableIndividualAssessmentsRequest == false)
            return false;
        DescribeApplicableIndividualAssessmentsRequest other = (DescribeApplicableIndividualAssessmentsRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getSourceEngineName() == null ^ this.getSourceEngineName() == null)
            return false;
        if (other.getSourceEngineName() != null && other.getSourceEngineName().equals(this.getSourceEngineName()) == false)
            return false;
        if (other.getTargetEngineName() == null ^ this.getTargetEngineName() == null)
            return false;
        if (other.getTargetEngineName() != null && other.getTargetEngineName().equals(this.getTargetEngineName()) == false)
            return false;
        if (other.getMigrationType() == null ^ this.getMigrationType() == null)
            return false;
        if (other.getMigrationType() != null && other.getMigrationType().equals(this.getMigrationType()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceEngineName() == null) ? 0 : getSourceEngineName().hashCode());
        hashCode = prime * hashCode + ((getTargetEngineName() == null) ? 0 : getTargetEngineName().hashCode());
        hashCode = prime * hashCode + ((getMigrationType() == null) ? 0 : getMigrationType().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicableIndividualAssessmentsRequest clone() {
        return (DescribeApplicableIndividualAssessmentsRequest) super.clone();
    }

}
