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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a set of options that define how DataBrew selects files for a given Amazon S3 path in a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/PathOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If provided, this structure defines a date range for matching Amazon S3 objects based on their LastModifiedDate
     * attribute in Amazon S3.
     * </p>
     */
    private FilterExpression lastModifiedDateCondition;
    /**
     * <p>
     * If provided, this structure imposes a limit on a number of files that should be selected.
     * </p>
     */
    private FilesLimit filesLimit;
    /**
     * <p>
     * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     * </p>
     */
    private java.util.Map<String, DatasetParameter> parameters;

    /**
     * <p>
     * If provided, this structure defines a date range for matching Amazon S3 objects based on their LastModifiedDate
     * attribute in Amazon S3.
     * </p>
     * 
     * @param lastModifiedDateCondition
     *        If provided, this structure defines a date range for matching Amazon S3 objects based on their
     *        LastModifiedDate attribute in Amazon S3.
     */

    public void setLastModifiedDateCondition(FilterExpression lastModifiedDateCondition) {
        this.lastModifiedDateCondition = lastModifiedDateCondition;
    }

    /**
     * <p>
     * If provided, this structure defines a date range for matching Amazon S3 objects based on their LastModifiedDate
     * attribute in Amazon S3.
     * </p>
     * 
     * @return If provided, this structure defines a date range for matching Amazon S3 objects based on their
     *         LastModifiedDate attribute in Amazon S3.
     */

    public FilterExpression getLastModifiedDateCondition() {
        return this.lastModifiedDateCondition;
    }

    /**
     * <p>
     * If provided, this structure defines a date range for matching Amazon S3 objects based on their LastModifiedDate
     * attribute in Amazon S3.
     * </p>
     * 
     * @param lastModifiedDateCondition
     *        If provided, this structure defines a date range for matching Amazon S3 objects based on their
     *        LastModifiedDate attribute in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathOptions withLastModifiedDateCondition(FilterExpression lastModifiedDateCondition) {
        setLastModifiedDateCondition(lastModifiedDateCondition);
        return this;
    }

    /**
     * <p>
     * If provided, this structure imposes a limit on a number of files that should be selected.
     * </p>
     * 
     * @param filesLimit
     *        If provided, this structure imposes a limit on a number of files that should be selected.
     */

    public void setFilesLimit(FilesLimit filesLimit) {
        this.filesLimit = filesLimit;
    }

    /**
     * <p>
     * If provided, this structure imposes a limit on a number of files that should be selected.
     * </p>
     * 
     * @return If provided, this structure imposes a limit on a number of files that should be selected.
     */

    public FilesLimit getFilesLimit() {
        return this.filesLimit;
    }

    /**
     * <p>
     * If provided, this structure imposes a limit on a number of files that should be selected.
     * </p>
     * 
     * @param filesLimit
     *        If provided, this structure imposes a limit on a number of files that should be selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathOptions withFilesLimit(FilesLimit filesLimit) {
        setFilesLimit(filesLimit);
        return this;
    }

    /**
     * <p>
     * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     * </p>
     * 
     * @return A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     */

    public java.util.Map<String, DatasetParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     * </p>
     * 
     * @param parameters
     *        A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     */

    public void setParameters(java.util.Map<String, DatasetParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     * </p>
     * 
     * @param parameters
     *        A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathOptions withParameters(java.util.Map<String, DatasetParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see PathOptions#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PathOptions addParametersEntry(String key, DatasetParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, DatasetParameter>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathOptions clearParametersEntries() {
        this.parameters = null;
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
        if (getLastModifiedDateCondition() != null)
            sb.append("LastModifiedDateCondition: ").append(getLastModifiedDateCondition()).append(",");
        if (getFilesLimit() != null)
            sb.append("FilesLimit: ").append(getFilesLimit()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathOptions == false)
            return false;
        PathOptions other = (PathOptions) obj;
        if (other.getLastModifiedDateCondition() == null ^ this.getLastModifiedDateCondition() == null)
            return false;
        if (other.getLastModifiedDateCondition() != null && other.getLastModifiedDateCondition().equals(this.getLastModifiedDateCondition()) == false)
            return false;
        if (other.getFilesLimit() == null ^ this.getFilesLimit() == null)
            return false;
        if (other.getFilesLimit() != null && other.getFilesLimit().equals(this.getFilesLimit()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastModifiedDateCondition() == null) ? 0 : getLastModifiedDateCondition().hashCode());
        hashCode = prime * hashCode + ((getFilesLimit() == null) ? 0 : getFilesLimit().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public PathOptions clone() {
        try {
            return (PathOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.PathOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
