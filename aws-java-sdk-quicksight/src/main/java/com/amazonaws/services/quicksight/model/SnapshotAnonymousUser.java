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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information on the anonymous user configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotAnonymousUser" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotAnonymousUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags configured
     * before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     * <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.
     * </p>
     * <p>
     * These are not the tags that are used for Amazon Web Services resource tagging. For more information on row level
     * security in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<SessionTag> rowLevelPermissionTags;

    /**
     * <p>
     * The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags configured
     * before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     * <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.
     * </p>
     * <p>
     * These are not the tags that are used for Amazon Web Services resource tagging. For more information on row level
     * security in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags
     *         configured before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     *         <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.</p>
     *         <p>
     *         These are not the tags that are used for Amazon Web Services resource tagging. For more information on
     *         row level security in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level
     *         Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<SessionTag> getRowLevelPermissionTags() {
        return rowLevelPermissionTags;
    }

    /**
     * <p>
     * The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags configured
     * before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     * <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.
     * </p>
     * <p>
     * These are not the tags that are used for Amazon Web Services resource tagging. For more information on row level
     * security in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param rowLevelPermissionTags
     *        The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags
     *        configured before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     *        <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.</p>
     *        <p>
     *        These are not the tags that are used for Amazon Web Services resource tagging. For more information on row
     *        level security in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level
     *        Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setRowLevelPermissionTags(java.util.Collection<SessionTag> rowLevelPermissionTags) {
        if (rowLevelPermissionTags == null) {
            this.rowLevelPermissionTags = null;
            return;
        }

        this.rowLevelPermissionTags = new java.util.ArrayList<SessionTag>(rowLevelPermissionTags);
    }

    /**
     * <p>
     * The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags configured
     * before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     * <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.
     * </p>
     * <p>
     * These are not the tags that are used for Amazon Web Services resource tagging. For more information on row level
     * security in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRowLevelPermissionTags(java.util.Collection)} or
     * {@link #withRowLevelPermissionTags(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rowLevelPermissionTags
     *        The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags
     *        configured before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     *        <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.</p>
     *        <p>
     *        These are not the tags that are used for Amazon Web Services resource tagging. For more information on row
     *        level security in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level
     *        Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotAnonymousUser withRowLevelPermissionTags(SessionTag... rowLevelPermissionTags) {
        if (this.rowLevelPermissionTags == null) {
            setRowLevelPermissionTags(new java.util.ArrayList<SessionTag>(rowLevelPermissionTags.length));
        }
        for (SessionTag ele : rowLevelPermissionTags) {
            this.rowLevelPermissionTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags configured
     * before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     * <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.
     * </p>
     * <p>
     * These are not the tags that are used for Amazon Web Services resource tagging. For more information on row level
     * security in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level Security
     * (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param rowLevelPermissionTags
     *        The tags to be used for row-level security (RLS). Make sure that the relevant datasets have RLS tags
     *        configured before you start a snapshot export job. You can configure the RLS tags of a dataset with a
     *        <code>DataSet$RowLevelPermissionTagConfiguration</code> API call.</p>
     *        <p>
     *        These are not the tags that are used for Amazon Web Services resource tagging. For more information on row
     *        level security in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-rls-tags.html">Using Row-Level
     *        Security (RLS) with Tags</a>in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotAnonymousUser withRowLevelPermissionTags(java.util.Collection<SessionTag> rowLevelPermissionTags) {
        setRowLevelPermissionTags(rowLevelPermissionTags);
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
        if (getRowLevelPermissionTags() != null)
            sb.append("RowLevelPermissionTags: ").append(getRowLevelPermissionTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotAnonymousUser == false)
            return false;
        SnapshotAnonymousUser other = (SnapshotAnonymousUser) obj;
        if (other.getRowLevelPermissionTags() == null ^ this.getRowLevelPermissionTags() == null)
            return false;
        if (other.getRowLevelPermissionTags() != null && other.getRowLevelPermissionTags().equals(this.getRowLevelPermissionTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowLevelPermissionTags() == null) ? 0 : getRowLevelPermissionTags().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotAnonymousUser clone() {
        try {
            return (SnapshotAnonymousUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotAnonymousUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
