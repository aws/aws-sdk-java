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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * How the auto-merging process should resolve conflicts between different profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ConflictResolution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictResolution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECENCY</code>: Uses the data that was most recently updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or two
     * departments have merged, data from the specified source is used. If two duplicate profiles are from the same
     * source, then <code>RECENCY</code> is used again.
     * </p>
     * </li>
     * </ul>
     */
    private String conflictResolvingModel;
    /**
     * <p>
     * The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     * <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     * </p>
     */
    private String sourceName;

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECENCY</code>: Uses the data that was most recently updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or two
     * departments have merged, data from the specified source is used. If two duplicate profiles are from the same
     * source, then <code>RECENCY</code> is used again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictResolvingModel
     *        How the auto-merging process should resolve conflicts between different profiles.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RECENCY</code>: Uses the data that was most recently updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or
     *        two departments have merged, data from the specified source is used. If two duplicate profiles are from
     *        the same source, then <code>RECENCY</code> is used again.
     *        </p>
     *        </li>
     * @see ConflictResolvingModel
     */

    public void setConflictResolvingModel(String conflictResolvingModel) {
        this.conflictResolvingModel = conflictResolvingModel;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECENCY</code>: Uses the data that was most recently updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or two
     * departments have merged, data from the specified source is used. If two duplicate profiles are from the same
     * source, then <code>RECENCY</code> is used again.
     * </p>
     * </li>
     * </ul>
     * 
     * @return How the auto-merging process should resolve conflicts between different profiles.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RECENCY</code>: Uses the data that was most recently updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or
     *         two departments have merged, data from the specified source is used. If two duplicate profiles are from
     *         the same source, then <code>RECENCY</code> is used again.
     *         </p>
     *         </li>
     * @see ConflictResolvingModel
     */

    public String getConflictResolvingModel() {
        return this.conflictResolvingModel;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECENCY</code>: Uses the data that was most recently updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or two
     * departments have merged, data from the specified source is used. If two duplicate profiles are from the same
     * source, then <code>RECENCY</code> is used again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictResolvingModel
     *        How the auto-merging process should resolve conflicts between different profiles.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RECENCY</code>: Uses the data that was most recently updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or
     *        two departments have merged, data from the specified source is used. If two duplicate profiles are from
     *        the same source, then <code>RECENCY</code> is used again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictResolvingModel
     */

    public ConflictResolution withConflictResolvingModel(String conflictResolvingModel) {
        setConflictResolvingModel(conflictResolvingModel);
        return this;
    }

    /**
     * <p>
     * How the auto-merging process should resolve conflicts between different profiles.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECENCY</code>: Uses the data that was most recently updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or two
     * departments have merged, data from the specified source is used. If two duplicate profiles are from the same
     * source, then <code>RECENCY</code> is used again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictResolvingModel
     *        How the auto-merging process should resolve conflicts between different profiles.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RECENCY</code>: Uses the data that was most recently updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SOURCE</code>: Uses the data from a specific source. For example, if a company has been aquired or
     *        two departments have merged, data from the specified source is used. If two duplicate profiles are from
     *        the same source, then <code>RECENCY</code> is used again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictResolvingModel
     */

    public ConflictResolution withConflictResolvingModel(ConflictResolvingModel conflictResolvingModel) {
        this.conflictResolvingModel = conflictResolvingModel.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     * <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     * </p>
     * 
     * @param sourceName
     *        The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     *        <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     * <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     * </p>
     * 
     * @return The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     *         <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     * <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     * </p>
     * 
     * @param sourceName
     *        The <code>ObjectType</code> name that is used to resolve profile merging conflicts when choosing
     *        <code>SOURCE</code> as the <code>ConflictResolvingModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictResolution withSourceName(String sourceName) {
        setSourceName(sourceName);
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
        if (getConflictResolvingModel() != null)
            sb.append("ConflictResolvingModel: ").append(getConflictResolvingModel()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictResolution == false)
            return false;
        ConflictResolution other = (ConflictResolution) obj;
        if (other.getConflictResolvingModel() == null ^ this.getConflictResolvingModel() == null)
            return false;
        if (other.getConflictResolvingModel() != null && other.getConflictResolvingModel().equals(this.getConflictResolvingModel()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConflictResolvingModel() == null) ? 0 : getConflictResolvingModel().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        return hashCode;
    }

    @Override
    public ConflictResolution clone() {
        try {
            return (ConflictResolution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ConflictResolutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
