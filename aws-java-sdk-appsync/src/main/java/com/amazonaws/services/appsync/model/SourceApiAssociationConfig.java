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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes properties used to specify configurations related to a source API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/SourceApiAssociationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceApiAssociationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property that indicates which merging option is enabled in the source API association.
     * </p>
     * <p>
     * Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are the
     * default behavior and require the user to trigger any changes from the source APIs to the merged API manually.
     * Auto merges subscribe the merged API to the changes performed on the source APIs so that any change in the source
     * APIs are also made to the merged API. Auto merges use <code>MergedApiExecutionRoleArn</code> to perform merge
     * operations.
     * </p>
     */
    private String mergeType;

    /**
     * <p>
     * The property that indicates which merging option is enabled in the source API association.
     * </p>
     * <p>
     * Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are the
     * default behavior and require the user to trigger any changes from the source APIs to the merged API manually.
     * Auto merges subscribe the merged API to the changes performed on the source APIs so that any change in the source
     * APIs are also made to the merged API. Auto merges use <code>MergedApiExecutionRoleArn</code> to perform merge
     * operations.
     * </p>
     * 
     * @param mergeType
     *        The property that indicates which merging option is enabled in the source API association.</p>
     *        <p>
     *        Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are
     *        the default behavior and require the user to trigger any changes from the source APIs to the merged API
     *        manually. Auto merges subscribe the merged API to the changes performed on the source APIs so that any
     *        change in the source APIs are also made to the merged API. Auto merges use
     *        <code>MergedApiExecutionRoleArn</code> to perform merge operations.
     * @see MergeType
     */

    public void setMergeType(String mergeType) {
        this.mergeType = mergeType;
    }

    /**
     * <p>
     * The property that indicates which merging option is enabled in the source API association.
     * </p>
     * <p>
     * Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are the
     * default behavior and require the user to trigger any changes from the source APIs to the merged API manually.
     * Auto merges subscribe the merged API to the changes performed on the source APIs so that any change in the source
     * APIs are also made to the merged API. Auto merges use <code>MergedApiExecutionRoleArn</code> to perform merge
     * operations.
     * </p>
     * 
     * @return The property that indicates which merging option is enabled in the source API association.</p>
     *         <p>
     *         Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are
     *         the default behavior and require the user to trigger any changes from the source APIs to the merged API
     *         manually. Auto merges subscribe the merged API to the changes performed on the source APIs so that any
     *         change in the source APIs are also made to the merged API. Auto merges use
     *         <code>MergedApiExecutionRoleArn</code> to perform merge operations.
     * @see MergeType
     */

    public String getMergeType() {
        return this.mergeType;
    }

    /**
     * <p>
     * The property that indicates which merging option is enabled in the source API association.
     * </p>
     * <p>
     * Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are the
     * default behavior and require the user to trigger any changes from the source APIs to the merged API manually.
     * Auto merges subscribe the merged API to the changes performed on the source APIs so that any change in the source
     * APIs are also made to the merged API. Auto merges use <code>MergedApiExecutionRoleArn</code> to perform merge
     * operations.
     * </p>
     * 
     * @param mergeType
     *        The property that indicates which merging option is enabled in the source API association.</p>
     *        <p>
     *        Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are
     *        the default behavior and require the user to trigger any changes from the source APIs to the merged API
     *        manually. Auto merges subscribe the merged API to the changes performed on the source APIs so that any
     *        change in the source APIs are also made to the merged API. Auto merges use
     *        <code>MergedApiExecutionRoleArn</code> to perform merge operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeType
     */

    public SourceApiAssociationConfig withMergeType(String mergeType) {
        setMergeType(mergeType);
        return this;
    }

    /**
     * <p>
     * The property that indicates which merging option is enabled in the source API association.
     * </p>
     * <p>
     * Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are the
     * default behavior and require the user to trigger any changes from the source APIs to the merged API manually.
     * Auto merges subscribe the merged API to the changes performed on the source APIs so that any change in the source
     * APIs are also made to the merged API. Auto merges use <code>MergedApiExecutionRoleArn</code> to perform merge
     * operations.
     * </p>
     * 
     * @param mergeType
     *        The property that indicates which merging option is enabled in the source API association.</p>
     *        <p>
     *        Valid merge types are <code>MANUAL_MERGE</code> (default) and <code>AUTO_MERGE</code>. Manual merges are
     *        the default behavior and require the user to trigger any changes from the source APIs to the merged API
     *        manually. Auto merges subscribe the merged API to the changes performed on the source APIs so that any
     *        change in the source APIs are also made to the merged API. Auto merges use
     *        <code>MergedApiExecutionRoleArn</code> to perform merge operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeType
     */

    public SourceApiAssociationConfig withMergeType(MergeType mergeType) {
        this.mergeType = mergeType.toString();
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
        if (getMergeType() != null)
            sb.append("MergeType: ").append(getMergeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceApiAssociationConfig == false)
            return false;
        SourceApiAssociationConfig other = (SourceApiAssociationConfig) obj;
        if (other.getMergeType() == null ^ this.getMergeType() == null)
            return false;
        if (other.getMergeType() != null && other.getMergeType().equals(this.getMergeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMergeType() == null) ? 0 : getMergeType().hashCode());
        return hashCode;
    }

    @Override
    public SourceApiAssociationConfig clone() {
        try {
            return (SourceApiAssociationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.SourceApiAssociationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
