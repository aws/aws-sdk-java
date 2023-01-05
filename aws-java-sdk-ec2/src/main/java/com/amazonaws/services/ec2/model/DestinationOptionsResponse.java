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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the destination options for a flow log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DestinationOptionsResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationOptionsResponse implements Serializable, Cloneable {

    /**
     * <p>
     * The format for the flow log.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     * </p>
     */
    private Boolean hiveCompatiblePartitions;
    /**
     * <p>
     * Indicates whether to partition the flow log per hour.
     * </p>
     */
    private Boolean perHourPartition;

    /**
     * <p>
     * The format for the flow log.
     * </p>
     * 
     * @param fileFormat
     *        The format for the flow log.
     * @see DestinationFileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The format for the flow log.
     * </p>
     * 
     * @return The format for the flow log.
     * @see DestinationFileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The format for the flow log.
     * </p>
     * 
     * @param fileFormat
     *        The format for the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationFileFormat
     */

    public DestinationOptionsResponse withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The format for the flow log.
     * </p>
     * 
     * @param fileFormat
     *        The format for the flow log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationFileFormat
     */

    public DestinationOptionsResponse withFileFormat(DestinationFileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     * </p>
     * 
     * @param hiveCompatiblePartitions
     *        Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     */

    public void setHiveCompatiblePartitions(Boolean hiveCompatiblePartitions) {
        this.hiveCompatiblePartitions = hiveCompatiblePartitions;
    }

    /**
     * <p>
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     * </p>
     * 
     * @return Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     */

    public Boolean getHiveCompatiblePartitions() {
        return this.hiveCompatiblePartitions;
    }

    /**
     * <p>
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     * </p>
     * 
     * @param hiveCompatiblePartitions
     *        Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationOptionsResponse withHiveCompatiblePartitions(Boolean hiveCompatiblePartitions) {
        setHiveCompatiblePartitions(hiveCompatiblePartitions);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     * </p>
     * 
     * @return Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     */

    public Boolean isHiveCompatiblePartitions() {
        return this.hiveCompatiblePartitions;
    }

    /**
     * <p>
     * Indicates whether to partition the flow log per hour.
     * </p>
     * 
     * @param perHourPartition
     *        Indicates whether to partition the flow log per hour.
     */

    public void setPerHourPartition(Boolean perHourPartition) {
        this.perHourPartition = perHourPartition;
    }

    /**
     * <p>
     * Indicates whether to partition the flow log per hour.
     * </p>
     * 
     * @return Indicates whether to partition the flow log per hour.
     */

    public Boolean getPerHourPartition() {
        return this.perHourPartition;
    }

    /**
     * <p>
     * Indicates whether to partition the flow log per hour.
     * </p>
     * 
     * @param perHourPartition
     *        Indicates whether to partition the flow log per hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationOptionsResponse withPerHourPartition(Boolean perHourPartition) {
        setPerHourPartition(perHourPartition);
        return this;
    }

    /**
     * <p>
     * Indicates whether to partition the flow log per hour.
     * </p>
     * 
     * @return Indicates whether to partition the flow log per hour.
     */

    public Boolean isPerHourPartition() {
        return this.perHourPartition;
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
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getHiveCompatiblePartitions() != null)
            sb.append("HiveCompatiblePartitions: ").append(getHiveCompatiblePartitions()).append(",");
        if (getPerHourPartition() != null)
            sb.append("PerHourPartition: ").append(getPerHourPartition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationOptionsResponse == false)
            return false;
        DestinationOptionsResponse other = (DestinationOptionsResponse) obj;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        if (other.getHiveCompatiblePartitions() == null ^ this.getHiveCompatiblePartitions() == null)
            return false;
        if (other.getHiveCompatiblePartitions() != null && other.getHiveCompatiblePartitions().equals(this.getHiveCompatiblePartitions()) == false)
            return false;
        if (other.getPerHourPartition() == null ^ this.getPerHourPartition() == null)
            return false;
        if (other.getPerHourPartition() != null && other.getPerHourPartition().equals(this.getPerHourPartition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getHiveCompatiblePartitions() == null) ? 0 : getHiveCompatiblePartitions().hashCode());
        hashCode = prime * hashCode + ((getPerHourPartition() == null) ? 0 : getPerHourPartition().hashCode());
        return hashCode;
    }

    @Override
    public DestinationOptionsResponse clone() {
        try {
            return (DestinationOptionsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
