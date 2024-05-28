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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelExportAsScript"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMetadataModelExportAsScriptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier for the export operation.
     * </p>
     */
    private String requestIdentifier;

    /**
     * <p>
     * The identifier for the export operation.
     * </p>
     * 
     * @param requestIdentifier
     *        The identifier for the export operation.
     */

    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * The identifier for the export operation.
     * </p>
     * 
     * @return The identifier for the export operation.
     */

    public String getRequestIdentifier() {
        return this.requestIdentifier;
    }

    /**
     * <p>
     * The identifier for the export operation.
     * </p>
     * 
     * @param requestIdentifier
     *        The identifier for the export operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataModelExportAsScriptResult withRequestIdentifier(String requestIdentifier) {
        setRequestIdentifier(requestIdentifier);
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
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: ").append(getRequestIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMetadataModelExportAsScriptResult == false)
            return false;
        StartMetadataModelExportAsScriptResult other = (StartMetadataModelExportAsScriptResult) obj;
        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StartMetadataModelExportAsScriptResult clone() {
        try {
            return (StartMetadataModelExportAsScriptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
