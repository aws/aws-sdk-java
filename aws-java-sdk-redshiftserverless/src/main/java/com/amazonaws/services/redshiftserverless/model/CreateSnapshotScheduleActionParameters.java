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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters that you can use to configure a <a
 * href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_CreateScheduledAction.html">scheduled
 * action</a> to create a snapshot. For more information about creating a scheduled action, see <a
 * href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_CreateScheduledAction.html"
 * >CreateScheduledAction</a>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateSnapshotScheduleActionParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotScheduleActionParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The retention period of the snapshot created by the scheduled action.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * A string prefix that is attached to the name of the snapshot created by the scheduled action. The final name of
     * the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     * </p>
     */
    private String snapshotNamePrefix;
    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     * </p>
     * 
     * @return The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace for which you want to configure a scheduled action to create a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleActionParameters withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The retention period of the snapshot created by the scheduled action.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period of the snapshot created by the scheduled action.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The retention period of the snapshot created by the scheduled action.
     * </p>
     * 
     * @return The retention period of the snapshot created by the scheduled action.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The retention period of the snapshot created by the scheduled action.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period of the snapshot created by the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleActionParameters withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * A string prefix that is attached to the name of the snapshot created by the scheduled action. The final name of
     * the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     * </p>
     * 
     * @param snapshotNamePrefix
     *        A string prefix that is attached to the name of the snapshot created by the scheduled action. The final
     *        name of the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     */

    public void setSnapshotNamePrefix(String snapshotNamePrefix) {
        this.snapshotNamePrefix = snapshotNamePrefix;
    }

    /**
     * <p>
     * A string prefix that is attached to the name of the snapshot created by the scheduled action. The final name of
     * the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     * </p>
     * 
     * @return A string prefix that is attached to the name of the snapshot created by the scheduled action. The final
     *         name of the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     */

    public String getSnapshotNamePrefix() {
        return this.snapshotNamePrefix;
    }

    /**
     * <p>
     * A string prefix that is attached to the name of the snapshot created by the scheduled action. The final name of
     * the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     * </p>
     * 
     * @param snapshotNamePrefix
     *        A string prefix that is attached to the name of the snapshot created by the scheduled action. The final
     *        name of the snapshot is the string prefix appended by the date and time of when the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleActionParameters withSnapshotNamePrefix(String snapshotNamePrefix) {
        setSnapshotNamePrefix(snapshotNamePrefix);
        return this;
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the snapshot.
     * </p>
     * 
     * @return An array of <a
     *         href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag objects</a>
     *         to associate with the snapshot.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the snapshot.
     * </p>
     * 
     * @param tags
     *        An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     *        objects</a> to associate with the snapshot.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     *        objects</a> to associate with the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleActionParameters withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the snapshot.
     * </p>
     * 
     * @param tags
     *        An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     *        objects</a> to associate with the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleActionParameters withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getSnapshotNamePrefix() != null)
            sb.append("SnapshotNamePrefix: ").append(getSnapshotNamePrefix()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotScheduleActionParameters == false)
            return false;
        CreateSnapshotScheduleActionParameters other = (CreateSnapshotScheduleActionParameters) obj;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotNamePrefix() == null ^ this.getSnapshotNamePrefix() == null)
            return false;
        if (other.getSnapshotNamePrefix() != null && other.getSnapshotNamePrefix().equals(this.getSnapshotNamePrefix()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getSnapshotNamePrefix() == null) ? 0 : getSnapshotNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotScheduleActionParameters clone() {
        try {
            return (CreateSnapshotScheduleActionParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.CreateSnapshotScheduleActionParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
