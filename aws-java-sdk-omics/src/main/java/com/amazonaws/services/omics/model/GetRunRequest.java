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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRun" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The run's export format.
     * </p>
     */
    private java.util.List<String> export;
    /**
     * <p>
     * The run's ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The run's export format.
     * </p>
     * 
     * @return The run's export format.
     * @see RunExport
     */

    public java.util.List<String> getExport() {
        return export;
    }

    /**
     * <p>
     * The run's export format.
     * </p>
     * 
     * @param export
     *        The run's export format.
     * @see RunExport
     */

    public void setExport(java.util.Collection<String> export) {
        if (export == null) {
            this.export = null;
            return;
        }

        this.export = new java.util.ArrayList<String>(export);
    }

    /**
     * <p>
     * The run's export format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExport(java.util.Collection)} or {@link #withExport(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param export
     *        The run's export format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunExport
     */

    public GetRunRequest withExport(String... export) {
        if (this.export == null) {
            setExport(new java.util.ArrayList<String>(export.length));
        }
        for (String ele : export) {
            this.export.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The run's export format.
     * </p>
     * 
     * @param export
     *        The run's export format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunExport
     */

    public GetRunRequest withExport(java.util.Collection<String> export) {
        setExport(export);
        return this;
    }

    /**
     * <p>
     * The run's export format.
     * </p>
     * 
     * @param export
     *        The run's export format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunExport
     */

    public GetRunRequest withExport(RunExport... export) {
        java.util.ArrayList<String> exportCopy = new java.util.ArrayList<String>(export.length);
        for (RunExport value : export) {
            exportCopy.add(value.toString());
        }
        if (getExport() == null) {
            setExport(exportCopy);
        } else {
            getExport().addAll(exportCopy);
        }
        return this;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @return The run's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunRequest withId(String id) {
        setId(id);
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
        if (getExport() != null)
            sb.append("Export: ").append(getExport()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRunRequest == false)
            return false;
        GetRunRequest other = (GetRunRequest) obj;
        if (other.getExport() == null ^ this.getExport() == null)
            return false;
        if (other.getExport() != null && other.getExport().equals(this.getExport()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExport() == null) ? 0 : getExport().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetRunRequest clone() {
        return (GetRunRequest) super.clone();
    }

}
