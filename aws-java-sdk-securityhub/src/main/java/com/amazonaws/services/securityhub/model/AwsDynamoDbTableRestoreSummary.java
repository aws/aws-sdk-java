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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the restore for the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableRestoreSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableRestoreSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the source backup from which the table was restored.
     * </p>
     */
    private String sourceBackupArn;
    /**
     * <p>
     * The ARN of the source table for the backup.
     * </p>
     */
    private String sourceTableArn;
    /**
     * <p>
     * Indicates the point in time that the table was restored to.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String restoreDateTime;
    /**
     * <p>
     * Whether a restore is currently in progress.
     * </p>
     */
    private Boolean restoreInProgress;

    /**
     * <p>
     * The ARN of the source backup from which the table was restored.
     * </p>
     * 
     * @param sourceBackupArn
     *        The ARN of the source backup from which the table was restored.
     */

    public void setSourceBackupArn(String sourceBackupArn) {
        this.sourceBackupArn = sourceBackupArn;
    }

    /**
     * <p>
     * The ARN of the source backup from which the table was restored.
     * </p>
     * 
     * @return The ARN of the source backup from which the table was restored.
     */

    public String getSourceBackupArn() {
        return this.sourceBackupArn;
    }

    /**
     * <p>
     * The ARN of the source backup from which the table was restored.
     * </p>
     * 
     * @param sourceBackupArn
     *        The ARN of the source backup from which the table was restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableRestoreSummary withSourceBackupArn(String sourceBackupArn) {
        setSourceBackupArn(sourceBackupArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the source table for the backup.
     * </p>
     * 
     * @param sourceTableArn
     *        The ARN of the source table for the backup.
     */

    public void setSourceTableArn(String sourceTableArn) {
        this.sourceTableArn = sourceTableArn;
    }

    /**
     * <p>
     * The ARN of the source table for the backup.
     * </p>
     * 
     * @return The ARN of the source table for the backup.
     */

    public String getSourceTableArn() {
        return this.sourceTableArn;
    }

    /**
     * <p>
     * The ARN of the source table for the backup.
     * </p>
     * 
     * @param sourceTableArn
     *        The ARN of the source table for the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableRestoreSummary withSourceTableArn(String sourceTableArn) {
        setSourceTableArn(sourceTableArn);
        return this;
    }

    /**
     * <p>
     * Indicates the point in time that the table was restored to.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreDateTime
     *        Indicates the point in time that the table was restored to.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setRestoreDateTime(String restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
    }

    /**
     * <p>
     * Indicates the point in time that the table was restored to.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the point in time that the table was restored to.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getRestoreDateTime() {
        return this.restoreDateTime;
    }

    /**
     * <p>
     * Indicates the point in time that the table was restored to.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreDateTime
     *        Indicates the point in time that the table was restored to.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableRestoreSummary withRestoreDateTime(String restoreDateTime) {
        setRestoreDateTime(restoreDateTime);
        return this;
    }

    /**
     * <p>
     * Whether a restore is currently in progress.
     * </p>
     * 
     * @param restoreInProgress
     *        Whether a restore is currently in progress.
     */

    public void setRestoreInProgress(Boolean restoreInProgress) {
        this.restoreInProgress = restoreInProgress;
    }

    /**
     * <p>
     * Whether a restore is currently in progress.
     * </p>
     * 
     * @return Whether a restore is currently in progress.
     */

    public Boolean getRestoreInProgress() {
        return this.restoreInProgress;
    }

    /**
     * <p>
     * Whether a restore is currently in progress.
     * </p>
     * 
     * @param restoreInProgress
     *        Whether a restore is currently in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableRestoreSummary withRestoreInProgress(Boolean restoreInProgress) {
        setRestoreInProgress(restoreInProgress);
        return this;
    }

    /**
     * <p>
     * Whether a restore is currently in progress.
     * </p>
     * 
     * @return Whether a restore is currently in progress.
     */

    public Boolean isRestoreInProgress() {
        return this.restoreInProgress;
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
        if (getSourceBackupArn() != null)
            sb.append("SourceBackupArn: ").append(getSourceBackupArn()).append(",");
        if (getSourceTableArn() != null)
            sb.append("SourceTableArn: ").append(getSourceTableArn()).append(",");
        if (getRestoreDateTime() != null)
            sb.append("RestoreDateTime: ").append(getRestoreDateTime()).append(",");
        if (getRestoreInProgress() != null)
            sb.append("RestoreInProgress: ").append(getRestoreInProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableRestoreSummary == false)
            return false;
        AwsDynamoDbTableRestoreSummary other = (AwsDynamoDbTableRestoreSummary) obj;
        if (other.getSourceBackupArn() == null ^ this.getSourceBackupArn() == null)
            return false;
        if (other.getSourceBackupArn() != null && other.getSourceBackupArn().equals(this.getSourceBackupArn()) == false)
            return false;
        if (other.getSourceTableArn() == null ^ this.getSourceTableArn() == null)
            return false;
        if (other.getSourceTableArn() != null && other.getSourceTableArn().equals(this.getSourceTableArn()) == false)
            return false;
        if (other.getRestoreDateTime() == null ^ this.getRestoreDateTime() == null)
            return false;
        if (other.getRestoreDateTime() != null && other.getRestoreDateTime().equals(this.getRestoreDateTime()) == false)
            return false;
        if (other.getRestoreInProgress() == null ^ this.getRestoreInProgress() == null)
            return false;
        if (other.getRestoreInProgress() != null && other.getRestoreInProgress().equals(this.getRestoreInProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceBackupArn() == null) ? 0 : getSourceBackupArn().hashCode());
        hashCode = prime * hashCode + ((getSourceTableArn() == null) ? 0 : getSourceTableArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreDateTime() == null) ? 0 : getRestoreDateTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreInProgress() == null) ? 0 : getRestoreInProgress().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableRestoreSummary clone() {
        try {
            return (AwsDynamoDbTableRestoreSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableRestoreSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
