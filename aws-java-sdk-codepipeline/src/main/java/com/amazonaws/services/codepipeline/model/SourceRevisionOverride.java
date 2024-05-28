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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list that allows you to specify, or override, the source revision for a pipeline execution that's being started. A
 * source revision is the version with all the changes to your application code, or source artifact, for the pipeline
 * execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/SourceRevisionOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceRevisionOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the action where the override will be applied.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The type of source revision, based on the source provider. For example, the revision type for the CodeCommit
     * action provider is the commit ID.
     * </p>
     */
    private String revisionType;
    /**
     * <p>
     * The source revision, or version of your source artifact, with the changes that you want to run in the pipeline
     * execution.
     * </p>
     */
    private String revisionValue;

    /**
     * <p>
     * The name of the action where the override will be applied.
     * </p>
     * 
     * @param actionName
     *        The name of the action where the override will be applied.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action where the override will be applied.
     * </p>
     * 
     * @return The name of the action where the override will be applied.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action where the override will be applied.
     * </p>
     * 
     * @param actionName
     *        The name of the action where the override will be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRevisionOverride withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The type of source revision, based on the source provider. For example, the revision type for the CodeCommit
     * action provider is the commit ID.
     * </p>
     * 
     * @param revisionType
     *        The type of source revision, based on the source provider. For example, the revision type for the
     *        CodeCommit action provider is the commit ID.
     * @see SourceRevisionType
     */

    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    /**
     * <p>
     * The type of source revision, based on the source provider. For example, the revision type for the CodeCommit
     * action provider is the commit ID.
     * </p>
     * 
     * @return The type of source revision, based on the source provider. For example, the revision type for the
     *         CodeCommit action provider is the commit ID.
     * @see SourceRevisionType
     */

    public String getRevisionType() {
        return this.revisionType;
    }

    /**
     * <p>
     * The type of source revision, based on the source provider. For example, the revision type for the CodeCommit
     * action provider is the commit ID.
     * </p>
     * 
     * @param revisionType
     *        The type of source revision, based on the source provider. For example, the revision type for the
     *        CodeCommit action provider is the commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceRevisionType
     */

    public SourceRevisionOverride withRevisionType(String revisionType) {
        setRevisionType(revisionType);
        return this;
    }

    /**
     * <p>
     * The type of source revision, based on the source provider. For example, the revision type for the CodeCommit
     * action provider is the commit ID.
     * </p>
     * 
     * @param revisionType
     *        The type of source revision, based on the source provider. For example, the revision type for the
     *        CodeCommit action provider is the commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceRevisionType
     */

    public SourceRevisionOverride withRevisionType(SourceRevisionType revisionType) {
        this.revisionType = revisionType.toString();
        return this;
    }

    /**
     * <p>
     * The source revision, or version of your source artifact, with the changes that you want to run in the pipeline
     * execution.
     * </p>
     * 
     * @param revisionValue
     *        The source revision, or version of your source artifact, with the changes that you want to run in the
     *        pipeline execution.
     */

    public void setRevisionValue(String revisionValue) {
        this.revisionValue = revisionValue;
    }

    /**
     * <p>
     * The source revision, or version of your source artifact, with the changes that you want to run in the pipeline
     * execution.
     * </p>
     * 
     * @return The source revision, or version of your source artifact, with the changes that you want to run in the
     *         pipeline execution.
     */

    public String getRevisionValue() {
        return this.revisionValue;
    }

    /**
     * <p>
     * The source revision, or version of your source artifact, with the changes that you want to run in the pipeline
     * execution.
     * </p>
     * 
     * @param revisionValue
     *        The source revision, or version of your source artifact, with the changes that you want to run in the
     *        pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceRevisionOverride withRevisionValue(String revisionValue) {
        setRevisionValue(revisionValue);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getRevisionType() != null)
            sb.append("RevisionType: ").append(getRevisionType()).append(",");
        if (getRevisionValue() != null)
            sb.append("RevisionValue: ").append(getRevisionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceRevisionOverride == false)
            return false;
        SourceRevisionOverride other = (SourceRevisionOverride) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getRevisionType() == null ^ this.getRevisionType() == null)
            return false;
        if (other.getRevisionType() != null && other.getRevisionType().equals(this.getRevisionType()) == false)
            return false;
        if (other.getRevisionValue() == null ^ this.getRevisionValue() == null)
            return false;
        if (other.getRevisionValue() != null && other.getRevisionValue().equals(this.getRevisionValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getRevisionType() == null) ? 0 : getRevisionType().hashCode());
        hashCode = prime * hashCode + ((getRevisionValue() == null) ? 0 : getRevisionValue().hashCode());
        return hashCode;
    }

    @Override
    public SourceRevisionOverride clone() {
        try {
            return (SourceRevisionOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.SourceRevisionOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
