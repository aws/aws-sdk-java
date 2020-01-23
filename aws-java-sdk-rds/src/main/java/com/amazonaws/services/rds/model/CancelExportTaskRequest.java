/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CancelExportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelExportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the snapshot export task to cancel.
     * </p>
     */
    private String exportTaskIdentifier;

    /**
     * <p>
     * The identifier of the snapshot export task to cancel.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        The identifier of the snapshot export task to cancel.
     */

    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot export task to cancel.
     * </p>
     * 
     * @return The identifier of the snapshot export task to cancel.
     */

    public String getExportTaskIdentifier() {
        return this.exportTaskIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot export task to cancel.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        The identifier of the snapshot export task to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskRequest withExportTaskIdentifier(String exportTaskIdentifier) {
        setExportTaskIdentifier(exportTaskIdentifier);
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
        if (getExportTaskIdentifier() != null)
            sb.append("ExportTaskIdentifier: ").append(getExportTaskIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelExportTaskRequest == false)
            return false;
        CancelExportTaskRequest other = (CancelExportTaskRequest) obj;
        if (other.getExportTaskIdentifier() == null ^ this.getExportTaskIdentifier() == null)
            return false;
        if (other.getExportTaskIdentifier() != null && other.getExportTaskIdentifier().equals(this.getExportTaskIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskIdentifier() == null) ? 0 : getExportTaskIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CancelExportTaskRequest clone() {
        return (CancelExportTaskRequest) super.clone();
    }

}
